import java.util.*;

public class stringbuilderconcept
{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("VenkataChalapathi");
        System.out.println("String : " + sb);
        // set char

        sb.setCharAt(0,'p');
        System.out.println(sb);

        //insert char
        sb.insert(0, 'v');
        System.out.println(sb);

        //delete char
        sb.delete(1,2);
        System.out.println(sb);

        //append char
        sb.append('G');
        System.out.println(" "+sb);

    }
}