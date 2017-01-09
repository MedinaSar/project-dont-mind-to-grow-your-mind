package com.example.medin.myapplication;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import java.util.Random;
import android.graphics.Point;

class ImageAdapter extends BaseAdapter {
private final Context mContext;

public ImageAdapter(Context c) {
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

        WindowManager wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        Display ds = wm.getDefaultDisplay();
        Point size = new Point();
        ds.getSize(size);
        int w = size.x, h = size.y;
        System.out.println("x: "+w+" y: "+h); //works perfectly!

        imageView.setLayoutParams(new GridLayoutManager.LayoutParams(250,250));

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
        R.drawable.penguin, R.drawable.hippopotamus,
        R.drawable.elephant, R.drawable.dolphin,
        R.drawable.elephant,  R.drawable.cat,
        R.drawable.penguin,  R.drawable.hamster,
        R.drawable.dolphin, R.drawable.butterfly,
        R.drawable.donkey,  R.drawable.hippopotamus,
        R.drawable.ladybug,  R.drawable.panda,
        R.drawable.butterfly,  R.drawable.hamster,
        R.drawable.ladybug, R.drawable.cat,
        R.drawable.donkey, R.drawable.panda,
        };
}