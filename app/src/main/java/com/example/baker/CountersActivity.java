package com.example.baker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CountersActivity extends AppCompatActivity
{
    private static final String CBALPSZENNA = "com.example.baker.CBALPSZENNA";
    private static final String CBALZIEMNIA = "com.example.baker.CBALZEIMNIA";
    private static final String CBALWODA = "com.example.baker.CBALWODA";
    private static final String CBALZAKWAS = "com.example.baker.CBALZAKWAS";
    private static final String CBALDROZDZE = "com.example.baker.CBALDROZDZE";
    private static final String CBALSOL = "com.example.baker.CBALSOL";
    private static final String CSTAPSZENNA = "com.example.baker.CSTAPSZENNA";
    private static final String CSTAZYTNIA = "com.example.baker.CSTAZYTNIA";
    private static final String CSTAWODA = "com.example.baker.CSTAWODA";
    private static final String CSTAZAKWAS = "com.example.baker.CSTAZAKWAS";
    private static final String CSTADROZDZE = "com.example.baker.CSTADROZDZE";
    private static final String CSTASOL = "com.example.baker.CSTASOL";
    private static final String CWILPSZENNA = "com.example.baker.CWILPSZENNA";
    private static final String CWILPREPARAT = "com.example.baker.CWILPREPARAT";
    private static final String CWILDROZDZE = "com.example.baker.CWILDROZDZE";
    private static final String CWILWODA = "com.example.baker.CWILWODA";
    private static final String CORZPSZENNA = "com.example.baker.CORZPSZENNA";
    private static final String CORZPREPARAT = "com.example.baker.CORZPREPARAT";
    private static final String CORZDROZDZE = "com.example.baker.CORZDROZDZE";
    private static final String CORZWODA = "com.example.baker.CORZWODA";
    private static final String SHAREDPREFS = "com.example.baker.SHAREDPREFS";

    private EditText countBalPszenna;
    private EditText countBalZiemnia;
    private EditText countBalWoda;
    private EditText countBalZakwas;
    private EditText countBalDrozdze;
    private EditText countBalSol;

    private EditText countStaPszenna;
    private EditText countStaZytnia;
    private EditText countStaWoda;
    private EditText countStaZakwas;
    private EditText countStaDrozdze;
    private EditText countStaSol;

    private EditText countWilPszenna;
    private EditText countWilPreparat;
    private EditText countWilDrozdze;
    private EditText countWilWoda;

    private EditText countOrzPszenna;
    private EditText countOrzPreparat;
    private EditText countOrzDrozdze;
    private EditText countOrzWoda;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counters);

        countBalPszenna = findViewById(R.id.c_bal_pszenna);
        countBalZiemnia = findViewById(R.id.c_bal_ziem);
        countBalWoda = findViewById(R.id.c_bal_woda);
        countBalZakwas = findViewById(R.id.c_bal_zakwas);
        countBalDrozdze = findViewById(R.id.c_bal_drozdze);
        countBalSol = findViewById(R.id.c_bal_sol);

        countStaPszenna = findViewById(R.id.c_sta_pszenna);
        countStaZytnia = findViewById(R.id.c_sta_zytnia);
        countStaWoda = findViewById(R.id.c_sta_woda);
        countStaZakwas = findViewById(R.id.c_sta_zakwas);
        countStaDrozdze = findViewById(R.id.c_sta_drozdze);
        countStaSol = findViewById(R.id.c_sta_sol);

        countWilPszenna = findViewById(R.id.c_wil_pszenna);
        countWilPreparat = findViewById(R.id.c_wil_preparat);
        countWilDrozdze = findViewById(R.id.c_wil_drozdze);
        countWilWoda = findViewById(R.id.c_wil_woda);

        countOrzPszenna = findViewById(R.id.c_orz_pszenna);
        countOrzPreparat = findViewById(R.id.c_orz_preparat);
        countOrzDrozdze = findViewById(R.id.c_orz_drozdze);
        countOrzWoda = findViewById(R.id.c_orz_woda);

        loadCounters();


    }

    public void loadCounters()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);
        String cBalPszenna = String.valueOf(sharedPreferences.getFloat(CBALPSZENNA, 0f));
        String cBalZiem = String.valueOf(sharedPreferences.getFloat(CBALZIEMNIA, 0f));
        String cBalWoda = String.valueOf(sharedPreferences.getFloat(CBALWODA, 0f));
        String cBalZakwas = String.valueOf(sharedPreferences.getFloat(CBALZAKWAS, 0f));
        String cBalDrozdze = String.valueOf(sharedPreferences.getFloat(CBALDROZDZE, 0f));
        String cBalSol = String.valueOf(sharedPreferences.getFloat(CBALSOL, 0f));

        String cStaPszenna = String.valueOf(sharedPreferences.getFloat(CSTAPSZENNA, 0f));
        String cStaZytnia = String.valueOf(sharedPreferences.getFloat(CSTAZYTNIA, 0f));
        String cStaWoda = String.valueOf(sharedPreferences.getFloat(CSTAWODA, 0f));
        String cStaZakwas = String.valueOf(sharedPreferences.getFloat(CSTAZAKWAS, 0f));
        String cStaDrozdze = String.valueOf(sharedPreferences.getFloat(CSTADROZDZE, 0f));
        String cStaSol = String.valueOf(sharedPreferences.getFloat(CSTASOL, 0f));

        String cWilPszenna = String.valueOf(sharedPreferences.getFloat(CWILPSZENNA, 0f));
        String cWilPreparat = String.valueOf(sharedPreferences.getFloat(CWILPREPARAT, 0f));
        String cWilDrozdze = String.valueOf(sharedPreferences.getFloat(CWILDROZDZE, 0f));
        String cWilWoda = String.valueOf(sharedPreferences.getFloat(CWILWODA, 0f));

        String cOrzPszenna = String.valueOf(sharedPreferences.getFloat(CORZPSZENNA, 0f));
        String cOrzPreparat = String.valueOf(sharedPreferences.getFloat(CORZPREPARAT, 0f));
        String cOrzDrozdze = String.valueOf(sharedPreferences.getFloat(CORZDROZDZE, 0f));
        String cOrzWoda = String.valueOf(sharedPreferences.getFloat(CORZWODA, 0f));

        countBalPszenna.setText(cBalPszenna);
        countBalZiemnia.setText(cBalZiem);
        countBalWoda.setText(cBalWoda);
        countBalZakwas.setText(cBalZakwas);
        countBalDrozdze.setText(cBalDrozdze);
        countBalSol.setText(cBalSol);

        countStaPszenna.setText(cStaPszenna);
        countStaZytnia.setText(cStaZytnia);
        countStaWoda.setText(cStaWoda);
        countStaZakwas.setText(cStaZakwas);
        countStaDrozdze.setText(cStaDrozdze);
        countStaSol.setText(cStaSol);

        countWilPszenna.setText(cWilPszenna);
        countWilPreparat.setText(cWilPreparat);
        countWilDrozdze.setText(cWilDrozdze);
        countWilWoda.setText(cWilWoda);

        countOrzPszenna.setText(cOrzPszenna);
        countOrzPreparat.setText(cOrzPreparat);
        countOrzDrozdze.setText(cOrzDrozdze);
        countOrzWoda.setText(cOrzWoda);

    }

    public void saveCounters()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        String cBalPszenna = countBalPszenna.getText().toString();
        if(!cBalPszenna.equals("")) editor.putFloat(CBALPSZENNA, Float.parseFloat(cBalPszenna));

        String cBalZiemnia = countBalZiemnia.getText().toString();
        if(!cBalZiemnia.equals("")) editor.putFloat(CBALZIEMNIA, Float.parseFloat(cBalZiemnia));

        String cBalWoda = countBalWoda.getText().toString();
        if(!cBalWoda.equals("")) editor.putFloat(CBALWODA, Float.parseFloat(cBalWoda));

        String cBalZakwas = countBalZakwas.getText().toString();
        if(!cBalZakwas.equals("")) editor.putFloat(CBALZAKWAS, Float.parseFloat(cBalZakwas));

        String cBalDrozdze = countBalDrozdze.getText().toString();
        if(!cBalDrozdze.equals("")) editor.putFloat(CBALDROZDZE, Float.parseFloat(cBalDrozdze));

        String cBalSol = countBalSol.getText().toString();
        if(!cBalSol.equals("")) editor.putFloat(CBALSOL, Float.parseFloat(cBalSol));

        String cOrzPszenna = countOrzPszenna.getText().toString();
        if(!cOrzPszenna.equals("")) editor.putFloat(CORZPSZENNA, Float.parseFloat(cOrzPszenna));

        String cOrzPreparat = countOrzPreparat.getText().toString();
        if(!cOrzPreparat.equals("")) editor.putFloat(CORZPREPARAT, Float.parseFloat(cOrzPreparat));

        String cOrzDrozdze = countOrzDrozdze.getText().toString();
        if(!cOrzDrozdze.equals("")) editor.putFloat(CORZDROZDZE, Float.parseFloat(cOrzDrozdze));

        String cOrzWoda = countOrzWoda.getText().toString();
        if(!cOrzWoda.equals("")) editor.putFloat(CORZWODA, Float.parseFloat(cOrzWoda));

        String cWilPszenna = countWilPszenna.getText().toString();
        if(!cWilPszenna.equals("")) editor.putFloat(CWILPSZENNA, Float.parseFloat(cWilPszenna));

        String cWilPreparat = countWilPreparat.getText().toString();
        if(!cWilPreparat.equals("")) editor.putFloat(CWILPREPARAT, Float.parseFloat(cWilPreparat));

        String cWilDrozdze = countWilDrozdze.getText().toString();
        if(!cWilDrozdze.equals("")) editor.putFloat(CWILDROZDZE, Float.parseFloat(cWilDrozdze));

        String cWilWoda = countWilWoda.getText().toString();
        if(!cWilWoda.equals("")) editor.putFloat(CWILWODA, Float.parseFloat(cWilWoda));

        String cStaPszenna = countStaPszenna.getText().toString();
        if(!cStaPszenna.equals("")) editor.putFloat(CSTAPSZENNA, Float.parseFloat(cStaPszenna));

        String cStaZytnia = countStaZytnia.getText().toString();
        if(!cStaZytnia.equals("")) editor.putFloat(CSTAZYTNIA, Float.parseFloat(cStaZytnia));

        String cStaWoda = countStaWoda.getText().toString();
        if(!cStaWoda.equals("")) editor.putFloat(CSTAWODA, Float.parseFloat(cStaWoda));

        String cStaZakwas = countStaZakwas.getText().toString();
        if(!cStaZakwas.equals("")) editor.putFloat(CSTAZAKWAS, Float.parseFloat(cStaZakwas));

        String cStaDrozdze = countStaDrozdze.getText().toString();
        if(!cStaDrozdze.equals("")) editor.putFloat(CSTADROZDZE, Float.parseFloat(cStaDrozdze));

        String cStaSol = countStaSol.getText().toString();
        if(!cStaSol.equals("")) editor.putFloat(CSTASOL, Float.parseFloat(cStaSol));

        editor.apply();

        Toast.makeText(CountersActivity .this,"przeliczniki zatwierdzone",Toast.LENGTH_LONG).show();
    }

    public void restoreCounters()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putFloat(CBALPSZENNA, 0.46f);
        editor.putFloat(CBALZIEMNIA, 0.007f);
        editor.putFloat(CBALWODA, 0.18f);
        editor.putFloat(CBALZAKWAS, 0.33f);
        editor.putFloat(CBALDROZDZE, 0.01f);
        editor.putFloat(CBALSOL, 0.011f);

        editor.putFloat(CWILPSZENNA, 0.5f);
        editor.putFloat(CWILPREPARAT, 0.125f);
        editor.putFloat(CWILDROZDZE, 0.025f);
        editor.putFloat(CWILWODA, 0.35f);

        editor.putFloat(CSTAPSZENNA, 0.16f);
        editor.putFloat(CSTAZYTNIA, 0.37f);
        editor.putFloat(CSTAWODA, 0.42f);
        editor.putFloat(CSTAZAKWAS, 0.018f);
        editor.putFloat(CSTADROZDZE, 0.008f);
        editor.putFloat(CSTASOL, 0.011f);

        editor.putFloat(CORZPSZENNA, 0.5f);
        editor.putFloat(CORZPREPARAT, 0.125f);
        editor.putFloat(CORZDROZDZE, 0.025f);
        editor.putFloat(CORZWODA, 0.37f);

        editor.apply();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_counters, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.save_counters:
                saveCounters();
                return true;

            case R.id.restore_counters:
                restoreCounters();
                loadCounters();
                return true;

            default: return super.onOptionsItemSelected(item);
        }

    }
}