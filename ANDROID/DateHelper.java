import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by yatnosudar on 4/28/15.
 */
public class DateHelper {

    public static final String DATE_DEFAULT = "yyyy-MM-dd";
    public static final String DATE_DEFAULT_WITH_TIME = "yyyy-MM-dd HH:mm";
    public static final String DATE_DDMMYYYY = "dd-MM-yyyy";
    public static final String DATE_EEDDMMMYYYY = "EEEE, dd MMMM yyyy";
    public static final String DATE_DDMMMMYYYY = "dd MMMM yyyy";
    public static final String DATE_YYYY_MM_DD = "yyyy/MM/dd";
    public static final String DATE_YYYY_MM_DD_WITH_TIME = "yyyy/MM/dd HH:mm";
    public static final String LOCALE = "ID"

    public static String dateParseToString(String dateInput, String old_format, String formatDate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(old_format);
            Date date;
            date = sdf.parse(dateInput);
            Locale id = new Locale("in", LOCALE);
            SimpleDateFormat format = new SimpleDateFormat(formatDate, id);
            String result = format.format(date);
            return result;
        } catch (ParseException e) {
            return dateInput;
        }
    }
    public static String dateParseToString(Date date, String old_format){
        Locale id = new Locale("in", LOCALE);
        SimpleDateFormat format = new SimpleDateFormat(old_format, id);
        String result = format.format(date);
        return result;
    }
    public static Date dateParseToDate(String dateInput, String old_format){
        try {
            Locale id = new Locale("in", LOCALE);
            SimpleDateFormat sdf = new SimpleDateFormat(old_format,id);
            Date date = sdf.parse(dateInput);
            return date;
        } catch (Exception e) {
            return null;
        }
    }
}
