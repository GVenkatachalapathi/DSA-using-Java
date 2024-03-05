import java.util.*;

public class lineararray
{
    public static void main(String args[])
    {
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = s.nextInt();
        int search[]=new int[n];
        for(i=0; i<n; i++){
            search[i]=s.nextInt();
        }
        System.out.println("Enter a number to search :");
        int x = s.nextInt();
        for(i=0; i<n; i++)
        {
            if(search[i]==x)
            {
                System.out.println("index :"+i);
                break;
            }
        }
    }
}