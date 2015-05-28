package bealder.web2day;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class NewsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_webview);

        new MixinMenuActivity().addMenuListeners(this);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("http://web2day.co/actualites-bealder/");
    }
}
