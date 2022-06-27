package Prime_Numbers;

public class Fibonacci_Numbers {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		System.out.println("First 10 Fibonacci Numbers");
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=10;i++){
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;}
	}

}
