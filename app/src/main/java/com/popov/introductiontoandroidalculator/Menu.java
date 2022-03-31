package com.popov.introductiontoandroidalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class Menu extends AppCompatActivity {


    private static final String THEMES_KEY = "THEMES_KEY";
    private static final String THEMES_DAY = "THEMES_DAY";
    private static final String THEMES_NIGHT = "THEMES_NIGHT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sharedPreferences = getSharedPreferences("preferences", Context.MODE_PRIVATE);

        String theme = sharedPreferences.getString(THEMES_KEY, THEMES_DAY);

        switch (theme){
            case THEMES_DAY:
                setTheme(R.style.Theme_IntroductionToAndroidСalculator);
                break;
            default:
                setTheme(R.style.Theme_IntroductionToAndroidСalculatorNight);
                break;
        }

        setContentView(R.layout.activity_menu);

        findViewById(R.id.calculator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculatorActivityIntent = new Intent(Menu.this, MainActivity.class);
                startActivity(calculatorActivityIntent);
            }
        });

        findViewById(R.id.themes_day).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sharedPreferences.edit().putString(THEMES_KEY, THEMES_DAY).apply();

                recreate();
            }
        });

        findViewById(R.id.themes_night).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sharedPreferences.edit().putString(THEMES_KEY, THEMES_NIGHT).apply();
                recreate();
            }
        });
    }
}