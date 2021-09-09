
public class TwoDArrays {

	public static void main(String[] args) {
		int x[][]= new int[3][9];
		System.out.println(x.length); //3-- will give total number of rows
        System.out.println(x[0].length); //5-- will give total number of cols
        
        //1st row
        x[0][0] = 20;
        x[0][1] =30;
        x[0][2] = 40;
        x[0][3]	=20;
        x[0][4]	= 100;
        
        //2nd row
        x[1][0] = 25;
        x[1][1] = 35;
        x[1][2] = 22;
        x[1][3] = 25;
        x[1][4] = 32;
        
        //3rd row
        x[2][0] = 25;
        x[2][1] = 35;
        x[2][2] = 22;
        x[2][3] = 25;
        x[2][4] = 32;
        
        
        System.out.println(x[2][2]);
        
        //To print all the values of 2D arrays:
        
        for (int row=0;row < x.length;row++)
        	for (int col=0; col< x[0].length;col++)
        		
        	{
        		System.out.println(x[row][col]);
        	}
        
        
	}

}
