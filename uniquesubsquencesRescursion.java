import java.util.HashSet;

public class uniquesubsquencesRescursion
{
    public static void uniquesubsquences(String str, int idx,String newstring, HashSet<String> set)
    {
        if( idx == str.length() )
        {
            if(set.contains(newstring))
            {
                return;
            }
            else
            {
                System.out.println(newstring+"...");
                set.add(newstring);
                return;
            }
        }
        char currentchar = str.charAt(idx);
        uniquesubsquences(str, idx+1, newstring+currentchar, set);
        uniquesubsquences(str, idx+1, newstring, set);

    }
    public static void main(String args[])
    {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniquesubsquences(str, 0, "", set);
    }
}