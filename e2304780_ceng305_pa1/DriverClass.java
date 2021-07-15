import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 * Driver Class evaluates and tests Programming Assingment 1.
 * It takes input from the keyboard and according to the input,
 * it evaluates the given problem.
 *
 * @author Mehmet Hekimoğlu
 * @version 10.04.2021
 */
public class DriverClass
{
   public static void main(String[] args)
   {
      int question=-1;
      while(true)
      {
        System.out.println("Press 1 for Question 1");
        System.out.println("Press 2 for Question 2");
        System.out.println("Press 3 for Question 3");
        System.out.println("Press 0 for exit.");
        Scanner scan =  new  Scanner(System.in);
        question = scan.nextInt();
        scan.nextLine();
        if(question==0)
            break;
        else if(question==1){
              CashRegister register = new CashRegister(8);
              register.recordPurchase(28.00);
              register.recordTaxablePurchase(10.00);
              register.recordTaxablePurchase(2.00);
        
              System.out.println(register.getTotalTax());
              System.out.println("Expected: 0.96");
        
              register.receivePayment(50.00);
        
              double change = register.giveChange();
              System.out.println(change);      
              System.out.println("Expected: 9.04");  
        }
        else if(question==2){
              BankAccount momsSavings = new BankAccount(1000, 3);
              momsSavings.setTransactionFee(1.00);
        
              momsSavings.deposit(100);
              momsSavings.withdraw(10);
              momsSavings.withdraw(30);
              momsSavings.withdraw(27.25);
              momsSavings.deposit(30);
              momsSavings.deposit(12);
        
              momsSavings.deductMonthlyCharge();
        
              double balance = momsSavings.getBalance();
        
              System.out.print("Balance: ");
              System.out.println(balance);
              System.out.println("Expected: 1071.75");
        
              momsSavings.withdraw(20);
              momsSavings.deposit(20);
              momsSavings.deposit(20);
              momsSavings.deductMonthlyCharge();
        
              balance = momsSavings.getBalance();
        
              System.out.print("Balance: ");
              System.out.println(balance);
              System.out.println("Expected: 1091.75");
        
              momsSavings.deposit(10);
              momsSavings.withdraw(20);
              momsSavings.deposit(20);
              momsSavings.deposit(20);
              momsSavings.deductMonthlyCharge();
        
              balance = momsSavings.getBalance();
        
              System.out.print("Balance: ");
              System.out.println(balance);
              System.out.println("Expected: 1120.75");
        }
        else if(question==3) {
              JFrame frame = new JFrame();
              frame.setSize(150, 250);
              frame.setTitle("An Alien Face");
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
              FaceComponent component = new FaceComponent();
              frame.add(component);
        
              frame.setVisible(true);
        }
        else{
            System.out.println("There is no question with this number!!!");
        }
      }
      
   }
}
