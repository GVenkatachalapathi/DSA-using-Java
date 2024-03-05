import java.util.*;

public class reverserightangle
{
    public static void  main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the right angled triangle:");
        int n = sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}