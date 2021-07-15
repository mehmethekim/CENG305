import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * @author Mehmet Hekimoğlu
 * @since 13.06.2021
 * 
 * This class generetas a tic-tac-toe game to be played by 2 people on the terminal.
 * 
 */
public class TicTacToe
{
    // instance variables - replace the example below with your own
    private String[][] board = new String[3][3];

    /**
     * Constructor for objects of class TicTacToe
     */
    public TicTacToe()
    {
        // initialise instance variables
        
        for(int i = 0; i<3; i++)
            for(int j = 0; j<3; j++)
                board[i][j] = "_";
    }

    /**
     * This function displays the current tic-tac-toe board to the terminal.
     */
    public void printBoard()
    {
        //TODO
        System.out.printf("COORDINATES ON THE BOARD\n");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++)
                System.out.printf("(%d,%d)\t",i,j);
            System.out.printf("\n");
        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++)
                System.out.printf(" %s ",board[i][j]);
            System.out.printf("\n");
        }
    }
    /**
     * This function prints the playable coordinates in the tic-tac-toe game currently.
     * 
     */
    public void printAvailableCoordinates()
    {
       //TODO
       System.out.printf("AVAILABLE COORDINATES ON THE BOARD\n");
       for(int i = 0; i<3; i++)
            for(int j = 0; j<3; j++)
               if(board[i][j] == "_"){
                    System.out.printf(" (%d,%d) ,",i,j);
                }
    }
    /**
     * This function checks if the game is finished or not. If it is finished, displays the winner
     * @return returns an integer to indicate the winner.
     */
    public int checkWinDrawn()
    {
       //TODO
       return 1;
    }
    /**
     * This function plays the given coordinate on the board.
     */
    public void playGame()
    {
        
       //TODO
    }
   
}
