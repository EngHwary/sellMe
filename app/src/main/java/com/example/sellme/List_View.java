package com.example.sellme;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentPagerAdapter.*;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class List_View extends AppCompatActivity {

    ArrayList<Items> itemsList;
    ListView listView;
    ArrayAdapter adapter;
    Items items;
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter pagerAdapter;
    TextView tex11;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__view);

        tabLayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.pager);
        tex11=findViewById(R.id.tex11);















        Intent intent=getIntent();
        String myName=intent.getStringExtra("name");
       tex11.setText("hello "+myName);

       Intent intent1=getIntent();
       myName=intent1.getStringExtra("name");
       tex11.setText("hello "+myName);



        pagerAdapter =new PageAdapter(getSupportFragmentManager());
            viewPager.setAdapter(pagerAdapter);
            tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
            tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
            tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));

            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());

                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });




        }











    }

