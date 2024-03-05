import java.util.*;

public class StackHeight
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
        int xpownm1 = printXpowN( x,  n-1 );
        int xpown = x * xpownm1;
        return xpown;
    }
    public static void main(String args[])
    {
        int x = 2 , n = 5 ;
        int ans = printXpowN(x,n);
        System.out.println("x pow n :"+ans);
    }
}