package com.example.android.keepscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class soccer extends AppCompatActivity {


    int goalTeamA  = 0 ;
    int goalTeamB = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soccer);

        //button for soccewr score
        teamAGoal();
        teamBGoal();
        reset();


    }



    public void displaySoccerTeamA(int score){
        TextView goal = (TextView) findViewById(R.id.soccer_goal_a);
        goal.setText(String.valueOf(score));

    }



    public void teamAGoal(){


        Button goal = (Button) findViewById(R.id.goal_team_a);

        goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goalTeamA += 1;
                displaySoccerTeamA(goalTeamA);
            }
        });


    }


    // teamB keep score


    public void displaySoccerTeamB(int score){
        TextView goal = (TextView) findViewById(R.id.soccer_goal_b);
        goal.setText(String.valueOf(score));

    }

    public void teamBGoal(){

        Button goal = (Button) findViewById(R.id.goal_team_b);
        goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goalTeamB += 1;
                displaySoccerTeamB(goalTeamB);
            }
        });


    }


    public void reset () {

        Button reset = (Button) findViewById(R.id.soccer_reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goalTeamA = 0 ;
                goalTeamB = 0 ;
                displaySoccerTeamA(goalTeamA);
                displaySoccerTeamB(goalTeamB);

            }
        });



    }

}
