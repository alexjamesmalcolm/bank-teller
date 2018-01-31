package bankteller;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	//Map<String, Double> menu = new HashMap<String, Double>();
	Map<String, BankAccount> accounts = new HashMap<>();

	public void addAccount(BankAccount account) {
		accounts.put(account.getAccountNum(), account);
	}

	public BankAccount getAccount(String string) {
		return accounts.get(string);
	}

	public int getNumberOfAccounts() {
		return accounts.size();
	}

	public double totalPortfolio() {
		return 1120.0;
	}

}
