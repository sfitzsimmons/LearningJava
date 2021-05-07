import java.util.Scanner;

public class Loan {
	
	private int ammount;
	private int years;
	private int months, payments;
	private double payment_ammount;
	private double annual_percentage_rate;
	private double total_cost;
	
	public Loan() {
		
		// this takes the necessary information to have a loan.
		Scanner thisLine = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter loan ammount: ");
		this.setAmmount(thisLine.nextInt());
		// this.ammount = thisLine.nextInt();
		System.out.println();
		System.out.println();
		System.out.print("Enter duration of Loan in years: ");
		this.setYears(thisLine.nextInt());
		// this.years = thisLine.nextInt();
		System.out.println();
		System.out.println();
		System.out.print("Enter APR: ");
		this.setAnnual_percentage_rate(thisLine.nextDouble()+1);
		// this.years = thisLine.nextInt();
		System.out.println();
		thisLine.close();
		
		months = years * 12;
		payments = months;
		payment_ammount = (ammount / payments) * annual_percentage_rate;
		total_cost = payment_ammount * payments;
		
	}

	@Override
	public String toString() {
		return "Loan [ammount=" + ammount + ", years=" + years + ", months=" + months + ", payments=" + payments
				+ ", payment_ammount=" + payment_ammount + ", rate=" + annual_percentage_rate + ", total_cost=" + total_cost + "]";
	}

	///////////////////////////////////////////////////////
	///////////////////////////////////////////////////////
	///////////////                         ///////////////
	/////////         Getters and Setters         /////////                          
	////                                               ////
	//                                                   //
	public int getAmmount() {
		return ammount;
	}

	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public int getPayments() {
		return payments;
	}

	public void setPayments(int payments) {
		this.payments = payments;
	}

	public double getPayment_ammount() {
		return payment_ammount;
	}

	public void setPayment_ammount(double payment_ammount) {
		this.payment_ammount = payment_ammount;
	}

	public double getAnnual_percentage_rate() {
		return annual_percentage_rate;
	}

	public void setAnnual_percentage_rate(double annual_percentage_rate) {
		this.annual_percentage_rate = annual_percentage_rate;
	}

	public double getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}
	//                                                   //
	////                                               ////
	/////////         Getters and Setters         /////////
	///////////////                         ///////////////
	///////////////////////////////////////////////////////
	///////////////////////////////////////////////////////
	
	

}
