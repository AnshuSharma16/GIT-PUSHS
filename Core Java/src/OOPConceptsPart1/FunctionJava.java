package OOPConceptsPart1;

public class FunctionJava {

	public static void main(String[] args) {
		FunctionJava obj = new FunctionJava(); //one object will be created and obj is the ref variable and new 
		//after creating the obj the copy of non static methods will be given to this obj
		
		obj.test();
		int m= obj.pqr();
		System.out.println(m);
		
		int div = obj.division(60, 20);
		System.out.println(div);
		
		String n = obj.qa();
		System.out.println(n);
	}
	
	//non static methods
	public void test() {
		System.out.println("Addition");
	}
	
	public int pqr() {
		System.out.println("Addition");
		int a=10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	
	public String qa() {
		System.out.println("Selenium");
		
		String s = "New Selenium";
		return s;
	}

public int division (int x ,int y) {
System.out.println("Division");
int a=x/y;

 return a;
}
}

