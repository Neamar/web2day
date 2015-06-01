package bealder.web2day;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class BealderActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bealder);

        new MixinMenuActivity().addMenuListeners(this);
    }

    public void contactUs(View contactUs) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "contact@bealder.com", null));
        startActivity(Intent.createChooser(emailIntent, getString(R.string.send_email)));
    }
}
