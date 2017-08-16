/*
 * Brendan Howell
 * CIS-251
 * Example of using a recursive method
 */
public class RecursionExample {

	public static void main(String[] args) {
		message(5);

	} //end main
	
	
	public static void message(int numberOfTimes){
	
		System.out.println("Are we there yet?");
		if (numberOfTimes > 1){
		message(numberOfTimes - 1);
		}
	} //end message method

	
	
	
} //end class
