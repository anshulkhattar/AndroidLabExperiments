package com.example.androidlabexperiments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Exp7 extends AppCompatActivity {

    ListView listView;
    private String countryNames[] = {
            "India",
            "England",
            "New Zealand",
            "Australia"
    };

    private String captainNames[] = {
            "Virat Kohli",
            "Eoin Morgan",
            "Kane Williamson",
            "Aaron Finch"
    };


    private Integer imageid[] = {
            R.drawable.india,
            R.drawable.england,
            R.drawable.newzealand,
            R.drawable.australia

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp7);

        listView=findViewById(R.id.listview);
        Exp7Adapter adapter = new Exp7Adapter(this, countryNames, captainNames, imageid);
        listView.setAdapter(adapter);

    }
}
