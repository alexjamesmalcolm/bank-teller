package bankteller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.DoubleStream;

public class Bank {
	// Map<String, Double> menu = new HashMap<String, Double>();
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
		return getAccounts().stream().mapToDouble((BankAccount account) -> account.getBalance()).sum();
	}

	public Collection<BankAccount> getAccounts() {
		return accounts.values();
	}

}
