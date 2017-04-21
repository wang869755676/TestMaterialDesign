package com.example.recyclerdirection.testmaterialdesign;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class TabBarActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_bar);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        toolbar.setTitle("tooltitle");
        toolbar.setSubtitle("tablayout");

        setSupportActionBar(toolbar);

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new Fragment_a();
                    case 1:
                        return new Fragment_a();
                    case 2:
                        return new Fragment_a();
                    default:
                        return new Fragment_a();
                }
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "page one";
                    case 1:
                        return "page two";
                    case 2:
                        return "page three";
                    default:
                        return "page one";
                }
            }
        });
        tabLayout.setupWithViewPager(viewPager);


    }
}
