package Prime_Numbers;

import java.util.Scanner;

public class Giver_Number_Fibonacci_or_Not {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a number");
          Scanner input = new Scanner(System.in);
          num=input.nextInt();
          int a=0;
          int b=1;
          int c=0;
          while(c<num) {
        	  c=a+b;
        	  a=b;
        	  b=c;
          }
          if(c==num) {
        	  System.out.println("Entered number is a fibonacci number");
          }else{
          System.out.println("Entered number is not a fibonacci number");
          }

	}

}
