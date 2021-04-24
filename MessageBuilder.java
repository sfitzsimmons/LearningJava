/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 25th, 2021
 * Date Submitted: April 22th, 2021
 * The purpose of this assignment is to practice managing strings and string methods.
 */

import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;

public class MessageBuilder {
	
	public static String shipDOW() {
	      Calendar in3days = Calendar.getInstance(); 
	       in3days.add(Calendar.DAY_OF_YEAR, 3); 
	      return in3days.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.getDefault()); 
	 }
	
	public static String referenceNumber() {
	      return Long.toString(System.currentTimeMillis());
	 }

	public static void main(String[] args) {
		// This will generate text for an email
		
		// Creating Scanner Object
		Scanner myObj = new Scanner(System.in);
		
		// Declaring Variables
		String contact;
		String item;
		String count;
		
		// Strings given for assignment
		String salutation = "Dear $CONTACT$,\n";
		String customerInfo = "Your order for $COUNT$ $ITEM$ will be shipped $DOW$. \n";
		String orderNumber = "The reference number is $REF$\n";
		
		// Collecting user input
		System.out.print("Enter contact name: ");
		contact = myObj.nextLine();
		
		System.out.print("Enter item to order: ");
		item = myObj.nextLine();
		
		System.out.print("Enter number of items: ");
		count = myObj.nextLine();
		
		System.out.println();
		
		// Putting strings in strings
		salutation = salutation.replace("$CONTACT$", contact);
		customerInfo = customerInfo.replace("$COUNT$", count);
		customerInfo = customerInfo.replace("$ITEM$", item);
		customerInfo = customerInfo.replace("$DOW$", shipDOW());
		orderNumber = orderNumber.replace("$REF$", referenceNumber());
		
		// Vultron String
		String emailMsg = salutation.concat(customerInfo.concat(orderNumber));
		
		// Print result
		System.out.println(emailMsg);
		
		// Close Scanner object
		myObj.close();
	}
}
