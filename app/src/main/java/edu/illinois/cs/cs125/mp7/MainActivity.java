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
    private int counter;

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
                Log.v("StringMinusButtonSta", "minus button pressed");
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
                    Log.v("StringPlusButtonSta", "plus button pressed");
                }
        }
        );
        resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View h) {
                // Code here executes on main thread after user presses button
                String team1Score = team1ScoreString.getText().toString();
                int team1ScoreInt = Integer.parseInt(team1Score);
                while (team1ScoreInt >= 1) {
                    team1ScoreInt--;
                }
                team1Score = String.valueOf(team1ScoreInt);
                team1ScoreString.setText(team1Score);
                Log.v("StringResetButtonSta", "reset button pressed");
                }
                }
        );

    }
}
