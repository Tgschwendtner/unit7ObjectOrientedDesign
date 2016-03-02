import java.util.Scanner;
public class FillInQuestion extends Question
{
    //override the setText method to extract the answer from the question text
    public void setText( String questionText)
    {
        Scanner parser = new Scanner( questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question +="____" + parser.next();
        
        super.setText( question);
        setAnswer( answer);
    }
}