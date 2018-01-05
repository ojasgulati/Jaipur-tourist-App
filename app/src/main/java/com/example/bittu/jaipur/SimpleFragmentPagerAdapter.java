package com.example.bittu.jaipur;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
    private String tabTitles[] = new String[] { "Sites", "Temples", "Festivals","Hotels" };
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new HistoricalFragment();
        }else if(position == 1){
            return new TemplesFragment();
        }else if(position == 2){
            return new FestivalsFragment();
        }else{
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
