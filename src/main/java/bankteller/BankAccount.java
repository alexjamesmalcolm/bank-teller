package bankteller;

public class BankAccount {

	private String accountNum;
	private String type;
	private double balance;

	public BankAccount(String accountNum, String type, double balance) {
		this.accountNum = accountNum;
		this.type = type;
		this.balance = balance;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			balance -= amount;
		}
	}

	@Override
	public String toString() {
		return "BankAccount {accountNum: " + accountNum + ", type: " + type + ", balance: " + balance + "}";
	}

}
