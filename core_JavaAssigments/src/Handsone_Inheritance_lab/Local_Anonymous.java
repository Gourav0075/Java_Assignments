package Handsone_Inheritance_lab;
/*
 * create interface  Junittest which has two abstract methods test1() and Test2()
b) create another class MyClass having method Tester()
c) Inside Tester() method create local class CallTest that inherits Junittest
   and override its methods 

d) Create another function TesterAnnonymous that defined annonymous class 
   and inherit Junittest() and override its methods 
e) In main call Tester and testerAnnonymous functions of MyClass*/

interface Junittest {
	void test1();

	void test2();
}

class Myclass {

	void Tester() {

		class CallTest implements Junittest {
			public void test1() {
				System.out.println("In local class Test 1");
			}

			public void test2() {
				System.out.println("In local class Test 2");
			}
		}
		Junittest obj = new CallTest();
		obj.test1();
		obj.test2();
	}

	void TesterAnnonymous() {
		Junittest obj1 = new Junittest() {
			public void test1() {
				System.out.println("Anonymous class test 1");
			}

			public void test2() {
				System.out.println("Anonymous class test 2");
			}
		};
		obj1.test1();
		obj1.test2();
	}
}

public class Local_Anonymous {
	public static void main(String args[]) {
		Myclass m=new Myclass();
		m.Tester();
		m.TesterAnnonymous();

	}
}
