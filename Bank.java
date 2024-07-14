package banking;

import java.util.Scanner;

/**
 * Bank for managing customers and their bank account.
 */
public class Bank {

	public static void main(String[] args) {
		
		//creates new instance of the bank class
		Bank bank = new Bank();
		
		bank.run();
		
		

	}
	//runs the program
	public void run() {
		
		System.out.println("Welcome to the Bank! What is your name?");
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		
		System.out.println("Hello " + name + "! We are creating a checking and savings account for you.");
		
		//Create customer object with the provided name.
		Customer customer = new Customer(name);
		
		//ask for address
		System.out.println("What is your address?");
		
		//get address from input
		String address = scanner.next();
		
		//set address
		customer.setAddress(address);
		
		
		//create account of type "checking"
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		
		//create account of type "savings"
		BankAccount savingsAccount = new BankAccount("savings", customer);
		
		System.out.println();
		System.out.println();
		System.out.println("Customer info:");
		System.out.println(checkingAccount.getCustomerInfo());
		System.out.println();

		
		System.out.println("Checking account:");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println();

		
		System.out.println("Savings account:");
		System.out.println(savingsAccount.getAccountInfo());
		
		//making deposits
		
		System.out.println();
		System.out.println();

		
		System.out.println("Enter amount to deposit into checking account");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);
		
		System.out.println();
		
		System.out.println("Enter amount to deposit into savings account");
		amount = scanner.nextDouble();
		savingsAccount.deposit(amount);
		
		System.out.println();
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		// making withdrawals
		System.out.println();
		System.out.println();
		System.out.println("Enter amount to withdraw from your checking account:");
		amount = scanner.nextDouble();
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Enter amount to withdraw from your savings account:");
		amount = scanner.nextDouble();
		try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println();
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		
		
		
		
		
	}

}
