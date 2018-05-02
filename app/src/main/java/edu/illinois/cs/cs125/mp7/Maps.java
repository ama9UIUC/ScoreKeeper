package edu.illinois.cs.cs125.mp7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.uber.sdk.android.core.UberSdk;
import com.uber.sdk.android.rides.RideRequestButton;
import com.uber.sdk.core.auth.Scope;
import com.uber.sdk.rides.client.SessionConfiguration;

public class Maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SessionConfiguration config = new SessionConfiguration.Builder()
                // mandatory
                .setClientId("")
                // required for enhanced button features
                .setServerToken("")
                // required for implicit grant authentication
                .setRedirectUri("<REDIRECT_URI>")
                // optional: set sandbox as operating environment
                .setEnvironment(SessionConfiguration.Environment.SANDBOX)
                .build();
        UberSdk.initialize(config);

        RideRequestButton requestButton = new RideRequestButton(Maps.this);
        RelativeLayout layout = new RelativeLayout(this);

        layout.addView(requestButton);





    }
}
