package com.example.examenmapaspr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=(Spinner)findViewById(R.id.spinner);
    }
    public void siguiente(View view){
        Intent control = new Intent(this, Lugares.class);
        control.putExtra("lugar",spinner.getSelectedItem().toString());
        startActivity(control);
    }
}