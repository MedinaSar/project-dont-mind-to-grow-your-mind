package com.example.medin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ImageButton fact_button = (ImageButton) findViewById(R.id.imageButton);

        fact_button.setOnClickListener((new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facts= new Intent(MainActivity.this, facts.class);
                startActivity(facts);
            }
        }));

        final ImageButton game_button = (ImageButton) findViewById(R.id.imageButton2);

        game_button.setOnClickListener((new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent games_intent= new Intent(MainActivity.this, Memory.class);
                startActivity(games_intent);
            }
        }));
    }
}