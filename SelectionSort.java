import java.util.*;

public class SelectionSort
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
            int smallest = i;
            for(j=i+1; j<n; j++)
            {
                if(a[smallest] > a[j])
                {
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        PrintArray(a);
    }
}