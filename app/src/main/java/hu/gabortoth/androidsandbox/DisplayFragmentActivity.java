package hu.gabortoth.androidsandbox;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class DisplayFragmentActivity extends android.support.v4.app.FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
