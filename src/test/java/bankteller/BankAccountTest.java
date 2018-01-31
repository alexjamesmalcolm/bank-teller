package bankteller;

import org.junit.Test;
import org.junit.Assert;

public class BankAccountTest {
	@Test
	public void shouldHaveAccountNum() {
		BankAccount underTest = new BankAccount("0001", "", 0.0);
		String check = underTest.getAccountNum();
		Assert.assertEquals("0001", check);
	}
	
	@Test
	public void shouldHaveType() {
		BankAccount underTest = new BankAccount("", "checking", 0.0);
		String check = underTest.getType();
		Assert.assertEquals("checking", check);
	}
	
	@Test
	public void shouldHaveBalance() {
		BankAccount underTest = new BankAccount("", "", 100.0);
		double check = underTest.getBalance();
		Assert.assertEquals(100.0, check, 0.001);
	}
}
