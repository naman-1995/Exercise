import static java.text.DateFormat.FULL;
import static java.text.DateFormat.LONG;
import static java.text.DateFormat.MEDIUM;
import static java.text.DateFormat.SHORT;
import static java.util.Locale.UK;
import static java.util.Locale.US;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class Java4_9 {
    public static void main(String[] args) {
        Date today = new Date();

        Locale[] locales = { US, UK,};

        int[] styles = { FULL, LONG, MEDIUM, SHORT };

        String[] styleNames = { "FULL", "LONG", "MEDIUM", "SHORT" };

        DateFormat dateFormat = null;



        for (Locale locale : locales)
        {
            System.out.println("\nThe Date for " + locale.getDisplayCountry() + ":");

            for (int i = 0; i < styles.length; i++)
            {
                dateFormat = DateFormat.getDateInstance(styles[i], locale);

                System.out.println("\t In " + styleNames[i] + " is " + dateFormat.format(today));
            }
        }
    }
}

