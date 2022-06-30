package com.example.unitcoverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MetresToCm extends AppCompatActivity {

    EditText Metres, Cm;
    Button cMetres, cCm;
    TextView inCm, inM;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metrestocm);

        Metres = findViewById(R.id.metresedittext);
        Cm = findViewById(R.id.cmedittext);
       cMetres = findViewById(R.id.converttocm);
        cCm = findViewById(R.id.converttoMetres);
        inCm = findViewById(R.id.answerincm);
        inM = findViewById(R.id.answerinmetres);

        cMetres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntoCm();
            }
        });

        cCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntoMetres();
            }
        });


    }



    private void IntoCm() {

        String ValueEntered = Metres.getText().toString();
        double Metres = Double.parseDouble(ValueEntered);
        double Cm = Metres * 100;

        inCm.setText("" + Cm);

    }
    private void IntoMetres() {
        String ValueEntered = Cm.getText().toString();
        double Cm = Double.parseDouble(ValueEntered);
        double metres = Cm / 100;

        inM.setText("" + metres);
    }



}
