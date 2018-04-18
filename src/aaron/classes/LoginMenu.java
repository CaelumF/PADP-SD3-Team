package aaron.classes;

import aaron.classes.PasswordChecker;
import caelum.classes.UserQuery;
import caelum.classes.Utils;
import stephen.classes.PersonalAndCreditDetails;

import java.util.Scanner;

import static stephen.classes.PersonalAndCreditDetails.getPersonalDetails;

public class LoginMenu {
    public static String email;
    public static void main() {
        // TODO Auto-generated method stub
        Scanner in = Utils.globScanner;
//        Aaron's code - used to create verification below
//        System.out.println("Enter 1 to login or 2 to register");
//        int userChoice = in.nextInt(ScannerB.InputForm.);
//        in.close();
        //<caelum's Verification code>
        int userChoice = new UserQuery<Integer>("Enter 1 to login or 2 to register").query(Integer::valueOf,
                d -> d == 1 || d == 2, s -> "Please enter either 1 or 2");
        //</caelum's Verification code>
        while (userChoice != 2) {
            //login method
            login();
        }
        //register method
        getPersonalDetails();
    }

//    static void getPersonalDetails() {
//        //Stephen's method
//        PersonalAndCreditDetails.getPersonalDetails();
//        PersonalAndCreditDetails.getCreditDetails();
//    }

    static void login() {
        //login - email address
        String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        //Using Caelum's UserQuery class, Aaron made this verification using regex found online
        email = new UserQuery<String>("What's your email address?").query(s -> s.matches(EMAIL_REGEX), s -> "Invalid email");

        //password - 4 digit pin
        String password = new UserQuery<String>("What's your password?").query(s -> true, s -> "");
        if(!PasswordChecker.validate(email, password)){
            //Invalid password or email
            System.out.println("Invalid credentials");
            //Move back to login menu
            main();
        }
        /**
         * Informing user if a email is used is a security vulnerability and allows emails to be tested*
         * on whether they use the service
         * */
        //if email doenst exist loop back to start.
        //if email=x main();
    }
}
