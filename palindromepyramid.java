import java.util.*;

public class palindromepyramid
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows in pyramid:");
        int n = sc.nextInt();
        
        for (i=1; i<=n; i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}