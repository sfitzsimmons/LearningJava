/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 11th, 2021
 * Date Submitted: April 10th, 2021
 * The purpose of this assignment is to practice using a while loop.
 */

import java.util.Scanner;

public class Assignment07a {

	public static void main(String[] args) {
		// This will show a savings account balance
		Scanner myObj = new Scanner(System.in);
		
		int currentBalance = 0;
		
		int amountToSaveEachMonth;
		System.out.print("Enter the amount to save each month: ");
		amountToSaveEachMonth = myObj.nextInt();
		
		int numberOfMonthsToSave;
		System.out.print("Enter the number of months to save: ");
		numberOfMonthsToSave = myObj.nextInt();
		
		int currentSavingsMonth = 1;
		
		while (currentSavingsMonth <= numberOfMonthsToSave) {
			currentBalance += amountToSaveEachMonth;
			System.out.println("For month " + currentSavingsMonth + ", the balance is " + currentBalance);
			currentSavingsMonth ++;
		}
		

	}

}
