/*
	ISYS 320
	Name(s): Clayton Bruce
	Date: 4/1/2018
*/

import java.util.Scanner;

public class P2_Doubler {

	public static void main(String[] args) {

		
		
		Scanner console = new Scanner(System.in); 
		System.out.println("What is your number? "); 
		int number = console.nextInt();
		
		System.out.println("Your number doubled is: " + number*2);
	}

}
