package com.example.unitcoverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FeetsToInches extends AppCompatActivity {

    EditText Feets, Inches;
    Button cF, cIn;
    TextView inIn, inF;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feetstoinches);

        Feets = findViewById(R.id.feet2edittext);
        Inches = findViewById(R.id.inchesedittext);
        cF = findViewById(R.id.converttoinches);
        cIn = findViewById(R.id.converttofeet2);
        inIn = findViewById(R.id.answerininches);
        inF = findViewById(R.id.answerinfeet2);

        cF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intoInches();
            }
        });

        cIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intoFeets();
            }
        });

    }



    private void intoInches() {

        String ValueEntered = Feets.getText().toString();
        double feets = Double.parseDouble(ValueEntered);
        double Inch = feets * 12;

        inIn.setText("" + Inch);

    }

    private void intoFeets() {
        String ValueEntered = Inches.getText().toString();
        double inch = Double.parseDouble(ValueEntered);
        double feets = inch / 12;

        inF.setText("" + feets);

    }


}
