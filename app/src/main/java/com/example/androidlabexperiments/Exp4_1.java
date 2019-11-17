package com.example.androidlabexperiments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exp4_1 extends AppCompatActivity {

    private EditText num1,num2;
    private Button add,sub,mult,div;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp4_1);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        add=findViewById(R.id.plus);
        sub=findViewById(R.id.minus);
        mult=findViewById(R.id.multi);
        div=findViewById(R.id.divide);
        res=findViewById(R.id.res);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnum=num1.getText().toString();
                String snum=num2.getText().toString();

                int num11=Integer.parseInt(fnum);
                int num22=Integer.parseInt(snum);

                res.setText((num11+num22)+"");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnum=num1.getText().toString();
                String snum=num2.getText().toString();

                int num11=Integer.parseInt(fnum);
                int num22=Integer.parseInt(snum);

                res.setText((num11-num22)+"");
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnum=num1.getText().toString();
                String snum=num2.getText().toString();

                int num11=Integer.parseInt(fnum);
                int num22=Integer.parseInt(snum);

                res.setText(num11*num22+"" +
                        "");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnum=num1.getText().toString();
                String snum=num2.getText().toString();

                int num11=Integer.parseInt(fnum);
                int num22=Integer.parseInt(snum);

                res.setText(num11/num22+"");
            }
        });

    }
}
