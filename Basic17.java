// Write a Java program to add two binary numbers.
// Input Data:
// Input first binary number: 10
// Input second binary number: 11
// Expected Output

// Sum of two binary numbers: 101

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	      String a="100";
	      String b="11";
	      
	      int num1=Integer.parseInt(a,2);
	      int num2=Integer.parseInt(b,2);
	      
	      int sum=num1+num2;
	      
	      System.out.println(Integer.toBinaryString(sum));
	}
}
