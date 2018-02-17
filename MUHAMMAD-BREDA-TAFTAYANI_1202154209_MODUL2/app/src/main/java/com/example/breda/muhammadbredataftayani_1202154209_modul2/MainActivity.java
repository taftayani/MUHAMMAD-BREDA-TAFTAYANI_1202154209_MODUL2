package com.example.breda.muhammadbredataftayani_1202154209_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Order(View view) {
        RadioButton dine, takeaway;
        dine = (RadioButton) findViewById(R.id.dine);
        takeaway = (RadioButton) findViewById(R.id.TakeAway);
        if (dine.isChecked()){
            Intent intent=new Intent(this,dinein.class);
            startActivity(intent);
        }
        else if (takeaway.isChecked()){
            Intent intent = new Intent(this,TakeAway.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"Choose One Of it",Toast.LENGTH_SHORT).show();
        }
    }
}
