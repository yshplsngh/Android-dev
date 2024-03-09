package com.example.scorp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int teamascore;
    int teambscore;
    public void teama3point(View view){
        TextView tv1 = (TextView)findViewById(R.id.team_a_score);
        teamascore = teamascore+3;
        tv1.setText(""+teamascore);
    }
    public void teama2point(View view){
        TextView tv1 = (TextView) findViewById(R.id.team_a_score);
        teamascore = teamascore+2;
        tv1.setText(""+teamascore);
    }
    public void teamafreethrow(View view){
        TextView tv1 = (TextView) findViewById(R.id.team_a_score);
        teamascore = teamascore+1;
        tv1.setText(""+teamascore);
    }
    public void teamb3point(View view){
        TextView tv1 = (TextView) findViewById(R.id.team_b_score);
        teambscore = teambscore+3;
        tv1.setText(""+teambscore);
    }
    public void teamb2point(View view){
        TextView tv1 = (TextView) findViewById(R.id.team_b_score);
        teambscore = teambscore+2;
        tv1.setText(""+teambscore);
    }
    public void teambfreethrow(View view){
        TextView tv1 = (TextView) findViewById(R.id.team_b_score);
        teambscore = teambscore+1;
        tv1.setText(""+teambscore);
    }
    public void resetscore(View view){
        TextView tv1 = (TextView) findViewById(R.id.team_a_score);
        teamascore=0;
        tv1.setText(""+0);
        TextView tv2 = (TextView) findViewById(R.id.team_b_score);
        teambscore=0;
        tv2.setText(""+0);
    }



}