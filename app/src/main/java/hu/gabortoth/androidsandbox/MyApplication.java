package hu.gabortoth.androidsandbox;

import android.app.Application;
import android.util.Log;

import com.google.firebase.FirebaseApp;

import hu.gabortoth.androidsandbox.helpers.FontsOverride;
//import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by gtoth on 2016.10.11..
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FontsOverride.setDefaultFont(this, "DEFAULT", "Raleway-Black.ttf");
        FontsOverride.setDefaultFont(this, "MONOSPACE", "Raleway-Black.ttf");
        FontsOverride.setDefaultFont(this, "SERIF", "Raleway-Regular.ttf");
        FontsOverride.setDefaultFont(this, "SANS_SERIF", "Raleway-Black.ttf");

        /*CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Raleway-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );*/

        //FirebaseApp.initializeApp(this, FirebaseOptions.fromResource(this));
        // ^ already exists

        if (!FirebaseApp.getApps(this).isEmpty()) {
            //FirebaseDatabase.getInstance().setPersistenceEnabled(true);
            //startService(new Intent(MyFirebaseInstanceIdService.class.getName()));
            Log.d("MyApplication", "FirebaseApp not empty");
        }
    }
}
