package com.example.zox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void after_cookies(View view){
        ImageView img1 = (ImageView) findViewById(R.id.android_cookie_image_view);
        img1.setImageResource(R.drawable.after_cookie);
        img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
        TextView tv = (TextView) findViewById(R.id.status_text_view);
        tv.setText("I,am Full");
    }
}