package edu.illinois.cs.cs125.mp7;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
    ImageButton basketballPicture;
    ImageButton cricketBallPicture;

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
                Context context = getApplicationContext();
                CharSequence text = "Input team names and score limit";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Log.v("basketballIntent", "basketball intent pressed");
            }

        });

        cricketBallPicture = (ImageButton) findViewById(R.id.cricketBallPicture);
        cricketBallPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code that executes for the basketball image button
                Intent cricketBallPicIntent = new Intent(HomePage.this, CricketScoreActivity.class);
                startActivity(cricketBallPicIntent);
                Context context = getApplicationContext();
                CharSequence text = "Input home country";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Log.v("cricketBallIntent", "cricket intent pressed");
            }

    }
        );

}
}