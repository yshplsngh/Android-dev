package com.example.tictak;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    0=X;
//    1=o;
    int activeplayer=0;
    boolean gameactive=true;
    int [] gamestate={2,2,2,2,2,2,2,2,2};
    int [][] winpos = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    public void taptap(View view){
        ImageView img = (ImageView) view;
        int tappedimage = Integer.parseInt(img.getTag().toString());
        if(!gameactive){
            gamereset(view);
        }
        else if(gamestate[tappedimage]==2){
            gamestate[tappedimage]=activeplayer;
            img.setTranslationY(-1000f);
            if(activeplayer==0){
                img.setImageResource(R.drawable.x);
                activeplayer=1;
                TextView status = findViewById(R.id.status);
                status.setText("O' turn");
            }
            else{
                img.setImageResource(R.drawable.o);
                activeplayer=0;
                TextView status = findViewById(R.id.status);
                status.setText("X' turn");
            }
            img.animate().translationYBy(1000f).setDuration(200);
        }
        else{
            Toast.makeText(this, "already occupied!", Toast.LENGTH_SHORT).show();
        }
        for(int [] winpos2:winpos){
            if(gamestate[winpos2[0]]==gamestate[winpos2[1]]&&gamestate[winpos2[1]]==gamestate[winpos2[2]]&&gamestate[winpos2[0]]!=2){
                String st,pp;
                gameactive = false;
                if(gamestate[winpos2[0]]==0){
                    st="X WON";
                    pp="";

                }
                else{
                    st="O WON";
                    pp="";
                }
                TextView status = findViewById(R.id.status);
                status.setText(pp);
                TextView wonstatus = findViewById(R.id.wonstatus);
                wonstatus.setText(st);
            }
        }
        boolean emptySquare = false;
        for (int squareState : gamestate){
            if (squareState == 2) {
                emptySquare = true;
                break;
            }
        }
        if (!emptySquare && gameactive){
            gameactive = false;
            String winnerStr;
            winnerStr = "NO ONE WON";
            TextView wonstatus = findViewById(R.id.wonstatus);
            wonstatus.setText(winnerStr);TextView status = findViewById(R.id.status);
            status.setText("");

        }
    }
    public void gamereset(View view){
        gameactive =true;
        activeplayer=0;
        for(int i=0;i<gamestate.length;i++){
            gamestate[i] =2;
        }
        ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        TextView status = findViewById(R.id.status);
        status.setText("X' turn");
        TextView wonstatus = findViewById(R.id.wonstatus);
        wonstatus.setText("");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}