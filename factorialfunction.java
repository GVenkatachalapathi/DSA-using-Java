import java.util.*;

public class factorialfunction

{
    public  static void FindFactorial(int n)
    {
        int fact=1;
        for(int i=n; i>=1; i--)
        {
            fact =fact*i;
        }
        System.out.println("The factorial is :" +fact);
    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        FindFactorial(n);
    }
}