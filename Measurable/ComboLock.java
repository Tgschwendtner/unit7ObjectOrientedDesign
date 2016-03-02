public class ComboLock
{
    private int dial = 0;
    private int secret1; 
    private int secret2;
    private int secret3;
    private boolean open1;
    private boolean open2;
    private boolean open3;
    public ComboLock( int num1, int num2, int num3 )
    {
        secret1 = num1;
        secret2 = num2;
        secret3 = num3;
    }

    public void turnRight( int ticks)
    {
        int count = 0;
        while (count <= ticks)
        {
            if (dial == 39)
            {
                dial = 0;
            }
            else
            {
                dial++;
            }
            count++;
        }
        if (dial == secret1 )
        {
            open1 = true;
        }

        else if( dial != secret1)
        {
            open1 = false;
        }
        if (open1 == true)
        {
            if( dial == secret3)
            {
                open3 = true;
            }
            else if( dial != secret3)
            {
                open3 = false;
            }
        }
    }

    public void turnLeft( int ticks)
    {
        int count = 0;
        while (count <= ticks)
        {
            if (dial == 0)
            {
                dial = 39;
            }
            else
            {
                dial--;
            }
            count++;
        }
        if (dial != secret2)
        {
            open2 = false;
        }
        else
        {
            open2 = true;
        }
    }

    public void reset()
    {
        dial = 0;
        open1 = false;
        open2 = false;
        open3 = false;
    }

    public boolean open()
    {
        if ( open1 == true && open2 == true && open3 == true )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}