/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 4th, 2021
 * Date Submitted: April 4th, 2021
 * The purpose of this assignment is to calculate and display the age I will be in the year 2030.
 */
public class Assignment03a {
	
		static final int YEAR2030 = 2030;      // Here are my constants
		static final int CURRENT_YEAR = 2021;  // for extra credit.
		
	public static void main(String[] args) {
		// This will calculate the age I will be in the year 2030.
		String student = "Sean Fitzsimmons";
		int age = 26;
		age = age + (YEAR2030 - CURRENT_YEAR);
		System.out.println(student + " will be age " + age + " in the year " + YEAR2030);
	}
}
