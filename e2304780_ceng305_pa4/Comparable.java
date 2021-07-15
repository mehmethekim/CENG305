
/**
 * This is Comparable interface. It has one function which is to compare 2 strings and returns positive number if function caller is bigger than the argument.
 * Negative number if smaller. Returns 0 if they are equal lexicographically.
 *
 * @author Mehmet Hekimoğlu
 * @version (11/07/2021)
 */
public interface Comparable
{
    int compareTo(Object otherObject);
}
