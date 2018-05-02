package edu.illinois.cs.cs125.mp7;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class HomePage extends AppCompatActivity {
    ImageButton basketballPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);



        basketballPicture = (ImageButton) findViewById(R.id.basketballPicture);
        basketballPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code that executes for the basketball image button
                Intent basketballPicIntent = new Intent(HomePage.this, MainActivity.class);
                startActivity(basketballPicIntent);
                Log.v("basketballIntent", "basketball intent pressed");
            }

        });






    }
}
