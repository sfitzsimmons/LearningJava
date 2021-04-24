/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 11th, 2021
 * Date Submitted: April 10th, 2021
 * The purpose of this assignment is to practice using return methods.
 */

import java.util.Scanner;

public class TripPlanner {

	public static double result(double miles, double speed) {
		// takes distance and speed and returns the time it will take to travel that far at that speed.
		double result;
		result = miles / speed;
		return result;
	}
	
	public static double gallons(double miles, double MPG) {
		// EXTRA CREDIT takes the distance and the MPG and returns the amount of fuel used.
		double result;
		result = miles / MPG;
		return result;
	}
	
	public static void main(String[] args) {
		// takes variables then puts them through methods that return the results I need to print.
		Scanner myObj = new Scanner(System.in); // Creation of scanner object
		
		// Declaration of variables
		double milesToTravel;
		double travelSpeedMPH;
		double travelMPG;
		
		// User input section		
		System.out.print("Enter number of miles to travel: ");
		milesToTravel = myObj.nextDouble();
		
		System.out.print("Enter travel speed (MPH) ");
		travelSpeedMPH = myObj.nextDouble();
		
		System.out.print("Enter travel MPG: ");
		travelMPG = myObj.nextDouble();
		
		// Method calling section
		double timeToTravel = result(milesToTravel, travelSpeedMPH);
		
		System.out.println("Time to travel is " + timeToTravel + " hours"); // Printing first result
		
		double gallons = gallons(milesToTravel, travelMPG);

		System.out.print("Travel will take ");  // EXTRA CREDIT formatting second result to print to two decimal places.
		System.out.printf("%.2f", gallons);       
		System.out.print(" gallons of gas.");
	}

}
