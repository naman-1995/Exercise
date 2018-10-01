import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Java4_1{

    public static void main(String[] args) {
        List<Float> a= Arrays.asList(new Float(10),new Float(20),new Float(30),new Float(40),new Float(50));

        ListIterator iterator=a.listIterator();
        float sum =0;
        while(iterator.hasNext())
        {
            float i=(Float) iterator.next();

            sum += i;
        }

        System.out.println(sum);

    }

}
