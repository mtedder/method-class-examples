import java.util.Scanner;

/**
 * 
 */

/**
 * @author Maurice
 * Methods example 1:
 * -Reuse
 * -Modularity
 */
public class ReverseStringMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Get user input from the console
		Scanner input = new Scanner(System.in);
		//Get user input
		System.out.println("Input an Interger number: ");
		String userInput = input.next();
		
		System.out.println("Result1: " + reverseNumber(userInput));//Show results header
		/*
		 * This code reverses the order of a string
		 * for-loop to loop through string in reverse order
		 * Note: Change to function for re-usability
		 */	
		System.out.print("Result2: ");
		for(int i=userInput.length()-1; i >= 0 ; i--){						
			//Show results
			System.out.print(userInput.charAt(i));
		}//end for-loop
		System.out.println();
	}//end main

	/*
	 * This function reverses the string number input as a function
	 */
	public static String reverseNumber(String userInput) {
		String output = "";//initialize to empty string
		//String reverse algorithm
//		for(int i=userInput.length()-1; i >= 0 ; i--){									
//			//concatenate chars into a new string
//			output = output + userInput.charAt(i);
//		}//end for-loop
			
		//Modulus reverse number algorithm
		int val = Integer.parseInt(userInput);
		for(int i=0; i < userInput.length() ; i++){				
			output = output + Integer.valueOf(val%10);
			val/=10;
		}	
		return output;
	}
}
