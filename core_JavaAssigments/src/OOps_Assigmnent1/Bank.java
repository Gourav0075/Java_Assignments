package OOps_Assigmnent1;

public class Bank {
	String nameOfHolder, accountType;
	int accountNumber;
	double balanceAmount;

	void assignValue() {
		nameOfHolder = "Gourav dhomne";
		accountType = "current";
		accountNumber = 366300058;
		balanceAmount = 15000.00;
	}

	int depositAmount() {
		int deposit = 5000;
		balanceAmount = balanceAmount + deposit;
		return deposit;
	}

	int withdrawAmount() {
		int withdraw = 1000;
		return withdraw;
	}

	void display() {
		System.out.println(nameOfHolder);
		System.out.println("Balance Amount is = " + (balanceAmount - withdrawAmount()));
	}

	public static void main(String[] args) {

		Bank b = new Bank();
		b.assignValue();
		b.depositAmount();
		b.withdrawAmount();
		b.display();

	}

}
