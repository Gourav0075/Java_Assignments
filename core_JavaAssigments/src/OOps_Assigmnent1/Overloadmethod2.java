package OOps_Assigmnent1;
//Q 11 Write a set of overloaded methods power() that returns the Xn

////where n is integer and X may be int and float.

public class Overloadmethod2 {

	int n;
	int num1;
	int num2;

	Overloadmethod2() {
	}

	int Overloadmethod23(int num1, int n) {
		int x = (int) Math.pow(num1, n);
		return x;
	}

	float Overloadmethod23(float num1, int n) {

		float x = (float) Math.pow(num1, n);
		return x;
	}

	public static void main(String[] args) {

		Overloadmethod2 o1 = new Overloadmethod2();

		int x = o1.Overloadmethod23(4, 3);
		System.out.println("the integer type square is : " + x);

		float y = o1.Overloadmethod23(4.0f, 2);
		System.out.println("the float type square is :" + y);

	}

}
