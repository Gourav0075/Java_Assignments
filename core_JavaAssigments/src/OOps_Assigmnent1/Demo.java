package OOps_Assigmnent1;

//Q 9 Write a JAVA program which contains a method fun() such that fun(x) returns x2
//and fun(x,y)
//returns x2 + y2
//. (where x and y are integers).
import java.util.Scanner;

public class Demo {

	int res1, res2, res3;

	int Fun(int x) {
		res1 = x * x;
		return res1;
	}

	int Fun(int x, int y) {
		res2 = x * x;
		res3 = y * y;
		return res2 + res2;
	}

	void showx() {
		System.out.println("result is :" + res1);
	}

	void showxy() {
		System.out.println("result is : " + (res2 + res3));
	}

	public static void main(String[] arg) {
		Demo a = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 or 2");
		int c = sc.nextInt();
		if (c == 1) {
			System.out.println("Enter one number");
			int num = sc.nextInt();
			a.Fun(num);
			a.showx();
		} else if (c == 2) {
			System.out.println("Enter two number");
			int num1, num2;
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			a.Fun(num1, num2);
			a.showxy();

			sc.close();
		}
	}

}
