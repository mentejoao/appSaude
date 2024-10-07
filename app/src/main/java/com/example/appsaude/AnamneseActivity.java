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

    private EditText editTextNomePaciente;
    private EditText editTextDataNascimentoPaciente, editTextIdadePaciente, editTextPesoPaciente, editTextAlturaPaciente, editTextEnderecoPaciente, editTextCidadePaciente, editTextTelefonePaciente, editTextEmailPaciente, editTextCpfPaciente, editTextProfissaoPaciente;
    private CheckBox checkboxFemininoPaciente, checkboxMasculinoPaciente, checkboxOutroPaciente, checkboxEducacaoInfantilIncompletoPaciente, checkboxEducacaoInfantilCompletoPaciente, checkboxFundamentalIncompletoPaciente, checkboxFundamentalCompletoPaciente, checkboxMedioIncompletoPaciente, checkboxMedioCompletoPaciente, checkboxSuperiorIncompletoPaciente, checkboxSuperiorCompletoPaciente, checkboxPosGraduacaoPaciente, checkboxMestradoPaciente, checkboxDoutoradoPaciente;
 // Antecedentes Pessoais
 // Tipo sanguíneo
 private CheckBox antecedentes_checkbox_a_positivo;
    private CheckBox antecedentes_checkbox_a_negativo;
    private CheckBox antecedentes_checkbox_b_positivo;
    private CheckBox antecedentes_checkbox_b_negativo;
    private CheckBox antecedentes_checkbox_ab_positivo;
    private CheckBox antecedentes_checkbox_ab_negativo;
    private CheckBox antecedentes_checkbox_o_positivo;
    private CheckBox antecedentes_checkbox_o_negativo;

    // Alergias
    private EditText antecedentes_input_text_alergias;

    // Consome tabaco
    private CheckBox antecedentes_checkbox_sim_tabaco;
    private CheckBox antecedentes_checkbox_nao_tabaco;
    private CheckBox antecedentes_checkbox_nunca_fumei;

    // Quantidade tabaco
    private EditText antecedentes_input_text_quantidade_tabaco;

    // Consome bebidas alcoólicas
    private CheckBox antecedentes_checkbox_sim_bebidas;
    private CheckBox antecedentes_checkbox_nao_bebidas;

    // Frequência de ingestão de bebidas alcoólicas
    private CheckBox antecedentes_checkbox_nunca_bebidas;
    private CheckBox antecedentes_checkbox_mensalmente_bebidas;
    private CheckBox antecedentes_checkbox_2_4_vezes_bebidas;
    private CheckBox antecedentes_checkbox_2_3_vezes_bebidas;
    private CheckBox antecedentes_checkbox_4_mais_vezes_bebidas;

    // Uso de outras substâncias psicoativas
    private CheckBox antecedentes_checkbox_nao_substancias;
    private CheckBox antecedentes_checkbox_sim_estimulantes;
    private CheckBox antecedentes_checkbox_sim_perturbadoras;
    private CheckBox antecedentes_checkbox_sim_depressoras;

    // Alimentação
    private CheckBox antecedentes_checkbox_cafe_da_manha;
    private CheckBox antecedentes_checkbox_lanche_da_manha;
    private CheckBox antecedentes_checkbox_almoco;
    private CheckBox antecedentes_checkbox_lanche_da_tarde;
    private CheckBox antecedentes_checkbox_jantar;
    private CheckBox antecedentes_checkbox_ceia;

    // Porções de frutas
    private CheckBox antecedentes_checkbox_1_porcao_fruta;
    private CheckBox antecedentes_checkbox_2_porcoes_fruta;
    private CheckBox antecedentes_checkbox_3_porcoes_fruta;
    private CheckBox antecedentes_checkbox_4_porcoes_fruta;
    private CheckBox antecedentes_checkbox_5_porcoes_fruta;
    private CheckBox antecedentes_checkbox_6_ou_mais_porcoes_fruta;

    // Porções de verduras
    private CheckBox antecedentes_checkbox_1_porcao_verdura;
    private CheckBox antecedentes_checkbox_2_porcoes_verdura;
    private CheckBox antecedentes_checkbox_3_porcoes_verdura;
    private CheckBox antecedentes_checkbox_4_porcoes_verdura;
    private CheckBox antecedentes_checkbox_5_porcoes_verdura;
    private CheckBox antecedentes_checkbox_6_ou_mais_porcoes_verdura;

    // Consumo de água
    private CheckBox antecedentes_checkbox_sim_agua;
    private CheckBox antecedentes_checkbox_nao_agua;
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
        editTextNomePaciente = findViewById(R.id.editText_nome_paciente);
        editTextDataNascimentoPaciente = findViewById(R.id.editText_data_nascimento_paciente);
        editTextIdadePaciente = findViewById(R.id.editText_idade_paciente);
        checkboxFemininoPaciente = findViewById(R.id.checkbox_feminino_paciente);
        checkboxMasculinoPaciente = findViewById(R.id.checkbox_masculino_paciente);
        checkboxOutroPaciente = findViewById(R.id.checkbox_outro_paciente);
        editTextPesoPaciente = findViewById(R.id.editText_peso_paciente);
        editTextAlturaPaciente = findViewById(R.id.editText_altura_paciente);
        editTextEnderecoPaciente = findViewById(R.id.editText_endereco_paciente);
        editTextCidadePaciente = findViewById(R.id.editText_cidade_paciente);
        editTextTelefonePaciente = findViewById(R.id.editText_telefone_paciente);
        editTextEmailPaciente = findViewById(R.id.editText_email_paciente);
        editTextCpfPaciente = findViewById(R.id.editText_cpf_paciente);
        editTextProfissaoPaciente = findViewById(R.id.editText_profissao_paciente);
        checkboxEducacaoInfantilIncompletoPaciente = findViewById(R.id.checkbox_educacao_infantil_incompleto_paciente);
        checkboxEducacaoInfantilCompletoPaciente = findViewById(R.id.checkbox_educacao_infantil_completo_paciente);
        checkboxFundamentalIncompletoPaciente = findViewById(R.id.checkbox_fundamental_incompleto_paciente);
        checkboxFundamentalCompletoPaciente = findViewById(R.id.checkbox_fundamental_completo_paciente);
        checkboxMedioIncompletoPaciente = findViewById(R.id.checkbox_medio_incompleto_paciente);
        checkboxMedioCompletoPaciente = findViewById(R.id.checkbox_medio_completo_paciente);
        checkboxSuperiorIncompletoPaciente = findViewById(R.id.checkbox_superior_incompleto_paciente);
        checkboxSuperiorCompletoPaciente = findViewById(R.id.checkbox_superior_completo_paciente);
        checkboxPosGraduacaoPaciente = findViewById(R.id.checkbox_pos_graduacao_paciente);
        checkboxMestradoPaciente = findViewById(R.id.checkbox_mestrado_paciente);
        checkboxDoutoradoPaciente = findViewById(R.id.checkbox_doutorado_paciente);
        // Tipo sanguíneo
        antecedentes_checkbox_a_positivo = findViewById(R.id.checkbox_tipo_a_positivo);
        antecedentes_checkbox_a_negativo = findViewById(R.id.checkbox_tipo_a_negativo);
        antecedentes_checkbox_b_positivo = findViewById(R.id.checkbox_tipo_b_positivo);
        antecedentes_checkbox_b_negativo = findViewById(R.id.checkbox_tipo_b_negativo);
        antecedentes_checkbox_ab_positivo = findViewById(R.id.checkbox_tipo_ab_positivo);
        antecedentes_checkbox_ab_negativo = findViewById(R.id.checkbox_tipo_ab_negativo);
        antecedentes_checkbox_o_positivo = findViewById(R.id.checkbox_tipo_o_positivo);
        antecedentes_checkbox_o_negativo = findViewById(R.id.checkbox_tipo_o_negativo);

