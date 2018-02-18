package com.example.breda.muhammadbredataftayani_1202154209_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void TakeAway(View view) {
        Intent intent=new Intent(this,Menu.class);
        Toast.makeText(getApplicationContext(),"Take away, have a nice day",Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
