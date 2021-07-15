
/**
 * This class is used for recording purchase history and for calculating
 * tax of the purchase. It can also calculate change that would be given from
 * a certain payment
 * @param purchase Amount of money customer spent for items without tax
 * @param taxablePurchase Amount of money customer spent for items with tax
 * @param taxRate Tax Rate of the taxable items.
 * @param payment Given payment of the customer for purchased items and tax.
 * 
 * @author Mehmet Hekimoğlu
 */
public class CashRegister extends DriverClass
{
   private double purchase;
   private double payment;
   private double taxablePurchase;
   private double taxRate;

   /**
    * Constructs a CashRegister with no money in it.
    * Initializes purchase, taxablePurchase and payment to "0".
    * @param rate tax-rate of the taxable items.
    */
   public CashRegister(double rate)
   {
      //TODO
      purchase = 0;
      taxablePurchase = 0;
      taxRate = rate;
      payment = 0;
   }
   /**
    * Records the purchases for non-taxable items and add given amount to 
    * total record.
    * @param amount the amount of money of the purchase.
    */

   public void recordPurchase(double amount)
   {
      //TODO
      purchase = purchase + amount;
   }
   /**
    * Records the purchases for taxable items add given amount to 
    * total record.
    * @param amount the amount of money of the purchase.
    */
  
   public void recordTaxablePurchase(double amount)
   {
      //TODO
      taxablePurchase = taxablePurchase + amount;
   }
    /**
     * Receives the payment from the customer.
     * @param amount The amount of money received for payment.
     */
  
   public void receivePayment(double amount)
   {
      //TODO
      payment = payment + amount;
   }
   /**
    * Calculates the change to give the customer with subtracting the purchased
    * items value from the payment.Uses getTotalTax() function to get total tax
    * of the purchased items.
    * @return Returns the calculated change value
    * 
    */
   public double giveChange()
   {   
      //TODO
      return(payment-taxablePurchase-purchase-getTotalTax());
      
   }
   /**
    * Calculates the total tax value using tax rate and purchased taxable items.
    * @return Returns total tax money.
    */
 
   
   public double getTotalTax()
   {
      //TODO
      return (taxablePurchase*taxRate/100);
   }
}
