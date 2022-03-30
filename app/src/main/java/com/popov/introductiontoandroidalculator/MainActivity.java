package com.popov.introductiontoandroidalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textEdit;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonDel;
    private Button buttonObelus;
    private Button buttonMultiply;
    private Button buttonMinus;
    private Button buttonPlus;
    private Button buttonEqually;
    private Button buttonPoint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textEdit = findViewById(R.id.text_edit);
        button0 = findViewById(R.id.key_0);
        button1 = findViewById(R.id.key_1);
        button2 = findViewById(R.id.key_2);
        button3 = findViewById(R.id.key_3);
        button4 = findViewById(R.id.key_4);
        button5 = findViewById(R.id.key_5);
        button6 = findViewById(R.id.key_6);
        button7 = findViewById(R.id.key_7);
        button8 = findViewById(R.id.key_8);
        button9 = findViewById(R.id.key_9);
        buttonDel = findViewById(R.id.key_del);
        buttonObelus = findViewById(R.id.key_obelus);
        buttonMultiply = findViewById(R.id.key_multiplication);
        buttonMinus = findViewById(R.id.key_minus);
        buttonPlus = findViewById(R.id.key_plus);
        buttonEqually = findViewById(R.id.key_equals);
        buttonPoint = findViewById(R.id.key_point);

    }
}