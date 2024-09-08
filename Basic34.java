// Write a Java program to compute hexagon area.
// Area of a hexagon = (6 * s^2)/(4*tan(π/6))
// where s is the length of a side
// Input Data:
// Input the length of a side of the hexagon: 6
// Expected Output

// The area of the hexagon is: 93.53074360871938
import java.util.*;

public class Main

{   public static double area(double s){
    
        double a= (6*Math.pow(s,2))/(4*Math.tan(Math.PI/6));
        return a;
    
    }
	public static void main(String[] args) {

		System.out.println("Enter side:");
		Scanner sc= new Scanner(System.in);

		int num=sc.nextInt();
	    System.out.println(area(num));
	}
}
