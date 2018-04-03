package com.nutchanok.me.testapp.fragment;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.nutchanok.me.testapp.Coordinate;
import com.nutchanok.me.testapp.R;
import com.nutchanok.me.testapp.activity.Second1Activity;


/**
 * A simple {@link Fragment} subclass.
 */
public class Res1SecondFragment extends Fragment implements View.OnClickListener {

    public int x, y;
    public double z;

    Button tvSwitch;
    RadioGroup rgOhm;
    ImageView img_show, img_show2, img_show3, img_show4, img_show5;
    Button btn1black, btn1brown, btn1red, btn1orange, btn1yellow, btn1green, btn1blue, btn1violet, btn1gray, btn1white,
            btn2black, btn2brown, btn2red, btn2orange, btn2yellow, btn2green, btn2blue, btn2violet, btn2gray, btn2white,
            btn3black, btn3brown, btn3red, btn3orange, btn3yellow, btn3green, btn3blue, btn3violet, btn3gray, btn3white,
            btn4black, btn4brown, btn4red, btn4orange, btn4yellow, btn4green, btn4blue, btn4violet, btn4silver, btn4gold,
            btn5brown, btn5red, btn5green, btn5blue, btn5violet, btn5silver, btn5gold;
    int num_bar_1 = 0;
    int num_bar_2 = 0;
    int num_bar_3 = 0;
    int num_bar_4 = 0;
    double num_bar_4_1 = 0;
    int num_bar_4_2 = 0;
    TextView tv_result1;
    TextView tv_result2;
    TextView tv_result2_power;
    int sum;
    TextView percent;
    Context context;


