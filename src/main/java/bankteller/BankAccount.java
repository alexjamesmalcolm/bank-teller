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
		return "0001";
	}

	public String getType() {
		return "checking";
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double influx) {
		balance += influx;
	}

}
