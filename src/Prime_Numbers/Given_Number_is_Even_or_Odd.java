package Prime_Numbers;

import java.util.Scanner;

public class Given_Number_is_Even_or_Odd {

	public static void main(String[] args) {
		
		int num ;
		System.out.println("Enter a number");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if(num%2==0){
		System.out.println("Entered number is even");
		}else{
		System.out.println("Entered number is odd");}
	}

}
