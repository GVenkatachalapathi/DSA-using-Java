import java.util.*;

public class InsertionSort
{
    public static void PrintArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
    
        int a[] = {1,2,6,3,0};
        int n = a.length;

        for(int i=1; i<n; i++)
        {
            int current = a[i];
            int j=i-1;
            
            while( j>=0 && current < a[j] )
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        PrintArray(a);
    }
}