import java.util.*;

public class TowerOfHanoi
{
    public static void DiskTransfer(int n, String source, String helper, String destnation) 
    {
        if(n == 1)
        {
            System.out.println("Move a disk "+n +" from "  + source + " to " + destnation);
            return;
        }

        DiskTransfer(n-1,source,destnation,helper);
        System.out.println("Move a disk "+ n +" from "  + source + " to " + destnation);
        DiskTransfer(n-1,helper,source,destnation);
    }
    public static void main(String args[])
    {
        int n = 3;
        DiskTransfer(n,"S","H","D");
    }
}