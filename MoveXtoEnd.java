import java.util.*;

public class MoveXtoEnd
{
    public static void Xmove(String str,int idx, int count, String newstring)
    {
        if(idx == str.length())
        {
            for(int i=0; i<count; i++)
            {
                newstring += 'x';
            }
            System.out.print(newstring);
            return;
        }
        char currentchar = str.charAt(idx);
        if(currentchar == 'x')
        {
            count++;
            Xmove(str, idx+1, count, newstring);
        }
        else
        {
            newstring += currentchar;
            Xmove(str, idx+1, count, newstring);
        }
    }

    public static void main(String args[])
    {
        String str = "axbcxxd";
        Xmove(str, 0, 0, "");
    }
}