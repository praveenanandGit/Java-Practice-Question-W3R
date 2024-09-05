//Write a Java program to swap two variables.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("A:");
	        int a = sc.nextInt();
	        System.out.println("B:");
	        int b= sc.nextInt();
	      //Using Third variable 
	       // int c=0;
	        
	       // c=a;
	       // a=b;
	       // b=c;
	       // System.out.println("after swap A:"+a+" and B:"+b);
	        
	   // Without using Third variable
	   
	    a = a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("after swap A:"+a+" and B:"+b);
	    
	   
	   
	   
	        
	       
	       
	}
}
