package OOPConceptsPart1;

public class StaticBlock {
	
	static {
	System.out.println("Hello World!");
	}
	
	public void test() {
		System.out.println("Test method");
	}
	
	static {
		System.out.println("Hi Anshu");
	}
	
	public static void main (String[] args) {
		StaticBlock obj = new StaticBlock();
		obj.test();
	}

}
