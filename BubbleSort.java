import java.util.*;

public class BubbleSort
{
    public static void PrintArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int i,j,n;
        int a[] = {1,2,6,3,0};
        n = a.length;

        for(i=0; i<n-1; i++)
        {
            for(j=0; j<n-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        PrintArray(a);
    }
}