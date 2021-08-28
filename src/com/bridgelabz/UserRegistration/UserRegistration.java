package com.bridgelabz.UserRegistration;
import java.util.*;

public class UserRegistration {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a;
		String input,dummy;
		while(true) {
					
					System.out.println("\nEnter Your Choice\n"
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
								String Regex = "^[A-Z][a-z]{2,}";
								if(input.matches(Regex))
									System.out.println("First Name is Valid");
								else
									System.out.println("First Name is not Valid");
								break;
								
						//Use Case 2
						case 2: System.out.println("Please enter your Last Name");
								input = sc.next();
								Regex = "^[A-Z][a-z]{2,}";
								if(input.matches(Regex))
									System.out.println("Last Name is Valid");
								else
									System.out.println("Last Name is not Valid");
								break;
								
						// Use Case 3 & 9
						case 3: System.out.println("Enter your Valid Email");
								input = sc.next();
								Regex = "^[a-zA-Z]{2,}?[.+-]?[0-9a-zA-Z]{0,}@[a-zA-Z0-9]{1,}.[a-z]{2,}?[.][a-z]{1,}";
								if(input.matches(Regex))
									System.out.println("Email is Valid");
								else
									System.out.println("Email is not Valid");
								break;
								
								
						// Use Case 4
						case 4: System.out.println("Enter your Valid Phone No.");
								dummy = sc.nextLine();
								input = sc.nextLine();
								Regex = "^[0-9]{1,3}\s[0-9]{10}";
								if(input.matches(Regex))
									System.out.println("Phone No is Valid");
								else
									System.out.println("Phone No is not Valid");
								break;
								
						// Use Case 5 & 6 & 7 & 8
						case 5: System.out.println("Enter your Password");
								input = sc.next();
								Regex = "^(?=.{8,}$)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*$";
								if(input.matches(Regex))
									System.out.println("Password is Valid");
								else
									System.out.println("Password is not Valid");
								break;
						
						default: System.out.println("Program Exited");return;
								
						
					}
				}
		}

}
