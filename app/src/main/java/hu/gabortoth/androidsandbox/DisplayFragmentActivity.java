package hu.gabortoth.androidsandbox;

import android.net.Uri;
import android.os.Bundle;

public class DisplayFragmentActivity extends android.support.v4.app.FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        //setContentView(R.layout.news_articles);

        /*if(findViewById(R.id.fragment_container) != null) {
            // if we're being restored from a previous state,
            // then we don't need to do anything or else
            // we could end up with overlapping fragments.
            if(savedInstanceState != null) {
                return;
            }

            HeadlinesFragment headlinesFragment = new HeadlinesFragment();

            // in case this activity started special instructions from an intent
            // pass the intent's extras to the fragment as argument
            headlinesFragment.setArguments(getIntent().getExtras());

            // add fragment to the fragment container
            // (notice fluent interface pattern!)
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,headlinesFragment).commit();
        }*/
    }

}
