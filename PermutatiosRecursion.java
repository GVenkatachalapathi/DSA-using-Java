import java.util.*;

public class PermutatiosRecursion
{
    public static void printperm(String str, String combinations)
    {
        if(str.length() == 0)
        {
            System.out.println(combinations);
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char currentchar = str.charAt(i);
            String newstring = str.substring(0,i) + str.substring(i+1);
            printperm(newstring,combinations+currentchar);
        }
    }

    public static void main(String args[])
    {
        String str = "abcd";
        printperm(str, "");
    }
}