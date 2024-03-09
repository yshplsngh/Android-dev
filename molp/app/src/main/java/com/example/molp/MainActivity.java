package com.example.molp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int c=0;
    boolean ischeckcheese;
    boolean ischeckchoco;;
    String str="";
    public void submitOrder(View view){
        CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
        ischeckcheese = cb1.isChecked();
        CheckBox cb2 = (CheckBox) findViewById(R.id.cb2);
        ischeckchoco = cb2.isChecked();
//        Log.v("MainActivity","Extra cheesse checker "+ischeckcheese);
        if(c==0){
            Toast.makeText(this, "Please order Something", Toast.LENGTH_SHORT).show();
        }
        else{
            TextView tv1=(TextView) findViewById(R.id.tv3);
            tv1.setText(getText(R.string.order_summary));
            TextView tv5= (TextView) findViewById(R.id.tv5);
            tv5.setTextSize(20);
            str = ordersummary(c,ischeckcheese,ischeckchoco);
            tv5.setText(str);
        }
    }
    public void email_order(View view){
        EditText et1 = (EditText) findViewById(R.id.et1);
        String name = et1.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_SUBJECT,"Order by Zomato to "+name);
            intent.putExtra(Intent.EXTRA_TEXT, str);
            startActivity(Intent.createChooser(intent, "Send Email"));
    }
    public String ordersummary(int c,boolean ischeckcheese,boolean ischeckchoco){
        EditText et1 = (EditText) findViewById(R.id.et1);
        String na = et1.getText().toString();
        int total=c*70;
        str="";
        str+="\n"+getString(R.string.To_name,na);
        str+="\n"+getString(R.string.quantiry,c);
        if(ischeckcheese==true){
            str+="\n"+getString(R.string.topping1);
            total+=3;
        }
        if(ischeckchoco==true){
            str+="\n"+getString(R.string.topping2);
            total+=5;
        }
        str+="\n"+getString(R.string.totalinr)+total;
        return str;
    }
    public void resetOrder(View view){
        c=0;
        EditText et1 = (EditText) findViewById(R.id.et1);
        et1.setText("");
        CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
        cb1.setChecked(false);
        CheckBox cb2 = (CheckBox) findViewById(R.id.cb2);
        cb2.setChecked(false);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText("" + 0);
        TextView tv1=(TextView) findViewById(R.id.tv3);
        tv1.setText(getString(R.string.price_on_reset));
        TextView tv3 = (TextView) findViewById(R.id.tv5);
        tv3.setText(getString(R.string.text_on_reset));
        tv3.setTextSize(10);
    }
    public void plusone(View view){
        if(c<100){
            c++;
            TextView tv2 = (TextView) findViewById(R.id.tv2);
            tv2.setText(""+c);
        }
        else{
            Toast.makeText(this, "wo wo its too much", Toast.LENGTH_SHORT).show();
        }
//        TextView tv4 = (TextView) findViewById(R.id.tv4);
//        tv4.setText(NumberFormat.getCurrencyInstance().format(c*70));
    }
    public void subone(View view){
        if(c>0){
            c--;
            TextView tv2 = (TextView) findViewById(R.id.tv2);
            tv2.setText(""+c);
//            TextView tv4 = (TextView) findViewById(R.id.tv4);
//            tv4.setText(NumberFormat.getCurrencyInstance().format(c*70));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}