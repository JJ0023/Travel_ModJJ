package com.example.travel;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class WishlistActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        tabLayout = (TabLayout)findViewById(R.id.tablayout_id);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Fragments Added Here
        adapter.AddFragment(new FragmentBucketlist(),getString(R.string.BucketList));
        adapter.AddFragment(new FragmentExplore(),getString(R.string.Explore));
        adapter.AddFragment(new FragmentAccomplished(),getString(R.string.Accomplished));

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //Set Icon For tabs
        //tabLayout.getTabAt(0).setIcon(R.drawable.);

        //Remove Shadow from the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);



    }
}
