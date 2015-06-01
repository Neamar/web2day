package bealder.web2day;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public abstract class WebActivity extends Activity {
    public void onCreate(Bundle savedInstanceState, String url) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_webview);

        new MixinMenuActivity().addMenuListeners(this);

        WebView webView = (WebView) findViewById(R.id.webView);
        final View loader = findViewById(R.id.loader);
        webView.loadUrl(url);

        webView.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                loader.setVisibility(View.GONE);
            }
        });
    }
}
