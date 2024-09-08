//  Write a Java program to compare two numbers.
// Input Data:
// Input first integer: 25
// Input second integer: 39
// Expected Output

// 25 != 39                                                                          
// 25 < 39                                                                           
// 25 <= 39
import java.util.*;

public class Main
{
	public static void main(String[] args) {

		System.out.println("Enter First number:");
		Scanner sc= new Scanner(System.in);

		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		
		if(a<b){
		    System.out.println(a+"<"+b);
		    if(a<=b)
		    {
		        System.out.println(a+"<="+b);
		    }
		    if(a!=b){
		        System.out.println(a+"!="+b);
		    }
		}
		else{
		    if(a>b){
		    System.out.println(a+">"+b);
		    if(a>=b)
		    {
		        System.out.println(a+">="+b);
		    }
		    if(a!=b){
		        System.out.println(a+"!="+b);
		    }
		}
		
		}
		








	}
}
