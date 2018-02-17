package com.example.breda.muhammadbredataftayani_1202154209_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//untuk menghilangkan app bar
        setContentView(R.layout.activity_splash);
        TextView tSpalsh;//atribut untuk text

        tSpalsh=(TextView) findViewById(R.id.textView);

        final Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        },1500L); //3000L = 1,5detik)
    }
}
