/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 4th, 2021
 * Date Submitted: April 4th, 2021
 * The purpose of this assignment is to practice formatted strings and void functions.
 */
import java.util.Scanner; // Importing the Scanner class

public class Assignment04b {
	
	public static void totalCosts(String carModel, double expectedMonthlyPayment, int numberOfMonths) {
		// This takes 3 arguments and prints a formatted print statement.
		double totalCosts = (expectedMonthlyPayment * numberOfMonths);
		System.out.print("I am looking for a " + carModel + " car that I can pay " + expectedMonthlyPayment + " per month for " 
							+ numberOfMonths + " months. My total cost would be ");
		System.out.printf("%.2f", totalCosts);

	}

	public static void main(String[] args) {
		// This will take user input to get car model, expected monthly payment, and number of months.
		Scanner myObj = new Scanner(System.in); // Creating my Scanner object
		
		String carModel;
		System.out.print("Please enter car model: ");
		carModel = myObj.nextLine(); // Reading the user input and assigning it to carModel
		
		double expectedMonthlyPayment;
		System.out.print("Please enter the Expected Monthly Payment: ");
		expectedMonthlyPayment = myObj.nextDouble();
		
		int numberOfMonths;
		System.out.print("Enter number of months: ");
		numberOfMonths = myObj.nextInt();
		
		totalCosts(carModel, expectedMonthlyPayment, numberOfMonths);  // calling the method that prints the final message.

	}

}
