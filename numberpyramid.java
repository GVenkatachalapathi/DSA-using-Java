import java.util.*;

public class numberpyramid
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
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}