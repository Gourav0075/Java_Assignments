package Handsone_Inheritance_lab;

public class MainClass extends Department implements College{

	public void Collegename()
	{
		System.out.println("welcome in cdac");
	}
    void display()
    {
    	System.out.println("teacher name: "+name+" and qualification is "+Qualification);
    	System.out.println("department no.:  "+Dept_no+" department name is: "+Dept_name);
    }
	public static void main(String[] args) {
		MainClass obj=new MainClass();
		obj.Collegename();
		obj.display();

	}

}
