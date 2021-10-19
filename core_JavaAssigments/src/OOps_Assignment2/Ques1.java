package OOps_Assignment2;

import java.util.Scanner;

/*Q  WAP using parameterized constructor with two parameters id and name. While creating the
 *  objects obj1 and obj2 passed two arguments so that this constructor gets invoked after 
 *  creation of obj1 and obj2*/


public class Ques1 {

	int Id;
	String name;

	Ques1(int Id, String name) {
		this.Id = Id;
		this.name = name;

	}

	void display() {
		System.out.println("Id: " + Id + " name:  " + name);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id");
		int Id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();

		Ques1 obj1 = new Ques1(Id, name);
		obj1.display();

		// Ques1 obj2=new Ques1(Id,name);
		// obj2.display();

		sc.close();
	}

}
