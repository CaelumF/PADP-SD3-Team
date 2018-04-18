package stephen.classes;

import caelum.classes.UserQuery;
import caelum.classes.Utils;

import java.util.Scanner;

public class PersonalAndCreditDetails {

	public static void main(String[] args) {
		getPersonalDetails();
		getCreditDetails();
	}
	public static void getPersonalDetails() {
		
		String firstName;
		String surname;
		int age;
		String gender;
		int userGenderChoice;
		String email;
		String pin;
		String mobileNum;
		String address;
		
		Scanner input = Utils.globScanner;

//		Stephen's code - commented to preserve his work which Caelum used find-replace to tie in with my verification
//		do {
//		System.out.println("Please enter your age: ");
//		if(age <14) {
//			System.out.println("You must be over 14 in order to hire a bike.");
//		}
//		} while(age < 14);
        age = new UserQuery<Integer>("Please enter your age:").query(Integer::parseInt, s -> s > 14, s -> "You must be over 14 in order to hire a bike.");

        System.out.println("Please enter your first name: ");
		firstName = input.nextLine();

		System.out.println("Please enter your surname: ");
		surname = input.nextLine();
//		Stephen's code - commented to preserve his work which Caelum used find-replace to tie in with my verification
//		System.out.println("Gender: 1 - Male, 2 - Female");
//		userGenderChoice = input.nextInt();
		//Generated from code above by Caelum for Verification
		userGenderChoice = new UserQuery<Integer>("Gender: 1 - Male, 2 - Female").query(Integer::parseInt,
				s -> s == 1 || s == 2, s -> s + " is not 1 or 2");

		if(userGenderChoice != 1) {
			gender = "female";
		}
		else {
			gender = "male";
		}
		//Stephen's code - commented to preserve his work which Caelum used find-replace to tie in with my verification
//		System.out.println("Please enter your email: ");
//		email = input.next();
//
//		System.out.println("Please enter a 4 digit PIN to access your account: ");
//		pin = input.nextInt();

		//Stephen's code - commented to preserve his work which Caelum used find-replace to tie in with my verification
//		System.out.println("Please enter your mobile number: ");
//		mobileNum = input.nextInt();
        //Generated from code above by Caelum for Verification

        String emailRegex = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        email = new UserQuery<String>("Please enter your email: ").query(s -> s.matches(emailRegex), s -> "Bad email");

        pin = new UserQuery<String>("Please enter your 3-digit security code:")
                .query(s -> s.matches("[0-9]{3}"),
                        s -> s + " is not a valid pin.");

        //Generated from code above by Caelum for Verification
        mobileNum = new UserQuery<String>("Please enter your mobile number: ").query(s -> s.matches("([0-9]| |\\+)+"
		), s-> "Invalid mobile number");

        System.out.println("Please enter your address: ");
        address = input.nextLine();
        System.out.println(address);

//		input.close();
	}
	
	static String creditCardNum;
	static String expiryMonth;
	static String expiryYear;
	static String securityCode;
	static double accountDeposit;
	
	public static void getCreditDetails() {
 		/*Stephen's code - commented to preserve his work which Caelum used find-replace to tie in with my verification
		Scanner creditCard = Utils.globScanner;

		System.out.println("Please enter your 16-digit credit card number:");
		creditCardNum = creditCard.nextDouble();

		System.out.println("Please enter the number of the month your card will expire in the form MM:");
		expiryMonth = creditCard.nextInt();

		System.out.println("Please enter the year your card will expire in the form YYYY:");
		expiryYear = creditCard.nextInt();

		System.out.println("Please enter your 3-digit security code:");
		securityCode = creditCard.nextInt();

		System.out.println("Please enter the amount you wish to put onto your account(minimum �10): ");
		accountDeposit = creditCard.nextDouble();
		System.out.println(accountDeposit);

		creditCard.close(); */
		//Generated from code above by Caelum for Verification
		creditCardNum = new UserQuery<String>("Please enter your 16-digit credit card number:")
				.query(s -> s.matches("[0-9]{16}"),
						s -> s + " is not a valid cc number");

		expiryMonth = new UserQuery<String>("Please enter the number of the month your card will expire in the form MM:")
				.query(s -> s.matches("[0-9][0-9]"),
						s -> s + " is not a valid ");

		expiryYear = new UserQuery<String>("Please enter the year your card will expire in the form YYYY:")
				.query(s -> s.matches("[0-9]{4}"),
						s -> s + " is not a valid ");

		securityCode = new UserQuery<String>("Please enter your 3-digit security code:")
				.query(s -> s.matches("[0-9]{3}"),
						s -> s + " is not a valid ");

		accountDeposit = new UserQuery<Double>("Please enter the amount you wish to put onto your account(minimum �10):")
				.query(Double::parseDouble, d -> d >= 10, d -> d + " is not a proper number or is out of range");
		TermsAndConditions.ReadFromFile();
		Payment.accountBalance += accountDeposit;
//		= new UserQuery<String>("")
//				.query(s -> s.matches(""), s -> s + " is not a valid ");

	}
}
















