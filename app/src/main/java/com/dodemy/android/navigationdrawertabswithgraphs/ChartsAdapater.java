package com.dodemy.android.navigationdrawertabswithgraphs;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import static com.dodemy.android.navigationdrawertabswithgraphs.TabFragment.int_items;



public class ChartsAdapater extends FragmentPagerAdapter {


 public  ChartsAdapater(FragmentManager fm){
     super(fm);
 }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BarChartFragment();
            case 1:
                return  new BargroupChartFragment();
            case 2:
                return new LinechartFragment();
            case 3:
                return new PiechartFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return int_items;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Bar";
            case 1:
                return "BarGroup";
            case 2:
                return "Line";
            case 3:
                return "Pie";




        }

        return null;
    }
}


