package OOps_Assigmnent1;
//Q 4 Create a class named 'StudentRecord' with String variable 'sname'

//and integer variable 'roll_no'.
//Assign the value of roll_no as '2' and that of name as "John" while
//creating an object of the class Student.
//and using display method show all values on console

public class StudentRecord {
	String sname;
	int RollNo;

	void Getinput(String sname, int RollNo) {
		this.sname = sname;
		this.RollNo = RollNo;
	}

	void GetDisplay() {
		System.out.println("Student Name = " + sname);
		System.out.println("Student RollNo = " + RollNo);
	}

	public static void main(String args[]) {
		StudentRecord A = new StudentRecord();
		A.Getinput("john", 2);
		A.GetDisplay();

	}
}
