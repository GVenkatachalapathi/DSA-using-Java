import java.util.*;

public class ReverseStringRecursion
{
    public static void PrintRevString(String str, int idx)
    {
        if(idx == 0 )
        {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        PrintRevString(str, idx-1);
    }
    public static void main(String args[])
    {
        String  str = "manas";
        PrintRevString(str, str.length()-1);
    }
}