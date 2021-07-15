
/**
 * Executive class extends to Manager. Executive is a Manager that has a region code.
 *@param region_code Region Code of the Executive.
 * @author Mehmet Hekimoğlu
 * @version (11/07/2021)
 */
public class Executive extends Manager
{
    private String region_code;
    /**
     * Constructor class for Executive. Takes name, salary, department, region_code and set it to variables.
     * @param name Name of the Exective.
     * @param salary Salary of the Exective.
     * @param department Department of the Exective.
     * @param region_code Region Code of the Exective.
     */
    public Executive(String name,int salary,String department, String region_code)
    {
        super(name,salary,department);
        this.region_code= region_code;
    }
    /**
     * This function prints the salary, name, department and region_code of the Executive. Uses Manager.toString() to print the name, salary and the department of the Executive.
     * @return Returns text containing salary, name, department and region code of the Executive.
     */
    public String toString(){
        return (super.toString()+"\nHis/Her region is "+ region_code+".\n");
    }

    
}
