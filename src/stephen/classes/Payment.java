package stephen.classes;

import caelum.classes.BikeTimer;
import luke.classes.Receipt;

public class Payment {
    public static double accountBalance = 10;

    public static void main(String[] args) {
        //Arbitrary test
        chargeHire(1000);
    }

    public static void chargeHire(int minutes) {

        //Time is measured in minutes
        int time = minutes;
        double cost;

        if(time >= 0 && time <30) {
            cost = 0;
        }
        else {
            if(time >30 && time < 60) {
                cost = 0.5;
            }
            else {
                if(time > 60 && time < 120) {
                    cost = 1.50;
                }
                else{
                    if(time > 120 && time <180) {
                        cost = 6.50;
                    }
                    else {

                        int numOfHalfHours = (time/30);
                        int b = (numOfHalfHours - 5);
                        int c = (b*2);
                        cost = (6.50 + c);
                    }
                }
            }
        }
        System.out.println("€" +cost);
        if(cost <= accountBalance) {
            accountBalance = (accountBalance - cost);
//            System.out.println("Bike rent successful! you have been charged" + cost);
            Receipt.printSlip(cost);
        }
        else {
            System.out.println("There were insuficient funds in your account." + "\n" +
                    "We will now charge the credit card you have provided us instead.");
        }
    }
}

