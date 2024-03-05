import java.util.*;
public class input
{
    public static void main(String args[])
    {
        int a,b;
        System.out.println("Enter any two numbers :");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        int sum=a+b;
        System.out.println("Sum of two numbers :"+sum);
    }
}