package com.bridgelabz.UserRegistration;
import java.util.*;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String input;
		System.out.println("Enter Your Choice\n"
				+ "1. First Name\n"
				+ "2. Last Name\n"
				+ "3. Email\n"
				+ "4. Mobile\n"
				+ "5. Password\n");
		do {
			System.out.println("Please enter a Number");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			a = sc.nextInt();
			break;
		}while(true);
		
		
		switch(a) {
			//Use Case 1
			case 1: System.out.println("Please enter your first Name");
					input = sc.next();
					String Regex = "^[A-Z][a-z]{3,}";
					if(input.matches(Regex))
						System.out.println("First Name is Valid");
					else
						System.out.println("First Name is not Valid");
					break;
					
			
		}
		

	}

}
