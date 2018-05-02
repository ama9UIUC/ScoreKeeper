package edu.illinois.cs.cs125.mp7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView team1ScoreString;
    private TextView team2ScoreString;
    private Button minusButton1;
    private Button plusButton1;
    private Button resetButton;
    private Button minusButton2;
    private Button plusButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minusButton1 = findViewById(R.id.minusButton1);
        team1ScoreString = findViewById(R.id.team1Score);
        minusButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String team1Score = team1ScoreString.getText().toString();
                int team1ScoreInt = Integer.parseInt(team1Score);
                team1ScoreInt--;
                team1Score = String.valueOf(team1ScoreInt);
                team1ScoreString.setText(team1Score);
                // Code here executes on main thread after user presses button
                Log.v("minusButton1Clicked", "minus button 1 pressed");
                }
        }
        );


        plusButton1 = findViewById(R.id.plusButton1);
        plusButton1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View h) {
                    String team1Score = team1ScoreString.getText().toString();
                    int team1ScoreInt = Integer.parseInt(team1Score);
                    team1ScoreInt++;
                    team1Score = String.valueOf(team1ScoreInt);
                    team1ScoreString.setText(team1Score);
                    // Code here executes on main thread after user presses button
                    Log.v("plusButton1Clicked", "plus button 1 pressed");
                }
        }
        );
        team2ScoreString = findViewById(R.id.team2Score);
        minusButton2 = findViewById(R.id.minusButton2);
        team2ScoreString = findViewById(R.id.team2Score);
        minusButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String team2Score = team2ScoreString.getText().toString();
                int team2ScoreInt = Integer.parseInt(team2Score);
                team2ScoreInt--;
                team2Score = String.valueOf(team2ScoreInt);
                team2ScoreString.setText(team2Score);
                // Code here executes on main thread after user presses button
                Log.v("minusButton2Clicked", "minus button 2 pressed");
                }
                }
        );
        //
        plusButton2 = findViewById(R.id.plusButton2);
        plusButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View h) {
                String team2Score = team2ScoreString.getText().toString();
                int team2ScoreInt = Integer.parseInt(team2Score);
                team2ScoreInt++;
                team2Score = String.valueOf(team2ScoreInt);
                team2ScoreString.setText(team2Score);
                // Code here executes on main thread after user presses button
                Log.v("plusButton2Clicked", "plus button 2 pressed");
                }
                }
        );
        resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View h) {
                // Code here executes on main thread after user presses button
                String team1Score = team1ScoreString.getText().toString();
                int team1ScoreInt = Integer.parseInt(team1Score);
                team1ScoreInt = 0;
                team1Score = String.valueOf(team1ScoreInt);
                team1ScoreString.setText(team1Score);
                /*
                resetting team 2 score begins here
                 */
                String team2Score = team2ScoreString.getText().toString();
                int team2ScoreInt = Integer.parseInt(team2Score);
                team2ScoreInt = 0;
                team2Score = String.valueOf(team2ScoreInt);
                team2ScoreString.setText(team2Score);
                Log.v("resetButtonClicked", "reset button pressed");
                }
                }
        );

    }
}
