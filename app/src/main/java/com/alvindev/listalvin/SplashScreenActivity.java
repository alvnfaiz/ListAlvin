package com.alvindev.listalvin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(500);
                }catch(Exception error){
                    error.printStackTrace();
                }finally{
                    Intent intentMain = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intentMain);
                }
            }
        };
        timer.start();
    }
}