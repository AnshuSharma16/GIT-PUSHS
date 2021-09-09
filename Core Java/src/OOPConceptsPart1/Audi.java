package OOPConceptsPart1;

public class Audi extends Car {
 public void start() {//Method overridding:: when same method is present in parent class as well as in child class >>the child class method will be given preferrred by the java compiler
	 System.out.println("Audi A3");
 }
 
 public void theftSafety() {
	 System.out.println("Hahaha");
 }
}
