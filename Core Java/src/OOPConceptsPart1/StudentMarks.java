package OOPConceptsPart1;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int x=sc.nextInt();
	
	
	if (x < 40) {
		System.out.println("You are fail");
	}else if (x>40 && x<=50) {
		System.out.println("Grade DD");
	}else if (x>51 && x<=60) {
		System.out.println("Grade CC");
	}else if (x>61 && x<=80) {
			System.out.println("Grade BB");
	}else 
	{
		System.out.println("Grade AA");
	}
	
	
	
	 
		
			}
	
		}

		

	


