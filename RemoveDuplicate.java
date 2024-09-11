import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set <Character> pq= new HashSet<>();
       
       StringBuilder res = new StringBuilder();
       
       char [] input = sc.nextLine().toCharArray();
       
       for(char x:input){
         if(pq.add(x)){
           res.append(x);
         }
       }
      
       
      
      System.out.println(res.toString());
  }
}
