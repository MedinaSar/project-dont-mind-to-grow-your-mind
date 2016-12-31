package com.example.medin.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Memory extends AppCompatActivity {
    public int clicks=0;
    public ImageView previous, current;
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(Memory.this, "" + clicks, //from 0 to 19
                        Toast.LENGTH_SHORT).show();
                current = (ImageView) v;

                TextView tv = (TextView) findViewById(R.id.textView2);

                current.setImageResource(ImageAdapter.mThumbIds[position]);
                if(clicks==0)  {
                    previous = current; tv.setText("ANYTHING!"); }
                else
                {
                    if (previous.getDrawable().getConstantState().equals(current.getDrawable().getConstantState()))
                        tv.setText("You did it!"); //working
                    else tv.setText("SOMETHING!");
                }
                clicks++;
                previous = current;
                //dodaj restrictions i ostale karafeke za memory!
            }
        });
    }
}