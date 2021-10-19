package OOps_Assigmnent1;

import java.util.Scanner;


////Q 12 create an object of class .in case if user wish to store value to instance 
////variable so that should be possible .if he doesnot passes any value then variable 
////should assigned zero.
public class object {

	int a;

	object() {
		this.a = 0;
	}

	object(int b) {
		this.a = b;
	}

	void display() {
		System.out.println("Value of A is  = " + a);
	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("If You want to Enter Value Then Plz Press 1");
		int c = sc.nextInt();
		if (c == 1) {
			System.out.println("Enter the Value ");
			int d = sc.nextInt();
			object a = new object(d);
			a.display();
		} else {
			object a = new object();
			a.display();
		}

	}
}
