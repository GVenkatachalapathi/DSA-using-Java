import java.util.*;

public class recursion4Factorial
{
    public static int Factorial(int n) {
        if( n == 1 ||  n == 0 )
        {
            return 1;
        }
        int fm1 = Factorial(n-1);
        int factofn = n * Factorial(n-1);
        return factofn;
    }
    public static void main(String args[])
    {
        int n = 5;
        int ans = Factorial(n);
        System.out.println("Factorial :"+ans);
    }
}