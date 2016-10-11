package hu.gabortoth.androidsandbox;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
//import com.google.firebase.database.FirebaseDatabase;

//import com.google.firebase.messaging.FirebaseMessaging;
//import com.google.firebase.messaging.FirebaseMessagingService;

import hu.gabortoth.androidsandbox.fcm.MyFirebaseInstanceIdService;

/**
 * Created by gtoth on 2016.10.11..
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //FirebaseApp.initializeApp(this, FirebaseOptions.fromResource(this));
        // ^ already exists

        if (!FirebaseApp.getApps(this).isEmpty()) {
            //FirebaseDatabase.getInstance().setPersistenceEnabled(true);
            //startService(new Intent(MyFirebaseInstanceIdService.class.getName()));
            Log.d("MyApplication", "FirebaseApp not empty");
        }
    }
}
