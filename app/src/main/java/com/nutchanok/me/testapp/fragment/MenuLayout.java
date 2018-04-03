package com.nutchanok.me.testapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.nutchanok.me.testapp.activity.AboutActivity;
import com.nutchanok.me.testapp.activity.CapasisterActivity;
import com.nutchanok.me.testapp.activity.LawsOhmActivity;
import com.nutchanok.me.testapp.activity.MainFragmentTabActivity;
import com.nutchanok.me.testapp.R;
import com.nutchanok.me.testapp.activity.HomeActivity;
import com.nutchanok.me.testapp.activity.UnitConverterActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuLayout extends Fragment implements View.OnClickListener {

    Button btn_home;

    LinearLayout ll_home;
    LinearLayout ll_res;
    LinearLayout ll_cap;
    LinearLayout ll_converter;
    LinearLayout ll_law_ohm;
    LinearLayout ll_about;

    public MenuLayout() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.layout_menu, container, false);

        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {


        ll_home = (LinearLayout) rootView.findViewById(R.id.ll_home);
        ll_res = (LinearLayout) rootView.findViewById(R.id.ll_res);
        ll_cap = (LinearLayout) rootView.findViewById(R.id.ll_cap);
        ll_converter = (LinearLayout) rootView.findViewById(R.id.ll_converter);
        ll_law_ohm = (LinearLayout) rootView.findViewById(R.id.ll_law_ohm);
        ll_about = (LinearLayout) rootView.findViewById(R.id.ll_about);

        ll_home.setOnClickListener(this);
        ll_res.setOnClickListener(this);
        ll_cap.setOnClickListener(this);
        ll_converter.setOnClickListener(this);
        ll_law_ohm.setOnClickListener(this);
        ll_about.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == ll_home) {
            Intent home = new Intent(getActivity(), HomeActivity.class);
            startActivity(home);
        }

        if (v == ll_res) {
            Intent res = new Intent(getActivity(), MainFragmentTabActivity.class);
            startActivity(res);

        }
        if (v == ll_cap) {
            Intent res = new Intent(getActivity(), CapasisterActivity.class);
            startActivity(res);

        }
        if (v == ll_converter) {
            Intent res = new Intent(getActivity(), UnitConverterActivity.class);
            startActivity(res);

        }
        if (v == ll_law_ohm) {
            Intent res = new Intent(getActivity(), LawsOhmActivity.class);
            startActivity(res);

        }
        if (v == ll_about) {
            Intent res = new Intent(getActivity(), AboutActivity.class);
            startActivity(res);

        }


    }
}
