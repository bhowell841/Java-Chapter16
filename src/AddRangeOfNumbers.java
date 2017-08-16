import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-251
 * User enters a positive integer
 * Use recursion to add numbers from that number to 1
 */
public class AddRangeOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();
		
		System.out.println(number + " summed down to one is " + addNumbers(number));

	} //end main
	
	public static int addNumbers(int n){
	if (n == 1){
		return n;		
	}
	else{
		return n + addNumbers(n-1);
	}
	
	} //end addNumbers method
} //end class
