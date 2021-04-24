/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 18th, 2021
 * Date Submitted: April 14th, 2021
 * The purpose of this assignment is to practice using a for loop.
 */

import java.util.Scanner;

public class Assignment07b {

	public static void main(String[] args) {
		// This will calculate compound interest
		Scanner myObj = new Scanner(System.in);
		double currentBalance, newBalance;
		final double INTEREST_RATE = 1.05;
		int yearCount;
		System.out.print("Number of years to invest: ");
		yearCount = myObj.nextInt();
		System.out.print("Amount to invest: ");
		currentBalance = myObj.nextDouble();
		newBalance = currentBalance;
		
		for (int i = 1; i < yearCount + 1; i++) {
			newBalance = newBalance * INTEREST_RATE;
			System.out.print("\nYear " + i + " balance = ");
			System.out.printf("%.2f", newBalance);
			if (newBalance >= (currentBalance * 2)) {
				System.out.println("\nYou have doubled your investment");
				break;
			}
		}
	}
}
