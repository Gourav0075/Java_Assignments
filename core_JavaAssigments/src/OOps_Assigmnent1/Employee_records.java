package OOps_Assigmnent1;

import java.util.Scanner;

//Q 5 wap to ask 6 employee record from  user using get and display method show record on console after
////performing sorting on record on basis ofemployee id.
public class Employee_records {

	int EmpId;
	String Name;

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter Id & Name");
		EmpId = s.nextInt();
		Name = s.next();
		s.close();
	}

	void loop(Employee_records emp[]) {
		Employee_records temp = new Employee_records();
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j < 6 - 1 - i; j++) {
				if (emp[j].EmpId > emp[j + 1].EmpId) {
					temp = emp[j];
					emp[j] = emp[j];
					emp[j] = temp;
				}
			}
		}
	}

	void display() {
		System.out.println("Id+ " + EmpId + " Name: " + Name);
	}

	public static void main(String args[]) {
		Employee_records e[] = new Employee_records[6];
		Employee_records e1 = new Employee_records();
		for (int i = 0; i < 6; i++) {
			e[i] = new Employee_records();
			e[i].input();
		}
		e1.loop(e);
		for (int i = 0; i < 6; i++) {
			e[i].display();
		}
		
	}
	
}
