/**
 * This class generates a bank account. Every transaction from the account is
 * charged with some fee value. Every account has free transaction limit for
 * every month. If transactions value exceeds this value, it will cost money
 * to the account owner end of every month. At the end of every month,
 * transaction and free transaction are reseted.
 * @param balance Money balance of the customer
 * @param transactions Transaction that customer did. Deposit and withdraws are counted
 * @param freeTransactions Free transaction chances of the customer. Deposit and withdraws do not cost monet if customer has free transactions.
 * @param transactionFee Cost of the transactions. At the end of every month, transaction fee is taken from the balance of the customer.
 * 
 */
public class BankAccount extends DriverClass
{
   private double balance;
   private int transactions;
   private int freeTransactions;
   private double transactionFee;
   /**
    * Constructs a Bank Account with no money in it.
    * @param free Free transaction charges of the customer.
    */

   public BankAccount(int free)
   {
      //TODO
      balance = 0;
      freeTransactions = free;
      transactions = 0;
      transactionFee=0;
   }

   /**
    * Constructs a Bank Account with initial balance in it.
    * @param initialBalance Initial money balance of the customer.
    * @param free Free transaction charges of the customer.
    */
   public BankAccount(double initialBalance, int free)
   {
      //TODO
      balance = initialBalance;
      freeTransactions = free;
      transactions = 0;
      transactionFee=0;
   }

  /**
   * Deposits the given amount of money into the acount. Counts as transaction.
   * @param amount Amount of money to be deposited into the account.
   */
   public void deposit(double amount)
   {
      //TODO
      balance = balance + amount;
      transactions++;
    
   }
   /**
    * Withdraws the given amount of money into the acount. Counts as transaction.
    * @param amount Amount of money to be withdrawn from the account.
    */

  
   public void withdraw(double amount)
   {
     //TODO
     balance = balance - amount;
     transactions++; 
   }
   /**
    * Returns the current balance of the acount.
    * @return Returns the current balance parameter.
    */

  
   public double getBalance()
   {
      //TODO
      return(balance);
   }
   /**
    * Sets the fee for transactions.
    * @param fee Amount of money it costs to do transactions.
    */

  
   public void setTransactionFee(double fee)
   {
      //TODO
      transactionFee = fee;
   }

  /**
   * Withdraws transaction cost from the account if the account is out
   * of free transactions charges. Resets the transaction count every end
   * of the month.
   */
   public void deductMonthlyCharge()
   {
      //TODO
      if(transactions>freeTransactions){
      balance = balance-(transactions-freeTransactions)*transactionFee;
      transactions = 0;
    }
    else{
    transactions=0;
    }
   }
}
