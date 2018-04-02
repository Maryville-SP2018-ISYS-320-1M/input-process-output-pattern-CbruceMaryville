/*
	ISYS 320
	Name(s): Clayton Bruce
	Date: 4/1/2018
*/

import java.util.Scanner;

public class P3_EchoChamber {

	public static void main(String[] args) {

		
		
		Scanner console = new Scanner(System.in); 
		System.out.print("What is your phrase? :  "); 
		String input = console.nextLine();
		System.out.print("How many times do you want it repeated? : ");
		int num = console.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println(input);
		}
		
	}

}
