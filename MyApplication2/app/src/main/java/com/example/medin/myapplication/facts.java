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

        int day = (Calendar.DAY_OF_MONTH)%22;

        switch(day+1)  {
            case 1:  img.setImageResource(R.drawable.day1);
                     txt.setText(R.string.day1);
                     break;
            case 2:  img.setImageResource(R.drawable.day2);
                     txt.setText(R.string.day2);
                     break;
            case 3:  img.setImageResource(R.drawable.day3);
                     txt.setText(R.string.day3);
                     break;
            case 4:  img.setImageResource(R.drawable.day4);
                     txt.setText(R.string.day4);
                     break;
            case 5:  img.setImageResource(R.drawable.day5);
                     txt.setText(R.string.day5);
                     break;
            case 6: img.setImageResource(R.drawable.day6);
                    txt.setText(R.string.day6);
                    break;
            case 7: img.setImageResource(R.drawable.day7);
                    txt.setText(R.string.day7);
                    break;
        }
    }
}
