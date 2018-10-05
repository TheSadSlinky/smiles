
/**
 * Write a description of class StringRipper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringRipper
{
    private String word;

    public StringRipper()
    {
        word = "sad";
    }

    public StringRipper(String s)
    {
        word = s;
    }

    public void setString(String s)
    {
        word = s;
    }	

    public String ripString(int x, int y)
    {
        return word.substring(x,y);
    }

    public String toString()
    {
        return word + "\n\n";
    }

}
