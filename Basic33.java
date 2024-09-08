// Write a Java program and compute the sum of an integer's digits.
// Input Data:
// Input an integer: 25
// Expected Output

// The sum of the digits is: 7
import java.util.*;

public class Main
{
	public static void main(String[] args) {

		System.out.println("Enter number:");
		Scanner sc= new Scanner(System.in);

		int num=sc.nextInt();
		int sum=0;
		while(num>0){
		   int num1= num%10;
		   sum=sum+num1;
		   num=num/10;
		}
		System.out.println(sum);
	

	}
}
