package OOps_Assigmnent1;

//Q 7 Write a JAVA program which contains a method square() such that
////square(3) returns 9,
////square(0.2) returns 0.04. 
public class SquareaReturn {
	int a;
	int squ;
	double a1;
	double squu;

	void Methodsquare(int a) {
		this.a = a;
		squ = a * a;
	}

	void Methodsquare(double a1) {
		this.a1 = a1;
		squu = a1 * a1;
	}

	void display() {
		System.out.println("   " + squ);
		System.out.println("   " + squu);
	}

	public static void main(String args[]) {
		SquareaReturn A = new SquareaReturn();
		A.Methodsquare(3);
		A.Methodsquare(0.2);
		A.display();

	}
}
