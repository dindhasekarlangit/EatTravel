package com.example.eattravel.eattravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Thread login = new Thread(){

            public void run() {
                try {
                    sleep(2000);
                }
                catch (InterruptedException a)
                {
                    a.printStackTrace();
                }
                finally {
                    startActivity(new Intent(login.this,MainActivity.class));
                    finish();
                }
            }
        };
        login.start();
    }

}
