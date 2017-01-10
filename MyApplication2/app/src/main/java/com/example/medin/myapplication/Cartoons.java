package com.example.medin.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.animation.AlphaAnimation;
import android.view.LayoutInflater;
import android.os.Handler;

public class Cartoons extends AppCompatActivity {
    private int clicks = 0;
    private ImageView previous;
    private ImageView current;
    private ImageView temp;
    private int previousPosition = -1;
    private static boolean gone = false;
    private void showToast(final Toast toast, String msg, int dur, TextView text){
        text.setText(msg);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, dur);
        return;
    }

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);

        final AlphaAnimation anim = new AlphaAnimation(0.5f, 0.0f);
        anim.setDuration(1000);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        final TextView text = (TextView) layout.findViewById(R.id.text);
        final Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0); toast.setDuration(Toast.LENGTH_SHORT); toast.setView(layout);

        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter2(this));
        ImageAdapter2.shuffleArray(ImageAdapter2.mThumbIds);

        final long startTime = System.nanoTime();

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                current = (ImageView) v;
                current.setImageResource(ImageAdapter2.mThumbIds[position]);
                if (clicks == 0) {
                    previous = current;
                    clicks++;

                } else if (clicks == 2 && previous.getDrawable().getConstantState().equals(current.getDrawable().getConstantState())
                        && previousPosition != position) {
                    previous.startAnimation(anim); current.startAnimation(anim);
                    previous.setVisibility(View.INVISIBLE); current.setVisibility(View.INVISIBLE);
                    showToast(toast,"You did it!", 600,text);
                    for(int i = 0; i < gridview.getChildCount(); i++) {
                        if(gridview.getChildAt(i).getVisibility()==View.INVISIBLE)
                            gone = true;
                        else
                            gone = false;
                    }

                    if(gone) {
                        long endTime = System.nanoTime();
                        long score = (endTime - startTime) / 10000000;

                        SharedPreferences sharedPreferences = getSharedPreferences("HighScores", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putLong("Score", score);
                        editor.commit();

                        Long score1 = sharedPreferences.getLong("Score", score);
                        //showToast(toast, "CONGRATS! "+score1, 900, text);
                        TextView t = (TextView) findViewById(R.id.textView2);
                        t.setText("CONGRATS! You're score is: "+score1);
                        t.setBackgroundColor(R.color.tileColor2);
                        t.setTextSize(50);
                    }
                }  else if (clicks == 3) {
                    clicks = 1;
                    temp.setImageResource(R.color.tileColor2);
                    previous.setImageResource(R.color.tileColor2); }
                if(previousPosition!=position)
                    clicks++;
                temp=previous;
                previous = current;
                previousPosition = position;
            }
        });
    }
}
