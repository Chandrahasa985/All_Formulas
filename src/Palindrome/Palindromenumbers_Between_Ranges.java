package Palindrome;

import java.util.Scanner;

public class Palindromenumbers_Between_Ranges {

	public static void main(String[] args) {
	
		int r1,r2,org,rev;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Range 1");
		r1 = in.nextInt();
		System.out.println("Enter Range 2");
		r2 = in.nextInt();
		for(int i=r1;i<=r2;i++){
		org=i;
		rev=0;
		while(org!=0){
		int rem = org%10;
		org/=10;
		rev=rev*10+rem;}
		if(i==rev){
		System.out.print(i+" ");}}
	}

}
