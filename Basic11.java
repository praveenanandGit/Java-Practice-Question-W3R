package basicPracticeQuestion;

import java.util.Scanner;

public class Basic5 {
	
		public double r;
		
		public double perimeter (double radius) {
			
			double peri=2*Math.PI*radius;
			
			return peri;
			
		}
		
		public double area(double radius) {
			double a=Math.PI*radius*radius;
			return a;
			
		}
		

	public static void main(String[] args) {
		
		  Basic5 myobj=new Basic5();
		  myobj.r=3;
		 System.out.println(myobj.perimeter(myobj.r));
		 System.out.println( myobj.area(myobj.r));
		
	}

}
