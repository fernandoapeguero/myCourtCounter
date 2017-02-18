package com.example.android.keepscore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       basketball();
         soccer();

    }

    public void basketball (){


      Button basketball = (Button) findViewById(R.id.basketball);

       basketball.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                Intent ball = new Intent(MainActivity.this,Basketball.class);
                startActivity(ball);
           }
        });


  }


   public void soccer(){

       final Button soccer = (Button) findViewById(R.id.soccer);

       soccer.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent goal = new Intent(MainActivity.this, com.example.android.keepscore.soccer.class);
                startActivity(goal);
            }
        });


    }



}
