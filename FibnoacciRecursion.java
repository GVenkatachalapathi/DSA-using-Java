import java.util.*;

public class FibnoacciRecursion
{
    public static void PrintFibnacci(int a,int b,int n)
    {
        if( n == 0 )
        {
            return;
        }
        int c = a + b;
        System.out.print(" "+c);
        PrintFibnacci( b, c, n-1);
    }
    public static void main(String args[])
    {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series using Recursion:");
        System.out.print(a+" "+b);
        int n = 8;
        PrintFibnacci( a, b, n-2);
    }
}