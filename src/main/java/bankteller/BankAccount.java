package bankteller;

import java.math.BigDecimal;
import java.math.MathContext;

public class BankAccount {

	private String accountNum;
	private String type;
	private BigDecimal balance;

	public BankAccount(String accountNum, String type, String balance) {
		this.accountNum = accountNum;
		this.type = type;
		this.balance = new BigDecimal(balance);
	}

	public BankAccount(String accountNum, String type, BigDecimal inputBalance) {
		this.balance = inputBalance;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getType() {
		return type;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance.add(new BigDecimal(amount));
		}
	}

	public void withdraw(String string) {
		if (new BigDecimal(string).compareTo(BigDecimal.ZERO) == 1) {
			balance = balance.subtract(new BigDecimal(string));
		}
	}

	@Override
	public String toString() {
		return "BankAccount {accountNum: " + accountNum + ", type: " + type + ", balance: " + balance + "}";
	}

}
