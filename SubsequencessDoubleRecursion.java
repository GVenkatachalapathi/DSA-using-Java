import java.util.*;

public class SubsequencessDoubleRecursion
{
    public static void stringsubsequences(String str,int idx, String newstring){
        if(idx == str.length())
        {
            System.out.println(newstring);
            return;
        }
        char currentchar = str.charAt(idx);
        stringsubsequences(str,idx+1,newstring+currentchar);
        stringsubsequences(str,idx+1,newstring);
    }

    public static void main(String[] args) {
        String str = "abc";
        stringsubsequences(str,0,"");
    }
}