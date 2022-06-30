package com.example.unitcoverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FarenhietToCelcius extends AppCompatActivity {

    EditText fheit, celcius;
    Button ctocel, ctofh;
    TextView incel, infh;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farenhiettocelcius);

        fheit = findViewById(R.id.Farenhietedittext);
        celcius = findViewById(R.id.celciusedittext);
        ctocel = findViewById(R.id.converttocelcius);
        ctofh = findViewById(R.id.converttofarenhiet);
        incel = findViewById(R.id.answerincelcius);
        infh = findViewById(R.id.answerinfarenhiet);

        ctocel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               FToCelcius();
            }
        });

        ctofh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CelciusToFarenhiet();
            }
        });


    }



    private void FToCelcius() {

        String ValueEntered = fheit.getText().toString();
        double fh = Double.parseDouble(ValueEntered);
        double celcius = (fh - 32) * 0.5;

        incel.setText("" + celcius);

    }

    private void CelciusToFarenhiet() {

        String ValueEntered = celcius.getText().toString();
        double celcius = Double.parseDouble(ValueEntered);
        double fh = (celcius * 1.8) + 32;

        infh.setText("" + fh);

    }

}
