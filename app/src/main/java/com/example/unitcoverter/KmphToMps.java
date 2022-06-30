package com.example.unitcoverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class KmphToMps extends AppCompatActivity {

    EditText Kmph, Mps;
    Button KtoMps, MpstoKmph;
    TextView inMps, inKmph;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kmphtomps);

        Kmph = findViewById(R.id.kmphedittext);
        Mps = findViewById(R.id.mphedittext);
        KtoMps = findViewById(R.id.converttomps);
        MpstoKmph = findViewById(R.id.converttokmph);
        inMps = findViewById(R.id.answerinmps);
        inKmph = findViewById(R.id.answerinKmph);


        KtoMps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KmphIntoMps();
            }
        });

        MpstoKmph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MpsToKmph();

            }
        });

    }


    private void KmphIntoMps() {

        String ValueEntered = Kmph.getText().toString();
        double Kmph = Double.parseDouble(ValueEntered);
        double Mps = Kmph * 0.28;

        inMps.setText("" + Mps);

    }

    private void MpsToKmph() {

        String ValueEntered = Mps.getText().toString();
        double Mps = Double.parseDouble(ValueEntered);
        double Kmph = Mps / 0.28;

        inKmph.setText("" + Kmph);


    }



}




