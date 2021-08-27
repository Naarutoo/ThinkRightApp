package com.example.thinkright;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {
TextView mtvCompanyName;
ImageView mIvTitle;
LottieAnimationView lottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    initview();
    }

    private void initview() {
    mtvCompanyName = findViewById(R.id.tvCompany);
    mIvTitle = findViewById(R.id.titleImage);
    lottie = findViewById(R.id.lottie);


    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
    },4000);
    }
}