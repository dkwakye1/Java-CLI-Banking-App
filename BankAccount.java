package banking;

public class BankAccount {
	
	
	//instance variable
	
	String accountType;
	
	double balance;
	
	Customer customer;
	
	
	// Constructor for creating BankAccount objects.
	public BankAccount(String accountType, Customer customer) {
		
		this.accountType = accountType;
		this.customer = customer;
	}
	
	

	//methods
	
	public void deposit(double amount) {
		
		this.balance  += amount;
	}
	
	/**
	 * 
	 * @param amount
	 * @throws Exception
	 */
	
	public void withdraw (double amount) throws Exception {
		
		if(amount > this.balance) {
			
			throw new Exception("Withdraw amount is greater than available balance.");
			
		}
		
		
		this.balance -= amount;
	}
	
	public String getAccountInfo() {
		
		return this.accountType + ": " + this.balance;
		
	}
	

	/**
	 * 
	 * @return
	 */
	public String getCustomerInfo() {
		
		return customer.getName() + " from " + customer.getAddress();
	}
	
	

}
