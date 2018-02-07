package com.example.merwyn.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    public void click(View v)
    {
        Intent i = new Intent();
        i.setClass(this,SignUp.class);
        startActivity(i);
    }
    public void home(View v)
    {
        Intent i = new Intent();
        i.setClass(this,HomePage.class);
        startActivity(i);
    }

}
