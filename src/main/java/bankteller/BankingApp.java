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
		
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to deposit");
		System.out.println("Press 2 to withdrawal");
		System.out.println("Press 3 to check balance");
		System.out.println("Press 4 to close an account");
		System.out.println("Press 5 to exit");
	}

}
