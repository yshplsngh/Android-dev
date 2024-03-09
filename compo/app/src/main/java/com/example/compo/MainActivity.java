package com.example.compo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void sm1(View view){
        Toast.makeText(this, "please wait while sending..", Toast.LENGTH_SHORT).show();
    }
    public void rs1(View view){
        Toast.makeText(this, "Ruko jra sabar karo", Toast.LENGTH_SHORT).show();
    }
    public void a1(View view){
        Toast.makeText(this, "muje lge tu pit ke hi javego", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}