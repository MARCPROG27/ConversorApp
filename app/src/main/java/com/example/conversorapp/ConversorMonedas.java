package com.example.conversorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.conversorapp.databinding.FragmentConversorMonedasBinding;


public class ConversorMonedas extends Fragment {


    private FragmentConversorMonedasBinding mBinding;


    Spinner spinner;
    EditText txtvalor;
    TextView txtresultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mBinding = FragmentConversorMonedasBinding.inflate(inflater, container, false);

        relleno();


        mBinding.btnvolver.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity2.class);
                startActivity(intent);
            }


        });

        return mBinding.getRoot();


    }

    //PROCEDIMIENTO QUE AGREGA DATOS AL SPINNER AL ADAPTADOR;CUANDO USUARIO SELECCIONE OPCION DE CONVERSION SE LE MUESTRA RESULTADO Y EN CASO DE ERROR UN TOAST
    private void relleno() {
        String[] items = new String[]{"SELECCIONE UNA OPCION", "PESO CHILENO A DOLAR USA", "PESO CHILENO A EURO", "PESO CHILENO A PESETA", "DOLAR USA A PESO CHILENO"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, items);
        mBinding.spinner.setAdapter(adapter);
        mBinding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int a = mBinding.spinner.getSelectedItemPosition();

                switch (a) {

                    case 1:
                        try {
                            String str = mBinding.txtvalor.getText().toString();
                            Double valor1 = Double.parseDouble(str);
                            Double conv = valor1 * 0.0011;
                            mBinding.txtresultado.setText(Double.toString(conv) + " DOLARES");

                            mBinding.spinner.setAdapter(adapter);


                        } catch (Exception e) {
                            Toast.makeText(getActivity(), " DEBE INGRESAR UN NUMERO", Toast.LENGTH_LONG).show();
                        }
                        mBinding.spinner.setAdapter(adapter);

                        break;

                    case 2:

                        try {
                            String str = mBinding.txtvalor.getText().toString();
                            Double valor1 = Double.parseDouble(str);
                            Double conv = valor1 * 0.0011;
                            mBinding.txtresultado.setText(Double.toString(conv) + " EUROS");
                            mBinding.spinner.setAdapter(adapter);

                        } catch (Exception e) {
                            Toast.makeText(getActivity(), " DEBE INGRESAR UN NUMERO", Toast.LENGTH_LONG).show();

                        }
                        mBinding.spinner.setAdapter(adapter);
                        break;

                    case 3:
                        try {
                            String str = mBinding.txtvalor.getText().toString();
                            Double valor1 = Double.parseDouble(str);
                            Double conv = valor1 * 0.1799;
                            mBinding.txtresultado.setText(Double.toString(conv) + " PESETAS ESPAÑOLAS");
                            mBinding.spinner.setAdapter(adapter);

                        } catch (Exception e) {
                            Toast.makeText(getActivity(), " DEBE INGRESAR UN NUMERO", Toast.LENGTH_LONG).show();
                        }
                        mBinding.spinner.setAdapter(adapter);
                        break;
                    case 4:

                        try {
                            String str = mBinding.txtvalor.getText().toString();
                            Double valor1 = Double.parseDouble(str);
                            Double conv = valor1 * 912.25;
                            mBinding.txtresultado.setText(Double.toString(conv) + " PESOS");
                            mBinding.spinner.setAdapter(adapter);

                        } catch (Exception e) {
                            Toast.makeText(getActivity(), " DEBE INGRESAR UN NUMERO", Toast.LENGTH_LONG).show();
                        }
                        mBinding.spinner.setAdapter(adapter);
                        break;


                }


            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }


        });
    }

}
