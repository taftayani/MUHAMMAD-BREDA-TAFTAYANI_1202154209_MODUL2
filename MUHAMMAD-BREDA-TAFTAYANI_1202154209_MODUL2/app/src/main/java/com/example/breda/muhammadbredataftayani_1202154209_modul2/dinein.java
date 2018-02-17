package com.example.breda.muhammadbredataftayani_1202154209_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class dinein extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String messageSpin="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);

        //buat atribut spinner
        Spinner spin=(Spinner)findViewById(R.id.spinner);

        //membuat array spinner, dengan string array.
        ArrayAdapter<CharSequence> adapter=
                ArrayAdapter.createFromResource(this,R.array.array_table,android.R.layout.simple_spinner_item);
        //untuk membuat fungsi dropdown list
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //membuat kondisi, apabila tidak ada list
        if (spin!=null){
            spin.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        messageSpin=adapterView.getItemAtPosition(i).toString();
        YourOrder(view);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void YourOrder(View view) {
        Intent intent=new Intent(this,Menu.class);
        startActivity(intent);
    }
}
