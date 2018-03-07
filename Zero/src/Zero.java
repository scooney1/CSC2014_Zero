/**
 * Author:	Sam Cooney
 * Project:	Zero
 * Date:	Nov 29, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

public class Zero {

	public static void main(String[] args) {
		int numer = 10;
		int denom = 0;
		
		try {
			
			System.out.println(numer/denom);
		} catch (ArithmeticException problem) {
			
			System.out.println("Bad division.");
			System.out.println("The exception message: " + problem.getMessage());
			System.out.println();
			System.out.println("The call stack trace:");
			problem.printStackTrace();
		}
		
		System.out.println("This will not print.");
	}

}
