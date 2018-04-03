package com.nutchanok.me.testapp.activity;

import android.content.res.Configuration;
import android.os.Parcelable;
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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nutchanok.me.testapp.R;

public class LawsOhmActivity extends AppCompatActivity implements View.OnClickListener {


    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    TextView tv1, tv2;
    EditText et1, et2;
    double sum = 0;
    char sum2;
    double val1 = 0;
    double val2 = 0;
    TextView tv_result1;
    TextView tv_result2;
    int r = 0;


    Button btn_law_v, btn_law_i, btn_law_r, btn_cal;
    ImageView iv_law_ohm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws_ohm);

        initInstances();
    }

    private void initInstances() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv_result1 = (TextView) findViewById(R.id.tv_result1);
        tv_result2 = (TextView) findViewById(R.id.tv_result2);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);


        btn_law_i = (Button) findViewById(R.id.btn_law_i);
        btn_law_v = (Button) findViewById(R.id.btn_law_v);
        btn_law_r = (Button) findViewById(R.id.btn_law_r);
        btn_cal = (Button) findViewById(R.id.btn_cal);

        iv_law_ohm = (ImageView) findViewById(R.id.iv_law_ohm);

        btn_law_i.setOnClickListener(this);
        btn_law_v.setOnClickListener(this);
        btn_law_r.setOnClickListener(this);
        btn_cal.setOnClickListener(this);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(
                LawsOhmActivity.this, drawerLayout,
                R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.btn_law_i:
                iv_law_ohm.setImageResource(R.drawable.laws_ohm_i);
                tv1.setText("v");
                tv2.setText("÷ r");
                r=1;
                break;
            case R.id.btn_law_r:
                iv_law_ohm.setImageResource(R.drawable.laws_ohm_r);
                tv1.setText("v");
                tv2.setText("÷ i");
                r=2;
                break;
            case R.id.btn_law_v:
                iv_law_ohm.setImageResource(R.drawable.laws_ohm_v);
                tv1.setText("i");
                tv2.setText("× r");
                r=3;
                break;
        }
        if (v == btn_cal) {
            try {
                val1 = Double.parseDouble(et1.getText().toString());
            } catch (NumberFormatException e) {
            }
            try {
                val2 = Double.parseDouble(et2.getText().toString());
            } catch (NumberFormatException e) {
            }
            switch (r) {
                case 1:
                    sum = val1 / val2;
                    sum2 = 'A';
                    break;
                case 2:
                    sum = val1 / val2;
                    sum2 = 'Ω';
                    break;
                case 3:
                    sum = val1 * val2;
                    sum2 = 'V';
                    break;
            }
            tv_result1.setText(sum + "");
            tv_result2.setText(sum2 + "");

            Toast.makeText(LawsOhmActivity.this,
                    "Result = " + sum, Toast.LENGTH_SHORT).show();


        }
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
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main2_tab, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
            return true;
//        if (id == R.id.action_settings) {
//            Toast.makeText(LawsOhmActivity.this,
//                    "Settings Clicked", Toast.LENGTH_SHORT).show();
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}
