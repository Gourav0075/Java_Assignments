package Exception_handling_lab;

//6 Write a program to  demonstrate the finally block.

public class Finally_demonstrate {

	public static void main(String[] args) {
		try
		{
			int a=0;
			int b=4;
			int c=b/a;
			System.out.println("result="+c);
		}
		finally 
		{
			System.out.println("");
			System.out.println("finally block always run");
			System.out.println("welcome in finally block");
		}
	}

}
