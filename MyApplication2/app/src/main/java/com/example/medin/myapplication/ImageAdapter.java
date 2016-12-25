package com.example.medin.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageAdapter extends BaseAdapter {
private Context mContext;

public ImageAdapter(Context c) {
        mContext = c;
        }

public int getCount() {
        return mThumbIds.length;
        }

public Object getItem(int position) {
        return null;
        }

public long getItemId(int position) {
        return 0;
        }

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
    imageView.setImageResource(R.color.colorPrimary);
    return imageView;
}

// references to my images
public static Integer[] mThumbIds = {
        R.mipmap.penguin, R.mipmap.hippopotamus,
        R.mipmap.elephant, R.mipmap.dolphin,
        R.mipmap.elephant,  R.mipmap.cat,
        R.mipmap.penguin,  R.mipmap.hamster,
        R.mipmap.dolphin, R.mipmap.butterfly,
        R.mipmap.donkey,  R.mipmap.hippopotamus,
        R.mipmap.ladybug,  R.mipmap.panda,
        R.mipmap.butterfly,  R.mipmap.hamster,
        R.mipmap.ladybug, R.mipmap.cat,
        R.mipmap.donkey, R.mipmap.panda,
        };
}