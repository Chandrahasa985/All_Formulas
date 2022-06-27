package Stars_Printing;

public class Pyramid {

	public static void main(String[] args) {
		
		int a =15;
		for(int i=1;i<=a;i++) {
			for(int j=a-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
