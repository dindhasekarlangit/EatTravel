package com.example.eattravel.eattravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button math1 = (Button) findViewById(R.id.math1);
        Button math2 = (Button) findViewById(R.id.math2);
        Button math3 = (Button) findViewById(R.id.math3);
        Button math4 = (Button) findViewById(R.id.math4);
        Button math5 = (Button) findViewById(R.id.math5);


        math1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), nearme.class);
                startActivity(i);


            }
        });
        math2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ourpartners.class);
                startActivity(i);
            }
        });
        math3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), hours.class);
                startActivity(i);
            }
        });
        math4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), tradisonalfoods.class);
                startActivity(i);
            }
        });
        math5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), budgetmeals.class);
                startActivity(i);
            }
        });

    }
}