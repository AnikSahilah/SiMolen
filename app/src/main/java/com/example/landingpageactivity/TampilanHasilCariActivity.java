package com.example.landingpageactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TampilanHasilCariActivity extends AppCompatActivity {
    ImageButton buttonGambar1;
    ImageButton buttonGambar2;
    TextView buttonTulisan1;
    TextView buttonTulisan2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_hasil_cari);
        buttonGambar1 = findViewById(R.id.imagePlaceHolder1);
        buttonGambar2 = findViewById(R.id.imagePlaceHolder2);
        buttonTulisan1 = findViewById(R.id.nama_bengkel1);
        buttonTulisan2 = findViewById(R.id.nama_bengkel2);
        buttonGambar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TampilanHasilCariActivity.this,TampilanDetailBengkelActivity.class));
            }
        });
        buttonGambar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TampilanHasilCariActivity.this, TampilanDetailBengkelActivity.class));
            }
        });
        buttonTulisan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TampilanHasilCariActivity.this, TampilanDetailBengkelActivity.class));;
            }
        });
        buttonTulisan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TampilanHasilCariActivity.this, TampilanDetailBengkelActivity.class));;
            }
        });
    }
}
