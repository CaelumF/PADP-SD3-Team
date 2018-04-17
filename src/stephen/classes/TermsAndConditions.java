package stephen.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TermsAndConditions {

	public static void main(String[] args) {
		ReadFromFile();
	}
	
	static void ReadFromFile() {
		
		int userChoice;
		Scanner input = new Scanner(System.in);
		
		try{
		FileReader fr=new FileReader("termsandconditions.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str + "\n");
			
			}
		System.out.println("Do you agree to the terms and conditions: 1 - Agree, 2 - Disagree");
		userChoice = input.nextInt();
		if(userChoice == 2) {
			ReadFromFile();
		}
		
		br.close();
		}
		
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error!");
		}	
	}
}
