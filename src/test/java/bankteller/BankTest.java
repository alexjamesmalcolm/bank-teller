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
}
