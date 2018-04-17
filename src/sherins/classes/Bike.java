package sherins.classes;

import java.util.Scanner;

public class Bike {
    private static String userName;
    private static String pin;




    public static void main(String[] args) {
        // login personal details

        Scanner in= new Scanner(System.in);

        System.out.println("Login in:");
        System.out.println("Enter Your Name");
        in.nextLine();
        System.out.println("Enter Your PIN");
        String  pin = in.nextLine();

        System.out.println("you are logged in");

        Scanner  input= new Scanner(System.in);
        System.out.print("enter 1 to see available bikes or 2 to ask for help");
        int userChoice=in.nextInt();
        if(userChoice ==1) {

            getBike();
        }

    }
    public static void getBike(){


    }




}

