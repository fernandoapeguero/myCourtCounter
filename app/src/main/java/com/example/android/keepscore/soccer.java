package com.example.android.keepscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class soccer extends AppCompatActivity {


    int goalTeamA  = 0 ;
    int goalTeamB = 0 ;

    // fouls and ejection init team A

    int foulsTeamA = 0 ;
    int ejectionsFoTeamA = 0 ;

    // foul  and ejection init  Team B

    int foulsTeamB = 0 ;
    int ejectionsFoTeamB = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soccer);

        //button for soccewr score
        teamAGoal();
        teamBGoal();
        reset();

        // increment of fouls and ejections button listener
        increaseFoulTeamA();
        increaseEjectionsTeamA();

        // increment of foul and ejection button listener team b
         increaseFoulTeamB();
         increaseEjectionsTeamB();
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

    public void displayFoulsTeamA(int foul){

        TextView foulsTeamA = (TextView) findViewById(R.id.Fouls_counter_teamA);
        foulsTeamA.setText(String.valueOf(foul));

    }

    public void displayEjectionsTeamA(int ejections ){

        TextView ejectionsTeamA = (TextView) findViewById(R.id.ejections_counter_teamA);
        ejectionsTeamA.setText(String.valueOf(ejections));

    }

    // increment fouls

    public void increaseFoulTeamA(){

        Button foulTeamA = (Button) findViewById(R.id.foul_button_team_a);

        foulTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                foulsTeamA += 1;
                displayFoulsTeamA( foulsTeamA);
            }
        });
    }

    /// increment for ejections team A

    public void increaseEjectionsTeamA( ){

        final Button ejectionListener = (Button) findViewById(R.id.eject_button_team_a);
        ejectionListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejectionsFoTeamA +=1;
                displayEjectionsTeamA(ejectionsFoTeamA);
            }
        });
    }

 /// display fouls team B


    public void displayFoulsTeamB(int fouls ){
        TextView  foulTeamB = (TextView) findViewById(R.id.fouls_counter_teamB);
         foulTeamB.setText(String.valueOf(fouls));


    }
// increase the fouls counter team B


    public void increaseFoulTeamB(){

        final Button foulListener = (Button) findViewById(R.id.foul_button_teamB);

        foulListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foulsTeamB += 1;
                displayFoulsTeamB(foulsTeamB);
            }
        });
    }

   // display the ejections counter

    public void displayEjectionTeamB(int ejectionCount){

        TextView ejectionTextSeter = (TextView) findViewById(R.id.ejections_counter_teamB);
        ejectionTextSeter.setText(String.valueOf(ejectionCount));

    }

    public void increaseEjectionsTeamB() {

        Button ejectionListenerTeamB = (Button) findViewById(R.id.eject_button_team_b);
        ejectionListenerTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejectionsFoTeamB += 1;
                displayEjectionTeamB(ejectionsFoTeamB);
            }
        });

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

                //team A values
                goalTeamA = 0 ;
                foulsTeamA = 0 ;
                ejectionsFoTeamA = 0 ;

                // team b values
                goalTeamB = 0 ;
                foulsTeamB = 0 ;
                ejectionsFoTeamB =0 ;

                // team a display values after reset
                displaySoccerTeamA(goalTeamA);
                displayFoulsTeamA(foulsTeamA);
                displayEjectionsTeamA(ejectionsFoTeamA);

                // team b display values after reset
                displaySoccerTeamB(goalTeamB);
                displayFoulsTeamB(foulsTeamB);
                displayEjectionTeamB(ejectionsFoTeamB);

            }
        });
    }
}
