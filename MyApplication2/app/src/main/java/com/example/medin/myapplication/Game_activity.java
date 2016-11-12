package com.example.medin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Game_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activity);

        final TextView textv = (TextView) findViewById(R.id.textView2);
        final ImageView imgv= (ImageView) findViewById(R.id.imageView2);


        imgv.setOnClickListener((new View.OnClickListener() {
            int i=0;
            @Override
            public void onClick(View v) {
                i = i + 1;
                textv.setText("counter="+i+" ");
            }
        }));

    }
}
