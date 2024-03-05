import java.util.*;

public class TilesRecursion
{
    public static int totalpaths(int  n, int m) 
    {
        if(n < m)
        {
            return 1;
        }
        if(n == m)
        {
            return 2;
        }

        int verpaths = totalpaths(n - m, m);
        int horpaths = totalpaths(n - 1, m);

        return verpaths + horpaths;

    }
    public static void main(String args[])
    {
        int n = 4,m = 3;
        int ans = totalpaths( n, m );
        System.out.println(ans);
    }
}