package Exception_handling_lab;

/*5  Write a program  for exception handling. Which will take  two command line arguments from the user
if the user does not provide that  arguments it should throw exception
*/


//we can pass two parameter to console
// run configurations->arguements-->5 6
public class Command_line_arguements_q5 {
	public static void main(String[] args) throws RuntimeException {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a + b;
			System.out.println("Sum of the two numbers is= " + c);
			// output will be =5+6;
			// Sum of the two numbers is= 11
		} catch (RuntimeException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
