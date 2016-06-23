import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by yatnosudar on 5/7/15.
 */
public class FragmentHelper {

    public static void replaceFragment(AppCompatActivity activity,Fragment fragment,int idContainer){
        activity.getSupportFragmentManager().beginTransaction()
                .replace(idContainer, fragment)
                .commit();
    }
    public static void addFragment(AppCompatActivity activity,Fragment fragment,int idContainer){
        activity.getSupportFragmentManager().beginTransaction()
                .add(idContainer, fragment)
                .commit();
    }
}
