import javax.swing.JOptionPane;

/*
 * Brendan Howell
 * CSC-251
 * Recursive Power Method
 * 
 * This project contains a method that uses recursive to 
 * raise a number to a power.  The method will accept both
 * arguements, the number and the exponent.
 */
public class RecursivePowerMethod {
	
	public static void main(String[] args){
		int base;
		int power;
		String input;

		//get data
		input = JOptionPane.showInputDialog("Enter a " +
				"nonnegative number:");
		base = Integer.parseInt(input);

		input = JOptionPane.showInputDialog("Enter a power: ");
		power = Integer.parseInt(input);

		JOptionPane.showMessageDialog(null, base + " to the power of " + power +
				 " = " + findPower(base, power));


	} //end main

	private static int findPower(int b, int p){
		if (p == 0)
			return 1;
		else 
			return b * findPower(b, p-1);
			
	} //end findPower
	
} //end class
