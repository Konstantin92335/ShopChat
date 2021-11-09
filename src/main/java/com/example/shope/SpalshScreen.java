package com.example.shope;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SpalshScreen extends Activity {
    private final int SPLASH_DISPLEY_LEHGHT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalshscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SpalshScreen.this, MainActivity.class);
                SpalshScreen.this.startActivity(mainIntent);
                SpalshScreen.this.finish();

            }
        },SPLASH_DISPLEY_LEHGHT);
    }
}
