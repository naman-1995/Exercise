import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java4_2 {

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
        int countchar=0;


        for(Map.Entry<Character,Integer> map : h.entrySet())

        {
            if(map.getValue()==1)
            {
                System.out.println("unique characters are : " + map.getKey());
                countchar++;
            }
        }
        System.out.println("Total unique character are : " + countchar);

    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string to check");
        String a=s.next();
        uniqueChar(a);

    }
}
