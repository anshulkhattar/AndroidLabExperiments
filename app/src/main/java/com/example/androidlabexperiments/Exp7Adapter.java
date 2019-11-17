package com.example.androidlabexperiments;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Exp7Adapter extends ArrayAdapter {
    private String[] countryNames;
    private String[] captainNames;
    private Integer[] imageid;
    private Activity context;

    public Exp7Adapter(Activity context, String[] countryNames, String[] captainNames, Integer[] imageid) {
        super(context, R.layout.list_item, countryNames);
        this.context = context;
        this.countryNames = countryNames;
        this.captainNames = captainNames;
        this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.list_item, null, true);
        TextView textViewCountry = (TextView) row.findViewById(R.id.textViewCountry);
        TextView textViewCapital = (TextView) row.findViewById(R.id.textViewCaptain);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.imageViewFlag);

        textViewCountry.setText(countryNames[position]);
        textViewCapital.setText(captainNames[position]);
        imageFlag.setImageResource(imageid[position]);
        return  row;
    }
}
