package com.example.medin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Game_activity extends AppCompatActivity {
    private String printMessage () {
        findViewById(R.id.imageView1).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageView2).setVisibility(View.INVISIBLE);
        flag[0]=0;
        return "Yay, you did it!";

    }
    private  short[] flag = {0,0,0,0,0,0,0,0};
    private int click = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activity);

        /*LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.game_toast,
                (ViewGroup) findViewById(R.id.relativeLayout));
        TextView text = (TextView) layout.findViewById(R.id.textView);
        text.setText(printMessage());*/

        final ImageView imgv = (ImageView) findViewById(R.id.imageView1);
        final ImageView imgv2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView imgv3 = (ImageView) findViewById(R.id.imageView3);
        final ImageView imgv4 = (ImageView) findViewById(R.id.imageView4);

        imgv.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                click++;
                click=click%2;
                flag[0]++;
                if (flag[0]==2)
                    Toast.makeText(Game_activity.this,printMessage(),Toast.LENGTH_SHORT).show();

                imgv.setImageResource(R.mipmap.penguin);
                flag[1]=0;
            }
        }));

        imgv2.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                flag[0]++;
                if (flag[0]==2)
                    Toast.makeText(Game_activity.this,printMessage(),Toast.LENGTH_SHORT).show();
                imgv2.setImageResource(R.mipmap.penguin);
                flag[1]=0;
                click++;
            }
        }));

        imgv3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click++;
                flag[1]++;
                flag[0]=0;
                imgv3.setImageResource(R.mipmap.elephant);
            }
        }));

        imgv4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag[1]++;
                flag[0]=0;
                imgv4.setImageResource(R.mipmap.cat);
                click++;
            }
        }));

    }
}
