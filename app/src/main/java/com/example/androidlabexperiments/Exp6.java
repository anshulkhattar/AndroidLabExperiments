package com.example.androidlabexperiments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exp6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp6);
    }
    public void onClick(View v){
        String ExpId = getResources().getResourceName(v.getId()).split("/")[1];
        if(ExpId.equals("browser")){
            String url = "http://www.google.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else if(ExpId.equals("go")){
            EditText name = findViewById(R.id.name);
            String username = name.getText().toString();
            System.out.println(username);

            Intent i = new Intent(getApplicationContext(), Exp6_2.class);
            i.putExtra("name",username);
            startActivity(i);
        }
    }
}
