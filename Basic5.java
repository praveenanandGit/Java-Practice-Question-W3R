import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter no. A:");
	        int a=input.nextInt();
	        System.out.println("Enter no. B:");
	        int b=input.nextInt();
	        int c=a*b;
	        System.out.println(a+"x"+b+"="+c);
	}
}
