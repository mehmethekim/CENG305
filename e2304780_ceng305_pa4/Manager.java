
/**
 * Manager class extends to Employee. Manager is an Employee. Managers have departments.
 * @param department Department of the Manager.
 * @author Mehmet Hekimoğlu
 * @version (11/07/2021)
 */
public class Manager extends Employee
{
    private String department;
    /**
     * Constructor class for Manager Takes name, salary, department and set it to variables.
     * @param name Name of the Manager to be set to Employee.name using super.().
     * @param salary Salary of the Manager to be set to Employee.salary using super.().
     * @param department Department of the Manager.
     */
    public Manager(String name, int salary, String department)
    {
         super(name,salary);
         this.department = department;
    }
    /**
     * This function sets the department of the Manager to a new value.
     * @param department Department of the Manager.
     */
    public void setDepartment(String department){
        this.department = department;
    }
    /**
     * This function returns the department of the Manager.
     * @return returns the department of the Manager.
     */
    public String getDepartment(){
        return department;
    }
    /**
     * This function prints the salary, name and department of the Manager. Uses Employee.toString() to print the name and salary of the Employee.
     * @return Returns text containing salary, name and department of the Manager.
     */
    
    @Override public String toString(){
        return (super.toString()+"\nHis/Her department is "+department+".");
    }
}
