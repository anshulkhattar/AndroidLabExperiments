package com.example.androidlabexperiments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);


        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> experiments = new ArrayList<String>();
        experiments.add("Select");
        experiments.add("Exp2");
        experiments.add("Exp3");
        experiments.add("Exp4_1");
        experiments.add("Exp4_2");
        experiments.add("Exp5");
        experiments.add("Exp6");
        experiments.add("Exp7");
        experiments.add("Exp8");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item, experiments);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = parent.getItemAtPosition(position).toString();

        if(item.equals("Exp2")){
            Intent i=new Intent(this,Exp2.class);
            startActivity(i);
        }
        else if(item.equals("Exp3")){
            Intent i=new Intent(this,Exp3.class);
            startActivity(i);
        }
        else if(item.equals("Exp4_1")){
            Intent i=new Intent(this,Exp4.class);
            startActivity(i);
        }
        else if(item.equals("Exp4_2")){
            Intent i=new Intent(this,Exp4_1.class);
            startActivity(i);
        }
        else if(item.equals("Exp5")){
            Intent i=new Intent(this,Exp5.class);
            startActivity(i);
        }
        else if(item.equals("Exp6")){
            Intent i=new Intent(this,Exp6.class);
            startActivity(i);
        }
        else if(item.equals("Exp7")){
            Intent i=new Intent(this,Exp7.class);
            startActivity(i);
        }
        else if(item.equals("Exp8")){
            Intent i=new Intent(this,Exp8.class);
            startActivity(i);
        }
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
