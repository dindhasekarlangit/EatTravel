package com.example.eattravel.eattravel;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;


public class SplashScreen extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);


        Thread splash = new Thread(){

            public void run() {
                try {
                    sleep(2000);
                }
                catch (InterruptedException a)
                {
                    a.printStackTrace();
                }
                finally {
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }
            }
        };
        splash.start();
    }
}


