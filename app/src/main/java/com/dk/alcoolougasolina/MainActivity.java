package com.dk.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText textAlcool, textGasolina;
    private TextView textResult;
    private String preencher = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textAlcool = findViewById(R.id.textAlcool);
        textGasolina = findViewById(R.id.textGasolina);
        textResult = findViewById(R.id.textResult);
    }

    public void calcular(View view) {

        validar(textAlcool.getText().toString(),textGasolina.getText().toString());

        if(preencher == "") {

            double valorAlcool = Double.parseDouble(textAlcool.getText().toString());
            double valorGasolina = Double.parseDouble(textGasolina.getText().toString());

                double calculo = valorAlcool / valorGasolina;
                if (calculo >= 0.7) {
                    textResult.setText("Melhor abastece com gasolina!");
                }
                if(calculo < 0.7){
                    textResult.setText("Melhor abastecer com alcool!");
                }
        }
        else{
            textResult.setText("Preencher valor de : " + preencher);
            preencher = "";
        }
    }
        public void validar(String alcool, String gasolina){

            if (alcool.equals("") || alcool == null) {
                preencher = " alcool";
            }
            if(gasolina.equals("") || alcool == null) {
                preencher += " gasolina ";
            }
        }
}