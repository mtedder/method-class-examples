import java.util.Scanner;

/**
 * 
 */

/**
 * @author Maurice
 * Examples of how to code various operations
 */
public class CodePatterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String answer = "y";
		do {
			System.out.println("Continue (y)es or (n)o");
			answer = scan.next();
		} while (answer.equalsIgnoreCase("y"));
		System.out.println("Bye!");
	}
	
	/*
	 * 
	 */
	public static boolean validateInteger(int input) {
		return true;
	}

}
