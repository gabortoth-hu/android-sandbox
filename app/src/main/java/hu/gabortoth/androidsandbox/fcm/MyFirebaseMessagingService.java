package hu.gabortoth.androidsandbox.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Gabor Toth on 2016. 10. 11..
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "FcmService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d(TAG,"Mesage received: "+remoteMessage.getMessageId());
    }
}
