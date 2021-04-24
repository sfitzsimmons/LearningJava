/*
 * Sean Fitzsimmons
 * e3566845
 * Due Date: April 4th, 2021
 * Date Submitted: April 4th, 2021
 * The purpose of this assignment is to calculate the number of classrooms to use and the number of remaining students there will be.
 */
public class Assignment03b {

	public static void main(String[] args) {
		// This will calculate the number of full classrooms and leftover students.
		String name = "Sean Fitzsimmons";
		int enrolledStudents = 66;
		int fullClassRooms = enrolledStudents / 20;
		int fullClassRoomsAlt = fullClassRooms; // this variable is here because I'm going to round fullClassRooms up, but may still need this value.
		int extras = enrolledStudents % 20;
		if (extras > 0) {
			fullClassRooms = fullClassRooms + 1;
		}
		System.out.println("My name is " + name);
		System.out.println("Number of enrolled students: " + enrolledStudents);
		System.out.println("Number of classrooms required for " + enrolledStudents + " enrolled students: " + fullClassRooms);
		System.out.println("You could have " + fullClassRoomsAlt + " full classrooms with " + extras + " leftover students.");
	}

}
