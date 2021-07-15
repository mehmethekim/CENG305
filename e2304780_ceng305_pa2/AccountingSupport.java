/**
 * @author Mehmet Hekimoğlu
 * @since 13.05.2021
 * 
 * This Class generates an Account for profit and losses for different months.
 * It has one private object and it is the name of the months in a year.
 */
public class AccountingSupport
{
    private String[] monthNames;
    /**
     * This is the constructor class of Accounting Support.It gives the name of the months to the private object monthNames.
     */
    public AccountingSupport()
    {
        this.monthNames = new String[]{"January", "February", "March", "April", "May", 
            "June", "July",  "August", "September", "October", "November", 
             "December"};
    }

    /**
     * This function adds all of the profits and losses in a year and returns the value.
     * @param1 integer array of the profits and losses for each month
     * @return total profit or loss in a year.
     */
    public int calculateTotalPnL(int[] pNlAmount)
    {
        //TODO
        int total = 0;int i=0;
        for(i = 0;i<12;i++){
            total = total + pNlAmount[i];
        }
        return total;
    }
    /**
     * This function returns the maximum profited month in a year. It will output an integer for that month.If September is the most profited 
     * month it will give output as "8"(count starts from 0).
     * @param1 integer array of the profits and losses for each month.
     * @return maximum profited month as an integer.
     */
    public int findMaxProfitMonth(int[] pNlAmount)
    {
        //TODO
        int max = -999999;int i=0;
        for(i=0;i<12;i++){
            if(pNlAmount[i]>max){
            max=pNlAmount[i];
            }
        }
        for(i=0;i<12;i++){
            if(max==pNlAmount[i]){
                break;
            }
        }
        return i;
    }
    /**
     * This function returns the minimum profited month in a year. It will output an integer for that month.If September is the least profited 
     * month it will give output as "8"(count starts from 0).
     * @param1 integer array of the profits and losses for each month.
     * @return minimum profited month as an integer.
     */
    public int findMinProfitMonth(int[] pNlAmount)
    {
        //TODO
        int min = 999999;int i = 0;
        for(i=0;i<12;i++){
            if(pNlAmount[i]<min)min=pNlAmount[i];
        }
        for(i=0;i<12;i++){
            if(min==pNlAmount[i]){
                break;
            }
        }
        return i;
    }
    /**
     * This function will give a console output like a graph for months and profits for that month.
     * @param1 integer array of the profits and losses for each month.
     * @param2 maximum profited month number.
     * @param3 minimum profited month number.
     */
    public void visualizeProfitLossMonthly(int[] pNlAmount, int maxMonthNo, int minMonthNo)
    {
        //TODO  
        int max = pNlAmount[maxMonthNo];
        int min= pNlAmount[minMonthNo];
        int len = java.lang.Math.abs(max)+java.lang.Math.abs(min);
        String[] m_arr = {"January", "February", "March", "April", "May", 
                    "June", "July",  "August", "September", "October", "November", 
                     "December"};
        
        for(int i=0;i<12;i++){
            
        }
        
        
        
        for(int i = 0;i<12;i++){
            
        }
    }
    /**
     * This function will display the months that are equeal or exceeded the given target profit. It will give month names as a console output.
     * @param1 Target profit value. We will use this value to calculate if given months exceeded this value or not.
     * @param2 integer array of the profits and losses for each month.
     */
    public void displayTargetReachedMonths(int target, int[] pNlAmount)
    {      
        //TODO
        int i = 0;
        String[] m_arr = {"January", "February", "March", "April", "May", 
                    "June", "July",  "August", "September", "October", "November", 
                     "December"};
        for(i=0;i<12;i++){
            if(pNlAmount[i] >= target)System.out.println(m_arr[i]);
        }
    }
}
