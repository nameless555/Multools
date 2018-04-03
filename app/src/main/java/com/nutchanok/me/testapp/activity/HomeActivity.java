package com.nutchanok.me.testapp.activity;

import android.content.Intent;
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
import android.widget.ImageButton;
import android.widget.Toast;

import com.nutchanok.me.testapp.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    ImageButton btn_res_color;
    //    Button btn_res_smd;
    ImageButton btn_cap;
    ImageButton btn_law_ohm;
    ImageButton btn_converter;
    ImageButton btn_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initInstances();
    }

    private void initInstances() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn_res_color = (ImageButton) findViewById(R.id.img_btn_res_color);
//        btn_res_smd = (ImageButton) findViewById(R.id.btn_res_smd);
        btn_cap = (ImageButton) findViewById(R.id.img_btn_cap);
        btn_law_ohm = (ImageButton) findViewById(R.id.img_btn_law_ohm);
        btn_converter = (ImageButton) findViewById(R.id.img_btn_converter);
        btn_about = (ImageButton) findViewById(R.id.img_btn_about);

        btn_res_color.setOnClickListener(this);
//        btn_res_smd.setOnClickListener(this);
        btn_cap.setOnClickListener(this);
        btn_law_ohm.setOnClickListener(this);
        btn_converter.setOnClickListener(this);
        btn_about.setOnClickListener(this);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(
                HomeActivity.this, drawerLayout,
                R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
//            Toast.makeText(HomeActivity.this,
//                    "Settings Clicked", Toast.LENGTH_SHORT).show();
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if (v == btn_res_color) {
            Intent res1 = new Intent(getApplicationContext(), MainFragmentTabActivity.class);
            startActivity(res1);
        }
//        if (v == btn_res_smd) {
//            Intent res1 = new Intent(getApplicationContext(), ResSmdActivity.class);
//            startActivity(res1);
//        }

        if (v == btn_law_ohm) {
            Intent law = new Intent(getApplicationContext(), LawsOhmActivity.class);
            startActivity(law);
        }

        if (v == btn_cap) {
            Intent cap = new Intent(getApplicationContext(), CapasisterActivity.class);
            startActivity(cap);
        }

        if (v == btn_converter) {
            Intent cap = new Intent(getApplicationContext(), UnitConverterActivity.class);
            startActivity(cap);
        }

        if (v == btn_about) {
            Intent cap = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(cap);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


}
