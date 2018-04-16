package stephen.classes;

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
		int pin;
		int mobileNum;
		String address;
		
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Please enter your age: ");
		age = input.nextInt();
		if(age <14) {
			System.out.println("You must be over 14 in order to hire a bike.");
		}
		} while(age < 14);
		
		
		System.out.println("Please enter your first name: ");
		firstName = input.next();
		
		System.out.println("Please enter your surname: ");
		surname = input.next();
		
		System.out.println("Gender: 1 - Male, 2 - Female");
		userGenderChoice = input.nextInt();
		
		if(userGenderChoice != 1) {
			gender = "female";
		}
		else {
			gender = "male";
		}
		
		System.out.println("Please enter your email: ");
		email = input.next();
		
		System.out.println("Please enter a 4 digit PIN to access your account: ");
		pin = input.nextInt();
		
		System.out.println("Please enter your mobile number: ");
		mobileNum = input.nextInt(); 
		
		System.out.println("Please enter your address: ");
		address = input.nextLine();
		System.out.println(address);
	
		input.close();
	}
	
	static double creditCardNum;
	static int expiryMonth;
	static int expiryYear;
	static int securityCode;
	static Double accountBalance;
	
	public static void getCreditDetails() {
		
		Scanner creditCard = new Scanner(System.in);
		
		System.out.println("Please enter your 16-digit credit card number:");
		creditCardNum = creditCard.nextDouble();
		
		System.out.println("Please enter the number of the month your card will expire in the form MM:");
		expiryMonth = creditCard.nextInt();
		
		System.out.println("Please enter the year your card will expire in the form YYYY:");
		expiryYear = creditCard.nextInt(); 
		
		System.out.println("Please enter your 3-digit security code:");
		securityCode = creditCard.nextInt();
		
		System.out.println("Please enter the amount you wish to put onto your account(minimum �10): ");
		accountBalance = creditCard.nextDouble();
		System.out.println(accountBalance);
		
		creditCard.close();
	}
}
















