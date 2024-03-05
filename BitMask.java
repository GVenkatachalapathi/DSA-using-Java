import java.util.*;

public class BitMask
{
    public static void main(String args[])
    {
        // int n = 5;
        // int pos = 2;
        // int bitmask = 1<<pos;

        // if( (bitmask & n) == 0 )
        // {
        //     System.out.println("Bit was zero");
        // }
        // else
        // {
        //     System.out.println("Bit was one");
        // }
        // int newnumber = bitmask | n ;
        // System.out.println("new :"+newnumber);

        // int notbitmask = ~(bitmask);

        // int newnumber = notbitmask & n ;
        // System.out.print("New number after removing the bit is: "+newnumber);

        Scanner s = new Scanner(System.in);
        System.out.println("enter operation to change bit :");
        int oper = s.nextInt();
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;

        if( oper == 1 )
        {
            int newnumber = bitmask | n ;
            System.out.println(newnumber);
        }
        else{
            int  notbitmask = ~(bitmask);
            int newnumber = notbitmask & n;
            System.out.println(newnumber);
        }
    }
}