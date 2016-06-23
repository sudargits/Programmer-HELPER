import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by ibun on 29/04/15.
 */
public class NumberHelper {
    public static String formatRupiahWithoutSymbol(double value){
        Locale id = new Locale("in", "ID");
        return NumberFormat.getInstance(id).format(value);
    }


}