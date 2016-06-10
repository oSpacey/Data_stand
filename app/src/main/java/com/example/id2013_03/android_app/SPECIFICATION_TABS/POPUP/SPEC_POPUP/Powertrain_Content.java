package com.example.id2013_03.android_app.SPECIFICATION_TABS.POPUP.SPEC_POPUP;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.example.id2013_03.android_app.R;


public class Powertrain_Content extends Fragment {
    ImageView engineBtn;
    ImageView transmissionBtn;
    ImageView exhaustBtn;
    ImageView lubricationBtn;
    ImageView powerTrain_title;

    ScrollView powerScroll;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.powertrain_content, container, false);

        engineBtn = (ImageView)rootView.findViewById(R.id.powertrain_engine);
        transmissionBtn = (ImageView)rootView.findViewById(R.id.powertrain_transmission);
        exhaustBtn = (ImageView)rootView.findViewById(R.id.powertrain_exhaust);
        lubricationBtn = (ImageView)rootView.findViewById(R.id.powertrain_lubricant);

        powerTrain_title = (ImageView)rootView.findViewById(R.id.powertrain_title);
        powerTrain_title.bringToFront();

        powerScroll = (ScrollView)rootView.findViewById(R.id.power_Scroll);

        engineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 840);
                engineBtn.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                transmissionBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                exhaustBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                lubricationBtn.setBackgroundResource(R.drawable.exclusivity_oval);

            }
        });

        transmissionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 1678);
                engineBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                transmissionBtn.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                exhaustBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                lubricationBtn.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        exhaustBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 2523);
                engineBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                transmissionBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                exhaustBtn.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                lubricationBtn.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        lubricationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 3360);
                engineBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                transmissionBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                exhaustBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                lubricationBtn.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
            }
        });

        return rootView;
    }

}
