package com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_DEFINED;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.id2013_03.android_app.R;

public class SuperSeries extends Fragment {
    ImageView car01;
    ImageView car02;
    ImageView car03;
    ImageView car04;
    ImageView backOfCar;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View superView = inflater.inflate(R.layout.defined_popup_super_series, container, false);

        car01 = (ImageView)superView.findViewById(R.id.car_01);
        car02 = (ImageView)superView.findViewById(R.id.car_02);
        car03 = (ImageView)superView.findViewById(R.id.car_03);
        car04 = (ImageView)superView.findViewById(R.id.car_04);
        backOfCar = (ImageView)superView.findViewById(R.id.super_back_of_car);

        car01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Not yet implemented", Toast.LENGTH_LONG).show();
                car01.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                car02.setBackgroundResource(R.drawable.exclusivity_oval);
                car03.setBackgroundResource(R.drawable.exclusivity_oval);
                car04.setBackgroundResource(R.drawable.exclusivity_oval);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        car02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Not yet implemented", Toast.LENGTH_LONG).show();
                car01.setBackgroundResource(R.drawable.exclusivity_oval);
                car02.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                car03.setBackgroundResource(R.drawable.exclusivity_oval);
                car04.setBackgroundResource(R.drawable.exclusivity_oval);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        car03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Not yet implemented", Toast.LENGTH_LONG).show();
                car01.setBackgroundResource(R.drawable.exclusivity_oval);
                car02.setBackgroundResource(R.drawable.exclusivity_oval);
                car03.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                car04.setBackgroundResource(R.drawable.exclusivity_oval);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        car04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Not yet implemented", Toast.LENGTH_LONG).show();
                car01.setBackgroundResource(R.drawable.exclusivity_oval);
                car02.setBackgroundResource(R.drawable.exclusivity_oval);
                car03.setBackgroundResource(R.drawable.exclusivity_oval);
                car04.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        backOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Not yet implemented", Toast.LENGTH_LONG).show();
                car01.setBackgroundResource(R.drawable.exclusivity_oval);
                car02.setBackgroundResource(R.drawable.exclusivity_oval);
                car03.setBackgroundResource(R.drawable.exclusivity_oval);
                car04.setBackgroundResource(R.drawable.exclusivity_oval);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
            }
        });
        return superView;
    }
}
