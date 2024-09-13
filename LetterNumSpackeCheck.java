package basicPracticeQuestion;

import java.util.Scanner;

public class Basic5 {
	
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int letter=0;
		int space=0;
		int number=0;
		int other=0;
		System.out.println("Enter a String");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isLetter(c)) {
				letter++;
			}
			else if(Character.isWhitespace(c)) {
				
				space++;
				
			}
			else if(Character.isDigit(c)) {
				number++;
			}
			else {
				other++;
			}

		}
		System.out.println("Letter:"+letter+"Space:"+space+"Number:"+number+"Others:"+other);
		
	}

	
	}


