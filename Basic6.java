package basicPracticeQuestion;

import java.util.Scanner;

public class Basic5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int b=sc.nextInt();
		
		int result=0;
		
		result=a+b;
		System.out.println(a+"+"+b+"="+result);
		result=a-b;
		System.out.println(a+"-"+b+"="+result);
		result=a*b;
		System.out.println(a+"*"+b+"="+result);
		result=a/b;
		System.out.println(a+"/"+b+"="+result);
		result=a%b;
		System.out.println(a+" mod "+b+"="+result);
		
		
	}

}
