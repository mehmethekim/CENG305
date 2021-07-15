import java.util.ArrayList;
import java.util.Random;
/**
 * @author Mehmet Hekimoğlu
 * @since 13.06.2021
 * This is the Draw class that gets list of readers and draws 2 people that win the lottery.
 * 
 * 
 */
public class Draw
{
    private ArrayList<Reader> participants = new ArrayList<Reader>(); // changed this line to avoid null pointer exception.
    private String drawID;
    private String correctAnswer;
    public Draw(String drawID, String correctAnswer)
    {
       //TODO
       this.correctAnswer = correctAnswer;
       this.drawID = drawID;
    }
    /**
     * This function adds the name, TCID and answer to the arraylist of the class.
     * @param name name of the reader
     * @param TCID Identificaiton number of the reader.
     * @param answer Given answer of the reader.
     * 
     */
    public void addParticipant(String name,String TCID, String answer)
    {
        //TODO
        Reader reader = new Reader(name,TCID,answer);
        
        participants.add(reader);
        
    }
    /**
     * This function finds all readers that give correct answer to the question
     * @return Arraylist of the readers parameters.
     */
    public ArrayList<Reader> findCorrectAnswerGivers()
    {
        //TODO
        ArrayList<Reader>  correct_list = new ArrayList<Reader>();
        for(int i=0;i<this.participants.size();i++){
            String ans = participants.get(i).getanswer();
            if(ans.equals(correctAnswer)){
                
                Reader true_ans = new Reader(participants.get(i).getname(),participants.get(i).getTCID(),participants.get(i).getanswer());
                correct_list.add(true_ans);
            }
            
        }
        return correct_list;
    }
    /**
     * This function make a draw randomly from the readers who give correct answer.
     * @param correctAnswerGivers Arraylist of the readers who give the correct answer.
     * @return returns the list of 2 people who win the draw and their parameters.
     */
    public ArrayList<Reader> makeDraw(ArrayList<Reader> correctAnswerGivers)
    {
        //TODO
        ArrayList<Reader> winner_list = new ArrayList<Reader>();
        
        int len  = correctAnswerGivers.size();
        Random rand = new Random();
        int rand_int1 = rand.nextInt(len);
        int rand_int2 = rand.nextInt(len);
        int counter = 0;
        while(rand_int2 == rand_int1)
        {
            counter++;
            rand_int2 = rand.nextInt(len);
            if(counter == 1000){
                return null;
            }
        }
        Reader winner1 = new Reader(correctAnswerGivers.get(rand_int1).getname(),correctAnswerGivers.get(rand_int1).getTCID(),correctAnswerGivers.get(rand_int1).getanswer());
        winner_list.add(winner1);
        Reader winner2 = new Reader(correctAnswerGivers.get(rand_int2).getname(),correctAnswerGivers.get(rand_int2).getTCID(),correctAnswerGivers.get(rand_int2).getanswer());
        winner_list.add(winner2);
        return winner_list;
    }
    /**
     * This function displays the winners name and TCID to the terminal
     * 
     */
    public void displayWinners(ArrayList<Reader> winners)
    {
        //TODO
        for(int i = 0;i<winners.size();i++){
            System.out.printf("%d. winner's TCID = %s Name = %s\n",(i+1),winners.get(i).getTCID(),winners.get(i).getname());
        }
        
    }
}
