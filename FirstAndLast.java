
/**
 * Write a description of class FirstAndLast here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstAndLast {
    private String word;

    public FirstAndLast(String s)
    {
        word = s;
    }

    public void setString(String s)
    {
        word = s;
        return;
    }

    public char getFirst()
    {
        return word.charAt(0);
    }

    public char getLast()
    {
        return word.charAt(word.length()-1);
    }

    public String toString()
    {
        String output = "\nword :: " + word;
        output += "\nfirst letter :: " + getFirst();
        output += "\nlast letter :: " + getLast();
        return output;
    }
}
