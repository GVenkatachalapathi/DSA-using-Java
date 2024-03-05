import java.util.*;

public class InvitePartyRecursion
{
    public static int totalways(int n)
    {
        if(n <= 1)
        {
            return 1;
        }

        int ways1 = totalways(n-1);
        int ways2 = (n-1) * totalways(n-2);

        return ways1 + ways2;
    }

    public static void main(String args[])
    {
        int n = 4;
        int ans = totalways(n);
        System.out.println("ways :"+ans);
    }
}