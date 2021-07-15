/**
 * This function generates a Store class which has customer names and their corresponding sale number.
 * It holds 10 customer name, and 10 sale number.
 */
public class Store
{
    private double[] sales;
    private String[] customerNames;
    private int counter;
    /**
     * Constructor for Store Class. It initalizes counter to 0, customerNames to String array of 10 elements and sales to double array of 10 elements.
     */
    public Store()
    {
        //TODO
        this.counter = 0;
        this.customerNames = new String[10];
        this.sales = new double[10];
    }

   /**
    * This function will add the given customer name and sale number to the class objects.
    * @param1 Name of the customer to be added to the list
    * @param2 Sale amount of the customer to be added to the list.
    */
    public void addSale(String customerName, double saleAmount)
    {
        //TODO
        this.customerNames[counter]=customerName;
        this.sales[counter] = saleAmount;
        counter++;
    }
    /**
     * This function will calculate the name of the best customer in the list. In a list of 10 people, it will return the person with most sales.
     * @return The name of the customer with most sales.
     */
    public String nameOfBestCustomer(){
        //TODO
        double max=-999999;
        int count = 0;
        for(int i = 0;i<10;i++){
            if(this.sales[i]>max){
                max = this.sales[i];
                count = i;
            }
            
            
        }
        return this.customerNames[count];
    }
}
