/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

**************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Input a string");
	  
	  char [] str=sc.nextLine().toCharArray();
	    char [] str1=new char[str.length];
	  for (int i = 0; i < str.length; i++) {
            str1[i] = str[str.length - 1 - i];
        }
        
      System.out.print(new String(str1));  
        
        
	   
	}
}
