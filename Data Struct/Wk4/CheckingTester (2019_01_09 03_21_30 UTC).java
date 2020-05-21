
public class CheckingTester {
	
	/**
	 * Tests the CheckingAccount Class
	 * 
	 * Outputs expected values as well as the balance of the account
	 * 
	 * @param args not used
	 */
	public static void main(String args[])
	{
		CheckingAccount demoChecking = new CheckingAccount();  // Start the account with $0, zero transactions
		
		System.out.printf("The checking account has %.2f", demoChecking.getBalance()); //Checking has $0
		System.out.println("\nExpected: $0.00\n");
		
		demoChecking.deposit(200); //Checking has $200
		System.out.printf("The checking account has %.2f", demoChecking.getBalance());
		System.out.println("\nExpected: $200.00\n");
		
		demoChecking.withdraw(100); //Checking has $100
		System.out.printf("The checking account has %.2f", demoChecking.getBalance());
		System.out.println("\nExpected: $100.00\n");
	
		demoChecking.deposit(200); //Checking has $300
		System.out.printf("The checking account has %.2f", demoChecking.getBalance());
		System.out.println("\nExpected: $300.00\n");
		
		demoChecking.deposit(150); //Checking has $449
		System.out.printf("The checking account has %.2f", demoChecking.getBalance());
		System.out.println("\nExpected: $449.00\n");
		
		demoChecking.withdraw(48); //Checking has $400
		System.out.printf("The checking account has %.2f", demoChecking.getBalance());
		System.out.println("\nExpected: $400.00\n");
	}

}
