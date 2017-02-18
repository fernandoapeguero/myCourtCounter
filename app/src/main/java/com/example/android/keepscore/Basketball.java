package com.example.android.keepscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Basketball extends AppCompatActivity {


    int scoreTeamA = 0 ;
    int scoreTeamB = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basketball);

        setTextTeamA();
        setTextTeamB();

        reset();
        //team a oncliclistener for buttons
        threePointTeamA();
        twoPointTeamA();
        onePointTeamA();

        // team b onclicklistener for buttons
        threePointTeamB();
        twoPointTeamB();
        onePointTeamB();
    }




    public  void setTextTeamA (){

        final EditText edit = (EditText) findViewById(R.id.edit_text_teamA);
        final TextView teamNameA = (TextView) findViewById(R.id.team_a_name);

        edit.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    String result = edit.getText().toString();
                    teamNameA.setText(result);
                    edit.clearFocus();
                    edit.setText("");
                    return true;
                }
                return false;
            }
        });
    }


    public void setTextTeamB()
    {
        final EditText edit = (EditText) findViewById(R.id.edit_text_teamB);
        final TextView name = (TextView) findViewById(R.id.team_b_name);

        edit.setOnEditorActionListener(new TextView.OnEditorActionListener()
        {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event)
            {
                if (actionId == EditorInfo.IME_ACTION_DONE){
                    String result = edit.getText().toString();
                    name.setText(result);
                    edit.clearFocus();
                    edit.setText("");
                    return true;
                }
                return false;
            }
        });
    }

    public void reset(){

        Button resetIt = (Button) findViewById(R.id.reset_basketball);
        resetIt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                scoreTeamA = 0;
                scoreTeamB = 0;
                displayScoreTeamA(scoreTeamA);
                displayScoreTeamB(scoreTeamB);
            }
        });


    }





    public void displayScoreTeamA(int Score) {

        TextView score = (TextView) findViewById(R.id.score_team_1);
        score.setText(String.valueOf(Score));

    }

    public void threePointTeamA() {

        Button threePoint = (Button) findViewById(R.id.three_points_a);
        threePoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 3;
                displayScoreTeamA(scoreTeamA);
            }
        });
    }

    public  void twoPointTeamA(){

        Button twoPoints = (Button) findViewById(R.id.two_points_a);
        twoPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scoreTeamA += 2;
                displayScoreTeamA(scoreTeamA);
            }
        });
    }

    public void onePointTeamA() {
        Button onePoint = (Button) findViewById(R.id.one_point_a);
        onePoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA +=1;
                displayScoreTeamA(scoreTeamA);
            }
        });
    }

    // teamb display and score updater

    public void displayScoreTeamB(int Score){

        TextView score = (TextView) findViewById(R.id.score_team_2);
        score.setText(String.valueOf(Score));
    }

    public void threePointTeamB(){

        Button threePoints = (Button) findViewById(R.id.three_points_b);
        threePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 3;
                displayScoreTeamB(scoreTeamB);
            }
        });
    }

    public  void twoPointTeamB(){

        Button twoPoints = (Button) findViewById(R.id.two_points_b);
        twoPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 2;
                displayScoreTeamB(scoreTeamB);
            }
        });
    }

    public void onePointTeamB(){

        Button onePoint = (Button) findViewById(R.id.one_point_b);
        onePoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB +=1;
                displayScoreTeamB(scoreTeamB);
            }
        });
    }
}