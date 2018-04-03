package com.nutchanok.me.testapp.activity;

import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import com.nutchanok.me.testapp.R;

public class CapasisterActivity extends AppCompatActivity implements NumberPicker.OnValueChangeListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    Button btn_cal;
    TextView tv_result_pf1, tv_result_pf2, tv_result_pf3, tv_result_pf3_power,
            tv_result_nf1, tv_result_nf2, tv_result_nf3, tv_result_nf3_power,
            tv_result_uf1, tv_result_uf2, tv_result_uf3, tv_result_uf3_power;
    EditText et_cap1, et_cap2, et_cap3;
    NumberPicker np1, np2, np3;
    double sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capasister);
        initInstances();
    }

    private void initInstances() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tv_result_nf1 = (TextView) findViewById(R.id.tv_result_nf1);
        tv_result_nf2 = (TextView) findViewById(R.id.tv_result_nf2);
        tv_result_nf3 = (TextView) findViewById(R.id.tv_result_nf3);
        tv_result_nf3_power = (TextView) findViewById(R.id.tv_result_nf3_power);

        tv_result_pf1 = (TextView) findViewById(R.id.tv_result_pf1);
        tv_result_pf2 = (TextView) findViewById(R.id.tv_result_pf2);
        tv_result_pf3 = (TextView) findViewById(R.id.tv_result_pf3);
        tv_result_pf3_power = (TextView) findViewById(R.id.tv_result_pf3_power);

        tv_result_uf1 = (TextView) findViewById(R.id.tv_result_uf1);
        tv_result_uf2 = (TextView) findViewById(R.id.tv_result_uf2);
        tv_result_uf3 = (TextView) findViewById(R.id.tv_result_uf3);
        tv_result_uf3_power = (TextView) findViewById(R.id.tv_result_uf3_power);

        np1 = (NumberPicker) findViewById(R.id.np1);
        np2 = (NumberPicker) findViewById(R.id.np2);
        np3 = (NumberPicker) findViewById(R.id.np3);

//        et_cap1 = (EditText) findViewById(R.id.et_cap1);
//        et_cap2 = (EditText) findViewById(R.id.et_cap2);
//        et_cap3 = (EditText) findViewById(R.id.et_cap3);

//        btn_cal = (Button) findViewById(R.id.btn_cal);

//        btn_cal.setOnClickListener(this);


        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(
                CapasisterActivity.this, drawerLayout,
                R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        np1.setMinValue(0);
        np1.setMaxValue(9);
        np1.setWrapSelectorWheel(false);
        np1.setOnValueChangedListener(this);

        np2.setMinValue(0);
        np2.setMaxValue(9);
        np2.setWrapSelectorWheel(false);
        np2.setOnValueChangedListener(this);

        np3.setMinValue(0);
        np3.setMaxValue(9);
        np3.setWrapSelectorWheel(false);
        np3.setOnValueChangedListener(this);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.manu_main, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
            return true;
//        if (id == R.id.action_settings) {
//            Toast.makeText(CapasisterActivity.this,
//                    "Settings Clicked", Toast.LENGTH_SHORT).show();
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        int val3_1 = 0;
        int val3_2 = 0;
        int val3_3 = 0;

        switch (picker.getId()) {
            case R.id.np1:
                val1 = Integer.parseInt(String.valueOf(newVal));
                tv_result_pf1.setText(val1 +"");
                tv_result_nf1.setText(val1 +"");
                tv_result_uf1.setText(val1 +"");
                break;
        }
        switch (picker.getId()) {
            case R.id.np2:
                val2 = Integer.parseInt(String.valueOf(newVal));
                tv_result_pf2.setText(val2 +"");
                tv_result_nf2.setText(val2 +"");
                tv_result_uf2.setText(val2 +"");
                break;
        }
        switch (picker.getId()) {
            case R.id.np3:
                val3 = Integer.parseInt(String.valueOf(newVal));
                if (val3 == 0) {
                    val3_1 = 0;
                } else if (val3 == 1) {
                    val3_1 = 1;
                }else if (val3 == 2) {
                    val3_1 = 2;
                }else if (val3 == 3) {
                    val3_1 = 3;
                }else if (val3 == 4) {
                    val3_1 = 4;
                }else if (val3 == 5) {
                    val3_1 = 5;
                }else if (val3 == 6) {
                    val3_1 = 6;
                } else if (val3 == 7) {
                    val3_1 = 7;
                } else if (val3 == 8) {
                    val3_1 = 8;
                } else if (val3 == 9) {
                    val3_1 = 9;
                }

                tv_result_pf3_power.setText(val3_1 +"");

                val3_2 = val3_1 - 3;

                tv_result_nf3_power.setText(val3_2 +"");

                val3_3 = val3_1 - 6;
                tv_result_uf3_power.setText(val3_3 +"");

                break;

        }

    }
}
