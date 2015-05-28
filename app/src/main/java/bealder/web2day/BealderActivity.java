package bealder.web2day;

import android.app.Activity;
import android.os.Bundle;


public class BealderActivity extends Activity {
		@Override
		protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_bealder);

            new MixinMenuActivity().addMenuListeners(this);
        }
}
