package com.example.id2013_03.android_app.Exclusivity_TABS.MAIN;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_BESPOKE.Mso_Bespoke_Popup;
import com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_DEFINED.Mso_Defined_Popup;
import com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_HERITAGE.Mso_Heritage_Popup;
import com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_LIMITED.Mso_Limited_Popup;
import com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_PROGRAMMES.Mso_Programmes_Popup;
import com.example.id2013_03.android_app.R;

/**
 * Created by ID2013-03 on 26/05/2016.
 */
public class MclarenF1 extends Fragment {
    ImageView msoDefined;
    ImageView msoBespoke;
    ImageView msoHeritage;
    ImageView msoProgrammes;
    ImageView msoLimited;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mclaren_f1, container, false);

        msoDefined = (ImageView)rootView.findViewById(R.id.mso_defined_btn);
        msoBespoke = (ImageView)rootView.findViewById(R.id.mso_bespoke_btn);
        msoHeritage = (ImageView)rootView.findViewById(R.id.mso_heritage_btn);
        msoProgrammes = (ImageView)rootView.findViewById(R.id.mso_programmes_btn);
        msoLimited = (ImageView)rootView.findViewById(R.id.mso_limited_btn);

        msoDefined.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Mso_Defined_Popup.class);
                startActivity(i);
            }
        });

        msoBespoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Mso_Bespoke_Popup.class);
                startActivity(i);
            }
        });

        msoHeritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Mso_Heritage_Popup.class);
                startActivity(i);
            }
        });

        msoProgrammes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Mso_Programmes_Popup.class);
                startActivity(i);
            }
        });

        msoLimited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Mso_Limited_Popup.class);
                startActivity(i);
            }
        });


        return rootView;
    }
}