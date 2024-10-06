package com.example.appsaude;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CaracterizacaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracterizacao);

        // Botão para a página de Conceito
        Button buttonConceito = findViewById(R.id.button_conceito);
        buttonConceito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaracterizacaoActivity.this, ConceitoActivity.class);
                startActivity(intent);
            }
        });

        // Botão para a página de Causas
        Button buttonCausas = findViewById(R.id.button_causas);
        buttonCausas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaracterizacaoActivity.this, CausasActivity.class);
                startActivity(intent);
            }
        });

        // Botão para a página de Anatomia
        Button buttonAnatomia = findViewById(R.id.button_anatomia);
        buttonAnatomia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaracterizacaoActivity.this, AnatomiaActivity.class);
                startActivity(intent);
            }
        });

        // Botão para a página de Sintomas
        Button buttonSintomas = findViewById(R.id.button_sintomas);
        buttonSintomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaracterizacaoActivity.this, SintomasActivity.class);
                startActivity(intent);
            }
        });

        // Botão para a página de Diagnóstico
        Button buttonDiagnostico = findViewById(R.id.button_diagnostico);
        buttonDiagnostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaracterizacaoActivity.this, DiagnosticoActivity.class);
                startActivity(intent);
            }
        });

        // Botão para a página de Tratamento
        Button buttonTratamento = findViewById(R.id.button_tratamento);
        buttonTratamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaracterizacaoActivity.this, TratamentoActivity.class);
                startActivity(intent);
            }
        });

        // Botão para a página de Referências
        Button buttonReferencias = findViewById(R.id.button_referencias);
        buttonReferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaracterizacaoActivity.this, ReferenciasActivity.class);
                startActivity(intent);
            }
        });
    }
}