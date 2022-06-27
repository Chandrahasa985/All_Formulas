package Prime_Numbers;

public class Palindrome_Final {

	public static void main(String[] args) {


		String str = "radar";
		int l = str.length();
		String rev = "";
		for (int i =l-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
