package bankteller;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		Bank myBank = new Bank();

		BankAccount account1 = new BankAccount("1111", "Checking", 500.0);
		BankAccount account2 = new BankAccount("2222", "Savings", 2500.0);

		myBank.addAccount(account1);
		myBank.addAccount(account2);

		System.out.println("Here are your accounts at our bank:");
		myBank.displayAccounts();

		displayChoices();
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		if (choice == 1) {
			String accountNum = askAccount(myBank, input);
			System.out.println("Enter the amount to deposit:");
			double amount = input.nextDouble();
			myBank.deposit(accountNum, amount);
			double balance = myBank.getAccount(accountNum).getBalance();
			System.out.println("Your updated balance is: " + balance);
		} else if (choice == 2) {
			String accountNum = askAccount(myBank, input);
			System.out.println("Enter the amount to withdrawal:");
			double amount = input.nextDouble();
			myBank.withdraw(accountNum, amount);
			double balance = myBank.getAccount(accountNum).getBalance();
			System.out.println("Your updated balance is: " + balance);
		} else if (choice == 3) {
			String accountNum = askAccount(myBank, input);
			double balance = myBank.getAccount(accountNum)
		} else if (choice == 4) {
			// close an account
		} else if (choice == 5) {
			// exit
		}
		input.close();
	}

	private static String askAccount(Bank myBank, Scanner input) {
		myBank.displayAccounts();
		System.out.println("Select the account by (acct num) to perform this transaction.");
		String accountNum = input.next();
		System.out.println("You have selected " + accountNum);
		return accountNum;
	}

	private static void displayChoices() {
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to deposit");
		System.out.println("Press 2 to withdrawal");
		System.out.println("Press 3 to check balance");
		System.out.println("Press 4 to close an account");
		System.out.println("Press 5 to exit");
	}

}
