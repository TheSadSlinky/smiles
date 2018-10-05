
/**
 * Write a description of class Name here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Name
{
    private String name;

    public Name()
    {
        name = "Billy";
    }

    public Name(String s)
    {
        name = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public String getFirst()
    {
        return name.substring(0,name.indexOf(" "));
    }

    public String getLast()
    {
        return name.substring(name.indexOf(" " + 1));
    }

    public String toString()
    {
        getFirst();
        getLast();
        
        String output = getFirst();
        output += getLast();
        output += name;
        
        return output;
    }

}
