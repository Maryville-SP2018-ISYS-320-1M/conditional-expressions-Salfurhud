/*
	ISYS 320
	Name(s):AlfuhrudSolomon
	Date: Apr22, 2018
*/

import java.util.Arrays;
import java.util.Scanner;

public class P3_Consecutive {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program calculates if three input values are consecutive.");
		
		String doItAgainResponse = "";
		
		do {
			System.out.print("Enter value 1: ");
			int num1 = console.nextInt();
			System.out.print("Enter value 2: ");
			int num2 = console.nextInt();
			System.out.print("Enter value 3: ");
			int num3 = console.nextInt();
		
			System.out.printf( "a: %d, b: %d, c: %d -> ", num1, num2, num3);
			
			if(areConsecutiveNumbers(num1, num2, num3)) {
				System.out.println("The numbers are consecutive");
			} else {
				System.out.println("The numbers are not consecutive");
			}
			
			System.out.print("Would you like to do it again (enter 'n' to quit)? ");
			doItAgainResponse = console.next();
		} while( !doItAgainResponse.equalsIgnoreCase("n"));
		
		System.out.println("Thanks!");
	}
	
	public static boolean areConsecutiveNumbers(int num1, int num2, int num3 ) {
		
		int[] ns = {num1, num2, num3};
		
		Arrays.sort(ns);
		
		for(int x = 0; x < ns.length; x++) {
			if((x + 1) < ns.length) {
				if(ns[x] + 1 != ns[x + 1]) {
					return false;
				}
			}
		}
		
		return true;
	}
	


}
