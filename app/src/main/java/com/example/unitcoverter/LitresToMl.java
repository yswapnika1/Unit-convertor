package com.example.unitcoverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LitresToMl extends AppCompatActivity {

   EditText Liters, Ml;
   Button  cL, cML;
   TextView inMl, inL;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.litrestoml);

        Liters = findViewById(R.id.litresedittext);
        Ml = findViewById(R.id.mledittext);
        cL = findViewById(R.id.converttoMl);
        cML = findViewById(R.id.converttolitres);
        inMl = findViewById(R.id.answerinml);
        inL = findViewById(R.id.answerinlitres);

        cL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intoMl();
            }
        });

        cML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intoLitres();
            }
        });

    }



    private void intoMl() {

        String ValueEntered = Liters.getText().toString();
        double liters = Double.parseDouble(ValueEntered);
        double Ml = liters * 1000;

        inMl.setText("" + Ml);
    }

    private void intoLitres() {
        String ValueEntered = Ml.getText().toString();
        double ml = Double.parseDouble(ValueEntered);
        double liters= ml / 1000;

        inL.setText("" + liters);

    }
}


