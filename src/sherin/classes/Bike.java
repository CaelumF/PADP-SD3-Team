package sherin.classes;

import caelum.classes.BikeDatabase;
import caelum.classes.UserQuery;
import caelum.classes.Utils;

import javax.rmi.CORBA.Util;
import java.util.Scanner;

public class Bike {
	private static final int UserChoice = 0;
	private static String userName;
	private static String pin;


	public static void main(String[] args) {
		// login personal details

		Scanner in = Utils.globScanner;

//		System.out.println("Login in:");
//		System.out.println("Enter Your userName");
//		String userName = in.nextLine();
//		System.out.println("Enter Your pin");
//		String pin = in.nextLine();
//
//		System.out.println("you are logged in");

//		Scanner input = Utils.globScanner;
		System.out.print("enter 1 to see available bikes or 2 to ask for help");
		int userChoice = in.nextInt();
		if (userChoice == 1) {
			getBike();
		}
	}

	public static void getBike() {
		Scanner in = Utils.globScanner;
//		System.out.println("Choose available bikes between 0 to 14");
		//Print out available bikes
		for(int i = 0; i < BikeDatabase.availableBikes.size(); i++){
			System.out.println(i + ": " + (BikeDatabase.availableBikes.get(i) ? "Available" : "Not available"));
			//*Ternary operator is caelum's edition just to make it look nicer
		}
		//Validation code,
//		int userChoice=in.nextInt();
        //Generated from code above by Caelum for Verification
        int userChoice = new UserQuery<Integer>("Choose available bikes between 0 to 14")
                .query(Integer::parseInt,
                        s -> s >= 0 && s <= 14
                                && BikeDatabase.availableBikes.get(s),
                        s -> s + "is out of range or not a number");
		//Set chosen bike to not available
		BikeDatabase.availableBikes.set(userChoice, false);

//		String availableBikes = in.nextLine();
//           if(userChoice !=1) {
//        	   availableBikes="between 1 and 15";
//        	   }
//
//
//           }
	}
}
	
	  

    
  

 