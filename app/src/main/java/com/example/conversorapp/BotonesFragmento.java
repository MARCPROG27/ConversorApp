package com.example.conversorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.conversorapp.databinding.FragmentBotonesFragmentoBinding;


public class BotonesFragmento extends Fragment {

    private FragmentBotonesFragmentoBinding mBinding;

    public BotonesFragmento() {

    }


    public static BotonesFragmento newInstance(String param1, String param2) {

        BotonesFragmento botonesFragmento = new BotonesFragmento();
        Bundle args = new Bundle();

        botonesFragmento.setArguments(args);
        return botonesFragmento;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentBotonesFragmentoBinding.inflate(inflater, container, false);


        mBinding.btnregresar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity2.class);
                startActivity(intent);
            }


        });


        return mBinding.getRoot();


    }

    Boolean estadoButton = true;
    Boolean estadoButton2 = true;
    Boolean estadoButton3 = true;
    Boolean estadoButton4 = true;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBinding.Btnverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (estadoButton == true) {

                    android.widget.Toast.makeText(getContext(), "Selecciono Btn Verde", Toast.LENGTH_LONG).show();
                    mBinding.Btnverde.setText("Activado");
                    estadoButton = false;
                } else if (estadoButton == false) {
                    mBinding.Btnverde.setText("Desactivado");
                    estadoButton = true;
                }

            }
        });

        mBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (estadoButton2 == true) {

                    android.widget.Toast.makeText(getContext(), "Selecciono Boton Rojo", Toast.LENGTH_LONG).show();
                    mBinding.button2.setText("Activado");
                    estadoButton2 = false;
                } else if (estadoButton2 == false) {
                    mBinding.button2.setText("Desactivado");
                    estadoButton2 = true;
                }

            }
        });

        mBinding.btnnivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (estadoButton3 == true) {

                    android.widget.Toast.makeText(getContext(), "Seleccionó Nivel 4", Toast.LENGTH_LONG).show();
                    mBinding.btnnivel.setText("Activó Nivel 4");
                    estadoButton3 = false;
                } else if (estadoButton3 == false) {
                    android.widget.Toast.makeText(getContext(), "Es lamentable que haya desactivado este nivel", Toast.LENGTH_LONG).show();
                    mBinding.btnnivel.setText("Desactivó Nivel 4");
                    estadoButton3 = true;
                }

            }


        });

        mBinding.btnmusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (estadoButton4 == true) {

                    android.widget.Toast.makeText(getContext(), "Seleccionó Pausar música", Toast.LENGTH_LONG).show();
                    mBinding.btnmusica.setText("MUSICA PAUSADA");

                    estadoButton4 = false;
                } else if (estadoButton4 == false) {
                    android.widget.Toast.makeText(getContext(), "Reproduciendo...", Toast.LENGTH_LONG).show();
                    mBinding.btnmusica.setText("COMIENZA LA REPRODUCCION DE LA MUSICA");
                    estadoButton4 = true;
                }

            }


        });


    }
}