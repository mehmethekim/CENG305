import lang.stride.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * This is the driver class for CENG305-Programming Assignment 3
 * It has 3 questions.
 * 1st one is theatre reservation program. We can reserve seats according the seat number or price.
 * 2nd one is tic-tac-toe game that 2 players play.
 * 3rd one is lottery of a newspaper company. They will reward 2 of their customers who gave correct answer to the question.
 *
 * @author Mehmet Hekimoğlu
 * @version 13.06.2021
 * 
 */
public class Driver
{
    public static void main(String[] params)
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
            //scan.nextLine();
            
            switch (question) {
                case 1 : {
                   //TODO
                   char input = 'Y';
                   Theater theater = new Theater();
                   while(input=='Y' || input=='y'){
                   System.out.println("WELCOME");
                   System.out.println("1 To choose your place according to the coordinates");
                   System.out.println("2 To choose according to price");
                   
                   int question1 =-1;
                   question1 = scan.nextInt();
                   scan.nextLine();
                   if(question1==0)break;
                   switch (question1){
                        case 1:{
                            System.out.println("Where do you want to sit? Write coordinates please.( Between (0,0) and (8,9) both included.)");
                            int dig_1 = scan.nextInt();
                            scan.nextLine();
                            int dig_2 = scan.nextInt();
                            scan.nextLine();
                            theater.reserveSeat(dig_1,dig_2);
                            input = scan.next().charAt(0); 
                            scan.nextLine();
                            break;
                        }
                        case 2:{
                            System.out.println("Please enter the price of the seat that you want to sit");
                            int price_q1 = scan.nextInt();
                            scan.nextLine();
                            int[] array = theater.findTheFirstAvailablePlaceAccordingToPrice(price_q1);
                            theater.reserveSeat(array[0],array[1]);
                            input = scan.next().charAt(0); 
                            scan.nextLine();
                            break;
                        }
                    }
                    }
                   
                   
                   
                   break;
                
                    
                   
                }
                case 2 : {
                    //TODO
                    TicTacToe tictactoe = new TicTacToe();
                    tictactoe.printBoard();
                    tictactoe.printAvailableCoordinates();
                    break;
                   
                }
                case 3: {
                   //TODO
                   System.out.println("Enter the Draw ID");
                   String draw_id = scan.nextLine();
                   System.out.println("Enter the correct answer");
                   String answer = scan.nextLine();
                   Draw draw =  new Draw(draw_id,answer);
                   char input3 = 'Y';
                   while(input3=='Y' || input3=='y'){
                       System.out.println("Enter participant's name");
                       String p_name = scan.nextLine();
                       System.out.println("Enter participant's TCID");
                       String p_ID = scan.nextLine();
                       System.out.println("Enter participant's answer");
                       String p_ans = scan.nextLine();
                       draw.addParticipant(p_name,p_ID,p_ans);
                       System.out.println("Is there any more participants? (Y/N)");
                       input3 = scan.next().charAt(0); 
                        scan.nextLine();
                    }
                    ArrayList<Reader> correct_answer_givers = new ArrayList<Reader>();
                    correct_answer_givers = draw.findCorrectAnswerGivers();
                   //correct_answer_givers =draw.findCorrectAnswerGivers();
                   ArrayList<Reader> winners = new ArrayList<Reader>();
                   winners = draw.makeDraw(correct_answer_givers);
                   draw.displayWinners(winners);
                   break;
                }
            }
            
        }
    }
}
