/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 11th, 2021
 * Date Submitted: April 10th, 2021
 * The purpose of this assignment is to use if statements and boolean logic.
 */

import java.util.Scanner;

public class grade_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		short grade;
		System.out.print("Enter Grade (1-100): ");
		grade = myObj.nextShort();
		System.out.print("Letter Grade is ");
		
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");				
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
