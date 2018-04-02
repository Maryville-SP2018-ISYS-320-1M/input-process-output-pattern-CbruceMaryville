/*
	ISYS 320
	Name(s): Clayton Bruce
	Date: 4/1/2018
*/

import java.util.Scanner;

public class P4_ScalableBox {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in); 
		System.out.print("Input Box width? :  "); 
		int width = console.nextInt();
		
		
		System.out.print("Input Box Height? :  "); 
		int height = console.nextInt();
		
		drawBoxCap(width);
		drawBoxInsides(height);
		drawBoxCap(width);
	}
	
	public static int drawBoxCap(int width) {
		
		//width below also
		System.out.print("+");
		for( int capDashIndex = 1; capDashIndex <= width - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
		return width;
	}
	
	public static void drawBoxInsides(int height) {
		for( int insideRowIndex = 1; insideRowIndex <= height - 2; insideRowIndex++ ) {
			drawBoxInsideLine(height);
		}
	}
	
	public static int drawBoxInsideLine(int width) {
		
		//Width below
		System.out.print("|");
		for( int insideRowIndex = 1; insideRowIndex <= width - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
		return width;
	}
	

}
