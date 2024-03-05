import java.util.*;

public class CharOccuranceRecursion
{
    public static int first = -1;
    public static int last  = -1;

    public static void PrintIndexes(String str, int idx, char element)
    {
        if(idx == str.length() )
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentchar = str.charAt(idx);
        if(currentchar == element)
        {
            if(first == -1)
            {
                first = idx;
            }
            else
            {
                last = idx;
            }
        }
        PrintIndexes(str, idx+1, element);
    }
    public static void main(String args[])
    {
        String  str = "malalalls";
        PrintIndexes(str,0,'a');
    }
}