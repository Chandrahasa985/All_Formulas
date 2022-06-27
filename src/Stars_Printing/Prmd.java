package Stars_Printing;

public class Prmd {

	public static void main(String[] args) {
		
		int a = 6;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
		}

		int b=15;
		for(int s = 1; s <= b; s++) {
			for( int t=b-s; t>0;t--) {
				System.out.print(" ");
			}for(int u=1; u<=s; u++) {
				System.out.print("* ");
			}System.out.println();
		}
	}

}
