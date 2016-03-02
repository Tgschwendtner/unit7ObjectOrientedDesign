public class CallingCard extends Card
{
    private int CardNumber;
    private int Pin;
    public CallingCard( int Cardnum, int Code, String n)
    {
        super(n);
        CardNumber = Cardnum;
        Pin = Code;
    }
}
