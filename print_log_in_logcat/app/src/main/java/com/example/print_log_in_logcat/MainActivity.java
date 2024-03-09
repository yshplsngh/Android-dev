package com.example.print_log_in_logcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void printToLogs(View view) {
        TextView textView1 = (TextView) findViewById(R.id.menu_item_1);
        TextView textView2 = (TextView) findViewById(R.id.menu_item_2);
        TextView textView3 = (TextView) findViewById(R.id.menu_item_3);
        EditText edittext = (EditText) findViewById(R.id.editTextTextPassword);
        String s = edittext.getText().toString();
        Log.v("MainActivity", s);
        Log.v("MainActivity", edittext.getText().toString());
        Log.v("MainActivity", textView1.getText().toString());
        Log.v("MainActivity", textView2.getText().toString());
        Log.v("MainActivity", textView3.getText().toString());
    }
}