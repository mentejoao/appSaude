package com.example.appsaude;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AnamneseActivity extends AppCompatActivity {

    // Declaração dos campos
    private EditText editTextEmail, editTextDataAplicacao, editTextHoraAplicacao, editTextNomeAvaliador;
    private CheckBox checkBoxEstagiario, checkBoxProfissional;

    private EditText editTextEmailPaciente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anamnese);

        // Inicialização dos campos
        editTextEmail = findViewById(R.id.editText_email);
        editTextDataAplicacao = findViewById(R.id.editText_data_aplicacao);
        editTextHoraAplicacao = findViewById(R.id.editText_hora_aplicacao);
        editTextNomeAvaliador = findViewById(R.id.editText_nome_avaliador);
        checkBoxEstagiario = findViewById(R.id.checkbox_estagiario);
        checkBoxProfissional = findViewById(R.id.checkbox_profissional);
        editTextEmailPaciente = findViewById(R.id.editText_email_paciente);

        // Lógica de exclusividade entre os checkboxes
        checkBoxEstagiario.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBoxProfissional.setChecked(false);
            }
        });

        checkBoxProfissional.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBoxEstagiario.setChecked(false);
            }
        });

        Button buttonSalvar = findViewById(R.id.button_salvar);
        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validação dos campos obrigatórios
                if (editTextEmail.getText().toString().isEmpty() ||
                        editTextDataAplicacao.getText().toString().isEmpty() ||
                        editTextNomeAvaliador.getText().toString().isEmpty()) {
                    Toast.makeText(AnamneseActivity.this, "Por favor, preencha todos os campos obrigatórios.", Toast.LENGTH_SHORT).show();
                } else {
                    // Persistir os dados (aqui você pode salvar em uma estrutura de dados, por exemplo)
                    // Para este exemplo, vou apenas usar um Toast
                    Toast.makeText(AnamneseActivity.this, "Dados salvos com sucesso!", Toast.LENGTH_SHORT).show();

                    // Voltar para MainActivity
                    Intent intent = new Intent(AnamneseActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}