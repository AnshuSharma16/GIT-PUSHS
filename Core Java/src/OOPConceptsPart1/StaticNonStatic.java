package OOPConceptsPart1;

public class StaticNonStatic {
	String name ="Anshu";
	static int age = 25;
	
	

	public static void main(String[] args) {
		
		StaticNonStatic.sum(); //Calling by class name
		sum(); //Direct calling
		
		System.out.println(StaticNonStatic.age);
		
		//Calling non -static 
		
		StaticNonStatic obj = new StaticNonStatic();
			obj.test();
		System.out.println(obj.name);
		
		obj.sum(); //I can also access static method using obj reference but one warning is there and it is not a good practice
			
		
	}
public void test() {
	System.out.println("Test method");
}
public static void sum() {
	System.out.println("sum method");
}
}
