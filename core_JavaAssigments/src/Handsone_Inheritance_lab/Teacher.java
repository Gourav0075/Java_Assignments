package Handsone_Inheritance_lab;
//Write a program in java. A class Teacher contains two fields Name
//and Qualification. Extends the class to department it contains dept.
//no and Dept Name. An interface named as college it contains one field 
//name of the college. Using the above classes and interface get the appropriate
//information and display it.

import java.util.Scanner;

public class Teacher 
{
	String name;
	String Qualification;
	
	Teacher()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name and qualification");
		name=sc.next();
		Qualification=sc.next();
	}

}
