package Palindrome;

public class Sample {

	public static void main(String[] args) {


		String str = "Chandrahasa Reddy";
		int a = str.length();
		String rev = "";
		
		for ( int i = a-1; i>=0;i--) {
			
			rev = rev+str.charAt(i);
			
			
		}
		System.out.println(rev);
	}

}
