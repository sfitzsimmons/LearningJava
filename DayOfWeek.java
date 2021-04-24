/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 18th, 2021
 * Date Submitted: April 18th, 2021
 * The purpose of this assignment is to practice using an array.
 */

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObject = new Scanner(System.in);
		String [] DAY_OF_WEEK = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		boolean valid = false;
		
		// do-while loop
		
		do {
			System.out.print("Enter the day of the week: ");
			String choice = myObject.next();
			System.out.println("");
			int selection = Integer.parseInt(choice);
			selection -= 1;
			
			// Data validation
			
			if (selection >= 0 & selection <= 6) {
				System.out.println("The day of the week is " + DAY_OF_WEEK[selection] + ".");
				valid = true;
			} else {
				System.out.println("Invalid Entry");
			}
			
		// Try again?	
		
		System.out.print("Try again (Y/N): ");
		String next = myObject.next();
		next = next.toUpperCase();
		
		// Try again data validation
		
		while (!(next.equals("Y") | next.equals("N"))) {
			System.out.println("Invalid Entry");
			System.out.println("Try again (Y/N): ");
			next = myObject.next();
			next = next.toUpperCase();
			System.out.println("");
		}
		
		// Try again mechanics
		
		if (next.equals("Y")) {
			valid = false;
		} else if (next.equals("N")) {
			break;
		}
		
		} while (!valid);
	}
}