// Alergias
        antecedentes_input_text_alergias = findViewById(R.id.editText_alergias_antecedentes);

// Consome tabaco
        antecedentes_checkbox_sim_tabaco = findViewById(R.id.checkbox_sim_tabaco);
        antecedentes_checkbox_nao_tabaco = findViewById(R.id.checkbox_nao_tabaco);
        antecedentes_checkbox_nunca_fumei = findViewById(R.id.checkbox_nunca_fumei_tabaco);

// Quantidade tabaco
        antecedentes_input_text_quantidade_tabaco = findViewById(R.id.editText_quantidade_tabaco_antecedentes);

// Consome bebidas alcoólicas
        antecedentes_checkbox_sim_bebidas = findViewById(R.id.checkbox_sim_bebidas);
        antecedentes_checkbox_nao_bebidas = findViewById(R.id.checkbox_nao_bebidas);

// Frequência de ingestão de bebidas alcoólicas
        antecedentes_checkbox_nunca_bebidas = findViewById(R.id.checkbox_nunca_bebidas);
        antecedentes_checkbox_mensalmente_bebidas = findViewById(R.id.checkbox_mensalmente_bebidas);
        antecedentes_checkbox_2_4_vezes_bebidas = findViewById(R.id.checkbox_2_4_vezes_bebidas);
        antecedentes_checkbox_2_3_vezes_bebidas = findViewById(R.id.checkbox_2_3_vezes_bebidas);
        antecedentes_checkbox_4_mais_vezes_bebidas = findViewById(R.id.checkbox_4_mais_vezes_bebidas);

