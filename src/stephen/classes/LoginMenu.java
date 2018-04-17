package stephen.classes;

import java.util.Scanner;

public class LoginMenu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1 to login or 2 to register");
        int userChoice = in.nextInt();
        while (userChoice != 2) {
            //login method
            login();
        }
        //register method
        getPersonalDetails();
        in.close();
    }

    static void getPersonalDetails() {
        //Stephen's method
        PersonalAndCreditDetails.getPersonalDetails();
        PersonalAndCreditDetails.getCreditDetails();
    }

    static void login() {

        //login - email address
        String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        String email = new UserQuery<String>("What's your email address?").query(s -> s.matches(EMAIL_REGEX), s -> "");

        //if email doenst exist loop back to start.
        //if email=x main();

        //password - 4 digit pin
        String password = new UserQuery<String>("What's your password?").query(s -> true, s -> "");
    }
}
