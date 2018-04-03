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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.nutchanok.me.testapp.R;

import java.util.ArrayList;

public class UnitConverterActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    private Spinner UnitSpinner;
    private Button btn_enter;
    Object text;
    EditText et1;
    double val = 0;
    double resultexapeta;
    double resultexatera;
    double resultexagiga;
    double resultexamega;
    double resultexakilo;
    double resultexahecto;
    double resultexadeca;
    double resultexadeci;
    double resultexacenti;
    double resultexamilli;
    double resultexamicro;
    double resultexanano;
    double resultexapico;
    double resultexafemto;
    double resultexaatto;

    double resultpetaexa;
    double resultpetatera;
    double resultpetagiga;
    double resultpetamega;
    double resultpetakilo;
    double resultpetahecto;
    double resultpetadeca;
    double resultpetadeci;
    double resultpetacenti;
    double resultpetamilli;
    double resultpetamicro;
    double resultpetanano;
    double resultpetapico;
    double resultpetafemto;
    double resultpetaatto;

    double resultteraexa;
    double resultterapeta;
    double resultteragiga;
    double resultteramega;
    double resultterakilo;
    double resultterahecto;
    double resultteradeca;
    double resultteradeci;
    double resultteracenti;
    double resultteramilli;
    double resultteramicro;
    double resultteranano;
    double resultterapico;
    double resultterafemto;
    double resultteraatto;

    double resultgigaexa;
    double resultgigapeta;
    double resultgigatera;
    double resultgigamega;
    double resultgigakilo;
    double resultgigahecto;
    double resultgigadeca;
    double resultgigadeci;
    double resultgigacenti;
    double resultgigamilli;
    double resultgigamicro;
    double resultgiganano;
    double resultgigapico;
    double resultgigafemto;
    double resultgigaatto;

    double resultmegaexa;
    double resultmegapeta;
    double resultmegatera;
    double resultmegagiga;
    double resultmegakilo;
    double resultmegahecto;
    double resultmegadeca;
    double resultmegadeci;
    double resultmegacenti;
    double resultmegamilli;
    double resultmegamicro;
    double resultmeganano;
    double resultmegapico;
    double resultmegafemto;
    double resultmegaatto;


    double resultkiloexa;
    double resultkilopeta;
    double resultkilotera;
    double resultkilogiga;
    double resultkilomega;
    double resultkilohecto;
    double resultkilodeca;
    double resultkilodeci;
    double resultkilocenti;
    double resultkilomilli;
    double resultkilomicro;
    double resultkilonano;
    double resultkilopico;
    double resultkilofemto;
    double resultkiloatto;


    double resulthectoexa;
    double resulthectopeta;
    double resulthectotera;
    double resulthectogiga;
    double resulthectomega;
    double resulthectokilo;
    double resulthectodeca;
    double resulthectodeci;
    double resulthectocenti;
    double resulthectomilli;
    double resulthectomicro;
    double resulthectonano;
    double resulthectopico;
    double resulthectofemto;
    double resulthectoatto;


    double resultdecaexa;
    double resultdecapeta;
    double resultdecatera;
    double resultdecagiga;
    double resultdecamega;
    double resultdecakilo;
    double resultdecahecto;
    double resultdecadeci;
    double resultdecacenti;
    double resultdecamilli;
    double resultdecamicro;
    double resultdecanano;
    double resultdecapico;
    double resultdecafemto;
    double resultdecaatto;


    double resultdeciexa;
    double resultdecipeta;
    double resultdecitera;
    double resultdecigiga;
    double resultdecimega;
    double resultdecikilo;
    double resultdecihecto;
    double resultdecideca;
    double resultdecicenti;
    double resultdecimilli;
    double resultdecimicro;
    double resultdecinano;
    double resultdecipico;
    double resultdecifemto;
    double resultdeciatto;


    double resultcentiexa;
    double resultcentipeta;
    double resultcentitera;
    double resultcentigiga;
    double resultcentimega;
    double resultcentikilo;
    double resultcentihecto;
    double resultcentideca;
    double resultcentideci;
    double resultcentimilli;
    double resultcentimicro;
    double resultcentinano;
    double resultcentipico;
    double resultcentifemto;
    double resultcentiatto;


    double resultmilliexa;
    double resultmillipeta;
    double resultmillitera;
    double resultmilligiga;
    double resultmillimega;
    double resultmillikilo;
    double resultmillihecto;
    double resultmillideca;
    double resultmillideci;
    double resultmillicenti;
    double resultmillimicro;
    double resultmillinano;
    double resultmillipico;
    double resultmillifemto;
    double resultmilliatto;

    double resultmicroexa;
    double resultmicropeta;
    double resultmicrotera;
    double resultmicrogiga;
    double resultmicromega;
    double resultmicrokilo;
    double resultmicrohecto;
    double resultmicrodeca;
    double resultmicrodeci;
    double resultmicrocenti;
    double resultmicromilli;
    double resultmicronano;
    double resultmicropico;
    double resultmicrofemto;
    double resultmicroatto;


    double resultnanoexa;
    double resultnanopeta;
    double resultnanotera;
    double resultnanogiga;
    double resultnanomega;
    double resultnanokilo;
    double resultnanohecto;
    double resultnanodeca;
    double resultnanodeci;
    double resultnanocenti;
    double resultnanomilli;
    double resultnanomicro;
    double resultnanopico;
    double resultnanofemto;
    double resultnanoatto;


    double resultpicoexa;
    double resultpicopeta;
    double resultpicotera;
    double resultpicogiga;
    double resultpicomega;
    double resultpicokilo;
    double resultpicohecto;
    double resultpicodeca;
    double resultpicodeci;
    double resultpicocenti;
    double resultpicomilli;
    double resultpicomicro;
    double resultpiconano;
    double resultpicofemto;
    double resultpicoatto;


    double resultfemtoexa;
    double resultfemtopeta;
    double resultfemtotera;
    double resultfemtogiga;
    double resultfemtomega;
    double resultfemtokilo;
    double resultfemtohecto;
    double resultfemtodeca;
    double resultfemtodeci;
    double resultfemtocenti;
    double resultfemtomilli;
    double resultfemtomicro;
    double resultfemtopico;
    double resultfemtonano;
    double resultfemtoatto;


    double resultattoexa;
    double resultattopeta;
    double resultattotera;
    double resultattogiga;
    double resultattomega;
    double resultattokilo;
    double resultattohecto;
    double resultattodeca;
    double resultattodeci;
    double resultattocenti;
    double resultattomilli;
    double resultattomicro;
    double resultattopico;
    double resultattonano;
    double resultattofemto;

    private ArrayList<String> SIunit = new ArrayList<String>();

    TextView tv_exa, tv_peta, tv_tera, tv_giga, tv_mega, tv_kilo,
            tv_hecto, tv_deca, tv_deci, tv_centi, tv_milli, tv_micro,
            tv_nano, tv_pico, tv_femto, tv_atto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);
        initInstances();
    }

    private void initInstances() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(
                UnitConverterActivity.this, drawerLayout,
                R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        et1 = (EditText) findViewById(R.id.et1);
        tv_exa = (TextView) findViewById(R.id.tv_exa);
        tv_peta = (TextView) findViewById(R.id.tv_peta);
        tv_tera = (TextView) findViewById(R.id.tv_tera);
        tv_giga = (TextView) findViewById(R.id.tv_giga);
        tv_mega = (TextView) findViewById(R.id.tv_mega);
        tv_kilo = (TextView) findViewById(R.id.tv_kilo);
        tv_hecto = (TextView) findViewById(R.id.tv_hecto);
        tv_deca = (TextView) findViewById(R.id.tv_deca);
        tv_deci = (TextView) findViewById(R.id.tv_deci);
        tv_centi = (TextView) findViewById(R.id.tv_centi);
        tv_milli = (TextView) findViewById(R.id.tv_milli);
        tv_micro = (TextView) findViewById(R.id.tv_micro);
        tv_nano = (TextView) findViewById(R.id.tv_nano);
        tv_pico = (TextView) findViewById(R.id.tv_pico);
        tv_femto = (TextView) findViewById(R.id.tv_femto);
        tv_atto = (TextView) findViewById(R.id.tv_atto);

        UnitSpinner = (Spinner) findViewById(R.id.spunit);
        createsiunit();

        ArrayAdapter<String> adapterUnit = new ArrayAdapter<String>
                (this, android.R.layout.simple_dropdown_item_1line, SIunit);
        UnitSpinner.setAdapter(adapterUnit);
        addListenerOnSpinnerItemSelection();
        addListenerOnButton();

    }


    public void addListenerOnSpinnerItemSelection() {
        UnitSpinner = (Spinner) findViewById(R.id.spunit);
    }

    private void addListenerOnButton() {
        UnitSpinner = (Spinner) findViewById(R.id.spunit);
        btn_enter = (Button) findViewById(R.id.btn_enter);
        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = Integer.parseInt(et1.getText().toString());
                text = UnitSpinner.getSelectedItem();

                if (text == "exa") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultexapeta = val * 1000;
                    resultexatera = val * 100000 * 10;
                    resultexagiga = val * 100000 * 10000;
                    resultexamega = val * 100000 * 100000 * 100;
                    resultexakilo = val * 100000 * 100000 * 100000;
                    resultexahecto = val * 100000 * 100000 * 100000 * 10;
                    resultexadeca = val * 100000 * 100000 * 100000 * 100;
                    resultexadeci = val * 100000 * 100000 * 100000 * 10000;
                    resultexacenti = val * 100000 * 100000 * 100000 * 100000;
                    resultexamilli = val * 100000 * 100000 * 100000 * 100000 * 10;
                    resultexamicro = val * 100000 * 100000 * 100000 * 100000 * 1000;
                    resultexanano = val * 100000 * 100000 * 100000 * 100000 * 100000 * 100;
                    resultexapico = val * 100000 * 100000 * 100000 * 100000 * 100000 * 100000;
                    resultexafemto = val * 100000 * 100000 * 100000 * 100000 * 100000 * 100000 * 1000;
                    resultexaatto = val * 100000 * 100000 * 100000 * 100000 * 100000 * 100000 * 100000 * 10;
                    tv_exa.setText(val + "");
                    tv_peta.setText(resultexapeta + "");
                    tv_tera.setText(resultexatera + "");
                    tv_giga.setText(resultexagiga + "");
                    tv_mega.setText(resultexamega + "");
                    tv_kilo.setText(resultexakilo + "");
                    tv_hecto.setText(resultexahecto + "");
                    tv_deca.setText(resultexadeca + "");
                    tv_deci.setText(resultexadeci + "");
                    tv_centi.setText(resultexacenti + "");
                    tv_milli.setText(resultexamilli + "");
                    tv_micro.setText(resultexamicro + "");
                    tv_nano.setText(resultexanano + "");
                    tv_pico.setText(resultexapico + "");
                    tv_femto.setText(resultexafemto + "");
                    tv_atto.setText(resultexaatto + "");
                } else if (text == "peta") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultpetaexa = val * 0.001;
                    resultpetatera = val * 1000;
                    resultpetagiga = val * 100000 * 10;
                    resultpetamega = val * 100000 * 10000;
                    resultpetakilo = val * 100000 * 100000 * 100;
                    resultpetahecto = val * 100000 * 100000 * 1000;
                    resultpetadeca = val * 100000 * 100000 * 10000;
                    resultpetadeci = val * 100000 * 100000 * 10000 * 10;
                    resultpetacenti = val * 100000 * 100000 * 100000 * 100;
                    resultpetamilli = val * 100000 * 100000 * 100000 * 1000;
                    resultpetamicro = val * 100000 * 100000 * 100000 * 100000 * 10;
                    resultpetanano = val * 100000 * 100000 * 100000 * 100000 * 10000;
                    resultpetapico = val * 100000 * 100000 * 100000 * 100000 * 100000 * 100;
                    resultpetafemto = val * 100000 * 100000 * 100000 * 100000 * 100000 * 100000;
                    resultpetaatto = val * 100000 * 100000 * 100000 * 100000 * 100000 * 100000 * 1000;

                    tv_exa.setText(resultpetaexa + "");
                    tv_peta.setText(val + "");
                    tv_tera.setText(resultpetatera + "");
                    tv_giga.setText(resultpetagiga + "");
                    tv_mega.setText(resultpetamega + "");
                    tv_kilo.setText(resultpetakilo + "");
                    tv_hecto.setText(resultpetahecto + "");
                    tv_deca.setText(resultpetadeca + "");
                    tv_deci.setText(resultpetadeci + "");
                    tv_centi.setText(resultpetacenti + "");
                    tv_milli.setText(resultpetamilli + "");
                    tv_micro.setText(resultpetamicro + "");
                    tv_nano.setText(resultpetanano + "");
                    tv_pico.setText(resultpetapico + "");
                    tv_femto.setText(resultpetafemto + "");
                    tv_atto.setText(resultpetaatto + "");
                } else if (text == "tera") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultteraexa = val * 0.000001;
                    resultterapeta = val * 0.001;
                    resultteragiga = val * 1000;
                    resultteramega = val * 100000 * 10;
                    resultterakilo = val * 100000 * 10000;
                    resultterahecto = val * 100000 * 100000;
                    resultteradeca = val * 100000 * 100000 * 10;
                    resultteradeci = val * 100000 * 100000 * 1000;
                    resultteracenti = val * 100000 * 100000 * 10000;
                    resultteramilli = val * 100000 * 100000 * 100000;
                    resultteramicro = val * 100000 * 100000 * 100000 * 1000;
                    resultteranano = val * 100000 * 100000 * 100000 * 100000 * 10;
                    resultterapico = val * 100000 * 100000 * 100000 * 100000 * 10000;
                    resultterafemto = val * 100000 * 100000 * 100000 * 100000 * 100000 * 100;
                    resultteraatto = val * 100000 * 100000 * 100000 * 100000 * 100000 * 100000;

                    tv_exa.setText(resultteraexa + "");
                    tv_peta.setText(resultterapeta + "");
                    tv_tera.setText(val + "");
                    tv_giga.setText(resultteragiga + "");
                    tv_mega.setText(resultteramega + "");
                    tv_kilo.setText(resultterakilo + "");
                    tv_hecto.setText(resultterahecto + "");
                    tv_deca.setText(resultteradeca + "");
                    tv_deci.setText(resultteradeci + "");
                    tv_centi.setText(resultteracenti + "");
                    tv_milli.setText(resultteramilli + "");
                    tv_micro.setText(resultteramicro + "");
                    tv_nano.setText(resultteranano + "");
                    tv_pico.setText(resultterapico + "");
                    tv_femto.setText(resultterafemto + "");
                    tv_atto.setText(resultteraatto + "");
                } else if (text == "giga") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultgigaexa = val * 0.000000001;
                    resultgigapeta = val * 0.000001;
                    resultgigatera = val * 0.001;
                    resultgigamega = val * 1000;
                    resultgigakilo = val * 100000 * 10;
                    resultgigahecto = val * 100000 * 100;
                    resultgigadeca = val * 100000 * 1000;
                    resultgigadeci = val * 100000 * 100000;
                    resultgigacenti = val * 100000 * 100000 * 10;
                    resultgigamilli = val * 100000 * 100000 * 100;
                    resultgigamicro = val * 100000 * 100000 * 100000;
                    resultgiganano = val * 100000 * 100000 * 100000 * 1000;
                    resultgigapico = val * 100000 * 100000 * 100000 * 100000 * 10;
                    resultgigafemto = val * 100000 * 100000 * 100000 * 100000 * 10000;
                    resultgigaatto = val * 100000 * 100000 * 100000 * 100000 * 100000 * 100;

                    tv_exa.setText(resultgigaexa + "");
                    tv_peta.setText(resultgigapeta + "");
                    tv_tera.setText(resultgigatera + "");
                    tv_giga.setText(val + "");
                    tv_mega.setText(resultgigamega + "");
                    tv_kilo.setText(resultgigakilo + "");
                    tv_hecto.setText(resultgigahecto + "");
                    tv_deca.setText(resultgigadeca + "");
                    tv_deci.setText(resultgigadeci + "");
                    tv_centi.setText(resultgigacenti + "");
                    tv_milli.setText(resultgigamilli + "");
                    tv_micro.setText(resultgigamicro + "");
                    tv_nano.setText(resultgiganano + "");
                    tv_pico.setText(resultgigapico + "");
                    tv_femto.setText(resultgigafemto + "");
                    tv_atto.setText(resultgigaatto + "");
                } else if (text == "mega") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultmegaexa = val * 0.000000000001;
                    resultmegapeta = val * 0.000000001;
                    resultmegatera = val * 0.000001;
                    resultmegagiga = val * 0.001;
                    resultmegakilo = val * 1000;
                    resultmegahecto = val * 10000;
                    resultmegadeca = val * 100000;
                    resultmegadeci = val * 100000 * 100;
                    resultmegacenti = val * 100000 * 1000;
                    resultmegamilli = val * 100000 * 10000;
                    resultmegamicro = val * 100000 * 100000 * 100;
                    resultmeganano = val * 100000 * 100000 * 100000;
                    resultmegapico = val * 100000 * 100000 * 100000 * 1000;
                    resultmegafemto = val * 100000 * 100000 * 100000 * 100000 * 10;
                    resultmegaatto = val * 100000 * 100000 * 100000 * 100000 * 10000;

                    tv_exa.setText(resultmegaexa + "");
                    tv_peta.setText(resultmegapeta + "");
                    tv_tera.setText(resultmegatera + "");
                    tv_giga.setText(resultmegagiga + "");
                    tv_mega.setText(val + "");
                    tv_kilo.setText(resultmegakilo + "");
                    tv_hecto.setText(resultmegahecto + "");
                    tv_deca.setText(resultmegadeca + "");
                    tv_deci.setText(resultmegadeci + "");
                    tv_centi.setText(resultmegacenti + "");
                    tv_milli.setText(resultmegamilli + "");
                    tv_micro.setText(resultmegamicro + "");
                    tv_nano.setText(resultmeganano + "");
                    tv_pico.setText(resultmegapico + "");
                    tv_femto.setText(resultmegafemto + "");
                    tv_atto.setText(resultmegaatto + "");
                } else if (text == "kilo") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultkiloexa = val * 0.000000000000001;
                    resultkilopeta = val * 0.000000000001;
                    resultkilotera = val * 0.000000001;
                    resultkilogiga = val * 0.000001;
                    resultkilomega = val * 0.001;
                    resultkilohecto = val * 10;
                    resultkilodeca = val * 100;
                    resultkilodeci = val * 10000;
                    resultkilocenti = val * 100000;
                    resultkilomilli = val * 100000 * 10;
                    resultkilomicro = val * 100000 * 10000;
                    resultkilonano = val * 100000 * 100000 * 100;
                    resultkilopico = val * 100000 * 100000 * 100000;
                    resultkilofemto = val * 100000 * 100000 * 100000 * 1000;
                    resultkiloatto = val * 100000 * 100000 * 100000 * 100000 * 10;

                    tv_exa.setText(resultkiloexa + "");
                    tv_peta.setText(resultkilopeta + "");
                    tv_tera.setText(resultkilotera + "");
                    tv_giga.setText(resultkilogiga + "");
                    tv_mega.setText(resultkilomega + "");
                    tv_kilo.setText(val + "");
                    tv_hecto.setText(resultkilohecto + "");
                    tv_deca.setText(resultkilodeca + "");
                    tv_deci.setText(resultkilodeci + "");
                    tv_centi.setText(resultkilocenti + "");
                    tv_milli.setText(resultkilomilli + "");
                    tv_micro.setText(resultkilomicro + "");
                    tv_nano.setText(resultkilonano + "");
                    tv_pico.setText(resultkilopico + "");
                    tv_femto.setText(resultkilofemto + "");
                    tv_atto.setText(resultkiloatto + "");
                } else if (text == "hecto") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resulthectoexa = val * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resulthectopeta = val * 0.00001 * 0.00001 * 0.001;
                    resulthectotera = val * 0.00001 * 0.00001;
                    resulthectogiga = val * 0.00001 * 0.01;
                    resulthectomega = val * 0.0001;
                    resulthectokilo = val * 0.1;
                    resulthectodeca = val * 10;
                    resulthectodeci = val * 1000;
                    resulthectocenti = val * 10000;
                    resulthectomilli = val * 100000;
                    resulthectomicro = val * 100000 * 1000;
                    resulthectonano = val * 100000 * 100000 * 10;
                    resulthectopico = val * 100000 * 100000 * 10000;
                    resulthectofemto = val * 100000 * 100000 * 100000 * 100;
                    resulthectoatto = val * 100000 * 100000 * 100000 * 100000;

                    tv_exa.setText(resulthectoexa + "");
                    tv_peta.setText(resulthectopeta + "");
                    tv_tera.setText(resulthectotera + "");
                    tv_giga.setText(resulthectogiga + "");
                    tv_mega.setText(resulthectomega + "");
                    tv_kilo.setText(resulthectokilo + "");
                    tv_hecto.setText(val + "");
                    tv_deca.setText(resulthectodeca + "");
                    tv_deci.setText(resulthectodeci + "");
                    tv_centi.setText(resulthectocenti + "");
                    tv_milli.setText(resulthectomilli + "");
                    tv_micro.setText(resulthectomicro + "");
                    tv_nano.setText(resulthectonano + "");
                    tv_pico.setText(resulthectopico + "");
                    tv_femto.setText(resulthectofemto + "");
                    tv_atto.setText(resulthectoatto + "");
                } else if (text == "deca") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultdecaexa = val * 0.00001 * 0.00001 * 0.00001 * 0.01;
                    resultdecapeta = val * 0.00001 * 0.00001 * 0.0001;
                    resultdecatera = val * 0.00001 * 0.00001 * 0.1;
                    resultdecagiga = val * 0.00001 * 0.001;
                    resultdecamega = val * 0.00001;
                    resultdecakilo = val * 0.01;
                    resultdecahecto = val * 0.1;
                    resultdecadeci = val * 100;
                    resultdecacenti = val * 1000;
                    resultdecamilli = val * 10000;
                    resultdecamicro = val * 100000 * 100;
                    resultdecanano = val * 100000 * 100000;
                    resultdecapico = val * 100000 * 100000 * 1000;
                    resultdecafemto = val * 100000 * 100000 * 100000 * 10;
                    resultdecaatto = val * 100000 * 100000 * 100000 * 10000;

                    tv_exa.setText(resultdecaexa + "");
                    tv_peta.setText(resultdecapeta + "");
                    tv_tera.setText(resultdecatera + "");
                    tv_giga.setText(resultdecagiga + "");
                    tv_mega.setText(resultdecamega + "");
                    tv_kilo.setText(resultdecakilo + "");
                    tv_hecto.setText(resultdecahecto + "");
                    tv_deca.setText(val + "");
                    tv_deci.setText(resultdecadeci + "");
                    tv_centi.setText(resultdecacenti + "");
                    tv_milli.setText(resultdecamilli + "");
                    tv_micro.setText(resultdecamicro + "");
                    tv_nano.setText(resultdecanano + "");
                    tv_pico.setText(resultdecapico + "");
                    tv_femto.setText(resultdecafemto + "");
                    tv_atto.setText(resultdecaatto + "");
                } else if (text == "deci") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultdeciexa = val * 0.00001 * 0.00001 * 0.00001 * 0.0001;
                    resultdecipeta = val * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resultdecitera = val * 0.00001 * 0.00001 * 0.001;
                    resultdecigiga = val * 0.00001 * 0.00001;
                    resultdecimega = val * 0.00001 * 0.01;
                    resultdecikilo = val * 0.0001;
                    resultdecihecto = val * 0.001;
                    resultdecideca = val * 0.01;
                    resultdecicenti = val * 10;
                    resultdecimilli = val * 100;
                    resultdecimicro = val * 100000;
                    resultdecinano = val * 100000 * 1000;
                    resultdecipico = val * 100000 * 100000 * 10;
                    resultdecifemto = val * 100000 * 100000 * 10000;
                    resultdeciatto = val * 100000 * 100000 * 100000 * 100;

                    tv_exa.setText(resultdeciexa + "");
                    tv_peta.setText(resultdecipeta + "");
                    tv_tera.setText(resultdecitera + "");
                    tv_giga.setText(resultdecigiga + "");
                    tv_mega.setText(resultdecimega + "");
                    tv_kilo.setText(resultdecikilo + "");
                    tv_hecto.setText(resultdecihecto + "");
                    tv_deca.setText(resultdecideca + "");
                    tv_deci.setText(val + "");
                    tv_centi.setText(resultdecicenti + "");
                    tv_milli.setText(resultdecimilli + "");
                    tv_micro.setText(resultdecimicro + "");
                    tv_nano.setText(resultdecinano + "");
                    tv_pico.setText(resultdecipico + "");
                    tv_femto.setText(resultdecifemto + "");
                    tv_atto.setText(resultdeciatto + "");
                } else if (text == "centi") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultcentiexa = val * 0.00001 * 0.00001 * 0.00001 * 0.00001;
                    resultcentipeta = val * 0.00001 * 0.00001 * 0.00001 * 0.01;
                    resultcentitera = val * 0.00001 * 0.00001 * 0.0001;
                    resultcentigiga = val * 0.00001 * 0.00001 * 0.1;
                    resultcentimega = val * 0.00001 * 0.001;
                    resultcentikilo = val * 0.00001;
                    resultcentihecto = val * 0.0001;
                    resultcentideca = val * 0.001;
                    resultcentideci = val * 0.1;
                    resultcentimilli = val * 10;
                    resultcentimicro = val * 10000;
                    resultcentinano = val * 100000 * 100;
                    resultcentipico = val * 100000 * 100000;
                    resultcentifemto = val * 100000 * 100000 * 1000;
                    resultcentiatto = val * 100000 * 100000 * 100000 * 10;

                    tv_exa.setText(resultcentiexa + "");
                    tv_peta.setText(resultcentipeta + "");
                    tv_tera.setText(resultcentitera + "");
                    tv_giga.setText(resultcentigiga + "");
                    tv_mega.setText(resultcentimega + "");
                    tv_kilo.setText(resultcentikilo + "");
                    tv_hecto.setText(resultcentihecto + "");
                    tv_deca.setText(resultcentideca + "");
                    tv_deci.setText(resultcentideci + "");
                    tv_centi.setText(val + "");
                    tv_milli.setText(resultcentimilli + "");
                    tv_micro.setText(resultcentimicro + "");
                    tv_nano.setText(resultcentinano + "");
                    tv_pico.setText(resultcentipico + "");
                    tv_femto.setText(resultcentifemto + "");
                    tv_atto.setText(resultcentiatto + "");
                } else if (text == "milli") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultmilliexa = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resultmillipeta = val * 0.00001 * 0.00001 * 0.00001 * 0.001;
                    resultmillitera = val * 0.00001 * 0.00001 * 0.00001;
                    resultmilligiga = val * 0.00001 * 0.00001 * 0.01;
                    resultmillimega = val * 0.00001 * 0.0001;
                    resultmillikilo = val * 0.00001 * 0.1;
                    resultmillihecto = val * 0.00001;
                    resultmillideca = val * 0.0001;
                    resultmillideci = val * 0.01;
                    resultmillicenti = val * 0.1;
                    resultmillimicro = val * 1000;
                    resultmillinano = val * 100000 * 10;
                    resultmillipico = val * 100000 * 10000;
                    resultmillifemto = val * 100000 * 100000 * 100;
                    resultmilliatto = val * 100000 * 100000 * 100000;

                    tv_exa.setText(resultmilliexa + "");
                    tv_peta.setText(resultmillipeta + "");
                    tv_tera.setText(resultmillitera + "");
                    tv_giga.setText(resultmilligiga + "");
                    tv_mega.setText(resultmillimega + "");
                    tv_kilo.setText(resultmillikilo + "");
                    tv_hecto.setText(resultmillihecto + "");
                    tv_deca.setText(resultmillideca + "");
                    tv_deci.setText(resultmillideci + "");
                    tv_centi.setText(resultmillicenti + "");
                    tv_milli.setText(val + "");
                    tv_micro.setText(resultmillimicro + "");
                    tv_nano.setText(resultmillinano + "");
                    tv_pico.setText(resultmillipico + "");
                    tv_femto.setText(resultmillifemto + "");
                    tv_atto.setText(resultmilliatto + "");
                } else if (text == "micro") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultmicroexa = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.0001;
                    resultmicropeta = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resultmicrotera = val * 0.00001 * 0.00001 * 0.00001 * 0.001;
                    resultmicrogiga = val * 0.00001 * 0.00001 * 0.00001;
                    resultmicromega = val * 0.00001 * 0.00001 * 0.01;
                    resultmicrokilo = val * 0.00001 * 0.0001;
                    resultmicrohecto = val * 0.00001 * 0.001;
                    resultmicrodeca = val * 0.00001 * 0.01;
                    resultmicrodeci = val * 0.00001;
                    resultmicrocenti = val * 0.0001;
                    resultmicromilli = val * 0.001;
                    resultmicronano = val * 1000;
                    resultmicropico = val * 100000 * 10;
                    resultmicrofemto = val * 100000 * 10000;
                    resultmicroatto = val * 100000 * 100000 * 100;

                    tv_exa.setText(resultmicroexa + "");
                    tv_peta.setText(resultmicropeta + "");
                    tv_tera.setText(resultmicrotera + "");
                    tv_giga.setText(resultmicrogiga + "");
                    tv_mega.setText(resultmicromega + "");
                    tv_kilo.setText(resultmicrokilo + "");
                    tv_hecto.setText(resultmicrohecto + "");
                    tv_deca.setText(resultmicrodeca + "");
                    tv_deci.setText(resultmicrodeci + "");
                    tv_centi.setText(resultmicrocenti + "");
                    tv_milli.setText(resultmicromilli + "");
                    tv_micro.setText(val + "");
                    tv_nano.setText(resultmicronano + "");
                    tv_pico.setText(resultmicropico + "");
                    tv_femto.setText(resultmicrofemto + "");
                    tv_atto.setText(resultmicroatto + "");
                } else if (text == "nano") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultnanoexa = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.01;
                    resultnanopeta = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.0001;
                    resultnanotera = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resultnanogiga = val * 0.00001 * 0.00001 * 0.00001 * 0.001;
                    resultnanomega = val * 0.00001 * 0.00001 * 0.00001;
                    resultnanokilo = val * 0.00001 * 0.00001 * 0.01;
                    resultnanohecto = val * 0.00001 * 0.00001 * 0.1;
                    resultnanodeca = val * 0.00001 * 0.00001;
                    resultnanodeci = val * 0.00001 * 0.001;
                    resultnanocenti = val * 0.00001 * 0.01;
                    resultnanomilli = val * 0.00001 * 0.1;
                    resultnanomicro = val * 0.001;
                    resultnanopico = val * 1000;
                    resultnanofemto = val * 100000 * 10;
                    resultnanoatto = val * 100000 * 10000;

                    tv_exa.setText(resultnanoexa + "");
                    tv_peta.setText(resultnanopeta + "");
                    tv_tera.setText(resultnanotera + "");
                    tv_giga.setText(resultnanogiga + "");
                    tv_mega.setText(resultnanomega + "");
                    tv_kilo.setText(resultnanokilo + "");
                    tv_hecto.setText(resultnanohecto + "");
                    tv_deca.setText(resultnanodeca + "");
                    tv_deci.setText(resultnanodeci + "");
                    tv_centi.setText(resultnanocenti + "");
                    tv_milli.setText(resultnanomilli + "");
                    tv_micro.setText(resultnanomicro + "");
                    tv_nano.setText(val + "");
                    tv_pico.setText(resultnanopico + "");
                    tv_femto.setText(resultnanofemto + "");
                    tv_atto.setText(resultnanoatto + "");
                } else if (text == "pico") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultpicoexa = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001;
                    resultpicopeta = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.01;
                    resultpicotera = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.0001;
                    resultpicogiga = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resultpicomega = val * 0.00001 * 0.00001 * 0.00001 * 0.001;
                    resultpicokilo = val * 0.00001 * 0.00001 * 0.00001;
                    resultpicohecto = val * 0.00001 * 0.00001 * 0.0001;
                    resultpicodeca = val * 0.00001 * 0.00001 * 0.001;
                    resultpicodeci = val * 0.00001 * 0.00001 * 0.1;
                    resultpicocenti = val * 0.00001 * 0.00001;
                    resultpicomilli = val * 0.00001 * 0.0001;
                    resultpicomicro = val * 0.00001 * 0.1;
                    resultpiconano = val * 0.001;
                    resultpicofemto = val * 1000;
                    resultpicoatto = val * 100000;

                    tv_exa.setText(resultpicoexa + "");
                    tv_peta.setText(resultpicopeta + "");
                    tv_tera.setText(resultpicotera + "");
                    tv_giga.setText(resultpicogiga + "");
                    tv_mega.setText(resultpicomega + "");
                    tv_kilo.setText(resultpicokilo + "");
                    tv_hecto.setText(resultpicohecto + "");
                    tv_deca.setText(resultpicodeca + "");
                    tv_deci.setText(resultpicodeci + "");
                    tv_centi.setText(resultpicocenti + "");
                    tv_milli.setText(resultpicomilli + "");
                    tv_micro.setText(resultpicomicro + "");
                    tv_nano.setText(resultpiconano + "");
                    tv_pico.setText(val + "");
                    tv_femto.setText(resultpicofemto + "");
                    tv_atto.setText(resultpicoatto + "");
                } else if (text == "femto") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultfemtoexa = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.001;
                    resultfemtopeta = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001;
                    resultfemtotera = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.01;
                    resultfemtogiga = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.0001;
                    resultfemtomega = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resultfemtokilo = val * 0.00001 * 0.00001 * 0.00001 * 0.001;
                    resultfemtohecto = val * 0.00001 * 0.00001 * 0.00001 * 0.01;
                    resultfemtodeca = val * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resultfemtodeci = val * 0.00001 * 0.00001 * 0.0001;
                    resultfemtocenti = val * 0.00001 * 0.00001 * 0.001;
                    resultfemtomilli = val * 0.00001 * 0.00001 * 0.01;
                    resultfemtomicro = val * 0.00001 * 0.0001;
                    resultfemtonano = val * 0.00001 * 0.1;
                    resultfemtopico = val * 0.001;
                    resultfemtoatto = val * 1000;

                    tv_exa.setText(resultfemtoexa + "");
                    tv_peta.setText(resultfemtopeta + "");
                    tv_tera.setText(resultfemtotera + "");
                    tv_giga.setText(resultfemtogiga + "");
                    tv_mega.setText(resultfemtomega + "");
                    tv_kilo.setText(resultfemtokilo + "");
                    tv_hecto.setText(resultfemtohecto + "");
                    tv_deca.setText(resultfemtodeca + "");
                    tv_deci.setText(resultfemtodeci + "");
                    tv_centi.setText(resultfemtocenti + "");
                    tv_milli.setText(resultfemtomilli + "");
                    tv_micro.setText(resultfemtomicro + "");
                    tv_nano.setText(resultfemtonano + "");
                    tv_pico.setText(resultfemtopico + "");
                    tv_femto.setText(val + "");
                    tv_atto.setText(resultfemtoatto + "");
                } else if (text == "atto") {
                    Toast.makeText(UnitConverterActivity.this, "On Button:" + "\n"
                                    + String.valueOf(UnitSpinner.getSelectedItem()),
                            Toast.LENGTH_LONG).show();
                    resultattoexa = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resultattopeta = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.001;
                    resultattotera = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001;
                    resultattogiga = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.01;
                    resultattomega = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.0001;
                    resultattokilo = val * 0.00001 * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resultattohecto = val * 0.00001 * 0.00001 * 0.00001 * 0.00001;
                    resultattodeca = val * 0.00001 * 0.00001 * 0.00001 * 0.0001;
                    resultattodeci = val * 0.00001 * 0.00001 * 0.00001 * 0.01;
                    resultattocenti = val * 0.00001 * 0.00001 * 0.00001 * 0.1;
                    resultattomilli = val * 0.00001 * 0.00001 * 0.00001;
                    resultattomicro = val * 0.00001 * 0.00001 * 0.01;
                    resultattonano = val * 0.00001 * 0.0001;
                    resultattopico = val * 0.00001 * 0.1;
                    resultattofemto = val * 0.001;

                    tv_exa.setText(resultattoexa + "");
                    tv_peta.setText(resultattopeta + "");
                    tv_tera.setText(resultattotera + "");
                    tv_giga.setText(resultattogiga + "");
                    tv_mega.setText(resultattomega + "");
                    tv_kilo.setText(resultattokilo + "");
                    tv_hecto.setText(resultattohecto + "");
                    tv_deca.setText(resultattodeca + "");
                    tv_deci.setText(resultattodeci + "");
                    tv_centi.setText(resultattocenti + "");
                    tv_milli.setText(resultattomilli + "");
                    tv_micro.setText(resultattomicro + "");
                    tv_nano.setText(resultattonano + "");
                    tv_pico.setText(resultattopico + "");
                    tv_femto.setText(resultattofemto + "");
                    tv_atto.setText(val + "");
                } else {
                }


            }
        });
    }


    private void createsiunit() {
        SIunit.add("exa");
        SIunit.add("peta");
        SIunit.add("tera");
        SIunit.add("giga");
        SIunit.add("mega");
        SIunit.add("kilo");
        SIunit.add("hecto");
        SIunit.add("deca");
        SIunit.add("deci");
        SIunit.add("centi");
        SIunit.add("milli");
        SIunit.add("micro");
        SIunit.add("nano");
        SIunit.add("pico");
        SIunit.add("femto");
        SIunit.add("atto");
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
//            Toast.makeText(UnitConverterActivity.this,
//                    "Settings Clicked", Toast.LENGTH_SHORT).show();
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }
}

