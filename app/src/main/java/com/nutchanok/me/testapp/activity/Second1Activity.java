package com.nutchanok.me.testapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.nutchanok.me.testapp.R;

public class Second1Activity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    int sum = 0;
    double sum1 = 0;
    TextView tvResult1;
    TextView tvResult2;
    Button btnOk;
    EditText et1;
    TextView tvResult3;
    double cal = 0;
    RadioGroup rgOhm;
    double z = 0;
    int x = 0;
    int y = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);

        initInstances();


    }

    private void initInstances() {
        Intent intent = getIntent();
        sum1 = intent.getDoubleExtra("Result", 0);

        Bundle bundle = intent.getBundleExtra("cBundle");
        x = bundle.getInt("x");
        y = bundle.getInt("y");
        z = bundle.getDouble("z");


        et1 = (EditText) findViewById(R.id.et1);
        tvResult1 = (TextView) findViewById(R.id.tvResult1);
        tvResult2 = (TextView) findViewById(R.id.tv_result2);
        tvResult3 = (TextView) findViewById(R.id.tv_result3);
        btnOk = (Button) findViewById(R.id.btnOk);

        rgOhm = (RadioGroup) findViewById(R.id.rgOhm);

        btnOk.setOnClickListener(this);

        sum = x + y;

        tvResult1.setText("" + sum);

        tvResult2.setText("" + z);


        rgOhm.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.btnOk:
//                Intent returnIntent = new Intent();
//        returnIntent.putExtra("result1", et1.getText().toString());
//                setResult(RESULT_OK, returnIntent);
                finish();
        }

    }

    @Override
    public void finish() {
        super.finish();

//        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        double cal1 = 0;
        double cal2 = 0;
        sum1 = (x + y) * z;
        switch (rgOhm.getCheckedRadioButtonId()) {
            case R.id.rbKOhm:
                cal1 = sum1 / 1000;
                tvResult3.setText(cal1 + "");
                break;
            case R.id.rbMOhm:
                cal2 = sum1 / 1000000;
                tvResult3.setText(cal2 + "");
                break;
            case R.id.rbOhm:
                tvResult3.setText(sum1 + "");
                break;
        }

    }
}
