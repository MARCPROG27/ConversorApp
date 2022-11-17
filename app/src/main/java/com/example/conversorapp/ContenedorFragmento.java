package com.example.conversorapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.conversorapp.databinding.ActivityContenedorFragmentoBinding;


public class ContenedorFragmento extends AppCompatActivity {
    private ActivityContenedorFragmentoBinding mbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mbinding = ActivityContenedorFragmentoBinding.inflate(getLayoutInflater());
        setContentView(mbinding.getRoot());
        openfragment();

    }

    private void openfragment() {
        ConversorMonedas conversormonedas = new ConversorMonedas();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction()
                .add(mbinding.contenedorp.getId(), conversormonedas, ConversorMonedas.class.getSimpleName());
        transaction.commit();


    }
}