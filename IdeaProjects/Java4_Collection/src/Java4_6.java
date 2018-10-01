
import java.util.*;


public class Java4_6 {

    public static void freq(String a) {
        char[] b = a.toCharArray();

        HashMap<Character, Integer> h = new HashMap<Character, Integer>();

        for (int i = 0; i < b.length; i++) {
            int count = i;
            char ch = b[count];

            if (h.containsKey(b[i])) {
                h.put(ch, h.get(ch) + 1);
            } else {
                h.put(ch, 1);
            }
        }

        System.out.println(h);


        Set<Map.Entry<Character, Integer>> set = h.entrySet();
        System.out.println(set);

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(
                set);
        Collections.sort(list, (o1,o2)-> o2.getValue().compareTo(o1.getValue())
        );

        for (Map.Entry<Character, Integer> entry : list) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers");
        String a=s.next();
        freq(a);

    }
}