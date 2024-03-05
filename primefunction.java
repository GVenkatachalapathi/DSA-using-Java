import java.util.*;

public class primefunction
{
    public  static void FindPrime(int number)
    {
        boolean isprime=true;
        for(int i=2; i<=Math.sqrt(number); i++)
        {
            if(number%i==0)
            {
                isprime=false;
                break;
            }
        }
        if (isprime) {
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
        
    }
    public static  void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        FindPrime(number);
    }
}