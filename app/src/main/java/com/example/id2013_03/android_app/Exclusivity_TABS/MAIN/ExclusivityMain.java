package com.example.id2013_03.android_app.Exclusivity_TABS.MAIN;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.id2013_03.android_app.R;

import fr.castorflex.android.verticalviewpager.VerticalViewPager;

/**
 * Created by ID2013-03 on 26/05/2016.
 */
public class ExclusivityMain extends Fragment {

    ImageView msoBtn;
    ImageView factoryBtn;

    ViewPager viewPager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.exclusivitymain, container, false);

        viewPager = (ViewPager)getActivity().findViewById(R.id.vert_view);
        msoBtn = (ImageView)rootView.findViewById(R.id.msoBtn);
        factoryBtn = (ImageView)rootView.findViewById(R.id.factoryBtn);

        msoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        factoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });


        return rootView;

    }
}
