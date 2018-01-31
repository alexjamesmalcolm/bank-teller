package bankteller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	Map<String, BankAccount> accounts = new HashMap<>();

	public void addAccount(BankAccount account) {
		accounts.put(account.getAccountNum(), account);
	}

	public BankAccount getAccount(String accountNum) {
		return accounts.get(accountNum);
	}

	public int getNumOfAccounts() {
		return accounts.size();
	}

	public double totalPortfolio() {
		return getAccounts().stream().mapToDouble((BankAccount account) -> account.getBalance()).sum();
	}

	public Collection<BankAccount> getAccounts() {
		return accounts.values();
	}

	public void closeAccount(String accountNum) {
		accounts.remove(accountNum);
	}

	public void displayAccounts() {
		accounts.forEach((accountNum, account) -> System.out.println(account));
	}

	public void deposit(String accountNum, double balance) {
		BankAccount account = accounts.get(accountNum);
		account.deposit(balance);
	}

	public void withdraw(String accountNum, double balance) {
		BankAccount account = accounts.get(accountNum);
		account.withdraw(balance);
	}

}
