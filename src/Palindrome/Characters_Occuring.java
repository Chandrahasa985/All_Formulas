package Palindrome;

import java.util.Scanner;

public class Characters_Occuring {

	public static void main(String[] args) {
	String str = "chandra";
	char c = 'c';
	char h = 'h';
	char a = 'a';
	char n = 'n';
	char d = 'd';
	char r = 'r';
	
	int l = str.length();
	
	int cc = 0;
	int ch = 0;
	int ca = 0;
	int cn = 0;
	int cd = 0;
	int cr = 0;
	
	
	for(int i=0; i<=l-1;i++) {
		
		char x = str.charAt(i);
		
		if(x==c) {
			cc++;
		}else if (x==h) {
			ch++;
	} else if (x==a) {
		ca++;
		
	}else if (x==n) {
		cn++;
	} else if (x==d) {
		cd++;
	} else if (x==r) {
		cr++;
	}
		
	}
	System.out.println("c="+cc);
	System.out.println("h="+ch);
	System.out.println("a="+ca);
	System.out.println("n="+cn);
	System.out.println("d="+cd);
	System.out.println("r="+cr);
		
	
}}
