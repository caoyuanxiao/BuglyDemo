package com.bugly.smile.buglydemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Smile on 2017/4/6.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView=new TextView(this);
        textView.setText("SecondActivity");
        textView.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
        textView.setTextSize(30);
        setContentView(textView);
    }
}
