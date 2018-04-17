package sherin.classes;

import caelum.classes.BikeDatabase;
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

		System.out.println("Login in:");
		System.out.println("Enter Your userName");
		String userName = in.nextLine();
		System.out.println("Enter Your pin");
		String pin = in.nextLine();

		System.out.println("you are logged in");

		Scanner input = Utils.globScanner;
		System.out.print("enter 1 to see available bikes or 2 to ask for help");
		int userChoice = in.nextInt();
		if (userChoice == 1) {
			getBike();
		}
	}

	public static void getBike() {
		Scanner in = Utils.globScanner;
		System.out.println("Choose available bikes between 1 to 15");
		//Print out available bikes
		for(int i = 0; i < BikeDatabase.availableBikes.size(); i++){
			System.out.println(BikeDatabase.availableBikes.get(i));
		}
		//Validation code,
		int userChoice=in.nextInt();
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
	
	  

    
  

 