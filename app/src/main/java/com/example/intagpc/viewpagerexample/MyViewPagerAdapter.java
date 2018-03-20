package com.example.intagpc.viewpagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by intag pc on 3/20/2018.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: {
                AndroidFragment androidFragment = new AndroidFragment();
                return androidFragment;
            }
            case 1: {
                return new IOSFragment();
            }
            case 2: {
                return new WindowsFragment();
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Android";
        }
        if (position == 1) {
            title = "ios";


        }
        if (position == 2) {
            title = "windows";
        }
        return title;
    }
}
