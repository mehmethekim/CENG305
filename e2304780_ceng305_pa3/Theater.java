
/**
 * @author Mehmet Hekimoğlu
 * @since 13.04.2021
 * This class generates Theater Class for Question 1.
 * @param seatsPrices Prices of the seats are preset in the class.
 */
public class Theater
{
    // instance variables - replace the example below with your own
    private int[][] seatsPrices;

    public Theater()
    {
        // initialise instance variables
        int[][] seatsPrices = {{10,10,10,10,10,10,10,10,10,10},
                            {10,10,10,10,10,10,10,10,10,10},
                            {10,10,10,10,10,10,10,10,10,10},
                            {10,10,20,20,20,20,20,20,10,10},
                            {10,10,20,20,20,20,20,20,10,10},
                            {10,10,20,20,20,20,20,20,10,10},
                            {20,20,30,30,40,40,30,30,20,20},
                            {20,30,30,40,50,50,40,30,30,20},
                            {30,40,50,50,50,50,50,50,40,30}};
        this.seatsPrices = seatsPrices;
    }
    
    
   /**
    * This function checks the availability of the given seat. If the seat is available returns 1, else returns false.
    * @param i column number of the wanted seat
    * @param j row number of the wanted seat
    * @return returns boolean if the seat is available.
    */
    public boolean  checkAvailabilityOfSeat(int i, int j){
        //TODO
        
        if(seatsPrices[i][j]!=0){
            return true;
        }
        else if(seatsPrices[i][j]==0) return false;
        return false;
    }
    /**
     * This function reserves the wanted seat. First it checks wheter the given seat is empty or not. If it empty, reserves that seat
     * and changes it's value to "0".
     *@param i column number of the wanted seat
     * @param j row number of the wanted seat
     */
     
    public void  reserveSeat(int i, int j){
       //TODO
       boolean ret_val =checkAvailabilityOfSeat(i,j);
      {
           if(ret_val==true){
                System.out.printf("The place is reserved at (%d,%d)",i,j);
                this.seatsPrices[i][j] = 0;
                System.out.printf("Is there anyone who would you like to get another one? (Y/N)");
            }
            else{
                System.out.printf("That place is not avaliable would you like to get another one (Y/N)");
            }
        }
    }
    /** 
     * This function returns the coordinates of the seat accoridng to it's price. It finds the first seat that is available and
     * has the price that is wanted
     * @param price Wanted price of the seat.
     * @return returns the coordinates of the wanted price seat.
     */
    public int[] findTheFirstAvailablePlaceAccordingToPrice(int price){
        int[] coordinates = {-1, -1};
        //TODO
        int i = 0;
        int j = 0;
        for(i=0;i<9;i++){
            for(j=0;j<10;j++){
                if(seatsPrices[i][j] == price){
                    if(checkAvailabilityOfSeat(i,j)==true){
                    coordinates[0] = i;
                    coordinates[1] = j;
                    return coordinates;
                }
                    
                }
            }
        }
        return coordinates;
    
    }
}
