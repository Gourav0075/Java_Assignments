package Exception_handling_lab;

class testException extends Exception {
	public testException() {
		super();
		System.out.println("gaya khatam khatam");
	}

	public String getMessage() {
		return "speed limit  violation has occurred";
	}
}

abstract class Vehicle {

	abstract void engine();

	abstract void set_speed(int speed) throws testException;

}

class trucks extends Vehicle {

	int speed;

	public void engine() {
		System.out.println("Engine installed successfully in truks");

	}

	public void set_speed(int speed) throws testException {
		if (speed >= 100) {
			throw new testException();
		} else
			System.out.println("your speed is in limit");
	}
}

class submarines extends Vehicle {

	int speed;

	public void engine() {
		System.out.println("Engine installed successfully in submarines");

	}

	public void set_speed(int speed) throws testException {
		if (speed >= 300) {
			throw new testException();
		} else
			System.out.println("submarines speed is in limit");
	}
}

public class Q3 {
	public static void main(String agrs[]) {
		trucks t = new trucks();
		t.engine();
		try {
			t.set_speed(90);
		} catch (testException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
		} finally {
			System.out.println("Check speed");
		}

		submarines s = new submarines();
		s.engine();
		try {
			s.set_speed(400);
		} catch (testException j) {
			System.out.println(j);
		}

	}
}
