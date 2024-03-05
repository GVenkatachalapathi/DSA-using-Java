import java.util.*;

public class recursion1
{
    public static void PrintNums(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(n+" ");
        PrintNums(n-1);
    }
    public static void main(String args[])
    {
        int n=5;
        PrintNums(n);
    }
}