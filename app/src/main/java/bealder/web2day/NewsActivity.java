package bealder.web2day;

import android.os.Bundle;


public class NewsActivity extends WebActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, "http://web2day.co/actualites-bealder/");
    }
}
