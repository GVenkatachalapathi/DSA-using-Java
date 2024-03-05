import java.util.*;

public class recursion3naturalsum
{
    public static void PrintSum(int i,int n,int sum) {
        if( i==n )
        {
            sum = sum + i;
            System.out.println("Sum :"+sum);
            return;
        }
        sum = sum + i;
        PrintSum(i+1, n, sum); 
    }
    public static void main(String args[])
    {
        PrintSum(1, 5, 0); 
    }
}