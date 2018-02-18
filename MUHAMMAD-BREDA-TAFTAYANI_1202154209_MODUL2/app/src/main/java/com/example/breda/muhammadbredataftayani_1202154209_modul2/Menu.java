package com.example.breda.muhammadbredataftayani_1202154209_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {
    private final LinkedList<String> nCoffees= new LinkedList<>();
    private final LinkedList<Integer> nPrices= new LinkedList<>();
    private final LinkedList<Integer> nPhotos= new LinkedList<>();
//    private int Count=0;


    private RecyclerView recycle;
    private ListData madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //deklarasi method data()
        data();
        //membuat recycle viewnya
        recycle=(RecyclerView)findViewById(R.id.recyleview);
        //mendeklarasikan data recycle
        madapter= new ListData(this,nCoffees,nPrices,nPhotos);
        //set data untuk recycle
        recycle.setAdapter(madapter);
        //setting layout untuk recyclenya
        recycle.setLayoutManager(new LinearLayoutManager(this ));

    }

    private void data(){
            nCoffees.add("kopi gayo");
            nCoffees.add("kopi latte");
            nCoffees.add("latte art");
            nCoffees.add("kopi DJ");

            nPrices.add(10000);
            nPrices.add(20000);
            nPrices.add(30000);
            nPrices.add(40000);

            nPhotos.add(R.drawable.capucin);
            nPhotos.add(R.drawable.images);
            nPhotos.add(R.drawable.latte);
            nPhotos.add(R.drawable.single);


    }

}

