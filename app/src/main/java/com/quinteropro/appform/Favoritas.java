package com.quinteropro.appform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Favoritas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}