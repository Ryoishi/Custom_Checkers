package com.checkers_custom.ryo.custom_checkers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Ryo on 10/4/2015.
 */

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Runnable runnable3secs = new Runnable(){
            @Override
            public void run(){
                nextActivity();
                finish();
            }
        };
        Handler myHandler = new Handler();
        myHandler.postDelayed(runnable3secs, 3000);
    }
    public void nextActivity() {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}
