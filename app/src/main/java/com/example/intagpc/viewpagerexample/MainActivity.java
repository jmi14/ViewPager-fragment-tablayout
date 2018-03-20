package com.example.intagpc.viewpagerexample;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    MyViewPagerAdapter myViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setViewPager();
        setTabLayout();

    }

    private void setViewPager() {

        viewPager.setAdapter(myViewPagerAdapter);

    }

    private void setTabLayout() {

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabTextColors(Color.WHITE, Color.BLUE);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void initWidgets() {

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
    }


}
