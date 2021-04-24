/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 4th, 2021
 * Date Submitted: April 4th, 2021
 * The purpose of this assignment is to practice creating and calling void methods.
 */
public class DriveMyCar {
	
	public static void checkMirrors() {
		System.out.println("Strap seat belt, check mirrors");
	}
	
	public static void drive() {
		System.out.println("Drive to destination....");
	}
	
	public static void unlock() {
		System.out.println("Unlock your car");
	}
	
	public static void start() {
		System.out.println("Start car's engine");
	}
	
	public static void find() {
		System.out.println("Find your car");
	}
	
	public static void give() {
		System.out.println("Give address to GPS");
	}

	public static void main(String[] args) {
		// This will call each method from above in an order that makes sense.
		find();
		unlock();
		checkMirrors();
		start();
		give();
		drive();
	}
}
