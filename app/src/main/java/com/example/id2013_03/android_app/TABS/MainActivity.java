package com.example.id2013_03.android_app.TABS;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Imported necessary functions
     ---------------------------------------------------------------------------------------------------------------------------
*/
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.id2013_03.android_app.R;
import com.example.id2013_03.android_app.USER_LOGIN.Login;

import fr.castorflex.android.verticalviewpager.VerticalViewPager;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Main class for this section
     ---------------------------------------------------------------------------------------------------------------------------
*/
public class MainActivity extends MAIN_Base {

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    Variables used throughout this page of code
     ---------------------------------------------------------------------------------------------------------------------------
*/
    ViewPager viewPager;
    VerticalViewPager vertSpec;
    ViewPager vertEx;
    TabLayout tabLayout;

    TextView specTx;
    TextView overTx;
    TextView exclusiveTx;
    TextView heritageTx;
    TextView brochureTx;

    Typeface custom_font;

    Button logoBtn;


/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    Creating the layout for the page
                                The layout hold all the graphical contents

                              Layout for this page --- R.layout.activity_main

                        Here the ID's of the objects that the users will interact with
                      get called. This is so that we can set attributes to the objects so
                     "something" will actually happen when the users interact with the page.
     ---------------------------------------------------------------------------------------------------------------------------
*/
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    Finding the text that is displayed for the tabs
                    Once the text if found, the type face of this font is then changed to custom_font

                    custom_font is a variable. This variable has the file path for the font that is used.
                    If you wish to change the font simply change the path, which is the first line below
     ---------------------------------------------------------------------------------------------------------------------------
*/

        String fontPath = "fonts/Roboto-Regular.ttf";
        custom_font = Typeface.createFromAsset(getAssets(), fontPath);

        specTx = (TextView) findViewById(R.id.spec_text);
        specTx.setTypeface(custom_font);

        overTx = (TextView) findViewById(R.id.over_text);
        overTx.setTypeface(custom_font);

        exclusiveTx = (TextView) findViewById(R.id.over_text);
        exclusiveTx.setTypeface(custom_font);

        heritageTx = (TextView) findViewById(R.id.over_text);
        heritageTx.setTypeface(custom_font);

        brochureTx = (TextView) findViewById(R.id.over_text);
        brochureTx.setTypeface(custom_font);

        logoBtn = (Button)findViewById(R.id.logo_button);
        logoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
        logoBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);

                return true;
            }
        });

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));
        viewPager.setOffscreenPageLimit(5);




        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                viewPager.onRestoreInstanceState(savedInstanceState);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                viewPager.onRestoreInstanceState(savedInstanceState);
                vertSpec = (VerticalViewPager) findViewById(R.id.vert_view_spec);
                vertEx = (ViewPager)findViewById(R.id.vert_view);
                NestedScrollView nestScroll = (NestedScrollView)findViewById(R.id.child_scroll);

                int vertSpecPage = viewPager.getCurrentItem();

                if (vertSpecPage == 0) {
                    vertSpec.setCurrentItem(0);
                    nestScroll.scrollTo(0,0);
                }

                if(vertSpecPage == 2){
                    vertEx.setCurrentItem(0);
                }else
                    return;
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());




            }

        });
    }


    private class CustomAdapter extends FragmentStatePagerAdapter {
        private String fragments[] = {"", "", "", "", ""};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Specification();
                case 1:
                    return new Overview();
                case 2:
                    return new Exclusivity();
                case 3:
                    return new Heritage();
                case 4:
                    return new Brochure();
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
