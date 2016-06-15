package com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_DEFINED;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.id2013_03.android_app.R;


public class SportsSeries extends Fragment {

    ImageView frontOfCar;
    ImageView doorOfCar;
    ImageView windowOfCar;
    ImageView roofOfCar;
    ImageView backOfCar;

    ScrollView sportsTextScroll;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.defined_popup_sports_series, container, false);

        frontOfCar = (ImageView)rootView.findViewById(R.id.front_of_car);
        doorOfCar = (ImageView)rootView.findViewById(R.id.door_of_car);
        windowOfCar = (ImageView)rootView.findViewById(R.id.window_of_car);
        roofOfCar = (ImageView)rootView.findViewById(R.id.roof_of_car);
        backOfCar = (ImageView)rootView.findViewById(R.id.back_of_car);

        sportsTextScroll = (ScrollView)rootView.findViewById(R.id.mso_sports_text);

        frontOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sportsTextScroll.scrollTo(0, 810);
                frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                windowOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                roofOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        doorOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sportsTextScroll.scrollTo(0, 2380);
                frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                windowOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                roofOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        windowOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Not yet implemented", Toast.LENGTH_LONG).show();
                frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                windowOfCar.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                roofOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        roofOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Not yet implemented", Toast.LENGTH_LONG).show();
                frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                windowOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                roofOfCar.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        backOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sportsTextScroll.scrollTo(0, 1620);
                frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                windowOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                roofOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval_pressed);

            }
        });


        return rootView;
    }





}
