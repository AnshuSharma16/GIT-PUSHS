package OOPConceptsPart1;

import java.util.Scanner;

public class EligVote {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an age ::");
		age = sc.nextInt();

	
		if (age >=18) {
			System.out.println("Eligible to Vote");
			
		}
		else {
			System.out.println("Not eligible to Vote");
		}
		
	}

}
