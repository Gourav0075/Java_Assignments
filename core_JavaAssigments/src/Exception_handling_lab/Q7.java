package Exception_handling_lab;
/*Ques7:Write a program   for user defined Exception that checks the external and internal marks if the
internal marks is greater than 40 it raise the exception internal mark is  exceed, if the external mark is greater than 60
 exception is raised and display  the message the external marks is exceed, create the above exception and use it  in your program.*/
import java.util.Scanner;

class MarksExceedException extends Exception {

		MarksExceedException() {
			super("marks exceed!");
		}

//		public String getMessage()
//		{
//			return "Internal and External Marks ";
//		}
	}

	public class Q7{

		static void internalMarks(int marks) throws MarksExceedException {
			if (marks > 40)
				throw new MarksExceedException();
			else
				System.out.println("Internals:" + marks);
		}

		static void ExternalMarks(int marks) throws MarksExceedException {
			if (marks > 60)
				throw new MarksExceedException();
			else
				System.out.println("Externals:" + marks);
		}

		public static void main(String args[]) throws MarksExceedException {

//			try {
	//
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter the internal marks ");
//				int marks = sc.nextInt();
//				internalMarks(marks);
//				sc.close();
//			} catch (MarksExceedException e) {
//				System.out.println(e);
//				System.out.println(e.getMessage());
//			}

			try {

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the External marks ");
				int marks = sc.nextInt();
				ExternalMarks(marks);
				sc.close();
			} catch (MarksExceedException j) {
				System.out.println(j);
				System.out.println(j.getMessage());
			}

		}
	
}
