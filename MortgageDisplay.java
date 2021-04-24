/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 11th, 2021
 * Date Submitted: April 10th, 2021
 * The purpose of this assignment is combine using user input along with boolean logic.
 */

import java.util.Scanner;

public class MortgageDisplay {

	public static void main(String[] args) {
		// This will create two booleans and then if both are true, it will tell the user they qualify for the loan.
		Scanner myObj = new Scanner(System.in);
		Boolean residence;
		Boolean credit;
		System.out.print("Enter 1 if the Home will be the primary residence, or 0 if not the primary residence: ");
		byte answer = myObj.nextByte();
		
		if (answer == 1) {
			residence = true;
		} else {
			residence = false;
		}
		
		int creditScore;
		System.out.println("Enter the Credit Score: ");
		creditScore = myObj.nextInt();
	
		if (creditScore >= 580) {
			credit = true;
		} else {
			credit = false;
		}
		
		if (residence == true & credit == true) {
			System.out.println("Qualifies for the loan");
		} else {
			System.out.println("Does not qualify for the loan");
		}
		
	}

}
