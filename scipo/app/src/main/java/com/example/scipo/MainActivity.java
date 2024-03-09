package com.example.scipo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int c=0;
    public void submitOrder(View view){
        c = c+1;
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText("" + c);
        TextView tv4 = (TextView) findViewById(R.id.tv4);
        tv4.setText(NumberFormat.getCurrencyInstance().format(c*70));
//        tv4.setText(""+c*310);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}