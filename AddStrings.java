
/**
 * Write a description of class AddStrings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AddStrings {
    String word1;
    String word2;

    public AddStrings() {
        word1 = "no input";
        word2 = "no input";
    }

    public AddStrings(String w1,String w2){
        word1 = w1;
        word2 = w2;
    }

    public void setWords(String w1, String w2) {
        word1 = w1;
        word2 = w2;
    }
    
    public String toString() {
        String output = "";
        output += "first:: " + word1;
        output += "\nlast:: " + word2;
        output += "\nsum:: " + word1 + " " + word2;
        return output;
    }
}
