import java.util.Scanner;

/**
 * 
 */

/**
 * @author Maurice
 * Methods example 2:
 * -1. Create main method using ctrl+space in class body
 * -2. Create another method called test1 returns void, no parameters
 * -3. Create another method called test2 returns void, 1 int parameter
 * -3. Create another method called test3 returns int, no parameters
 * -4. Create another method called test4 returns float, 1 Scanner class parameter
 * -5. Create another method called test5 returns a String, 3 float parameters
 * 
 */
public class CreateMethods {
	
	public static void main(String[] args) {
		
	}
	
	//test 1
	public static void test1() {
		test1();
	}
	
	//test 2
	public static void test2(int number) {
		System.out.println("Test2:" + number);
	}
	
	//test 3
	public static int test3() {			
		return (int) Math.random();
	}
	
	//test 4
	public static float test4(Scanner scan) {
		return scan.nextFloat();
	}
	
	//test 5
	public static String test5(float x, float y, float z) {
		return "Point: (" + String.valueOf(x) + ", " + String.valueOf(y) + ", " + String.valueOf(z) + ")";
	}
}
