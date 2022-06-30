package com.example.unitcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   Button KandP, Kmphandmps, ftoc, littoml, kgtog, mtocm, feettocm, feettoin, intocm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KandP = findViewById(R.id.kiloTopounds);
        Kmphandmps = findViewById(R.id.KmphToMph);
        ftoc= findViewById(R.id.FToCelcius);
        littoml = findViewById(R.id.LitToMl);
        kgtog = findViewById(R.id.KgToG);
        mtocm = findViewById(R.id.MtoCm);
        feettocm = findViewById(R.id.FeetTocm);
        feettoin= findViewById(R.id.FeetToInches);
        intocm = findViewById(R.id.InchToCenti);

        KandP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, KiloToPounds.class));
            }
        });

        Kmphandmps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, KmphToMps.class));
            }
        });
        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FarenhietToCelcius.class));
            }
        });
        littoml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LitresToMl.class));
            }
        });
        kgtog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, KgToGrms.class));
            }
        });
        mtocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MetresToCm.class));
            }
        });
        feettoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FeetsToInches.class));
            }
        });
        feettocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FeetToCm.class));
            }
        });
        intocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InchesToCm.class));
            }
        });





    }
}






