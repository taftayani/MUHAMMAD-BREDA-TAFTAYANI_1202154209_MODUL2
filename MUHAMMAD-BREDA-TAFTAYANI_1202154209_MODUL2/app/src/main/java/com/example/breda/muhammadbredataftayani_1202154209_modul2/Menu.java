package com.example.breda.muhammadbredataftayani_1202154209_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {
    private final LinkedList<String> nFood= new LinkedList<>();
    private final LinkedList<Integer> nPrice= new LinkedList<>();
    private final LinkedList<Integer> nPhoto= new LinkedList<>();
    private int mCount=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
}
