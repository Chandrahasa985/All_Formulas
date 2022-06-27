package Prime_Numbers;

import java.util.Scanner;

public class Even_Numbers {

	public static void main(String[] args) {
		
	Scanner f = new Scanner(System.in);
	Scanner l = new Scanner(System.in);
	System.out.println("Enter starting number");
	int first = f.nextInt();
	System.out.println("Enter ending number");
	int last = l.nextInt();
	System.out.println("Even numbers from "+first+" to "+last+" are");
		
		for(int i=first;i<=last;i+=2) {
			System.out.print(i+" ");
		}
	
	   }
	}
	


