package bankteller;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

	@Test
	public void shouldDeposit10() {
		BankAccount underTest = new BankAccount("", "", "10.00");
		underTest.deposit(10.0);
		BigDecimal check = underTest.getBalance();
		assertThat(check, is(new BigDecimal("20.00")));
	}

	@Test
	public void shouldHaveAccountNum0001() {
		BankAccount underTest = new BankAccount("0001", "", "0");
		String check = underTest.getAccountNum();
		Assert.assertEquals("0001", check);
	}

	@Test
	public void shouldHaveAccountNum0002() {
		BankAccount underTest = new BankAccount("0002", "", "0");
		String check = underTest.getAccountNum();
		Assert.assertEquals("0002", check);
	}

	@Test
	public void shouldHaveBalance() {
		BankAccount underTest = new BankAccount("", "", "100.10");
		BigDecimal check = underTest.getBalance();
		assertThat(check, is(new BigDecimal("100.10")));
	}

	@Test
	public void shouldHaveTypeChecking() {
		BankAccount underTest = new BankAccount("", "checking", "0");
		String check = underTest.getType();
		Assert.assertEquals("checking", check);
	}

	@Test
	public void shouldHaveTypeSavings() {
		BankAccount underTest = new BankAccount("", "savings", "0");
		String check = underTest.getType();
		Assert.assertEquals("savings", check);
	}

	@Test
	public void shouldWithdraw10() {
		BankAccount underTest = new BankAccount("", "", "20.00");
		underTest.withdraw("10");
		BigDecimal check = underTest.getBalance();
		assertThat(check, is(new BigDecimal("10.00")));
	}

	@Test
	public void shouldToString1() {
		BankAccount underTest = new BankAccount("1111", "Checking", "1000.00");
		String check = underTest.toString();
		String expected = "BankAccount {accountNum: 1111, type: Checking, balance: 1000.00}";
		assertThat(check, is(expected));
	}

	@Test
	public void shouldToString2() {
		BankAccount underTest = new BankAccount("2222", "Savings", "2500.00");
		String check = underTest.toString();
		String expected = "BankAccount {accountNum: 2222, type: Savings, balance: 2500.00}";
		assertThat(check, is(expected));
	}

	@Test
	public void shouldNotWithdrawNegative() {
		BankAccount underTest = new BankAccount("", "", "20.00");
		underTest.withdraw("-10");
		BigDecimal balance = underTest.getBalance();
		assertThat(balance, is(new BigDecimal("20.00")));
	}

	@Test
	public void shouldNotDepositNegative() {
		BankAccount underTest = new BankAccount("", "", "20");
		underTest.deposit(-10.0);
		BigDecimal balance = underTest.getBalance();
		assertThat(balance, is(new BigDecimal("20")));
	}

	@Test
	public void shouldReturnBigDecimalForBalance() {
		BigDecimal inputBalance = new BigDecimal("100.00");
		BankAccount underTest = new BankAccount("1111", "Checking", inputBalance);
		BigDecimal balance = underTest.getBalance();
		Assert.assertThat(balance, is(inputBalance));
	}
}
