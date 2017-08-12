
package com.example.android.leagueresult;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int foulTeamA = 0;
    private int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void addOneForScoreA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForFoulA(View v) {
        foulTeamA = foulTeamA + 1;
        displayForFoulTeamA(foulTeamA);
    }

    public void addOneForScoreB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForFoulB(View v) {
        foulTeamB = foulTeamB + 1;
        displayForFoulTeamB(foulTeamB);
    }

    public void setResetScore(View v) {
        scoreTeamA = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForFoulTeamA(foulTeamA);
        displayForFoulTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */

    public void displayForFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayForFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }
}





