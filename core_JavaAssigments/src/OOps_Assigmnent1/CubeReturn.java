package OOps_Assigmnent1;
////Q 8 Write a JAVA program which contains a method cube() such that
////cube(3) returns 27,
////cube(0.2) returns 0.008.
public class CubeReturn {
	int a;
	int cube;
	double a1;
	double cube1;

	void cubeInt(int a) {
		this.a = a;
		cube = a * a * a;
	}

	void cubeDouble(double a1) {
		this.a1 = a1;
		cube1 = a1 * a1 * a1;
	}

	void display() {
		System.out.println("   " + cube);
		System.out.println("   " + cube1);
	}

	public static void main(String args[]) {
		CubeReturn A = new CubeReturn();
		A.cubeInt(3);
		A.cubeDouble(0.2);
		A.display();

	}

}
