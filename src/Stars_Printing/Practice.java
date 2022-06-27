package Stars_Printing;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
			Scanner in = new Scanner(System.in);
			//System.out.println(" Enter the first range");
			//int r1 = in.nextInt();
			System.out.println(" Enter a String");
	     String word = in.nextLine();
	   	       
	       System.out.println(word);
	       
	       int l = word.length();
	       String rev = "";
	       for(int i=l-1;i>=0;i--) {
	    	  rev = rev+word.charAt(i) ;
	       }
	       System.out.println(rev);
	       if(word.equalsIgnoreCase(rev)) {
	    	   System.out.println("It is Palindrome");
	       }else {
	    	   System.out.println("It is not Palindrome");
	       }
	       
	     
	      }
	       
	         
	       }
	      
	       
	


