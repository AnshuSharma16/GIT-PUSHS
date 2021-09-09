package OOPConceptsPart1;

import java.util.Scanner;

public class Password {
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number::");
		int x = sc.nextInt();
		
		if(x%2==0) {
			System.out.println("The number is Even");
		}else {
			System.out.println("The number is odd");
		}
		
	}
		
		/*Password pd = new Password();
		pd.test();
		int c= pd.pqr();
		System.out.println("The sum is::" + c);
	    
		
		
	}
		public void test() {
		System.out.println("Test method");	
		}
		
		public int pqr() {
			
			int a =20;
			int b=10;
			int c = a+b;
			
			return c;
		}
}*/


public void time() {
	System.out.println("no parm method");
}

public void time(int seconds) {
	System.out.println("One parm method");
}

public void time(int minutes ,int seconds) {
	System.out.println();
}
}

