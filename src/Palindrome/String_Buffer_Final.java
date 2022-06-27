package Palindrome;

public class String_Buffer_Final {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Chandra");
		StringBuffer rep = str.replace(1, 7, "Naveen");
		System.out.println(rep);
		StringBuffer rev = str.reverse();
		
		System.out.println(rev);

	}

}
