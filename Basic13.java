//  Write a Java program to print the area and perimeter of a rectangle.
// Test Data:
// Width = 5.5 Height = 8.5

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter Length");
	        int L=input.nextInt();
	        System.out.println("Enter Breadth");
	        int B=input.nextInt();
	        int perimeter=2*(L+B);
	        int area=L*B;
	        System.out.println("Perimeter:"+perimeter+"\n"+"Area:"+area);
	}
}
