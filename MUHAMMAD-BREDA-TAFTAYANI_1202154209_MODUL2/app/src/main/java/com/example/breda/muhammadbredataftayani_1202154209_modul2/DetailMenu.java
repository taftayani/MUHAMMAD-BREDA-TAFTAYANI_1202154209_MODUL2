package com.example.breda.muhammadbredataftayani_1202154209_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {
    //atribut untuk mendeklarasikan tampilan
    TextView coffee,price;
    ImageView photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        Intent intent= getIntent();
        String coffees=intent.getStringExtra("coffee");
        Integer prices=intent.getIntExtra("price",0);
        Integer photos=intent.getIntExtra("photo",0);

        coffee=(TextView)findViewById(R.id.title);
        price=(TextView)findViewById(R.id.Price);
        photo=(ImageView)findViewById(R.id.image);

        coffee.setText(coffees);
        price.setText("RP"+prices);
        photo.setImageResource(photos);

    }
}
