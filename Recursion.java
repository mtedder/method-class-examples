/**
 * 
 */

/**
 * @author Maurice
 * Recursion example 6:
 * -factorial with and without recursion
 * -Ref: http://www.javawithus.com/programs/factorial
 */
public class Recursion {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calculate the factorial without using recursion
		int n = 10;
		int result = 1;//initialize result

		//factorial for-loop
		for(int i=1 ; i <= n; i++){
			result = result * i;
		}
		
		System.out.println("Result-without recursion = " + result);
		
		System.out.println("Result-with recursion = " + factorial(n));
	}
	
	/*
	 * Calculate the factorial using recursion
	 */
	public static int factorial(int n) {
	       if (n == 0) {//exit condition - otherwise causes StackOverflowError
	           return 1;
	       } else {
	           return n * factorial(n - 1);
	       }	      
	  }	

}
