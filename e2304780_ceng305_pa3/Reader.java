/**
 * @author Mehmet Hekimoğlu
 * @since 13.06.2021
 * This class generates Reader class and it stores information of the readers name,TCID and answer.
 * 
 */


public class Reader
{
    private String name;
    private String TCID;
    private String answer;
    public Reader(String name, String TCID, String answer)
    {
        this.name = name;
        this.TCID = TCID;
        this.answer = answer;
    }
    public String getname() 
    {
        return this.name;
    }
    public String getTCID() 
    {
        return this.TCID;
    }
    public String getanswer() 
    {
        return this.answer;
    }
}