    public Res1SecondFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_res1_second, container, false);

        initInstances(rootView);
        return rootView;


    }

    private void initInstances(View rootView) {
        img_show = (ImageView) rootView.findViewById(R.id.img_show);
        img_show2 = (ImageView) rootView.findViewById(R.id.img_show2);
        img_show3 = (ImageView) rootView.findViewById(R.id.img_show3);
        img_show4 = (ImageView) rootView.findViewById(R.id.img_show4);
        img_show5 = (ImageView) rootView.findViewById(R.id.img_show5);

        tv_result1 = (TextView) rootView.findViewById(R.id.tv_result1);
        tv_result2 = (TextView) rootView.findViewById(R.id.tv_result2);
        tv_result2_power = (TextView) rootView.findViewById(R.id.tv_result2_power);

        percent = (TextView) rootView.findViewById(R.id.tv_result3);
        rgOhm = (RadioGroup) rootView.findViewById(R.id.rgOhm);



        btn1black = (Button) rootView.findViewById(R.id.btn1black);
        btn1brown = (Button) rootView.findViewById(R.id.btn1brown);
        btn1red = (Button) rootView.findViewById(R.id.btn1red);
        btn1orange = (Button) rootView.findViewById(R.id.btn1orange);
        btn1yellow = (Button) rootView.findViewById(R.id.btn1yellow);
        btn1green = (Button) rootView.findViewById(R.id.btn1green);
        btn1blue = (Button) rootView.findViewById(R.id.btn1blue);
        btn1violet = (Button) rootView.findViewById(R.id.btn1violet);
        btn1gray = (Button) rootView.findViewById(R.id.btn1gray);
        btn1white = (Button) rootView.findViewById(R.id.btn1white);

        btn2black = (Button) rootView.findViewById(R.id.btn2black);
        btn2brown = (Button) rootView.findViewById(R.id.btn2brown);
        btn2red = (Button) rootView.findViewById(R.id.btn2red);
        btn2orange = (Button) rootView.findViewById(R.id.btn2orange);
        btn2yellow = (Button) rootView.findViewById(R.id.btn2yellow);
        btn2green = (Button) rootView.findViewById(R.id.btn2green);
        btn2blue = (Button) rootView.findViewById(R.id.btn2blue);
        btn2violet = (Button) rootView.findViewById(R.id.btn2violet);
        btn2gray = (Button) rootView.findViewById(R.id.btn2gray);
        btn2white = (Button) rootView.findViewById(R.id.btn2white);

        btn3black = (Button) rootView.findViewById(R.id.btn3black);
        btn3brown = (Button) rootView.findViewById(R.id.btn3brown);
        btn3red = (Button) rootView.findViewById(R.id.btn3red);
        btn3orange = (Button) rootView.findViewById(R.id.btn3orange);
        btn3yellow = (Button) rootView.findViewById(R.id.btn3yellow);
        btn3green = (Button) rootView.findViewById(R.id.btn3green);
        btn3blue = (Button) rootView.findViewById(R.id.btn3blue);
        btn3violet = (Button) rootView.findViewById(R.id.btn3violet);
        btn3gray = (Button) rootView.findViewById(R.id.btn3gray);
        btn3white = (Button) rootView.findViewById(R.id.btn3white);

        btn4black = (Button) rootView.findViewById(R.id.btn4black);
        btn4brown = (Button) rootView.findViewById(R.id.btn4brown);
        btn4red = (Button) rootView.findViewById(R.id.btn4red);
        btn4orange = (Button) rootView.findViewById(R.id.btn4orange);
        btn4yellow = (Button) rootView.findViewById(R.id.btn4yellow);
        btn4green = (Button) rootView.findViewById(R.id.btn4green);
        btn4blue = (Button) rootView.findViewById(R.id.btn4blue);
        btn4violet = (Button) rootView.findViewById(R.id.btn4violet);
        btn4silver = (Button) rootView.findViewById(R.id.btn4silver);
        btn4gold = (Button) rootView.findViewById(R.id.btn4gold);

        btn5brown = (Button) rootView.findViewById(R.id.btn5brown);
        btn5red = (Button) rootView.findViewById(R.id.btn5red);
        btn5green = (Button) rootView.findViewById(R.id.btn5green);
        btn5blue = (Button) rootView.findViewById(R.id.btn5blue);
        btn5violet = (Button) rootView.findViewById(R.id.btn5violet);
        btn5silver = (Button) rootView.findViewById(R.id.btn5silver);
        btn5gold = (Button) rootView.findViewById(R.id.btn5gold);

        tvSwitch = (Button) rootView.findViewById(R.id.tvSwitch);

        btn1black.setOnClickListener(this);
        btn1brown.setOnClickListener(this);
        btn1red.setOnClickListener(this);
        btn1orange.setOnClickListener(this);
        btn1yellow.setOnClickListener(this);
        btn1green.setOnClickListener(this);
        btn1blue.setOnClickListener(this);
        btn1violet.setOnClickListener(this);
        btn1gray.setOnClickListener(this);
        btn1white.setOnClickListener(this);

        btn2black.setOnClickListener(this);
        btn2brown.setOnClickListener(this);
        btn2red.setOnClickListener(this);
        btn2orange.setOnClickListener(this);
        btn2yellow.setOnClickListener(this);
        btn2green.setOnClickListener(this);
        btn2blue.setOnClickListener(this);
        btn2violet.setOnClickListener(this);
        btn2gray.setOnClickListener(this);
        btn2white.setOnClickListener(this);

        btn3black.setOnClickListener(this);
        btn3brown.setOnClickListener(this);
        btn3red.setOnClickListener(this);
        btn3orange.setOnClickListener(this);
        btn3yellow.setOnClickListener(this);
        btn3green.setOnClickListener(this);
        btn3blue.setOnClickListener(this);
        btn3violet.setOnClickListener(this);
        btn3gray.setOnClickListener(this);
        btn3white.setOnClickListener(this);

        btn4black.setOnClickListener(this);
        btn4brown.setOnClickListener(this);
        btn4red.setOnClickListener(this);
        btn4orange.setOnClickListener(this);
        btn4yellow.setOnClickListener(this);
        btn4green.setOnClickListener(this);
        btn4blue.setOnClickListener(this);
        btn4violet.setOnClickListener(this);
        btn4silver.setOnClickListener(this);
        btn4gold.setOnClickListener(this);

        btn5brown.setOnClickListener(this);
        btn5red.setOnClickListener(this);
        btn5green.setOnClickListener(this);
        btn5blue.setOnClickListener(this);
        btn5violet.setOnClickListener(this);
        btn5silver.setOnClickListener(this);
        btn5gold.setOnClickListener(this);

        tvSwitch.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn1black:
                img_show.setImageResource(R.drawable.r4_c1_black);
                num_bar_1 = 00;
                break;
            case R.id.btn1brown:
                img_show.setImageResource(R.drawable.r4_c1_brown);
                num_bar_1 = 100;
                break;
            case R.id.btn1red:
                img_show.setImageResource(R.drawable.r4_c1_red);
                num_bar_1 = 200;
                break;
            case R.id.btn1orange:
                img_show.setImageResource(R.drawable.r4_c1_orange);
                num_bar_1 = 300;
                break;
            case R.id.btn1yellow:
                img_show.setImageResource(R.drawable.r4_c1_yellow);
                num_bar_1 = 400;
                break;
            case R.id.btn1green:
                img_show.setImageResource(R.drawable.r4_c1_green);
                num_bar_1 = 500;
                break;
            case R.id.btn1blue:
                img_show.setImageResource(R.drawable.r4_c1_blue);
                num_bar_1 = 600;
                break;
            case R.id.btn1violet:
                img_show.setImageResource(R.drawable.r4_c1_violet);
                num_bar_1 = 700;
                break;
            case R.id.btn1gray:
                img_show.setImageResource(R.drawable.r4_c1_gray);
                num_bar_1 = 800;
                break;
            case R.id.btn1white:
                img_show.setImageResource(R.drawable.r4_c1_white);
                num_bar_1 = 900;
                break;
        }
        switch (v.getId()) {
            case R.id.btn2black:
                img_show2.setImageResource(R.drawable.r4_c2_black);
                num_bar_2 = 0;
                break;
            case R.id.btn2brown:
                img_show2.setImageResource(R.drawable.r4_c2_brown);
                num_bar_2 = 10;
                break;
            case R.id.btn2red:
                img_show2.setImageResource(R.drawable.r4_c2_red);
                num_bar_2 = 20;
                break;
            case R.id.btn2orange:
                img_show2.setImageResource(R.drawable.r4_c2_orange);
                num_bar_2 = 30;
                break;
            case R.id.btn2yellow:
                img_show2.setImageResource(R.drawable.r4_c2_yellow);
                num_bar_2 = 40;
                break;
            case R.id.btn2green:
                img_show2.setImageResource(R.drawable.r4_c2_green);
                num_bar_2 = 50;
                break;
            case R.id.btn2blue:
                img_show2.setImageResource(R.drawable.r4_c2_blue);
                num_bar_2 = 60;
                break;
            case R.id.btn2violet:
                img_show2.setImageResource(R.drawable.r4_c2_violet);
                num_bar_2 = 70;
                break;
            case R.id.btn2gray:
                img_show2.setImageResource(R.drawable.r4_c2_gray);
                num_bar_2 = 80;
                break;
            case R.id.btn2white:
                img_show2.setImageResource(R.drawable.r4_c2_white);
                num_bar_2 = 90;
                break;
        }
        switch (v.getId()) {
            case R.id.btn3black:
                img_show3.setImageResource(R.drawable.r4_c3_black);
                num_bar_3 = 0;
                break;
            case R.id.btn3brown:
                img_show3.setImageResource(R.drawable.r4_c3_brown);
                num_bar_3 = 1;
                break;
            case R.id.btn3red:
                img_show3.setImageResource(R.drawable.r4_c3_red);
                num_bar_3 = 2;
                break;
            case R.id.btn3orange:
                img_show3.setImageResource(R.drawable.r4_c3_orange);
                num_bar_3 = 3;
                break;
            case R.id.btn3yellow:
                img_show3.setImageResource(R.drawable.r4_c3_yellow);
                num_bar_3 = 4;
                break;
            case R.id.btn3green:
                img_show3.setImageResource(R.drawable.r4_c3_green);
                num_bar_3 = 5;
                break;
            case R.id.btn3blue:
                img_show3.setImageResource(R.drawable.r4_c3_blue);
                num_bar_3 = 6;
                break;
            case R.id.btn3violet:
                img_show2.setImageResource(R.drawable.r4_c3_violet);
                num_bar_3 = 7;
                break;
            case R.id.btn3gray:
                img_show3.setImageResource(R.drawable.r5_c3_gray);
                num_bar_3 = 8;
                break;
            case R.id.btn3white:
                img_show3.setImageResource(R.drawable.r5_c3_white);
                num_bar_3 = 9;
                break;
        }

        sum = num_bar_1 + num_bar_2 + num_bar_3;

        tv_result1.setText(sum + "");
        context = tv_result1.getContext();

        switch (v.getId()) {
            case R.id.btn4black:
                img_show4.setImageResource(R.drawable.r5_c4_black);
                num_bar_4 = 1;
                num_bar_4_1 = 1;
                tv_result2_power.setText("");
                break;
            case R.id.btn4brown:
                img_show4.setImageResource(R.drawable.r5_c4_brown);
                num_bar_4 = 10;
                num_bar_4_1 = 10;
                tv_result2_power.setText("");
                break;
            case R.id.btn4red:
                img_show4.setImageResource(R.drawable.r5_c4_red);
                num_bar_4 = 10;
                num_bar_4_1 = 100;
                num_bar_4_2 = 2;
                tv_result2_power.setText("2");
                break;
            case R.id.btn4orange:
                img_show4.setImageResource(R.drawable.r5_c4_orange);
                num_bar_4 = 10;
                num_bar_4_1 = 1000;
                num_bar_4_2 = 3;
                tv_result2_power.setText("3");
                break;
            case R.id.btn4yellow:
                img_show4.setImageResource(R.drawable.r5_c4_yellow);
                num_bar_4 = 10;
                num_bar_4_1 = 10000;
                num_bar_4_2 = 4;
                tv_result2_power.setText("4");
                break;
            case R.id.btn4green:
                img_show4.setImageResource(R.drawable.r5_c4_green);
                num_bar_4 = 10;
                num_bar_4_1 = 100000;
                num_bar_4_2 = 5;
                tv_result2_power.setText("5");
                break;
            case R.id.btn4blue:
                img_show4.setImageResource(R.drawable.r5_c4_blue);
                num_bar_4 = 10;
                num_bar_4_1 = 1000000;
                num_bar_4_2 = 6;
                tv_result2_power.setText("6");
                break;
            case R.id.btn4violet:
                img_show4.setImageResource(R.drawable.r5_c4_violet);
                num_bar_4 = 10;
                num_bar_4_1 = 10000000;
                num_bar_4_2 = 7;
                tv_result2_power.setText("7");
                break;
            case R.id.btn4silver:
                img_show4.setImageResource(R.drawable.r5_c4_silver);
                num_bar_4 = 10;
                num_bar_4_1 = 0.1;
                num_bar_4_2 = -1;
                tv_result2_power.setText("-1");
                break;
            case R.id.btn4gold:
                img_show4.setImageResource(R.drawable.r5_c4_gold);
                num_bar_4 = 10;
                num_bar_4_1 = 0.01;
                num_bar_4_2 = -2;
                tv_result2_power.setText("-2");
                break;
        }


        tv_result2.setText(num_bar_4 + "");

        switch (v.getId()) {

            case R.id.btn5brown:
                img_show5.setImageResource(R.drawable.r4_c5_brown);
                percent.setText(R.string.error_1_percent);
                break;
            case R.id.btn5red:
                img_show5.setImageResource(R.drawable.r4_c5_red);
                percent.setText(R.string.error_2_percent);
                break;
            case R.id.btn5silver:
                img_show5.setImageResource(R.drawable.r4_c5_silver);
                percent.setText(R.string.error_5_percent);
                break;
            case R.id.btn5gold:
                img_show5.setImageResource(R.drawable.r4_c5_gold);
                percent.setText(R.string.error_5_percent);
                break;
            case R.id.btn5green:
                img_show5.setImageResource(R.drawable.r4_c5_green);
                percent.setText(R.string.error_10_percent);
                break;
            case R.id.btn5blue:
                img_show5.setImageResource(R.drawable.r4_c5_blue);
                percent.setText(R.string.error_025_percent);
                break;
            case R.id.btn5violet:
                img_show5.setImageResource(R.drawable.r4_c5_violet);
                percent.setText(R.string.error_01_percent);
                break;
        }


        switch (v.getId()) {
            case R.id.tvSwitch:
                Intent intent = new Intent(getContext(), Second1Activity.class);

                Coordinate c1 = new Coordinate();
                c1.x = num_bar_1;
                c1.y = num_bar_2;
                c1.z = num_bar_4_1;

                Bundle bundle = new Bundle();
                bundle.putInt("x", c1.x);
                bundle.putInt("y", c1.y);
                bundle.putDouble("z", c1.z);
                intent.putExtra("cBundle", bundle);

                startActivityForResult(intent, 12345);
        }

    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 12345) {
            if (resultCode == Activity.RESULT_OK) {
                String result = data.getStringExtra("result1");
                Toast.makeText(getActivity(), result, Toast.LENGTH_LONG).show();
            }
        }


    }
}
