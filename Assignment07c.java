/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 18th, 2021
 * Date Submitted: April 15th, 2021
 * The purpose of this assignment is to practice using a do while loop among other things.
 */

import java.util.Scanner;

public class Assignment07c {
	
	public static void selectedA () { 
		// This method prints "Do Deposit" when the user chooses option A. EXTRA CREDIT 2
		System.out.println("");
		System.out.println("Do Deposit");
		System.out.println("");
	}
	
	public static void selectedB () {
		// This method prints "Do Withdrawal" when the user chooses option B. EXTRA CREDIT 2
		System.out.println("");
		System.out.println("Do Withdrawal");
		System.out.println("");
	}
	

	public static void main(String[] args) {
		// This will display the user with options for operating an ATM.
		
		Scanner myObj = new Scanner(System.in);
		String menuChoice;
		
		do { 
			System.out.println("A. Deposit Cash.");
			System.out.println("B. Withdraw Cash.");
			System.out.println("X. Exit");
			System.out.println("");
			System.out.print("Enter your Selection: ");
			
			menuChoice = myObj.nextLine();
			menuChoice = menuChoice.toUpperCase();  // Converts user input to upper case for EXTRA CREDIT 1
			
			if (menuChoice.equals("A")) {
					selectedA();   // calls a the void method created for Extra Credit 2
					menuChoice = "Run it again, boys!";
				}	else if (menuChoice.equals("B")) {
					selectedB();   // calls a the void method created for Extra Credit 2
					menuChoice = "Run it again, boys!";
				}	else if (menuChoice.equals("X")) {
					break;
				} 	else {
					System.out.println("");
					System.out.println("Invalid selection");
					System.out.println("");
			}
				
		} while (menuChoice != "A" || menuChoice != "B" || menuChoice != "C");
		
	}

}