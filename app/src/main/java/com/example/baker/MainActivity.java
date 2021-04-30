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

public class MainActivity extends AppCompatActivity
{
    private EditText bal850;
    private EditText bal550;
    private EditText wilenski;
    private EditText slonecznikowy;
    private EditText wieloziarnisty;
    private EditText staropolski;
    private EditText orzechowy;
    private EditText kilowy;
    private EditText razowy;

    private static final String ILEBAL850 = "com.example.baker.ILEBAL850";
    private static final String ILEBAL550 = "com.example.baker.ILEBAL550";
    private static final String ILEWILENSKI = "com.example.baker.ILEWILENSKI";
    private static final String ILESLONECZNIKA = "com.example.baker.ILESLONECZNIKA";
    private static final String ILEWIELOZIARNISTEGO = "com.example.baker.ILEWIELOZIARNISTEGO";
    private static final String ILESTAROPOLSKIEGO = "com.example.baker.ILESTAROPOLSKIEGO";
    private static final String ILEORZECHOWEGO = "com.example.baker.ILEORZECHOWEGO";
    private static final String ILEKILOWEGO = "com.example.baker.ILEKILOWEGO";
    private static final String ILERAZOWEGO = "com.example.baker.ILERAZOWEGO";
    private static final String SHAREDPREFS = "com.example.baker.SHAREDPREFS";
    private static final String DATALOADED = "com.example.baker.DATALOADED";

    private static final String WAGA850 = "com.example.baker.WAGABAL850";
    private static final String WAGA550 = "com.example.baker.WAGABAL550";
    private static final String WAGAORZ = "com.example.baker.WAGAORZECH";
    private static final String WAGAWIL = "com.example.baker.WAGAWILENSKI";
    private static final String WAGASLO = "com.example.baker.WAGASLONECZNIK";
    private static final String WAGAWIE = "com.example.baker.WAGAWIELOZIARNISTE";
    private static final String WAGASTA = "com.example.baker.WAGASTAROPOLSKI";
    private static final String WAGAKIL = "com.example.baker.WAGAKILOWE";
    private static final String WAGARAZ = "com.example.baker.WAGARAZOWE";

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

    private String ileBal850;
    private String ileBal550;
    private String ileWilenskich;
    private String ileSlonecznikowych;
    private String ileWieloziarnistych;
    private String ileStaropolskich;
    private String ileOrzechowych;
    private String ileKilowych;
    private String ileRazowych;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bal850 = findViewById(R.id.bal850);
        bal550 = findViewById(R.id.bal550);
        wilenski = findViewById(R.id.wilenski);
        slonecznikowy = findViewById(R.id.slonecznik);
        wieloziarnisty = findViewById(R.id.wielo);
        staropolski = findViewById(R.id.staropol);
        orzechowy = findViewById(R.id.orzech);
        kilowy = findViewById(R.id.kilo);
        razowy = findViewById(R.id.raz);

        Button count = findViewById(R.id.count_button);

        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);

        if(!sharedPreferences.contains(WAGA850)) loadWeights();
        if(!sharedPreferences.contains(CBALPSZENNA)) loadBaltanowski();
        if(!sharedPreferences.contains(CWILPSZENNA)) loadWilenski();
        if(!sharedPreferences.contains(CSTAPSZENNA)) loadStaropolski();
        if(!sharedPreferences.contains(CORZPSZENNA)) loadOrzech();

        count.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ileBal850 = bal850.getText().toString();
                ileBal550 = bal550.getText().toString();
                ileWilenskich = wilenski.getText().toString();
                ileSlonecznikowych = slonecznikowy.getText().toString();
                ileWieloziarnistych = wieloziarnisty.getText().toString();
                ileStaropolskich = staropolski.getText().toString();
                ileOrzechowych = orzechowy.getText().toString();
                ileKilowych = kilowy.getText().toString();
                ileRazowych = razowy.getText().toString();
                startIntent();
            }
        });
    }

    public void startIntent()
    {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        if(!ileBal850.equals("") && !ileBal850.startsWith("0")) intent.putExtra(ILEBAL850, Integer.parseInt(bal850.getText().toString()));
        if(!ileBal550.equals("") && !ileBal550.startsWith("0")) intent.putExtra(ILEBAL550, Integer.parseInt(bal550.getText().toString()));
        if(!ileWilenskich.equals("") && !ileWilenskich.startsWith("0")) intent.putExtra(ILEWILENSKI, Integer.parseInt(wilenski.getText().toString()));
        if(!ileSlonecznikowych.equals("") && !ileSlonecznikowych.startsWith("0")) intent.putExtra(ILESLONECZNIKA, Integer.parseInt(slonecznikowy.getText().toString()));
        if(!ileWieloziarnistych.equals("") && !ileWieloziarnistych.startsWith("0")) intent.putExtra(ILEWIELOZIARNISTEGO, Integer.parseInt(wieloziarnisty.getText().toString()));
        if(!ileStaropolskich.equals("") && !ileStaropolskich.startsWith("0")) intent.putExtra(ILESTAROPOLSKIEGO, Integer.parseInt(staropolski.getText().toString()));
        if(!ileOrzechowych.equals("") && !ileOrzechowych.startsWith("0")) intent.putExtra(ILEORZECHOWEGO, Integer.parseInt(orzechowy.getText().toString()));
        if(!ileKilowych.equals("") && !ileKilowych.startsWith("0")) intent.putExtra(ILEKILOWEGO, Integer.parseInt(kilowy.getText().toString()));
        if(!ileRazowych.equals("") && !ileRazowych.startsWith("0")) intent.putExtra(ILERAZOWEGO, Integer.parseInt(razowy.getText().toString()));
        startActivity(intent);
    }

    public void loadWeights()
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

    public void loadBaltanowski()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putFloat(CBALPSZENNA, 0.46f);
        editor.putFloat(CBALZIEMNIA, 0.007f);
        editor.putFloat(CBALWODA, 0.18f);
        editor.putFloat(CBALZAKWAS, 0.33f);
        editor.putFloat(CBALDROZDZE, 0.01f);
        editor.putFloat(CBALSOL, 0.011f);

        editor.apply();
    }

    public void loadWilenski()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putFloat(CWILPSZENNA, 0.5f);
        editor.putFloat(CWILPREPARAT, 0.125f);
        editor.putFloat(CWILDROZDZE, 0.025f);
        editor.putFloat(CWILWODA, 0.35f);

        editor.apply();
    }

    public void loadStaropolski()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putFloat(CSTAPSZENNA, 0.16f);
        editor.putFloat(CSTAZYTNIA, 0.37f);
        editor.putFloat(CSTAWODA, 0.42f);
        editor.putFloat(CSTAZAKWAS, 0.018f);
        editor.putFloat(CSTADROZDZE, 0.008f);
        editor.putFloat(CSTASOL, 0.011f);

        editor.apply();
    }

    public void loadOrzech()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

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
        inflater.inflate(R.menu.menu_baker, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.settings_counters:
                Intent countersIntent = new Intent(MainActivity.this, CountersActivity.class);
                startActivity(countersIntent);
                return true;

            case R.id.settings_weights:
                Intent weightsIntent = new Intent(MainActivity.this, WeightsActivity.class);
                startActivity(weightsIntent);
                return true;

            default: return super.onOptionsItemSelected(item);
        }

    }
}