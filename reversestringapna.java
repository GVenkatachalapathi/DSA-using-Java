import java.util.*;

public class reversestringapna
{
    public static void main(String args[])
    {
        StringBuilder str = new StringBuilder("basha");
        int n = str.length();
        int i;
        for(i=0; i<n/2; i++)
        {
            int front = i;
            int back = n-1-i;

            char frontchar = str.charAt(front);
            char backchar = str.charAt(back);

            str.setCharAt (front, backchar);
            str.setCharAt ( back, frontchar);
        }
        System.out.println("Reversed string :"+str);
    }
}