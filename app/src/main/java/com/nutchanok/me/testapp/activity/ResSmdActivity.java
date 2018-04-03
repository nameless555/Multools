package com.nutchanok.me.testapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nutchanok.me.testapp.R;


public class ResSmdActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_result;
    Button btn1_0, btn1_1, btn1_2, btn1_3, btn1_4, btn1_5, btn1_6, btn1_7, btn1_8, btn1_9, btn1_r,
            btn2_0, btn2_1, btn2_2, btn2_3, btn2_4, btn2_5, btn2_6, btn2_7, btn2_8, btn2_9, btn2_r,
            btn3_0, btn3_1, btn3_2, btn3_3, btn3_4, btn3_5, btn3_6, btn3_7, btn3_8, btn3_9;
    double num1 = 0;
    double num2 = 0;
    double num3 = 0;
    double num3_1 = 0;
    double sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_smd);

        initInstances();
    }

    private void initInstances() {
        tv_result = (TextView) findViewById(R.id.tv_result);
        btn1_0 = (Button) findViewById(R.id.btn1_0);
        btn1_1 = (Button) findViewById(R.id.btn1_1);
        btn1_2 = (Button) findViewById(R.id.btn1_2);
        btn1_3 = (Button) findViewById(R.id.btn1_3);
        btn1_4 = (Button) findViewById(R.id.btn1_4);
        btn1_5 = (Button) findViewById(R.id.btn1_5);
        btn1_6 = (Button) findViewById(R.id.btn1_6);
        btn1_7 = (Button) findViewById(R.id.btn1_7);
        btn1_8 = (Button) findViewById(R.id.btn1_8);
        btn1_9 = (Button) findViewById(R.id.btn1_9);
        btn1_r = (Button) findViewById(R.id.btn1_r);

        btn2_0 = (Button) findViewById(R.id.btn2_0);
        btn2_1 = (Button) findViewById(R.id.btn2_1);
        btn2_2 = (Button) findViewById(R.id.btn2_2);
        btn2_3 = (Button) findViewById(R.id.btn2_3);
        btn2_4 = (Button) findViewById(R.id.btn2_4);
        btn2_5 = (Button) findViewById(R.id.btn2_5);
        btn2_6 = (Button) findViewById(R.id.btn2_6);
        btn2_7 = (Button) findViewById(R.id.btn2_7);
        btn2_8 = (Button) findViewById(R.id.btn2_8);
        btn2_9 = (Button) findViewById(R.id.btn2_9);
        btn2_r = (Button) findViewById(R.id.btn2_r);

        btn3_0 = (Button) findViewById(R.id.btn3_0);
        btn3_1 = (Button) findViewById(R.id.btn3_1);
        btn3_2 = (Button) findViewById(R.id.btn3_2);
        btn3_3 = (Button) findViewById(R.id.btn3_3);
        btn3_4 = (Button) findViewById(R.id.btn3_4);
        btn3_5 = (Button) findViewById(R.id.btn3_5);
        btn3_6 = (Button) findViewById(R.id.btn3_6);
        btn3_7 = (Button) findViewById(R.id.btn3_7);
        btn3_8 = (Button) findViewById(R.id.btn3_8);
        btn3_9 = (Button) findViewById(R.id.btn3_9);

        btn1_0.setOnClickListener(this);
        btn1_1.setOnClickListener(this);
        btn1_2.setOnClickListener(this);
        btn1_3.setOnClickListener(this);
        btn1_4.setOnClickListener(this);
        btn1_5.setOnClickListener(this);
        btn1_6.setOnClickListener(this);
        btn1_7.setOnClickListener(this);
        btn1_8.setOnClickListener(this);
        btn1_9.setOnClickListener(this);
        btn1_r.setOnClickListener(this);

        btn2_0.setOnClickListener(this);
        btn2_1.setOnClickListener(this);
        btn2_2.setOnClickListener(this);
        btn2_3.setOnClickListener(this);
        btn2_4.setOnClickListener(this);
        btn2_5.setOnClickListener(this);
        btn2_6.setOnClickListener(this);
        btn2_7.setOnClickListener(this);
        btn2_8.setOnClickListener(this);
        btn2_9.setOnClickListener(this);
        btn2_r.setOnClickListener(this);

        btn3_0.setOnClickListener(this);
        btn3_1.setOnClickListener(this);
        btn3_2.setOnClickListener(this);
        btn3_3.setOnClickListener(this);
        btn3_4.setOnClickListener(this);
        btn3_5.setOnClickListener(this);
        btn3_6.setOnClickListener(this);
        btn3_7.setOnClickListener(this);
        btn3_8.setOnClickListener(this);
        btn3_9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn1_0:
                num1 = 0;
            case R.id.btn1_1:
                num1 = 100;
                break;
            case R.id.btn1_2:
                num1 = 200;
                break;
            case R.id.btn1_3:
                num1 = 300;
                break;
            case R.id.btn1_4:
                num1 = 400;
                break;
            case R.id.btn1_5:
                num1 = 500;
                break;
            case R.id.btn1_6:
                num1 = 600;
                break;
            case R.id.btn1_7:
                num1 = 700;
                break;
            case R.id.btn1_8:
                num1 = 800;
                break;
            case R.id.btn1_9:
                num1 = 900;
                break;
            case R.id.btn1_r:
                num1 = 0.01;
                break;

            case R.id.btn2_0:
                num2 = 0;
                break;
            case R.id.btn2_1:
                num2 = 10;
                break;
            case R.id.btn2_2:
                num2 = 20;
                break;
            case R.id.btn2_3:
                num2 = 30;
                break;
            case R.id.btn2_4:
                num2 = 40;
                break;
            case R.id.btn2_5:
                num2 = 50;
                break;
            case R.id.btn2_6:
                num2 = 60;
                break;
            case R.id.btn2_7:
                num2 = 70;
                break;
            case R.id.btn2_8:
                num2 = 80;
                break;
            case R.id.btn2_9:
                num2 = 90;
                break;
            case R.id.btn2_r:
                num2 = 0.1;
                break;

            case R.id.btn3_0:
                num3 = 0;
                num3_1 = 0;
                break;
            case R.id.btn3_1:
                num3 = 1;
                num3_1 = 10;
                break;
            case R.id.btn3_2:
                num3 = 2;
                num3_1 = 100;
                break;
            case R.id.btn3_3:
                num3 = 3;
                num3_1 = 1000;
                break;
            case R.id.btn3_4:
                num3 = 4;
                num3_1 = 10000;
                break;
            case R.id.btn3_5:
                num3 = 5;
                num3_1 = 100000;
                break;
            case R.id.btn3_6:
                num3 = 6;
                num3_1 = 1000000;
                break;
            case R.id.btn3_7:
                num3 = 7;
                num3_1 = 10000000;
                break;
            case R.id.btn3_8:
                num3 = 8;
                num3_1 = 100000000;
                break;
            case R.id.btn3_9:
                num3 = 9;
                num3_1 = 1000000000;
                break;
            default:
                break;


        }

        if (v == btn2_r) {
            sum = (num1 + num3) * 0.1;
        }
        else {
            sum = (num1 + num3) * num3_1;
        }

        tv_result.setText(sum + "");


    }
}
