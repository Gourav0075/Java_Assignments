package OOps_Assignment2;

import java.util.Scanner;

/*
 Q 6 Write a program by creating an 'Employee' class having the following methods 
     and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee
     as parameter
2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000.
3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work 
     per day is more than 6 hours. 
*/
public class Ques2_Employee {

	int Emp_Id;
	String Emp_name;
	int Work_hours;
	double Emp_salary;

	void getInfo(int Emp_Id, String Emp_name) {
		this.Emp_Id = Emp_Id;
		this.Emp_name = Emp_name;
	}

	double AddSal(double Emp_salary) {
		if (Emp_salary < 50000)
			return Emp_salary + 10000;
		else
			return Emp_salary;
	}

	double AddWork(int Work_hours) {
		if (Work_hours > 6)
			return Emp_salary + 5000;
		else
			return Emp_salary;
	}

	void display() {
		System.out.println("Employee id :" + Emp_Id + " Name: " + Emp_name);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee records:");
		int id = sc.nextInt();
		String name = sc.next();

		Ques2_Employee e1 = new Ques2_Employee();
		e1.getInfo(id, name);
		e1.display();
		System.out.println("Enter the salary:");
		double salary = sc.nextDouble();
		System.out.println("Enter the hours of Employee have done:");
		int Working_hours = sc.nextInt();
		double addsal = e1.AddSal(salary);
		double Extrawork = e1.AddWork(Working_hours);
		double grosssalary = addsal + Extrawork;
		System.out.println("adding insentive of :" + addsal + "rs + He did extra work in hours of " + Working_hours
				+ "hrs the Gross salary is " + grosssalary);

		sc.close();
	}
}
