package bankteller;

import org.junit.Test;

import java.util.Collection;

import org.junit.Assert;

public class BankTest {

	@Test
	public void shouldCloseAccount() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 200.0));
		underTest.addAccount(new BankAccount("0002", "", 60.0));
		underTest.addAccount(new BankAccount("0003", "", 2000.0));
		underTest.closeAccount("0001");
		int check = underTest.getNumOfAccounts();
		Assert.assertEquals(2, check);
	}

	@Test
	public void shouldGet3Accounts() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 100.0));
		underTest.addAccount(new BankAccount("0002", "", 20.0));
		underTest.addAccount(new BankAccount("0003", "", 1000.0));
		Collection<BankAccount> accounts = underTest.getAccounts();
		Assert.assertEquals(3, accounts.size());
	}

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
		int check = underTest.getNumOfAccounts();
		Assert.assertEquals(2, check);
	}

	@Test
	public void shouldGetNumberOfAccounts3() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 0.0));
		underTest.addAccount(new BankAccount("0002", "", 0.0));
		underTest.addAccount(new BankAccount("0003", "", 0.0));
		int check = underTest.getNumOfAccounts();
		Assert.assertEquals(3, check);
	}

	@Test
	public void shouldGetPortfolioTotal1120() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 100.0));
		underTest.addAccount(new BankAccount("0002", "", 20.0));
		underTest.addAccount(new BankAccount("0003", "", 1000.0));
		double check = underTest.totalPortfolio();
		Assert.assertEquals(1120.0, check, 0.001);
	}

	@Test
	public void shouldGetPortfolioTotal2260() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 200.0));
		underTest.addAccount(new BankAccount("0002", "", 60.0));
		underTest.addAccount(new BankAccount("0003", "", 2000.0));
		double check = underTest.totalPortfolio();
		Assert.assertEquals(2260.0, check, 0.001);
	}

	@Test
	public void shouldDeposit10() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 200.0));
		underTest.deposit("0001", 10.0);
		double balance = underTest.getAccount("0001").getBalance();
		Assert.assertEquals(210.0, balance, 0.001);
	}

	@Test
	public void shouldWithdraw10() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 200.0));
		underTest.withdraw("0001", 10.0);
		double balance = underTest.getAccount("0001").getBalance();
		Assert.assertEquals(190.0, balance, 0.001);
	}

	@Test
	public void shouldReturnBalance200() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 200.0));
		double balance = underTest.getBalance("0001");
		Assert.assertEquals(200.0, balance, 0.001);
	}

	@Test
	public void shouldReturnBalance300() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("0001", "", 300.0));
		double balance = underTest.getBalance("0001");
		Assert.assertEquals(300.0, balance, 0.001);
	}
}
