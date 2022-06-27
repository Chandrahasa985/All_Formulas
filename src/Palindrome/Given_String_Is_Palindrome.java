package Palindrome;

import java.util.Scanner;

public class Given_String_Is_Palindrome {

	public static void main(String[] args) {
		
		String str,rev = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		str=in.nextLine();
		
		int l = str.length();
		
		for(int i=l-1;i>=0;i--){
			
		rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equalsIgnoreCase(rev)){
		System.out.println("The String is Palindrome");
		}else{
		System.out.println("The String is not Palindrome");}

	}

}
