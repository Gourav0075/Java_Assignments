package Handsone_Inheritance_lab;

import java.util.Scanner;

public class Department extends Teacher {
	int Dept_no;
	String Dept_name;

	Department() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Department no and name");
		Dept_no = sc.nextInt();
		Dept_name = sc.next();
	}

}
