package com.example.id2013_03.android_app.SPECIFICATION_TABS.MAIN;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.id2013_03.android_app.R;

import fr.castorflex.android.verticalviewpager.VerticalViewPager;

/**
 * Created by ID2013-03 on 02/06/2016.
 */
public class SpecificationMain extends Fragment {
    ImageView moreBtn;

    VerticalViewPager viewPager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.specification_main, container, false);

        viewPager = (VerticalViewPager) getActivity().findViewById(R.id.vert_view_spec);
        moreBtn = (ImageView)rootView.findViewById(R.id.moreBtn);

        moreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1, true);
            }
        });

        return rootView;
    }
}


