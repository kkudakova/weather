package com.example.kskhom.weather;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by kskhom on 13.08.2015.
 */
public class WeatherView extends LinearLayout {
    private ImageView mImage;
    private TextView temp;
    private TextView hum;

    public WeatherView(Context context, AttributeSet attrs) {
        super(context, attrs);

//        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.WeatherView , 0, 0);
//        String titleText = a.getString(R.styleable.WeatherView_titleText);
//        setOrientation(LinearLayout.VERTICAL);
//        setGravity(Gravity.CENTER_VERTICAL);
//
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        inflater.inflate(R.layout.activity_main, this, true);
//        TextView title = (TextView) getChildAt(0);
//        title.setText(titleText);
    }

    public WeatherView(Context context) {
        this(context, null);
    }

    public void setImageVisible(boolean visible) {
        mImage.setVisibility(visible ? View.VISIBLE : View.GONE);
    }


    public void setParams(Entry e)
    {
        temp.setText(e.temperature);
        hum.setText(e.relwet);
        switch(e.cloudiness) {
            case "1":
                mImage.setImageResource(R.drawable.im1);
                break;
            case "2":
                mImage.setImageResource(R.drawable.im2);
                break;
            case "3":
                mImage.setImageResource(R.drawable.im3);
                break;
            case "4":
                mImage.setImageResource(R.drawable.im4);
                break;
        }
    }
}
