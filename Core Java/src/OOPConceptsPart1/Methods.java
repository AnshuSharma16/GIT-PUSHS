package OOPConceptsPart1;

public class Methods {
	
		public void login()
		{
			System.out.println("I am in method");
		}
		

	public static void main(String[] args) {
		Methods a = new Methods();
		Methods2 fn  = new Methods2();
		fn.setData();
		a.login();

	}
	}


