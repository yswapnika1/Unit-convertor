package com.example.unitcoverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class KgToGrms extends AppCompatActivity {

    EditText Kg, Grms;
    Button cKg, cGrms;
    TextView inGrms, inKg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kilotogrms);

        Kg = findViewById(R.id.kgedittext);
        Grms = findViewById(R.id.grmsedittext);
        cKg = findViewById(R.id.converttogrms);
        cGrms = findViewById(R.id.converttokg);
        inGrms = findViewById(R.id.answeringrms);
        inKg = findViewById(R.id.answerinKg);

        cKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntoGrms();
            }
        });

        cGrms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntoKg();
            }
        });

    }



    private void IntoGrms() {
        String ValueEntered = Kg.getText().toString();
        double Kg = Double.parseDouble(ValueEntered);
        double grms = Kg * 1000;

        inGrms.setText("" + grms);

    }

    private void IntoKg() {
        String ValueEntered = Grms.getText().toString();
        double grms = Double.parseDouble(ValueEntered);
        double Kg = grms / 1000;

        inKg.setText("" + Kg);


    }


}
