package hu.gabortoth.androidsandbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("qqq","test");

        Date buildDate = new Date(BuildConfig.TIMESTAMP);
        TextView buildTimeTextView = (TextView) findViewById(R.id.build_time);
        buildTimeTextView.setText(buildDate.toString());
    }

    // In order for the system to match this method to
    // the method name given to android:onClick, the
    // method must:
    //   o be public
    //   o have a void return value
    //   o have a View as the only parameter
    //     (this will be the View that was clicked)
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void openFragmentActivity(View view) {
        Intent intent = new Intent(this, DisplayFragmentActivity.class);
        startActivity(intent);
    }
}
