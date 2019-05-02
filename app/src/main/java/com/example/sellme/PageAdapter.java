package com.example.sellme;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int postion) {

        switch (postion){
            case 0 :
                Fragment_one fragment_one=new Fragment_one();
                return fragment_one;


            case 1:
                Fragment_two fragment_two=new Fragment_two();

                return  fragment_two;
            case 2:
                Fragment_three fragment_three=new Fragment_three();
                return fragment_three;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
