package banking;

public class Customer {
	
	String name;
	
	
	String address;
	
	
	//constructor to create a customer by providing a name.
	public Customer(String name) {
		
		//set the instance variable "name" to the provided (or passed) "name".
		this.name = name;
		
	}
	
	//methods
	public void setAddress(String address) {
		
		//set the instance variable "address" to the provided (or passed) "address".
		this.address = address;
	}
	
	/*
	 * returns customer's name
	 */
	public String getName() {
		
		return this.name;
	}
	
	public String getAddress() {
		
		return this.address; 
	}

}
