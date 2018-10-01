import java.text.SimpleDateFormat;
import java.util.Date;

public class Java4_8 {
    public static void main(String args[]){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
