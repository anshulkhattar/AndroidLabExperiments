package com.example.androidlabexperiments;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exp4 extends AppCompatActivity {

    private TextView t;
    private Button sizeChange,colorChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp4);
        t=findViewById(R.id.text);
        sizeChange=findViewById(R.id.size);
        colorChange=findViewById(R.id.color);

        sizeChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getTextSize()==20)
                    t.setTextSize(40);
                else
                    t.setTextSize(20);
            }
        });
        colorChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getCurrentTextColor()== Color.rgb(0,0,0))
                    t.setTextColor(Color.rgb(0,200,0));
                else
                    t.setTextColor(Color.rgb(0,0,0));

            }
        });
    }
}