
public class DataTypes {
	
	String name;
	int age;
	
	public DataTypes() {
		System.out.println("Default Constructor");
	}
	
	public DataTypes(int a)
	{
		System.out.println("The value of a is" + a);
	}
	
	public DataTypes(String name , int age) {
		this.name= name;
		this.age= age;
		
		System.out.println(name);
		System.out.println(age);
		
		
	} 
	
	public static void main(String[] args) {
		
		DataTypes obj = new DataTypes();
		DataTypes obj1 = new DataTypes(25);
		DataTypes obj2= new DataTypes("Anshu" , 25);
		
		
		

}
}