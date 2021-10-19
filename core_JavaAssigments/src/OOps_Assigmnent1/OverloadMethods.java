package OOps_Assigmnent1;

import java.util.Scanner;

//Q 10 Write a set of overloaded methods min() that returns the smaller of two numbers passed to 
//them as arguments. Make versions for int and float.
public class OverloadMethods {

	void main(int x, int y) {
		if (x > y) {
			System.out.println("min no is: " + y);
		} else {
			System.out.println("min no is: " + x);
		}
	}

	void min(float x, float y) {
		if (x > y) {
			System.out.println("min no is: " + y);
		} else {
			System.out.println("min no is: " + x);
		}
	}

	void min(int x, float y) {
		if (x > y) {
			System.out.println("min no is: " + y);
		} else {
			System.out.println("min no is: " + x);
		}
	}

	public static void main(String[] arg) {
		OverloadMethods a = new OverloadMethods();
		a.min(5, 10);
		a.min(5f, 10f);
		a.min(5, 10f);
		a.min(5f, 10);
	}
}
