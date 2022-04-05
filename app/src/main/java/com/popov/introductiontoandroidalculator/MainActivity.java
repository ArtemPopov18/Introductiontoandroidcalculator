package com.popov.introductiontoandroidalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String key = "calculator";
    private TextView textEdit;
    private String field = "";
    private Calculator calculator = new Calculator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textEdit = findViewById(R.id.text_edit);


        if (savedInstanceState != null) {
            calculator = (Calculator) savedInstanceState.getSerializable(key);
        }

        showResult();

        findViewById(R.id.key_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.initialization("0");
                showResult();
            }
        });

        findViewById(R.id.key_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.initialization("1");
                showResult();
            }
        });

        findViewById(R.id.key_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.initialization("2");
                showResult();
            }
        });

        findViewById(R.id.key_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.initialization("3");
                showResult();
            }
        });

        findViewById(R.id.key_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.initialization("4");
                showResult();
            }
        });

        findViewById(R.id.key_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.initialization("5");
                showResult();
            }
        });

        findViewById(R.id.key_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.initialization("6");
                showResult();
            }
        });

        findViewById(R.id.key_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.initialization("7");
                showResult();
            }
        });

        findViewById(R.id.key_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.initialization("8");
                showResult();
            }
        });

        findViewById(R.id.key_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.initialization("9");
                showResult();
            }
        });

        findViewById(R.id.key_del).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setNumber1("del");
                calculator.setNumber2("del");
                calculator.setSign(0);
                calculator.initialization("");
                showResult();
            }
        });

        findViewById(R.id.key_obelus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setSign(4);
                calculator.initialization("");
                showResult();
            }
        });

        findViewById(R.id.key_multiplication).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setSign(3);
                calculator.initialization("");
                showResult();
            }
        });

        findViewById(R.id.key_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setSign(1);
                calculator.initialization("");
                showResult();
            }
        });

        findViewById(R.id.key_minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setSign(2);
                calculator.initialization("");
                showResult();
            }
        });

        findViewById(R.id.key_point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                field = field + ".";
                showResult();
            }
        });

        findViewById(R.id.key_equals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.operationsOfArithmetic();
                showResult();
            }
        });
    }

    private void showResult() {
        textEdit.setText(calculator.getNumber3());
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(key, calculator);

    }
}