import java.util.*;

public class RemoveDuplicatesStringRecursion
{
    public static boolean map[] = new boolean[26];
    public static void removeDuplicate(String str, int idx, String newstring)
    {
        if(idx == str.length())
        {
            System.out.print(newstring);
            return;
        }
        char currentchar = str.charAt(idx);
        if(map[currentchar - 'a'])
        {
            removeDuplicate(str, idx+1, newstring);
        }
        else
        {
            newstring += currentchar;
            map[currentchar - 'a'] = true;
            removeDuplicate(str, idx+1, newstring);
        }
    } 

    public static void main(String args[])
    {
        String str = "chalapthi";
        removeDuplicate(str, 0, "");
    }
}