package Exception_handling_lab;

class Shape {
	int dim1, dim2;

	void setData(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
}

class Circle extends Shape {
	double areaOfCircle() {
		return 3.14 * dim1 * dim1;
	}
}

class Rectangle extends Circle {
	double areaOfRectangle() {
		return dim1 * dim2;
	}
}

public class Q4 {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.setData(5, 6);
		System.out.println("area of different shapes");

		System.out.println("circle area:" + r.areaOfCircle());
		System.out.println("Rectangle area:" + r.areaOfRectangle());
	}
}
