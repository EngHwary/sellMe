package com.example.sellme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class Items_Adapter extends ArrayAdapter {
    public Items_Adapter(Context context, List objects) {
        super(context, 0, objects);
    }

    TextView text1,text2;

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        convertView= LayoutInflater.from(getContext()).inflate(R.layout.activity_custom_row,parent,false);

        text1=convertView.findViewById(R.id.text1);
        text2=convertView.findViewById(R.id.text2);


        Items items= (Items) getItem(position);

        text1.setText(items.getItemNo());
        text2.setText(items.getItemInfo());


        return convertView;
    }
}
