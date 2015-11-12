package itunes.com.itunesapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by root on 7/11/15.
 */
public class CollectionPagerAdapter extends FragmentStatePagerAdapter {

    public CollectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new TabOneFragment();
                break;

            case 1:
                fragment = new TabTwoFragment();
                break;

            case 2:
                fragment = new TabThreeFragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "TAB " + (position + 1);
    }
}
