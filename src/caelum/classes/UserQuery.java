package caelum.classes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
/**
 * Generic class for querying user questions
 *
 * @param <E> The data type of the user's response. This classes' query() method uses this type parameter.
 */
public class UserQuery<E> {
    String question;
    static Scanner scanner = Utils.globScanner;
    /**
     * Skips all inputs until it finds one equalling this
     */
    static String skipToRegex = "Credit";
    private boolean skipping = !skipToRegex.equals("");


    public UserQuery(String question) {
        this.question = question;
    }

    /**
     * Convenient version of the other query method for when the return type is simply a string and doesn't need
     * converting.
     */
    public E query(Predicate<E> validation, Function<String, String> failMessage) {
        return (E) query(s -> (E) s, validation, failMessage);
    }
    /**
     * Queries the user via standard input for data of type <E>
     * As users can only input String data, the @converter function is used to convert user input to <E> per
     * caller's specification. Then, that data is passed to @validation, if validation fails by returning false,
     * the @failMessge will be called with the input as a lambda parameter
     *
     * @param converter   Lambda method for converting user string input to the desired datatype E
     * @param validation  Lambda method for validating the converted data is correct
     * @param failMessage Lambda method if either validation fails or an exception is thrown in conversion or validation
     * @return The user's input as @converter returns it, if it passes validation
     */
    public E query(Function<String, E> converter, Predicate<E> validation, Function<String, String> failMessage) {
//        if(skipping){
//            if(question.matches(skipToRegex)) skipping = false;
//            else return E;
//        }
        System.out.println(question);
        String input = scanner.nextLine();
        System.out.println(">" + input);
        try {
            E value = converter.apply(input);
            if (!validation.test(value)) throw new Exception(failMessage.apply(input));
            return value;
        } catch (Exception e) {
            System.out.println(failMessage.apply(input));
            System.out.println("What would you like to do? 1 = enter again. 2 = Start again. 3 = exit");
            while (true) {
                switch (scanner.nextLine()) {
                    case "1":
                        //Iteration through recursive method calls if the user chooses to enter again.
                        return query(converter, validation, failMessage);
                    default:
                        System.out.println("What would you like to do? 1 = enter again. 2 = Start again. 3 = exit");
                }
            }
        }
    }
}

