import java.util.Scanner;

/**
 * 
 */

/**
 * @author Maurice
 * Passing Parameters example 5:
 * -Show passing by value
 * -Show passing by reference
 */
public class PassingParams {
	
	public static void main(String[] args) {
		int input1 = 10;
		test1(input1); //By value
		System.out.println("Test1 - Main:" + input1);
		
		int [] input2 =  {10};
		test2(input2);// by reference
		System.out.println("Test2 - Main:" + input2[0]);				
	}
	
	//test 1 - By value (makes a copy)
	public static void test1(int input) {
		System.out.println("Test1 input: " + input);
		
		input++;//modify
		
		System.out.println("Test1 input(modified): " + input);		
	}
	
	//test 2 - By Reference (modifies parameter)
	public static void test2(int[] input2) {
		System.out.println("Test2:" + input2[0]);
		
		input2[0] = input2[0] + 1;//modify
		
		System.out.println("Test2 input(modified): " + input2[0]);				
	}	
}
