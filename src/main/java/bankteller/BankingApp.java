package bankteller;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		Bank myBank = new Bank();

		BankAccount account1 = new BankAccount("1111", "Checking", 500.0);
		BankAccount account2 = new BankAccount("2222", "Savings", 2500.0);

		myBank.addAccount(account1);
		myBank.addAccount(account2);

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Here are your accounts at our bank:");
			myBank.displayAccounts();

			displayChoices();
			int choice = input.nextInt();
			if (choice == 1) {
				deposit(myBank, input);
			} else if (choice == 2) {
				withdraw(myBank, input);
			} else if (choice == 3) {
				String accountNum = askAccount(myBank, input);
				displayAccountBalance(myBank, accountNum);
			} else if (choice == 4) {
				closeAccount(myBank, input);
			} else if (choice == 5) {
				System.exit(0);
				break;
			}
		}
		input.close();
	}

	private static void closeAccount(Bank bank, Scanner input) {
		String accountNum = askAccount(bank, input);
		bank.closeAccount(accountNum);
	}

	private static void deposit(Bank bank, Scanner input) {
		String accountNum = askAccount(bank, input);
		askToDeposit(bank, input, accountNum);
		displayAccountBalance(bank, accountNum);
	}

	private static void withdraw(Bank bank, Scanner input) {
		String accountNum = askAccount(bank, input);
		askToWithdraw(bank, input, accountNum);
		displayAccountBalance(bank, accountNum);
	}

	private static void askToDeposit(Bank myBank, Scanner input, String accountNum) {
		System.out.println("Enter the amount to deposit:");
		double amount = input.nextDouble();
		myBank.deposit(accountNum, amount);
	}

	private static void askToWithdraw(Bank bank, Scanner input, String accountNum) {
		System.out.println("Enter the amount to withdrawal:");
		double amount = input.nextDouble();
		bank.withdraw(accountNum, amount);
	}

	private static void displayAccountBalance(Bank bank, String accountNum) {
		double balance = bank.getBalance(accountNum);
		System.out.println("Your balance is: " + balance);
	}

	private static String askAccount(Bank bank, Scanner input) {
		bank.displayAccounts();
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
