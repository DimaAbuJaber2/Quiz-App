package com.example.quizandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent data=getIntent();
        TextView text3=(TextView) findViewById(R.id.textView);
        Integer sum=Integer.parseInt(data.getStringExtra("result1"))+Integer.parseInt(data.getStringExtra("result2"))+
                Integer.parseInt(data.getStringExtra("result3"))+Integer.parseInt(data.getStringExtra("result4"))+
                Integer.parseInt(data.getStringExtra("result5"));
        String sumall=sum.toString();
        text3.setText("Your Score"+":"+"\t"+sumall+"/5");
    }
}
