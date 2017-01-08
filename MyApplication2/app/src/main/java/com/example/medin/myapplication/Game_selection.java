package com.example.medin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Game_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_selection);

        final Button cartoons_button = (Button) findViewById(R.id.buttonCartoons);

        cartoons_button.setOnClickListener((new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent cartoons_intent= new Intent(Game_selection.this, Cartoons.class);
                startActivity(cartoons_intent);
            }
        }));

            final Button animals_button = (Button) findViewById(R.id.buttonAnimals);
            animals_button.setOnClickListener((new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent animals_intent= new Intent(Game_selection.this, Memory.class);
                    startActivity(animals_intent);
                }
            }));
    }
}