
public class StaticArrays {

	public static void main(String[] args) {
		//Advantages : I can store multiple value in a single variable
		//dis-advantage: 1. size is fixed i.e static array >> To overcome this problem we use collections- ArrayList, hasTable (dynamic array)
		//2. It can store similar values >> To overcome this problem we use object array
		//
		
		//1. int array
		//lowest bound/index = 0
		//highest bound/index = n-1 i.e 4-1=3
		
	/*	int i[] = new int[8];
		i[0]=20;
		i[1]=30;
		i[2]=10;
		i[3]=15;
		i[4]=16;
		i[5]=12;
		i[6]=11;
	    i[7]=8;
		
	   // System.out.println(i);
	    for (int j=0;j<=7;j++) {
	    	
	    	System.out.println(i[j]);
	    	
	    }*/
	    	
	//double array
		
		/*double d[] = new double[4];
		d[0]=12.33;
		d[1]=13.25;
		d[2]= 0.881;
		d[3]=22.35;
		
		System.out.println(d[2]);*/
	    
		
// 	System.out.println(i[5]); >> Array index out of box exception
       
		//print all the values of array using for loop
		//for (int j=0;j<5;j++) {
		
		//	System.out.println(i[j]);
		//}
        	
        
	

//2.double array


    /* double d[] = new double[3];
      d[0] = 32.33;
      d[1] = 52.32;
      d[2]= 22.36;
      
      for (int j=0;j<3;j++){
    	  
    	  System.out.println(d[j]);
    
      }
     
     //3.Char array
      
      char c[] = new char[3];
      c[0]= 'a';
      c[1]= 'b';
      c[2]= 'c';
      
      for (int j=0; j<3; j++) {
    	  System.out.println(c[j]);
      }
      //System.out.println(c[0]);
    
      //4.String array
      
      String s[] = new String[3];
      s[0] = "Good";
      s[1] = "Anshu";
      s[2] = "Sharma";
      
      for (int j=0; j<3; j++) {
    	  System.out.println(s[j]);
      }*/

    //5.Object Array >> Object is a class >> it is used to store different data types
      
      Object ob[] = new Object[3];
      ob[0] = "Anshu";
      ob[1] = 12.33;
      ob[2] = 20;
      {
      System.out.println(ob[0]);
      
     
     
}

	//find largest and average
	
	/*int k[] = new int[3];
	 k[0] = 100;
	 k[1] = 200;
	 k[2] = 300;
	 
	 int sum = k[0]+k[1]+k[2];
	 System.out.println(sum);
	 int avg = sum/3;
	 System.out.println("Average of arraylist is:" + "" + avg);
	 
	/* if (k[0] > k[1] && k[0] > k[2]) {
		 System.out.println("A is the highest i.e" + k[0]);
	 }
	 else if (k[1] > k[2]) {
		 System.out.println("B is the highest i.e" + k[1]);
	 }
	 
	 else 
	 {
		 System.out.println("C is the highest i.e" + k[2]);
	 }
	 */
	    
	 
	
	
}
	   }
	


