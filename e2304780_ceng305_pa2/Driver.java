import lang.stride.*;
import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;
/**
 * @author Mehmet Hekimoğlu
 * @since 15.05.2021
 * This is the driver class for CENG PA2. It can be controlled with number inputs from the keyboard.
 * It has 3 questions. 
 * Question 1 : AccountingSupport Problem
 * Question 2: Best 10th customer in the store problem
 * Question 3 : Two moving ars on the screen problem.
 */
public class Driver
{
    public static void main(String[] params)
    {
        int question=-1;
        JFrame f; 
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
            //scan.nextLine();
            
            
            switch (question) {
                case 1 : {
                    //TODO- QUESTION 1
                    int i  = 0;
                    int array[] = {0,0,0,0,0,0,0,0,0,0,0,0};
                    AccountingSupport accountingSup = new AccountingSupport();
                    String[] m_arr = {"January", "February", "March", "April", "May", 
                    "June", "July",  "August", "September", "October", "November", 
                     "December"};
                    for(i = 0;i<12;i++){
                        array[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter monthly profit or loss for " + m_arr[i]));
                    }
                    while(true){
                    System.out.println("Press:");
                    System.out.println("0 To exit");
                    System.out.println("1 To calculate yearly profit or loss");
                    System.out.println("2 To find most profitable month");
                    System.out.println("3 To find least profitable month");
                    System.out.println("4 To visualize the profit and loss");
                    System.out.println("5 To display the target reached months");
                    int question_1 = scan.nextInt();
                    if(question_1==0)break;
                    switch(question_1){
                        case 1 :{
                            JOptionPane.showMessageDialog(null, "Yearly Profit is:" + accountingSup.calculateTotalPnL(array));
                            break;
                        }
                        case 2:{
                            JOptionPane.showMessageDialog(null, "Minimum Profit Reached in:" + m_arr[accountingSup.findMaxProfitMonth(array)]);
                            break;
                        }
                        case 3:{
                            JOptionPane.showMessageDialog(null, "Yearly Profit is:" + m_arr[accountingSup.findMinProfitMonth(array)]);
                            break;
                        }
                        case 4:{
                            
                            accountingSup.visualizeProfitLossMonthly(array,accountingSup.findMaxProfitMonth(array),accountingSup.findMinProfitMonth(array));
                            break;
                        }
                        case 5:{
                            System.out.println("Please enter the target profit:");
                            int target = scan.nextInt();
                            accountingSup.displayTargetReachedMonths(target,array);
                            break;
                        }
                        
                }
                    
                    
                    
                    
                   
                }
                    
                    
                    break;
                }
                case 2 : {
                   //TODO- QUESTION 2
                   Store store = new Store();
                   String name ;
                   double sale;
                   for(int i = 0;i<10;i++){
                        name =JOptionPane.showInputDialog("Enter the name of the customer: ");
                        sale=Double.parseDouble(JOptionPane.showInputDialog("Enter the buying amount of the customer: "));
                        store.addSale(name,sale);
                    }
                    JOptionPane.showMessageDialog(null, "The best customer is "+ store.nameOfBestCustomer());
                   break;
                }
                case 3: {
                  
                    CarViewer cr = new CarViewer();
                    cr.viewCarsMoving();
                }
            }
            
        }
    }
}
