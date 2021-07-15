
/**
 * Employee class extends to Person class. Executive has name and salary. Takes name parameter
 * from Person class.Employee is a Person.
 * 
 *
 * @author Mehmet Hekimoğlu
 * @version (11/07/2021)
 * @param salary Salary of the Employee.
 */
public class Employee extends Person
{
    private int salary;
    /**
     * Constructor class for Employee. Takes name and salary and set it to variables.
     * @param name Name of the Employee to be set to Person.name using super.().
     * @param salary Salary of the Employee.
     */
    public Employee(String name,int salary)
    {
        super(name);
        this.salary = salary;
    }
    /**
     * This function sets the salary of the Employee to a new value.
     * @param salary Salary of the Employee.
     */
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    /**
     * This function returns the salary of the Employee.
     * @return Returns the salary of the Employee.
     */
    public int getSalary()
    {
        return salary;
    }
    /**
     * This function prints the salary and name of Employee. Uses Person.toString() to print the name of the Employee.
     * @return Returns text containing name and salary of the Employee.
     */
    @Override  public String toString()
    {
        return ("\n"+super.toString()+"\nHe/She gets "+salary+".");
    }
    
}
