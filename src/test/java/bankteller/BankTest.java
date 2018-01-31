package bankteller;

import org.junit.Test;
import org.junit.Assert;

public class BankTest {

	@Test
	public void shouldGetBankAccount() {
		BankAccount account = new BankAccount("0001", "checking", 100.0);
		Bank underTest = new Bank();
		underTest.addAccount(account);
		BankAccount returnedAccount = underTest.getAccount("0001");
		Assert.assertEquals(account, returnedAccount);
	}

	@Test
	public void shouldGetNumberOfAccounts2() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 0.0));
		underTest.addAccount(new BankAccount("0002", "", 0.0));
		int check = underTest.getNumberOfAccounts();
		Assert.assertEquals(2, check);
	}

	@Test
	public void shouldGetNumberOfAccounts3() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 0.0));
		underTest.addAccount(new BankAccount("0002", "", 0.0));
		underTest.addAccount(new BankAccount("0003", "", 0.0));
		int check = underTest.getNumberOfAccounts();
		Assert.assertEquals(3, check);
	}
	
	@Test
	public void shouldGetPortfolioTotal() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 100.0));
		underTest.addAccount(new BankAccount("0002", "", 20.0));
		underTest.addAccount(new BankAccount("0003", "", 1000.0));
		double check = underTest.totalPortfolio();
		Assert.assertEquals(1120.0, check, 0.001);
	}

	// @Test
	// public void shouldGetAccounts() {}
}
