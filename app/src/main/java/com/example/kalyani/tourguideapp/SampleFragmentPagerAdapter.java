package com.example.kalyani.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SampleFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private Context mContext;
    SampleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new DivineDestinationsFragment();
        else if(position == 1)
            return new MuseumsFragment();
        else if(position == 2)
            return new BeachesFragment();
        else
            return new ParksFragment();
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 4;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.title_divine);
            case 1:
                return mContext.getString(R.string.title_museums);
            case 2:
                return mContext.getString(R.string.title_beaches);
            case 3:
                return mContext.getString(R.string.title_parks);
            default:
                return null;
        }
    }
}

