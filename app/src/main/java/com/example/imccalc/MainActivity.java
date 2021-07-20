package com.example.imccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick(View v){

        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        if(resultado < 18.5){
            //abaixo do peso
            lblResultado.setText("Abaixo do peso!");
        }
        else if(resultado > 24.9){
            //obesidade mórbida
            lblResultado.setText("Acima do peso!");
        }
        else{
            //dentro do padrão
            lblResultado.setText("Peso ok!");
        }

        /*switch (lblResultado) {
            case (resultado < 18.5):*/

        }
    }
}