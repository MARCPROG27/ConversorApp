package com.example.conversorapp;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import com.example.conversorapp.databinding.ActivityMain2Binding;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding mbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mbinding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(mbinding.getRoot());
        mbinding.btnconversor.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, ContenedorFragmento.class);
                startActivity(intent);
            }


        });
        mbinding.btnbotones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, ContenedorFragmentoBotones.class);
                startActivity(intent);
            }
        });


    }
}