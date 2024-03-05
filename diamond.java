import java.util.*;

public class diamond
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
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=n-1; i>=1; i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}