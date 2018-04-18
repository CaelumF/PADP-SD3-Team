package luke.classes;

import stephen.classes.Payment;
import stephen.classes.PersonalAndCreditDetails;

public class Receipt {

    public static void printSlip(double cost) {
        System.out.println("First Name: " + PersonalAndCreditDetails.firstName);
        System.out.println("Surname: " + PersonalAndCreditDetails.surname);
        System.out.println("Age: " + PersonalAndCreditDetails.age);
        System.out.println("Address: " + PersonalAndCreditDetails.address);
        System.out.println("Account Balance: " + Payment.accountBalance);
        System.out.println("Total: " + cost);
    }
}
