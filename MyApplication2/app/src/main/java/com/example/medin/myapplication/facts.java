package com.example.medin.myapplication;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class facts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facts_layout);

        final ImageView img = (ImageView) findViewById(R.id.imageView);
        final TextView txt = (TextView) findViewById(R.id.textView);

        //Mijenjam Views po datumu: promijeni value od slike i texta u xml svaki dan
        //pa na osnovu toga izbaci sliku + text
        int day = (Calendar.DAY_OF_MONTH)%7;
        String picName = "chow6";
        String desName = "day"+day;

        img.setImageResource(R.drawable.aligators21);
        txt.setText(desName);
    }
}
