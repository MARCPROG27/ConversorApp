package com.example.conversorapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.conversorapp.databinding.ActivityContenedorFragmentoBotonesBinding;

public class ContenedorFragmentoBotones extends AppCompatActivity {
    private ActivityContenedorFragmentoBotonesBinding mbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mbinding = ActivityContenedorFragmentoBotonesBinding.inflate(getLayoutInflater());
        setContentView(mbinding.getRoot());
        openfragmentbotones();

    }

    private void openfragmentbotones() {
        BotonesFragmento botonesfragmento = new BotonesFragmento();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction()
                .add(mbinding.contenedor.getId(), botonesfragmento, BotonesFragmento.class.getSimpleName());
        transaction.commit();


    }


}