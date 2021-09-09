package OOPConceptsPart1;

public class TestCar {

	public static void main(String[] args) {
		Audi ad =new Audi(); // compile time polymorphism >> at the time of compilation compiler will decide which method to call
		ad.start();
		ad.stop();
		ad.theftSafety();
		ad.refuel();
		
		System.out.println("-------------");
		
		Car ca = new Car();
		ca.start();
		ca.stop();
		ca.refuel();
		
		Car cd=new Audi(); //child class object can be referred by parent class reference variable >> run time or dynamic polymorphism or overridden method will be called
		cd.start();
		cd.stop();
		cd.refuel();
	// even by using child class reference we cannot refer theft safety which is in child class when can only refer theft safety by using static or compile time polymorphism
	//	only Audi class object can use the theft safety method and no other class can use theft safety
		
		


	}

}
