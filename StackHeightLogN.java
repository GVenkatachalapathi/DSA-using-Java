import java.util.*;

public class StackHeightLogN
{
    public static int printXpowN(int x, int n)
    {
        if( n == 0 )
        {
            return  1;
        }
        if( x == 0 )
        {
            return 0;
        }
        if ( n % 2 == 0)
        {
            return  printXpowN(x ,n/2) * printXpowN(x ,n/2);
        }
        else
        {
            return  printXpowN(x ,n/2) * printXpowN(x ,n/2) * x;
        }
    }
    public static void main(String args[])
    {
        int x = 2 , n = 5 ;
        int ans = printXpowN(x,n);
        System.out.println("x pow n :"+ans);
    }
}