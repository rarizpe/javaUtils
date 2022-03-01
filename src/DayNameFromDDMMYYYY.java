import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DayNameFromDDMMYYYY {
    public static void main(String[] args) throws ParseException {
        int year = 2015;
        int month = 8;
        int day = 5;
            String dateS = String.format("%d-%d-%d", month, day, year);
            SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
            Date d = df.parse(dateS);
            System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(d).toUpperCase());
    }
}
