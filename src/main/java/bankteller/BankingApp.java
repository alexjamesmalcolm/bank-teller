package bankteller;

public class BankingApp {

	public static void main(String[] args) {
		Bank myBank = new Bank();
		
		BankAccount account1 = new BankAccount("1111", "Checking", 500.0);
		BankAccount account2 = new BankAccount("2222", "Savings", 2500.0);
		
		myBank.addAccount(account1);
		myBank.addAccount(account2);
		
		System.out.println("Here are your accounts at our bank:");
		myBank.displayAccounts();
	}

}
