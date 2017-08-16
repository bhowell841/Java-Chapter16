import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-251
 * Factorial Problem with recursion
 */
public class FactorialProblemUsingRecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number and I will give you the factorial: ");
		int number = input.nextInt();
		
		//call factorial method
		System.out.println(number + "! is " + CalcFactorial(number));

	} // end main
	
	public static int CalcFactorial(int n){
		if (n == 1){
			return n;
		}
		else{
			return n * CalcFactorial(n-1);
		}
		
	} // end CalcFactorial Method

} // end class
