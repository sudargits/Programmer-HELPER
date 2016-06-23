import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yatnosudar on 5/26/15.
 */
public class RegexHelper {
    public static final String ALPHABET_NUMBER = "^[a-zA-Z0-9 _]*[a-zA-Z0-9][a-zA-Z0-9 _]*$";
    public static final String EMAIL = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
    public static final String ALPHABET = "^[a-zA-Z _]*[a-zA-Z][a-zA-Z _]*$";
    public static final String NUMBER = "^[0-9]*[0-9][0-9]*$";

    public static boolean alphabet_number(String value){
        Matcher m = Pattern.compile(ALPHABET_NUMBER).matcher(value);
        return m.find();
    }
    public static boolean alphabet(String value){
        Matcher m = Pattern.compile(ALPHABET).matcher(value);
        return m.find();
    }
    public static boolean email(String value){
        Matcher m = Pattern.compile(EMAIL).matcher(value);
        return m.find();
    }
    public static boolean number(String value){
        Matcher m = Pattern.compile(NUMBER).matcher(value);
        return m.find();
    }
}
