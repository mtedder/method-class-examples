import java.util.Scanner;

/**
 * 
 */

/**
 * @author Maurice
 * 	Methods example 4:
 * -Calling various method examples
 * -Assign return values to variables
 * -Print return values without assigning to variables
 */
public class MethodOverloading {
	
	public static void main(String[] args) {
		//Get user input from the console
		Scanner input = new Scanner(System.in);
		//Get user input
		System.out.println("Input an number: ");
		String userInput = input.next();
		input.nextLine();
				
		System.out.println("Call passing String input: " + reverseNumber(userInput));//Show results
		
//		int intUserInput = Integer.parseInt(userInput);//convert to int
		System.out.println("Input an integer number: ");
		int intUserInput = input.nextInt();
		
		System.out.println("Call passing int input: " + reverseNumber(intUserInput));//Show results
		
	}//end main

	/*
	 * This function reverses the string number input as a function
	 */
	public static String reverseNumber(String userInput) {
		String output = "";//initialize to empty string
		//String reverse algorithm
		for(int i=userInput.length()-1; i >= 0 ; i--){									
			//concatenate chars into a new string
			output = output + userInput.charAt(i);
		}//end for-loop
			
		return output;
	}
	
	/*
	 * This function reverses the number input as a function
	 */
	public static String reverseNumber(int val) {
//	public static int reverseNumber(String userInput) {//what happens when we use this version
		String output = "";//initialize to empty string
		
		//Modulus reverse number algorithm
		String userInput = String.valueOf(val);
		for(int i=0; i < userInput.length() ; i++){				
			output = output + Integer.valueOf(val%10);
			val/=10;
		}	
		return output;
	}	
}
