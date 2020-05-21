/**
   A checking account has a limited number of free deposits and withdrawals.
*/
public class CheckingAccount extends BankAccount
{
   private int transactionCount;
   final int FREE_TRANSACTIONS;
   final int TRANSACTION_FEE;

   /**
      Constructs a checking account with a zero balance.
   */
   public CheckingAccount()
   {
	   FREE_TRANSACTIONS = 3;
	   TRANSACTION_FEE = 1;
	   transactionCount = 1;
   }

   public void withdraw(double amount)
   { 
	  double fee = transactionCost(FREE_TRANSACTIONS, TRANSACTION_FEE, transactionCount);
      super.withdraw(amount + fee);  
      transactionCount++;
   }
   
   public void deposit(double amount)
   {
	  double fee = transactionCost(FREE_TRANSACTIONS, TRANSACTION_FEE, transactionCount);
      super.deposit(amount - fee);  
      transactionCount++;  
   }

   public void monthEnd()
   {
	   transactionCount = 0;
   }
   
   /**
    * Returns the fee of a transaction
    * 
    * @param freeTransactions The number of transactions before a fee is incurred.
    * @param transactionFee The fee per transaction.
    * @param transactionCount The number of transactions.
    * 
    * @return
    */
   private int transactionCost(int freeTransactions, int transactionFee, int transactionCount)
   {
	int transactionCost = 0;
	
	if (transactionCount > freeTransactions)   
		transactionCost = transactionFee;
	
	return transactionCost;
   }
}

