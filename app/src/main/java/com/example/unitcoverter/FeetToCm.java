package com.example.unitcoverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FeetToCm extends AppCompatActivity {

    EditText Feet, Cm;
    Button cf, cCm;
    TextView inCm,inF;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feettocm);

        Feet = findViewById(R.id.feetsedittext);
        Cm = findViewById(R.id.fcmedittext);
        cf = findViewById(R.id.converttofcm);
        cCm = findViewById(R.id.converttofeets);
        inCm = findViewById(R.id.answerinfcm);
        inF = findViewById(R.id.answerinfeets);

        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intoCm();
            }
        });

        cCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intoFeets();
            }
        });




    }


    private void intoCm() {

        String ValueEntered = Feet.getText().toString();
        double feets = Double.parseDouble(ValueEntered);
        double Cm = feets * 30.48;

        inCm.setText("" + Cm);
    }

    private void intoFeets() {
        String ValueEntered = Cm.getText().toString();
        double Cm = Double.parseDouble(ValueEntered);
        double Feets = Cm / 30.48;

        inF.setText("" + Feets);

    }

}
