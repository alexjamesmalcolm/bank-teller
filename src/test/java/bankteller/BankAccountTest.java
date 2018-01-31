package bankteller;

import org.junit.Test;
import org.junit.Assert;

public class BankAccountTest {
	@Test
	public void shouldDeposit10() {
		BankAccount underTest = new BankAccount("", "", 10.0);
		underTest.deposit(10.0);
		double check = underTest.getBalance();
		Assert.assertEquals(20.0, check, 0.001);
	}

	@Test
	public void shouldHaveAccountNum0001() {
		BankAccount underTest = new BankAccount("0001", "", 0.0);
		String check = underTest.getAccountNum();
		Assert.assertEquals("0001", check);
	}

	@Test
	public void shouldHaveAccountNum0002() {
		BankAccount underTest = new BankAccount("0002", "", 0.0);
		String check = underTest.getAccountNum();
		Assert.assertEquals("0002", check);
	}

	@Test
	public void shouldHaveBalance() {
		BankAccount underTest = new BankAccount("", "", 100.0);
		double check = underTest.getBalance();
		Assert.assertEquals(100.0, check, 0.001);
	}

	@Test
	public void shouldHaveTypeChecking() {
		BankAccount underTest = new BankAccount("", "checking", 0.0);
		String check = underTest.getType();
		Assert.assertEquals("checking", check);
	}

	@Test
	public void shouldHaveTypeSavings() {
		BankAccount underTest = new BankAccount("", "savings", 0.0);
		String check = underTest.getType();
		Assert.assertEquals("savings", check);
	}

	@Test
	public void shouldWithdraw10() {
		BankAccount underTest = new BankAccount("", "", 20.0);
		underTest.withdraw(10.0);
		double check = underTest.getBalance();
		Assert.assertEquals(10.0, check, 0.001);
	}
	
	@Test
	public void shouldToString1() {
		BankAccount underTest = new BankAccount("1111", "Checking", 1000.0);
		String check = underTest.toString();
		String expected = "BankAccount {accountNum: 1111, type: Checking, balance: 1000.0}";
		Assert.assertEquals(expected, check);
	}
	
	@Test
	public void shouldToString2() {
		BankAccount underTest = new BankAccount("2222", "Savings", 2500.0);
		String check = underTest.toString();
		String expected = "BankAccount {accountNum: 2222, type: Savings, balance: 2500.0}";
		Assert.assertEquals(expected, check);
	}
	
	@Test
	public void shouldNotWithdrawNegative() {
		BankAccount underTest = new BankAccount("","",20.0);
		underTest.withdraw(-10.0);
		double balance = underTest.getBalance();
		Assert.assertEquals(20.0, balance, 0.001);
	}
}
