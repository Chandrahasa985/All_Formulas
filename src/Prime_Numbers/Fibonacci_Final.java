package Prime_Numbers;

public class Fibonacci_Final {

	public static void main(String[] args) {


		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b);
		for (int i=3; i<=20; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}

}
