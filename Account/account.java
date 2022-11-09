// Account class with a constructor 
// to validate and initialize instance variable balance of type double
public class Account {
	
	private double balance; // instance variable that stores balance
	
	// constructor 
	public Account (double initialBalance) {
		// validate that initialBalance > 0.0; 
		// if not, balance is initialized to default value
		if (initialBalance > 0.0)
			balance = initialBalance; 
	} // end account constructor
	
	// credit (add) an amount to the account
	public void credit(double amount) {
	balance = balance + amount; 
	}
	
	// return the account balance
	public double getBalance() { 
		return balance;
	}
}