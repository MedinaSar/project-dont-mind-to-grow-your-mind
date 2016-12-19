package com.example.medin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Game_activity extends AppCompatActivity{
    public String printMessage () {
        /*findViewById(R.id.imageView1).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageView8).setVisibility(View.INVISIBLE);
        flag[0]=0;*/

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
        final ImageView imgv6 = (ImageView) findViewById (R.id.imageView6);
        final ImageView imgv7 = (ImageView) findViewById (R.id.imageView7);
        final ImageView imgv8 = (ImageView) findViewById (R.id.imageView8);
        final ImageView imgv9 = (ImageView) findViewById (R.id.imageView9);

        imgv.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                click++;
                if(click%3 == 0)
                {
                    imgv2.setImageResource(android.R.color.holo_blue_dark);
                    imgv3.setImageResource(android.R.color.holo_blue_dark);
                    imgv4.setImageResource(android.R.color.holo_blue_dark);
                    imgv6.setImageResource(android.R.color.holo_blue_dark);
                    imgv7.setImageResource(android.R.color.holo_blue_dark);
                    imgv8.setImageResource(android.R.color.holo_blue_dark);
                    imgv9.setImageResource(android.R.color.holo_blue_dark);
                    click = 1;
                    flag[0] = 0;
                }
                flag[0]++;
                if (flag[0]==2){
                    Toast.makeText(Game_activity.this,printMessage(),Toast.LENGTH_SHORT).show();
                    findViewById(R.id.imageView1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView8).setVisibility(View.INVISIBLE);
                    flag[0]=0;
                }
                flag[1]=0; flag[2]=0; flag[3]=0;
                imgv.setImageResource(R.mipmap.penguin);
            }
        }));

        imgv2.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                click++;
                if(click%3 == 0)
                {
                    imgv.setImageResource(android.R.color.holo_blue_dark);
                    imgv3.setImageResource(android.R.color.holo_blue_dark);
                    imgv4.setImageResource(android.R.color.holo_blue_dark);
                    imgv6.setImageResource(android.R.color.holo_blue_dark);
                    imgv7.setImageResource(android.R.color.holo_blue_dark);
                    imgv8.setImageResource(android.R.color.holo_blue_dark);
                    imgv9.setImageResource(android.R.color.holo_blue_dark);
                    click = 1; flag[0] = 0;
                }

                imgv2.setImageResource(R.mipmap.hamster);
                flag[1]++;
                if (flag[1]==2){
                    Toast.makeText(Game_activity.this,printMessage(),Toast.LENGTH_SHORT).show();
                    findViewById(R.id.imageView2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView9).setVisibility(View.INVISIBLE);
                    flag[1]=0;
                }
                flag[0]=0; flag[2]=0; flag[3]=0;
            }
        }));

        imgv3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click++;
                if(click%3 == 0)
                {
                    imgv.setImageResource(android.R.color.holo_blue_dark);
                    imgv2.setImageResource(android.R.color.holo_blue_dark);
                    imgv4.setImageResource(android.R.color.holo_blue_dark);
                    imgv6.setImageResource(android.R.color.holo_blue_dark);
                    imgv7.setImageResource(android.R.color.holo_blue_dark);
                    imgv8.setImageResource(android.R.color.holo_blue_dark);
                    imgv9.setImageResource(android.R.color.holo_blue_dark);
                    click = 1;
                }
                flag[2]++;
                if (flag[2]==2){
                    Toast.makeText(Game_activity.this,printMessage(),Toast.LENGTH_SHORT).show();
                    findViewById(R.id.imageView3).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView6).setVisibility(View.INVISIBLE);
                    flag[2]=0;
                }
                flag[1]=0; flag[0]=0; flag[3]=0;
                imgv3.setImageResource(R.mipmap.elephant);
            }
        }));

        imgv4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click++;
                if(click%3 == 0)
                {
                    imgv.setImageResource(android.R.color.holo_blue_dark);
                    imgv2.setImageResource(android.R.color.holo_blue_dark);
                    imgv3.setImageResource(android.R.color.holo_blue_dark);
                    imgv6.setImageResource(android.R.color.holo_blue_dark);
                    imgv7.setImageResource(android.R.color.holo_blue_dark);
                    imgv8.setImageResource(android.R.color.holo_blue_dark);
                    imgv9.setImageResource(android.R.color.holo_blue_dark);
                    click = 1;
                }
                flag[3]++;
                if (flag[3]==2){
                    Toast.makeText(Game_activity.this,printMessage(),Toast.LENGTH_SHORT).show();
                    findViewById(R.id.imageView4).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView7).setVisibility(View.INVISIBLE);
                    flag[3]=0;
                }
                flag[1]=0; flag[2]=0; flag[0]=0;
                imgv4.setImageResource(R.mipmap.cat);
            }
        }));

        imgv6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click++;
                if(click%3 == 0)
                {
                    imgv.setImageResource(android.R.color.holo_blue_dark);
                    imgv2.setImageResource(android.R.color.holo_blue_dark);
                    imgv3.setImageResource(android.R.color.holo_blue_dark);
                    imgv4.setImageResource(android.R.color.holo_blue_dark);
                    imgv7.setImageResource(android.R.color.holo_blue_dark);
                    imgv8.setImageResource(android.R.color.holo_blue_dark);
                    imgv9.setImageResource(android.R.color.holo_blue_dark);
                    click = 1;
                }
                flag[2]++;
                if (flag[2]==2){
                    Toast.makeText(Game_activity.this,printMessage(),Toast.LENGTH_SHORT).show();
                    findViewById(R.id.imageView6).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView3).setVisibility(View.INVISIBLE);
                    flag[2]=0;
                }
                flag[0]=0; flag[1]=0; flag[3]=0;
                imgv6.setImageResource(R.mipmap.elephant);
            }
        }));

        imgv7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click++;
                if(click%3 == 0)
                {
                    imgv.setImageResource(android.R.color.holo_blue_dark);
                    imgv2.setImageResource(android.R.color.holo_blue_dark);
                    imgv3.setImageResource(android.R.color.holo_blue_dark);
                    imgv6.setImageResource(android.R.color.holo_blue_dark);
                    imgv4.setImageResource(android.R.color.holo_blue_dark);
                    imgv8.setImageResource(android.R.color.holo_blue_dark);
                    imgv9.setImageResource(android.R.color.holo_blue_dark);
                    click = 1;
                }
                flag[3]++;
                if (flag[3]==2){
                    Toast.makeText(Game_activity.this,printMessage(),Toast.LENGTH_SHORT).show();
                    findViewById(R.id.imageView4).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView7).setVisibility(View.INVISIBLE);
                    flag[2]=0;
                }
                flag[0]=0; flag[1]=0; flag[2]=0;
                imgv7.setImageResource(R.mipmap.cat);
            }
        }));

        imgv8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click++;
                if(click%3 == 0)
                {
                    imgv.setImageResource(android.R.color.holo_blue_dark);
                    imgv2.setImageResource(android.R.color.holo_blue_dark);
                    imgv3.setImageResource(android.R.color.holo_blue_dark);
                    imgv6.setImageResource(android.R.color.holo_blue_dark);
                    imgv7.setImageResource(android.R.color.holo_blue_dark);
                    imgv8.setImageResource(android.R.color.holo_blue_dark);
                    imgv9.setImageResource(android.R.color.holo_blue_dark);
                    click = 1;
                }
                flag[0]++;
                if (flag[0]==2){
                    Toast.makeText(Game_activity.this,printMessage(),Toast.LENGTH_SHORT).show();
                    findViewById(R.id.imageView1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView8).setVisibility(View.INVISIBLE);
                    flag[0]=0;
                }
                flag[2]=0; flag[1]=0; flag[3]=0;
                imgv8.setImageResource(R.mipmap.penguin);
            }
        }));

        imgv9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click++;
                if(click%3 == 0)
                {
                    imgv.setImageResource(android.R.color.holo_blue_dark);
                    imgv2.setImageResource(android.R.color.holo_blue_dark);
                    imgv3.setImageResource(android.R.color.holo_blue_dark);
                    imgv6.setImageResource(android.R.color.holo_blue_dark);
                    imgv7.setImageResource(android.R.color.holo_blue_dark);
                    imgv8.setImageResource(android.R.color.holo_blue_dark);
                    imgv4.setImageResource(android.R.color.holo_blue_dark);
                    click = 1;

                }
                flag[1]++;
                if (flag[1]==2){
                    Toast.makeText(Game_activity.this,printMessage(),Toast.LENGTH_SHORT).show();
                    findViewById(R.id.imageView2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView9).setVisibility(View.INVISIBLE);
                    flag[1]=0;
                }
                flag[0]=0; flag[2]=0; flag[3]=0;
                imgv9.setImageResource(R.mipmap.hamster);
            }
        }));

    }
}
