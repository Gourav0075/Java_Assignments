package Exception_handling_lab;

import java.util.Scanner;

/*8  Write a program  in java. A class Teacher contains two fields Name and Qualification. Extends
the class to department it contains dept. no and Dept Name. An interface named
as college it contains one field name of the college. Using the above classes
and interface get the appropriate information and display it. Ask Deptno from user if deptno is
 not 10 or 20 or 30 throw NoDeptartmentException (userdefined exception) and with appropriate 
 message terminate program .else call display method if all data is valid
*/
class NoDeptartmentException extends Exception {
	NoDeptartmentException() {
		super("Department number not available");  /// (userdefined exception) 
	}
}

interface College {
	void collegeName();
}

class Teacher implements College {
	String Name;
	String Qualification;

	public void collegeName() {
		System.out.println("welcome to CDac");
	}

	void setData(String name, String qual) {
		Name = name;
		Qualification = qual;
	}

	void Display() {

		System.out.println("teacher name is" + Name + " and his qualifiaction " + Qualification);
	}
}

class Departement extends Teacher {
	int dept_no;
	String dept_name;

	void SetDeptData(int no, String name) throws NoDeptartmentException {
		dept_no = no;
		dept_name = name;

		if (dept_no == 20 || dept_no == 30 ||dept_no == 10) {
			System.out.println("Department number : " + dept_no + " and name is " + dept_name);
		} else
			throw new NoDeptartmentException();
	}
}

public class Teacher_main {

	public static void main(String[] args)throws NoDeptartmentException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Teacher records");
		String name=sc.next();
		String qual=sc.next();
		System.out.println("Enter the departement details");
		int deptno=sc.nextInt();
		String deptname=sc.next();
		
		Departement D1=new Departement();
		D1.collegeName();
		D1.setData(name, qual);
		D1.Display();
		D1.SetDeptData(deptno,deptname);
	    //D1.collegeName();
		
		

	}

}
