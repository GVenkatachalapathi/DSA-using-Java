
 import java.util.*;

 public class stringsconcept
{
    public static void main(String args[])
    {
        String firstname = "Venkata Chalapthi";
        String lastname = "Gujjala";
        String fullname = firstname +" " +lastname;
        System.out.println("Full Name is :" +fullname);
        int n = fullname.length();
        System.out.println("length of string :"+n);
        int i;
        for(i=0; i<n; i++)
        {
            System.out.println(fullname.charAt(i));
        }
        if (firstname.compareTo(lastname) == 0)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
        String str = "badboy";
        String newstr = str.substring(3);
        System.out.println(newstr);
    }
}