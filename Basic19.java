import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	    
	    Scanner sc= new Scanner(System.in);
	    
	    System.out.println("Enter Number:");
	    int num=sc.nextInt();
	    
	    String hexnum="";
	    int rem=0;
	    
	    while (num>0){
	        rem=num%16;
	        hexnum=(hex[rem]+hexnum);
	        num=num/16;
	    }
	    System.out.println(hexnum);
	    
	    
	    
	
	}
}
