package OOPConceptsPart1;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String::");
		String str = sc.nextLine();
		System.out.println("Number of vowels in a string" + count_vowels(str)+ "\n");
	}
		public static int count_vowels(String str) {
			
			int count =0;
			for (int i=0;i<str.length();i++) {
				if(str.charAt(i) == 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u')
				{
					count++;
					
				}
			}
				return count;
				
			}
			
		}
		
		
/*Scanner in = new Scanner(System.in);
System.out.print("Input the string: ");
String str = in.nextLine();

System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
}
public static int count_Vowels(String str)
{
int count = 0;
for (int i = 0; i < str.length(); i++)
{
    if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
            || str.charAt(i) == 'o' || str.charAt(i) == 'u')
    {
        count++;
    }
}
return count;
}
}*/
		
		


