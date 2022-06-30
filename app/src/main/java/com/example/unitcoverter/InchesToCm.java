package com.example.unitcoverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class InchesToCm extends AppCompatActivity {

    EditText inches, Cm;
    Button cIn, cCm;
    TextView inCm, inInch;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inchestocm);

        inches = findViewById(R.id.inch2edittext);
        Cm = findViewById(R.id.cm2edittext);
        cIn = findViewById(R.id.converttocm2);
        cCm = findViewById(R.id.converttoinch2);
        inCm = findViewById(R.id.answerincm2);
        inInch = findViewById(R.id.answerininch2);

        cIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intoCm();
            }
        });

        cCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intoInches();
            }
        });


    }



    private void intoCm() {

        String ValueEntered = inches.getText().toString();
        double inch = Double.parseDouble(ValueEntered);
        double Cm = inch * 2.54;

        inCm.setText("" + Cm);
    }

    private void intoInches() {

        String ValueEntered = Cm.getText().toString();
        double cm = Double.parseDouble(ValueEntered);
        double inch = cm / 2.54;

        inInch.setText("" + inch);
    }
}
