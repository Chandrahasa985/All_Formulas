package Stars_Printing;

public class Pyramid_Final {

	public static void main(String[] args) {

		int num=10;
		for(int i=1;i<=num;i++) {
			for(int j=num-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
