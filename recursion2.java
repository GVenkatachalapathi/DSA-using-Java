import java.util.*;

public class recursion2
{
    public static void PrintNums(int n)
    {
        if(n == 6)
        {
            return;
        }
        System.out.print(n+" ");
        PrintNums(n+1);
    }
    public static void main(String args[])
    {
        int n=1;
        PrintNums(n);
    }
}