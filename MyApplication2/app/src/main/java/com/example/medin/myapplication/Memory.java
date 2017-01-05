package com.example.medin.myapplication;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.animation.AlphaAnimation;


public class Memory extends AppCompatActivity {
    public int clicks = 0;
    public ImageView previous, current, temp;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);

        final AlphaAnimation anim = new AlphaAnimation(1.0f, 0.0f);
        anim.setDuration(1000);
        anim.setRepeatCount(0);

        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
        ImageAdapter.shuffleArray(ImageAdapter.mThumbIds);

        /*final Toast toast = new Toast (getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(getLayoutInflater().inflate(R.layout.custom_toast, null));*/

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                current = (ImageView) v;

                current.setImageResource(ImageAdapter.mThumbIds[position]);
                if (clicks == 0) {
                    previous = current;
                    clicks++;
                   //toast.setText("clicked : " + clicks);
                    //toast.show();
                } else {
                    if (previous.getDrawable().getConstantState().equals(current.getDrawable().getConstantState()) && clicks==2) {
                        previous.startAnimation(anim);
                        previous.setVisibility(View.INVISIBLE);
                        current.startAnimation(anim);
                        current.setVisibility(View.INVISIBLE);

                        /*toast.setText("You did it!");
                        toast.show();*/
                    }
                    else {
                        //toast.setText("clicked : " + clicks);
                        //toast.show();
                    }
                }
                if(clicks==3)
                {
                    clicks = 1;
                    temp.setImageResource(R.color.colorPrimary);
                    previous.setImageResource(R.color.colorPrimary);
                }
                clicks++;
                temp=previous;
                previous = current;
                //dodaj restrictions i ostale karafeke za memory!
            }
        });
    }
}