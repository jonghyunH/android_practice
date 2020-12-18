package com.example.android_practice;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class ScreenSlidePagerAdapter extends FragmentStateAdapter {

    public ScreenSlidePagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    @Override
    public Fragment createFragment(int position) {
        if(position == 0) return new ScreenSlidePageFragment1();
        else if (position == 1) return new ScreenSlidePageFragment2();
        else if (position == 2) return new ScreenSlidePageFragment3();
        else return new ScreenSlidePageFragment4();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}