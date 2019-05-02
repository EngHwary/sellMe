package com.example.sellme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Fragment_three extends Fragment {
    ArrayList<Items> arrayList;
    Items_Adapter adapter;
    Items items;
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_three,container,false);
        listView = view.findViewById(R.id.list3);



        ArrayList<Items> items=new ArrayList<>();
        items.add(new Items("1","labtop"));
        items.add(new Items("2","desk"));
        items.add(new Items("3","boiler"));

        Items_Adapter adapter=new Items_Adapter(getActivity(),items);
        listView.setAdapter(adapter);



        return view ;

    }


}
