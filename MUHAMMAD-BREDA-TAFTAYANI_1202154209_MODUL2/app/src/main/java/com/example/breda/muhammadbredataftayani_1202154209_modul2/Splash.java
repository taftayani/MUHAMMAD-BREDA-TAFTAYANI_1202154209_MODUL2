package com.example.breda.muhammadbredataftayani_1202154209_modul2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        TextView tSpalsh;//atribut untuk text

        tSpalsh=(TextView) findViewById(R.id.textView);
        Toast.makeText(getApplicationContext(),"Muhammad Breda Taftayani_1202154209",Toast.LENGTH_SHORT).show();
        final Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        },10000L); //1500L artinya = 1,5detik)
    }
}
