package Stars_Printing;

public class Pyramid_Shape {

	public static void main(String[] args) {
		int a = 10;
		for(int i=1; i<=a; i++)	{
			for(int j=((a-i)/2);j>0;j--) {
				System.out.print(" ");}
			
			for(int j=1;j<=i;j++) {
				System.out.print(" *");}
			
			for(int k=((a-i)/2);k>0;k--) {
				System.out.print(" ");}
			
			System.out.println();
			}

	}

}
