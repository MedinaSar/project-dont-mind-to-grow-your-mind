package com.example.medin.myapplication;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class facts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facts_layout);

        final ImageView img = (ImageView) findViewById(R.id.imageView);
        final TextView txt = (TextView) findViewById(R.id.textView);

        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH)%18;

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
            case 6:  img.setImageResource(R.drawable.day6);
                     txt.setText(R.string.day6);
                     break;
            case 7:  img.setImageResource(R.drawable.day7);
                     txt.setText(R.string.day7);
                     break;
            case 8:  img.setImageResource(R.drawable.day8);
                     txt.setText(R.string.day8);
                     break;
            case 9:  img.setImageResource(R.drawable.day9);
                     txt.setText(R.string.day9);
                     break;
            case 10: img.setImageResource(R.drawable.day10);
                     txt.setText(R.string.day10);
                     break;
            case 11: img.setImageResource(R.drawable.day11);
                     txt.setText(R.string.day11);
                     break;
            case 12: img.setImageResource(R.drawable.day12);
                     txt.setText(R.string.day12);
                     break;
            case 13: img.setImageResource(R.drawable.day13);
                     txt.setText(R.string.day13);
                     break;
            case 14: img.setImageResource(R.drawable.day14);
                     txt.setText(R.string.day14);
                     break;
            case 15: img.setImageResource(R.drawable.day15);
                     txt.setText(R.string.day15);
                     break;
            case 16: img.setImageResource(R.drawable.day16);
                     txt.setText(R.string.day16);
                     break;
            case 17: img.setImageResource(R.drawable.day17);
                     txt.setText(R.string.day17);
                     break;
            case 18: img.setImageResource(R.drawable.day18);
                     txt.setText(R.string.day18);
                     break;
        }
    }
}
