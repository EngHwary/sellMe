package com.example.sellme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Fragment_one extends Fragment {


    ArrayList<Items> arrayList;
    Items_Adapter adapter;
    Items items;
    ListView listView;



    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

            View view=inflater.inflate(R.layout.fragment_one,container,false);
           listView = view.findViewById(R.id.list1);



            ArrayList<Items> items=new ArrayList<>();
            items.add(new Items("1","watch"));
            items.add(new Items("2","bag"));
            items.add(new Items("3","wallet"));

            Items_Adapter adapter=new Items_Adapter(getActivity(),items);
            listView.setAdapter(adapter);








        return view ;
    }

}
