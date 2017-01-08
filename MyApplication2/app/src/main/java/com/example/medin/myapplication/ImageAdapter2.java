package com.example.medin.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.Random;

class ImageAdapter2 extends BaseAdapter {
    private final Context mContext;

    public ImageAdapter2(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) { return null; }

    public long getItemId(int position) { return 0; }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(270, 270));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(R.color.tileColor);
        imageView.setBackgroundColor(R.color.tileColor2);

        return imageView;
    }
    public static void shuffleArray(Integer[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Integer a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
    // references to images
    public static final Integer[] mThumbIds = {
            R.drawable.donald, R.drawable.dora,
            R.drawable.garfield, R.drawable.masha,
            R.drawable.mickey, R.drawable.minions,
            R.drawable.pikachu, R.drawable.smurfs,
            R.drawable.spongebob, R.drawable.tom_jerry,
            R.drawable.donald, R.drawable.dora,
            R.drawable.garfield, R.drawable.masha,
            R.drawable.mickey, R.drawable.minions,
            R.drawable.pikachu, R.drawable.smurfs,
            R.drawable.spongebob, R.drawable.tom_jerry,
    };
}