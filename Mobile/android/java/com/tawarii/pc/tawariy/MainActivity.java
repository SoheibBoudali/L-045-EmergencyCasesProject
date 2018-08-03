package com.tawarii.pc.tawariy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT =0;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent HomeActivity= new Intent(MainActivity.this, HomeActivity.class);
                startActivity(HomeActivity);
                finish();
            }
        },SPLASH_TIME_OUT);
        Intent LoginActivity= new Intent(MainActivity.this, LoginActivity.class);
        startActivity(LoginActivity);
    }
}

