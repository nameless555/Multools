package com.nutchanok.me.testapp.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nutchanok.me.testapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CeramicFragment extends Fragment {


    public CeramicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ceramic, container, false);
    }

}
