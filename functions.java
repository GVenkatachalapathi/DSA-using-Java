import java.util.*;

public class functions
{
    public static  void printMyName(String name)
    {
        System.out.print(name);
        return;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter name :");
        String name=s.next();
        printMyName(name);
    }
}