// Uso de outras substâncias psicoativas
        antecedentes_checkbox_nao_substancias = findViewById(R.id.checkbox_nao_substancias);
        antecedentes_checkbox_sim_estimulantes = findViewById(R.id.checkbox_sim_estimulantes);
        antecedentes_checkbox_sim_perturbadoras = findViewById(R.id.checkbox_sim_perturbadoras);
        antecedentes_checkbox_sim_depressoras = findViewById(R.id.checkbox_sim_depressoras);

// Alimentação
        antecedentes_checkbox_cafe_da_manha = findViewById(R.id.checkbox_cafe_da_manha);
        antecedentes_checkbox_lanche_da_manha = findViewById(R.id.checkbox_lanche_da_manha);
        antecedentes_checkbox_almoco = findViewById(R.id.checkbox_almoco);
        antecedentes_checkbox_lanche_da_tarde = findViewById(R.id.checkbox_lanche_da_tarde);
        antecedentes_checkbox_jantar = findViewById(R.id.checkbox_jantar);
        antecedentes_checkbox_ceia = findViewById(R.id.checkbox_ceia);

// Porções de frutas
        antecedentes_checkbox_1_porcao_fruta = findViewById(R.id.checkbox_1_porcao_fruta);
        antecedentes_checkbox_2_porcoes_fruta = findViewById(R.id.checkbox_2_porcoes_fruta);
        antecedentes_checkbox_3_porcoes_fruta = findViewById(R.id.checkbox_3_porcoes_fruta);
        antecedentes_checkbox_4_porcoes_fruta = findViewById(R.id.checkbox_4_porcoes_fruta);
        antecedentes_checkbox_5_porcoes_fruta = findViewById(R.id.checkbox_5_porcoes_fruta);
        antecedentes_checkbox_6_ou_mais_porcoes_fruta = findViewById(R.id.checkbox_6_ou_mais_porcoes_fruta);

// Porções de verduras
        antecedentes_checkbox_1_porcao_verdura = findViewById(R.id.checkbox_1_porcao_verdura);
        antecedentes_checkbox_2_porcoes_verdura = findViewById(R.id.checkbox_2_porcoes_verdura);
        antecedentes_checkbox_3_porcoes_verdura = findViewById(R.id.checkbox_3_porcoes_verdura);
        antecedentes_checkbox_4_porcoes_verdura = findViewById(R.id.checkbox_4_porcoes_verdura);
        antecedentes_checkbox_5_porcoes_verdura = findViewById(R.id.checkbox_5_porcoes_verdura);
        antecedentes_checkbox_6_ou_mais_porcoes_verdura = findViewById(R.id.checkbox_6_ou_mais_porcoes_verdura);

// Consumo de água
        antecedentes_checkbox_sim_agua = findViewById(R.id.checkbox_sim_agua);
        antecedentes_checkbox_nao_agua = findViewById(R.id.checkbox_nao_agua);


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