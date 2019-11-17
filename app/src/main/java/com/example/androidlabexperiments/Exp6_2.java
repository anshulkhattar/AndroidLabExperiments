package com.example.androidlabexperiments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Exp6_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp6_2);

        Intent i = getIntent();

        TextView name = findViewById(R.id.username);
        String username = i.getStringExtra("name");
        System.out.println(username);
        name.setText(username);
    }
}
