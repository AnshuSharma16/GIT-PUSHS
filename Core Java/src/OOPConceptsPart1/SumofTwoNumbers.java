package OOPConceptsPart1;

import java.util.Scanner;

public class SumofTwoNumbers {
	
	public static void radius() {
		Scanner sc = new Scanner(System.in);
		//int x,y;
		System.out.println("Enter a number");
		int x=sc.nextInt();
		System.out.println("Enter another number:");
		int y=sc.nextInt();
		System.out.println("Sum of numbers is::" + (x*y));
	}
		//Scanner sc = new Scanner(System.in);
		
		/*Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter a radius number");
		x=sc.nextInt();
		
		
		
		System.out.println("The radius of circle:: " + (x/2) + " " +  "and circumference of circle:: " + " " + (2*3.14*x/2));
		
		
	}*/

	public static void main(String[] args) {
		radius();
	}

}
