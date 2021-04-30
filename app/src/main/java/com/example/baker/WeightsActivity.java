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

public class WeightsActivity extends AppCompatActivity
{
    private static final String WAGA850 = "com.example.baker.WAGABAL850";
    private static final String WAGA550 = "com.example.baker.WAGABAL550";
    private static final String WAGAORZ = "com.example.baker.WAGAORZECH";
    private static final String WAGAWIL = "com.example.baker.WAGAWILENSKI";
    private static final String WAGASLO = "com.example.baker.WAGASLONECZNIK";
    private static final String WAGAWIE = "com.example.baker.WAGAWIELOZIARNISTE";
    private static final String WAGASTA = "com.example.baker.WAGASTAROPOLSKI";
    private static final String WAGAKIL = "com.example.baker.WAGAKILOWE";
    private static final String WAGARAZ = "com.example.baker.WAGARAZOWE";
    private static final String SHAREDPREFS = "com.example.baker.SHAREDPREFS";

    private EditText wagaBal850;
    private EditText wagaBal550;
    private EditText wagaOrzech;
    private EditText wagaWilenski;
    private EditText wagaSlonecznik;
    private EditText wagaWieloziarniste;
    private EditText wagaStaropolski;
    private EditText wagaKilowe;
    private EditText wagaRazowe;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weights);

        wagaBal850 = findViewById(R.id.waga_bal_850);
        wagaBal550 = findViewById(R.id.waga_bal_550);
        wagaOrzech = findViewById(R.id.waga_orz);
        wagaWilenski = findViewById(R.id.waga_wil);
        wagaSlonecznik = findViewById(R.id.waga_slo);
        wagaWieloziarniste = findViewById(R.id.waga_wie);
        wagaStaropolski = findViewById(R.id.waga_sta);
        wagaKilowe = findViewById(R.id.waga_kilo);
        wagaRazowe = findViewById(R.id.waga_raz);

        loadWeihgts();

    }

    public void loadWeihgts()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);

        String wBal850 = String.valueOf(sharedPreferences.getFloat(WAGA850, 0f));
        String wBal550 = String.valueOf(sharedPreferences.getFloat(WAGA550, 0f));
        String wOrzech = String.valueOf(sharedPreferences.getFloat(WAGAORZ, 0f));
        String wWilenski = String.valueOf(sharedPreferences.getFloat(WAGAWIL, 0f));
        String wSlonecznik = String.valueOf(sharedPreferences.getFloat(WAGASLO, 0f));
        String wWieloziarniste = String.valueOf(sharedPreferences.getFloat(WAGAWIE, 0f));
        String wStaropolski = String.valueOf(sharedPreferences.getFloat(WAGASTA, 0f));
        String wKilowe = String.valueOf(sharedPreferences.getFloat(WAGAKIL, 0f));
        String wRazowe = String.valueOf(sharedPreferences.getFloat(WAGARAZ, 0f));

        wagaBal850.setText(wBal850);
        wagaBal550.setText(wBal550);
        wagaOrzech.setText(wOrzech);
        wagaWilenski.setText(wWilenski);
        wagaSlonecznik.setText(wSlonecznik);
        wagaWieloziarniste.setText(wWieloziarniste);
        wagaStaropolski.setText(wStaropolski);
        wagaKilowe.setText(wKilowe);
        wagaRazowe.setText(wRazowe);
    }



    public void saveWeights()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        try
        {
            String wBal850 = wagaBal850.getText().toString();
            if (!wBal850.equals("")) editor.putFloat(WAGA850, Float.parseFloat(wBal850));
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("nieprawidłowa wartość pola bal850");
        }
        try
        {
            String wBal550 = wagaBal550.getText().toString();
            if (!wBal550.equals("")) editor.putFloat(WAGA550, Float.parseFloat(wBal550));
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("nieprawidłowa wartość pola bal550");
        }
        try
        {
            String wOrzech = wagaOrzech.getText().toString();
            if (!wOrzech.equals("")) editor.putFloat(WAGAORZ, Float.parseFloat(wOrzech));
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("nieprawidłowa wartość pola Orzech");
        }
        try
        {
            String wWilenski = wagaWilenski.getText().toString();
            if (!wWilenski.equals("")) editor.putFloat(WAGAWIL, Float.parseFloat(wWilenski));
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("nieprawidłowa wartość pola Wilenski");
        }
        try
        {
            String wSlonecznik = wagaSlonecznik.getText().toString();
            if (!wSlonecznik.equals("")) editor.putFloat(WAGASLO, Float.parseFloat(wSlonecznik));
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("nieprawidłowa wartość pola Slonecznik");
        }
        try
        {
            String wWielo = wagaWieloziarniste.getText().toString();
            if (!wWielo.equals("")) editor.putFloat(WAGAWIE, Float.parseFloat(wWielo));
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("nieprawidłowa wartość pola Wieloziarniste");
        }
        try
        {
            String wStaropol = wagaStaropolski.getText().toString();
            if (!wStaropol.equals("")) editor.putFloat(WAGASTA, Float.parseFloat(wStaropol));
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("nieprawidłowa wartość pola Staropolskie");
        }
        try
        {
            String wKilo = wagaKilowe.getText().toString();
            if (!wKilo.equals("")) editor.putFloat(WAGAKIL, Float.parseFloat(wKilo));
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("nieprawidłowa wartość pola Kilowe");
        }
        try
        {
            String wRazowe = wagaRazowe.getText().toString();
            if (!wRazowe.equals("")) editor.putFloat(WAGARAZ, Float.parseFloat(wRazowe));
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("nieprawidłowa wartość pola Razowe");
        }

        editor.apply();

        Toast.makeText(WeightsActivity.this, "wagi zapisane", Toast.LENGTH_LONG).show();
    }

    public void restoreWeights()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putFloat(WAGA850, 0.9f);
        editor.putFloat(WAGA550, 0.6f);
        editor.putFloat(WAGAORZ, 0.5f);
        editor.putFloat(WAGAWIL, 0.8f);
        editor.putFloat(WAGASLO, 0.55f);
        editor.putFloat(WAGAWIE, 0.55f);
        editor.putFloat(WAGASTA, 0.8f);
        editor.putFloat(WAGARAZ, 0.7f);
        editor.putFloat(WAGAKIL, 1f);

        editor.apply();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_weights, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.save_weights:
                saveWeights();
                return true;

            case R.id.restore_weights:
                restoreWeights();
                loadWeihgts();
                return true;

            default: return super.onOptionsItemSelected(item);
        }

    }
}