
/**
 * 
 *
 * @author Mehmet Hekimoğlu
 * @version (11/07/2021)
 * Person class generates person. Person has a name.
 * @param name Name of the Person.
 */
public  class Person implements Comparable
{
    private String name;
    /**
     * @param name input name to give to the Person.
     * This is constructor for Person class. It sets given name to private variable name.
     */
    public Person(String name)
    {
        this.name = name;
    }
    /**
     * This function changes the name of a person
     * @param name input name to give to the Person.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * This function gets the name of the person and returns it.
     * @return returns name of the person
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * This class returns a text with the name of the person inside of it.
     * @return returns the string text with Person.name in it.
     */
    public String toString()
    {
        return ("His/her name is "+this.name+".");
    }
    /**
     * This function uses Comparable interface to compare the name of the given input person and 
     * name of the function caller. Returns an integer from compareTo() class.
     * @return returns an integer from compareTo() function. According to dictionary order, returns positive or negative integer.
     * @param otherObject Takes input as an Object and we are typecasting it into a Person object to compare with function caller Person.
     */
     public int compareTo(Object otherObject)
    {
        
        Person other = (Person) otherObject;
        return(this.name.compareTo(other.name));
        
        
    }
}
