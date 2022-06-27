package Prime_Numbers;

import java.util.Scanner;

public class Given_Number_is_Prime_or_Not {

	public static void main(String[] args) {
		
		int num ;
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		int a=0;
		for(int i=1;i<=num;i++){
			
		if(num%i==0){
		a++;}
		}
		if(a==2){
		System.out.println("Entered number is a prime number");
		}else{
		System.out.println("Entered number is not a prime number");}

	}

}
