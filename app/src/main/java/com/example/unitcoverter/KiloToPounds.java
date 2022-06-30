package com.example.unitcoverter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class KiloToPounds extends AppCompatActivity {

    EditText Kilos, Pounds;
    Button Ktop, Ptok;
    TextView inPounds, inKilos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kilotopounds);

        Kilos = findViewById(R.id.kiloedittext);
        Pounds = findViewById(R.id.poundsedittext);
        Ktop = findViewById(R.id.converttopounds);
        Ptok = findViewById(R.id.converttokilos);
        inPounds = findViewById(R.id.answerinpounds);
        inKilos = findViewById(R.id.answerinKilos);

        Ktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KilosToPounds();
            }
        });

        Ptok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PoundsToKilos();
            }
        });



    }


    private void KilosToPounds() {

        String ValueEntered = Kilos.getText().toString();
        double Kilo = Double.parseDouble(ValueEntered);
        double Pounds = Kilo * 2.205;

        inPounds.setText("" + Pounds);

    }

    private void PoundsToKilos() {
        String ValueEntered = Pounds.getText().toString();
        double Pounds = Double.parseDouble(ValueEntered);
        double Kilo = Pounds / 2.205;

        inKilos.setText("" + Kilo);

    }
}
