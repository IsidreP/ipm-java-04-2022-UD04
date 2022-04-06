package package1;

public class Ej05 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;

		b=c;
		c=a;
		a=d;
		d=b;
		
		System.out.println(a+" "+b+" "+c+" "+d);
	}

}
