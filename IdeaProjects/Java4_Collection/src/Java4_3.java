import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java4_3 {

    public static void uniqueChar(String a)
    {
        char[] b=a.toCharArray();

        HashMap<Character,Integer> h = new HashMap<Character,Integer>();

        for(int i=0;i<b.length;i++)
        {
            int count=i;
            char ch=b[count];

            if(h.containsKey(b[i]))
            {
                h.put(ch,h.get(ch)+1);
            }
            else
            {
                h.put(ch,1);
            }
        }

        System.out.println(h);

    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string to check");
        String a=s.next();
        uniqueChar(a);

    }
}

