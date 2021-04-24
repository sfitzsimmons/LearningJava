/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 25th, 2021
 * Date Submitted: April 22th, 2021
 * The purpose of this assignment is to practice using the Local and Currency classes to dip our toes in OOP.
 */

import java.util.Currency;
import java.util.Locale;

public class Assignment10 {
	
	public static void displayMyLocaleInfo(Locale place) {
		// This will take a Locale and display its Country, Language, and Currency
		
		// Here I extract the needed data from the Locale argument.
		Currency currency = Currency.getInstance(place);  // Making a currency object to get Locale's currency
		String country = place.getDisplayCountry();  // Extracting country name
		String language = place.getDisplayLanguage();  // Extracting language used
		String money = currency.getDisplayName();  //Extracting currency used from the currency object I made
		
		String result = "The country ????????? speaks ???? and uses the currency !!!!."; // This string needs some work.
		
		// Here's my work on the string
		result = result.replace("?????????", country);
		result = result.replace("????", language);
		result = result.replace("!!!!", money);
		
		// Now let's print
		System.out.println(result);

	}

	public static void main(String[] args) {
		// This will display locale specific information
		
		// Making 4 local objects
		Locale usa = new Locale("en","us");
		Locale greatBritian = new Locale("en", "gb");
		Locale Mexico = new Locale("es", "mx");
		Locale Panama = new Locale("es", "pa");
		
		// Calling my displayMyLocaleInfo for each of the Locale objects I created
		displayMyLocaleInfo(usa);
		displayMyLocaleInfo(greatBritian);
		displayMyLocaleInfo(Mexico);
		displayMyLocaleInfo(Panama);
	}
}
