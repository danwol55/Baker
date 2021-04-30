package com.example.baker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
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

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.waga_ciasta);

        TextView balWaga = findViewById(R.id.waga_baltanowski);
        TextView balPszenna = findViewById(R.id.bal_pszenna);
        TextView balZiemniaczana = findViewById(R.id.bal_ziem);
        TextView balWoda = findViewById(R.id.bal_woda);
        TextView balZakwas = findViewById(R.id.bal_zakwas);
        TextView balDrozdze = findViewById(R.id.bal_drozdze);
        TextView balSol = findViewById(R.id.bal_sol);

        TextView wilWaga = findViewById(R.id.waga_wilenski);
        TextView wilPszenna = findViewById(R.id.wil_pszenna);
        TextView wilPreparat = findViewById(R.id.wil_preparat);
        TextView wilDrozdze = findViewById(R.id.wil_drozdze);
        TextView wilWoda = findViewById(R.id.wil_woda);

        TextView staWaga = findViewById(R.id.waga_staropolski);
        TextView staPszenna = findViewById(R.id.sta_pszenna);
        TextView staZytnia = findViewById(R.id.sta_zytnia);
        TextView staZakwas = findViewById(R.id.sta_zakwas);
        TextView staDrozdze = findViewById(R.id.sta_drozdze);
        TextView staWoda = findViewById(R.id.sta_woda);
        TextView staSol = findViewById(R.id.sta_sol);

        TextView orzechWaga = findViewById(R.id.waga_orzech);
        TextView orzechPszenna = findViewById(R.id.orz_pszenna);
        TextView orzechPreparat = findViewById(R.id.orz_preparat);
        TextView orzechDrozdze = findViewById(R.id.orz_drozdze);
        TextView orzechWoda = findViewById(R.id.orz_woda);

        int bal850=0, bal550=0, orzechowe=0;
        int staropolskie=0, razowe=0, kilowe=0;
        int wilenskie=0, slonecznikowe=0, wieloziarniste=0;

        SharedPreferences sharedPreferences = getSharedPreferences(SHAREDPREFS, MODE_PRIVATE);

        float wagaBal850 = sharedPreferences.getFloat(WAGA850, 0f);
        float wagaBal550 = sharedPreferences.getFloat(WAGA550, 0f);
        float wagaWil = sharedPreferences.getFloat(WAGAWIL, 0f);
        float wagaSlone = sharedPreferences.getFloat(WAGASLO, 0f);
        float wagaWielo = sharedPreferences.getFloat(WAGAWIE, 0f);
        float wagaOrzech = sharedPreferences.getFloat(WAGAORZ, 0f);
        float wagaStarop = sharedPreferences.getFloat(WAGASTA, 0f);
        float wagaRaz = sharedPreferences.getFloat(WAGARAZ, 0f);
        float wagaKilo = sharedPreferences.getFloat(WAGAKIL, 0f);

        float countBalPszenna = sharedPreferences.getFloat(CBALPSZENNA, 0f);
        float countBalZiemniaczana = sharedPreferences.getFloat(CBALZIEMNIA, 0f);
        float countBalWoda = sharedPreferences.getFloat(CBALWODA, 0f);
        float countBalZakwas = sharedPreferences.getFloat(CBALZAKWAS, 0f);
        float countBalDrozdze = sharedPreferences.getFloat(CBALDROZDZE, 0f);
        float countBalSol = sharedPreferences.getFloat(CBALSOL, 0f);

        float countStaPszenna = sharedPreferences.getFloat(CSTAPSZENNA, 0f);
        float countStaZytnia = sharedPreferences.getFloat(CSTAZYTNIA, 0f);
        float countStaWoda = sharedPreferences.getFloat(CSTAWODA, 0f);
        float countStaZakwas = sharedPreferences.getFloat(CSTAZAKWAS, 0f);
        float countStaDrozdze = sharedPreferences.getFloat(CSTADROZDZE, 0f);
        float countStaSol = sharedPreferences.getFloat(CSTASOL, 0f);

        float countWilPszenna = sharedPreferences.getFloat(CWILPSZENNA, 0f);
        float countWilPreparat = sharedPreferences.getFloat(CWILPREPARAT, 0f);
        float countWilDrozdze = sharedPreferences.getFloat(CWILDROZDZE, 0f);
        float countWilWoda = sharedPreferences.getFloat(CWILWODA, 0f);

        float countOrzechPszenna = sharedPreferences.getFloat(CORZPSZENNA, 0f);
        float countOrzechPreparat = sharedPreferences.getFloat(CORZPREPARAT, 0f);
        float countOrzechDrozdze = sharedPreferences.getFloat(CORZDROZDZE, 0f);
        float countOrzechWoda = sharedPreferences.getFloat(CORZWODA, 0f);

        Intent intent = getIntent();
        if(intent.hasExtra(ILEBAL850)) bal850 = intent.getIntExtra(ILEBAL850, 0);
        if(intent.hasExtra(ILEBAL550)) bal550 = intent.getIntExtra(ILEBAL550, 0);
        if(intent.hasExtra(ILEWILENSKI)) wilenskie = intent.getIntExtra(ILEWILENSKI, 0);
        if(intent.hasExtra(ILESLONECZNIKA)) slonecznikowe = intent.getIntExtra(ILESLONECZNIKA, 0);
        if(intent.hasExtra(ILEWIELOZIARNISTEGO)) wieloziarniste = intent.getIntExtra(ILEWIELOZIARNISTEGO, 0);
        if(intent.hasExtra(ILESTAROPOLSKIEGO)) staropolskie = intent.getIntExtra(ILESTAROPOLSKIEGO, 0);
        if(intent.hasExtra(ILEORZECHOWEGO)) orzechowe = intent.getIntExtra(ILEORZECHOWEGO, 0);
        if(intent.hasExtra(ILEKILOWEGO)) kilowe = intent.getIntExtra(ILEKILOWEGO, 0);
        if(intent.hasExtra(ILERAZOWEGO)) razowe = intent.getIntExtra(ILERAZOWEGO, 0);

        //Baltanowski-------------------------------------------------------------------------------

        Float wagaCiastaBaltanowski = bal850 * wagaBal850 + bal550 * wagaBal550;
        wagaCiastaBaltanowski = ((float)Math.round(wagaCiastaBaltanowski*100))/100;
        if(wagaCiastaBaltanowski == wagaCiastaBaltanowski.intValue())
        {
            balWaga.setText(wagaCiastaBaltanowski.intValue() + "kg");
        }
        else balWaga.setText(wagaCiastaBaltanowski.toString().replace('.', ',') + "kg");

        Float wagaBalPszenna = wagaCiastaBaltanowski * countBalPszenna;
        wagaBalPszenna = ((float)Math.round(wagaBalPszenna*100))/100;
        balPszenna.setText(wagaBalPszenna.toString().replace('.', ',') + "kg");

        Float wagaBalZiemniaczana = wagaCiastaBaltanowski * countBalZiemniaczana;
        wagaBalZiemniaczana = ((float)Math.round(wagaBalZiemniaczana*100))/100;
        balZiemniaczana.setText(wagaBalZiemniaczana.toString().replace('.', ',') + "kg");

        Float wagaBalWoda = wagaCiastaBaltanowski * countBalWoda;
        wagaBalWoda = ((float)Math.round(wagaBalWoda*100))/100;
        balWoda.setText(wagaBalWoda.toString().replace('.', ',') + "kg");

        Float wagaBalZakwas = wagaCiastaBaltanowski * countBalZakwas;
        wagaBalZakwas = ((float)Math.round(wagaBalZakwas*100))/100;
        balZakwas.setText(wagaBalZakwas.toString().replace('.', ',') + "kg");

        Float wagaBalDrozdze = wagaCiastaBaltanowski * countBalDrozdze;
        wagaBalDrozdze = ((float)Math.round(wagaBalDrozdze*100))/100;
        balDrozdze.setText(wagaBalDrozdze.toString().replace('.', ',') + "kg");

        Float wagaBalSol = wagaCiastaBaltanowski * countBalSol;
        wagaBalSol = ((float)Math.round(wagaBalSol*100))/100;
        balSol.setText(wagaBalSol.toString().replace('.', ',') + "kg");

        //Baltanowski-------------------------------------------------------------------------------

        //Orzechowe---------------------------------------------------------------------------------

        Float wagaCiastaOrzech = orzechowe * wagaOrzech;
        wagaCiastaOrzech = ((float)Math.round(wagaCiastaOrzech*100))/100;
        if(wagaCiastaOrzech == wagaCiastaOrzech.intValue())
        {
            orzechWaga.setText(wagaCiastaOrzech.intValue() + "kg");
        }
        else orzechWaga.setText(wagaCiastaOrzech.toString().replace('.', ',') + "kg");

        Float wagaOrzechPszenna = wagaCiastaOrzech * countOrzechPszenna;
        wagaOrzechPszenna = ((float)Math.round(wagaOrzechPszenna*100))/100;
        orzechPszenna.setText(wagaOrzechPszenna.toString().replace('.', ',') + "kg");

        Float wagaOrzechPreparat = wagaCiastaOrzech * countOrzechPreparat;
        wagaOrzechPreparat = ((float)Math.round(wagaOrzechPreparat*100))/100;
        orzechPreparat.setText(wagaOrzechPreparat.toString().replace('.', ',') + "kg");

        Float wagaOrzechDrozdze = wagaCiastaOrzech * countOrzechDrozdze;
        wagaOrzechDrozdze = ((float)Math.round(wagaOrzechDrozdze*100))/100;
        orzechDrozdze.setText(wagaOrzechDrozdze.toString().replace('.', ',') + "kg");

        Float wagaOrzechWoda = wagaCiastaOrzech * countOrzechWoda;
        wagaOrzechWoda = ((float)Math.round(wagaOrzechWoda*100))/100;
        orzechWoda.setText(wagaOrzechWoda.toString().replace('.', ',') + "kg");

        //Orzechowe---------------------------------------------------------------------------------

        //Staropolskie------------------------------------------------------------------------------

        Float wagaCiastaStaropolski = kilowe * wagaKilo + staropolskie * wagaStarop + razowe * wagaRaz;
        wagaCiastaStaropolski = ((float)Math.round(wagaCiastaStaropolski*100))/100;
        if(wagaCiastaStaropolski == wagaCiastaStaropolski.intValue())
        {
            staWaga.setText(wagaCiastaStaropolski.intValue() + "kg");
        }
        else staWaga.setText(wagaCiastaStaropolski.toString().replace('.', ',') + "kg");

        Float wagaStaPszenna = wagaCiastaStaropolski * countStaPszenna;
        wagaStaPszenna = ((float)Math.round(wagaStaPszenna*100))/100;
        staPszenna.setText(wagaStaPszenna.toString().replace('.', ',') + "kg");

        Float wagaStaZytnia = wagaCiastaStaropolski * countStaZytnia;
        wagaStaZytnia = ((float)Math.round(wagaStaZytnia*100))/100;
        staZytnia.setText(wagaStaZytnia.toString().replace('.', ',') + "kg");

        Float wagaStaDrozdze = wagaCiastaStaropolski * countStaDrozdze;
        wagaStaDrozdze = ((float)Math.round(wagaStaDrozdze*100))/100;
        staDrozdze.setText(wagaStaDrozdze.toString().replace('.', ',') + "kg");

        Float wagaStaZakwas = wagaCiastaStaropolski * countStaZakwas;
        wagaStaZakwas = ((float)Math.round(wagaStaZakwas*100))/100;
        staZakwas.setText(wagaStaZakwas.toString().replace('.', ',') + "kg");

        Float wagaStaWoda = wagaCiastaStaropolski * countStaWoda;
        wagaStaWoda = ((float)Math.round(wagaStaWoda*100))/100;
        staWoda.setText(wagaStaWoda.toString().replace('.', ',') + "kg");

        Float wagaStaSol = wagaCiastaStaropolski * countStaSol;
        wagaStaSol = ((float)Math.round(wagaStaSol*100))/100;
        staSol.setText(wagaStaSol.toString().replace('.', ',') + "kg");

        //Staropolskie------------------------------------------------------------------------------

        //Wilenskie---------------------------------------------------------------------------------

        Float wagaCiastaWilenski = (wilenskie * wagaWil) + (slonecznikowe * wagaSlone) + (wieloziarniste * wagaWielo);
        wagaCiastaWilenski = ((float)Math.round(wagaCiastaWilenski*100))/100;
        if(wagaCiastaWilenski == wagaCiastaWilenski.intValue())
        {
            wilWaga.setText(wagaCiastaWilenski.intValue() + "kg");
        }
        else wilWaga.setText(wagaCiastaWilenski.toString().replace('.', ',') + "kg");

        Float wagaWilPszenna = wagaCiastaWilenski * countWilPszenna;
        wagaWilPszenna = ((float)Math.round(wagaWilPszenna*100))/100;
        wilPszenna.setText(wagaWilPszenna.toString().replace('.', ',') + "kg");

        Float wagaWilPreparat = wagaCiastaWilenski * countWilPreparat;
        wagaWilPreparat = ((float)Math.round(wagaWilPreparat*100))/100;
        wilPreparat.setText(wagaWilPreparat.toString().replace('.', ',') + "kg");

        Float wagaWilDrozdze = wagaCiastaWilenski * countWilDrozdze;
        wagaWilDrozdze = ((float)Math.round(wagaWilDrozdze*100))/100;
        wilDrozdze.setText(wagaWilDrozdze.toString().replace('.', ',') + "kg");

        Float wagaWilWoda = wagaCiastaWilenski * countWilWoda;
        wagaWilWoda = ((float)Math.round(wagaWilWoda*100))/100;
        wilWoda.setText(wagaWilWoda.toString().replace('.', ',') + "kg");

        //Wilenskie---------------------------------------------------------------------------------

    }
}