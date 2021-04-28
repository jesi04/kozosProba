package com.example.proba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView adatok = findViewById(R.id.adatok);

        Bundle extras = getIntent().getExtras();

        if (extras != null){
            adatok.setText(extras.getString("nev")+extras.getString("datum")+extras.getString("szig"));
        }
    }
}