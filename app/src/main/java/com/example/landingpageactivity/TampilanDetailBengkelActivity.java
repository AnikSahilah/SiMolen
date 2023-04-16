package com.example.landingpageactivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TampilanDetailBengkelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_detail_bengkel);
        getSupportActionBar().hide();
    }
}
