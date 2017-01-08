package com.example.medin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button fact_button = (Button) findViewById(R.id.buttonFact);

        fact_button.setOnClickListener((new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facts= new Intent(MainActivity.this, facts.class);
                startActivity(facts);
            }
        }));

        final Button game_button = (Button) findViewById(R.id.buttonPlay);

        game_button.setOnClickListener((new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent games_intent= new Intent(MainActivity.this, Memory.class);
                startActivity(games_intent);
            }
        }));
    }
}