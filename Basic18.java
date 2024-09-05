// Write a Java program to multiply two binary numbers.
// Input Data:
// Input the first binary number: 10
// Input the second binary number: 11
// Expected Output

// Product of two binary numbers: 110 


import java.util.Scanner;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    
	    String a="10";
	    String b="11";
	    
	    int num1=Integer.parseInt(a,2);
	    int num2=Integer.parseInt(b,2);
	    
	    int mul=num2*num1;
	    System.out.println(Integer.toBinaryString(mul));}
	     
}
