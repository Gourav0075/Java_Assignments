package Exception_handling_lab;

public class This_Example {

	int a, b;
	String c;

	This_Example(int a, int b) {
		this.a = a;
		this.b = b;
	}

	This_Example(int a, int b, String c) {
		this(a, b);
		this.c = c;
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String[] args) {
		new This_Example(1, 2, "abc");

	}

}
