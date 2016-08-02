package com.wohlig.sava;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Mahesh on 8/2/2016.
 */
public class Test extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_welcome);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
    }
    private void setupViewPager(ViewPager viewPager) {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new One(), "");
        adapter.addFragment(new One(), "");
        adapter.addFragment(new One(), "");
        adapter.addFragment(new One(), "");
        viewPager.setAdapter(adapter);
    }


}
