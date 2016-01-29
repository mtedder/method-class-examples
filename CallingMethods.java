import java.util.Scanner;

/**
 * 
 */

/**
 * @author Maurice
 * Methods example 3:
 * -Calling various method examples
 * -Assign return values to variables
 * -Print return values without assigning to variables
 */
public class CallingMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingMethods.test1();
		
		CallingMethods.test2(5);
		
		System.out.println(CallingMethods.test3());
		
		Scanner scanner = new Scanner(System.in);
		
		float output = CallingMethods.test4(scanner);
		
		String point = CallingMethods.test5(1, 7, 100);
		 System.out.println("Coordinates: " + point);
	}

	//test 1
	public static void test1() {
		System.out.println("Test1");
		return;//optional but not required
	}
	
	//test 2
	public static void test2(int number) {
		System.out.println("Test2:" + number);
	}
	
	/*
	 * test 3
	 * CAN YOU FIND THE BUG IN THIS METHOD AND FIX IT?
	 */
	public static int test3() {			
		return (int)Math.random();
	}
	
	//test 4
	public static float test4(Scanner scan) {
		System.out.println("Input a float value:");
		return scan.nextFloat();
	}
	
	//test 5
	public static String test5(float x, float y, float z) {
		return "Point: (" + String.valueOf(x) + ", " + String.valueOf(y) + ", " + String.valueOf(z) + ")";
	}
}
