package com.reactcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button bananasButton;
    private Button calculatorButton;
    private Button greetingButton;
    private Button blinkButton;
    private Button View1;
    private Button View2;
    private Button View3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bananasButton = (Button) findViewById(R.id.id_main_bananas);
        calculatorButton = (Button) findViewById(R.id.id_main_calculator);
        greetingButton = (Button) findViewById(R.id.id_main_greeting);
        blinkButton = (Button) findViewById(R.id.id_main_blink);
        View1 = (Button) findViewById(R.id.id_main_one);
        View2 = (Button) findViewById(R.id.id_main_two);
        View3 = (Button) findViewById(R.id.id_main_three);

        bananasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BananasActivity.class);
                startActivity(intent);
            }
        });

        calculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });

        greetingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GreetingActivity.class);
                startActivity(intent);
            }
        });

        blinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BlinkActivity.class);
                startActivity(intent);
            }
        });

        View1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OneActivity.class);
                startActivity(intent);
            }
        });

        View2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });

        View3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThreeActivity.class);
                startActivity(intent);
            }
        });
    }
}
