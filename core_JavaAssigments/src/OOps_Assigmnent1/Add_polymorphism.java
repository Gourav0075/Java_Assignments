package OOps_Assigmnent1;

//Q 6 wap to perform addition of two three and fourth integer numbers
//using functions
//(use polymorphism)
public class Add_polymorphism {

	int a, b, c, d;
	int sum;

	void Sum(int a, int b) {
		this.a = a;
		this.b = b;
		sum = a + b;
	}

	void Sum(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		sum = a + b + c;
	}

	void Sum(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		sum = a + b + c + d;
	}

	void Display() {
		System.out.println("Sum Of The Digit Number = " + sum);
	}

	public static void main(String args[]) {
		Add_polymorphism A = new Add_polymorphism();
		// A.Sum(5,5);
		// A.Sum(5,5,5);
		A.Sum(5, 5, 5, 5);
		A.Display();
		Add_polymorphism A1 = new Add_polymorphism();
		A1.Sum(5, 5);
		A1.Display();
	}
}
