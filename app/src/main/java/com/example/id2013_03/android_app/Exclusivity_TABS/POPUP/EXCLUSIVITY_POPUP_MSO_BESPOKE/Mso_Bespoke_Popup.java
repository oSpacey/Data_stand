package com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_BESPOKE;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import com.example.id2013_03.android_app.R;
import com.example.id2013_03.android_app.TABS.POPUP_Base;

import static android.view.Gravity.BOTTOM;

/**
 * Created by ID2013-03 on 31/05/2016.
 */
public class Mso_Bespoke_Popup extends POPUP_Base {
    ViewPager viewPager;
    TabLayout tabLayout;
    ImageView closeBespoke;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bespoke_popup_main);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((width * 1), (int) (height * .975));

        getWindow().setGravity(BOTTOM);

        closeBespoke = (ImageView)findViewById(R.id.closeBespoke);
        closeBespoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        viewPager = (ViewPager) findViewById(R.id.exclusivity_pop_View);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));
        viewPager.setOffscreenPageLimit(2);

        tabLayout = (TabLayout) findViewById(R.id.exclusivity_pop_Tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

        });


    }


    private class CustomAdapter extends FragmentStatePagerAdapter {
        private String fragments[] = {"Introduction", "Custom Interior Tailoring", "Create Your Perfect McLaren", "Bespoke Paintwork", "Limitless Customisation"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Introduction_Bespoke();
                case 1:
                    return new Custom_Interior_Tailoring();
                case 2:
                    return new Create_Your_Perfect_McLaren();
                case 3:
                    return new Bespoke_Paintwork();
                case 4:
                    return new Limitless_Customisation();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];
        }


    }
}