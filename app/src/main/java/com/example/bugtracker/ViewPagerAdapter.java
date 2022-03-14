package com.example.bugtracker;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity){super(fragmentActivity);}

    @NonNull
    @Override
    public Fragment createFragment(int position){
        switch (position){
            case 1:
                return new In_Progress_Issues();
            case 2:
                return new Done_Issues();
            default:
                return new New_Issues();
        }
    }
    @Override
    public int getItemCount(){return 3;}
}
