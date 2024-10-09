package com.example.appsaude;

import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AnamneseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anamnese);

        // Inicialização dos campos
        EditText editTextEmail = findViewById(R.id.editText_email);
        EditText editTextDataAplicacao = findViewById(R.id.editText_data_aplicacao);
        EditText editTextHoraAplicacao = findViewById(R.id.editText_hora_aplicacao);
        EditText editTextNomeAvaliador = findViewById(R.id.editText_nome_avaliador);
        CheckBox checkBoxEstagiario = findViewById(R.id.checkbox_estagiario);
        CheckBox checkBoxProfissional = findViewById(R.id.checkbox_profissional);
        EditText editTextNomePaciente = findViewById(R.id.editText_nome_paciente);
        EditText editTextDataNascimentoPaciente = findViewById(R.id.editText_data_nascimento_paciente);
        EditText editTextIdadePaciente = findViewById(R.id.editText_idade_paciente);
        CheckBox checkboxFemininoPaciente = findViewById(R.id.checkbox_feminino_paciente);
        CheckBox checkboxMasculinoPaciente = findViewById(R.id.checkbox_masculino_paciente);
        CheckBox checkboxOutroPaciente = findViewById(R.id.checkbox_outro_paciente);
        EditText editTextPesoPaciente = findViewById(R.id.editText_peso_paciente);
        EditText editTextAlturaPaciente = findViewById(R.id.editText_altura_paciente);
        EditText editTextEnderecoPaciente = findViewById(R.id.editText_endereco_paciente);
        EditText editTextCidadePaciente = findViewById(R.id.editText_cidade_paciente);
        EditText editTextTelefonePaciente = findViewById(R.id.editText_telefone_paciente);
        EditText editTextEmailPaciente = findViewById(R.id.editText_email_paciente);
        EditText teditTextCpfPaciente = findViewById(R.id.editText_cpf_paciente);
        EditText editTextProfissaoPaciente = findViewById(R.id.editText_profissao_paciente);
        CheckBox checkboxEducacaoInfantilIncompletoPaciente = findViewById(R.id.checkbox_educacao_infantil_incompleto_paciente);
        CheckBox checkboxEducacaoInfantilCompletoPaciente = findViewById(R.id.checkbox_educacao_infantil_completo_paciente);
        CheckBox checkboxFundamentalIncompletoPaciente = findViewById(R.id.checkbox_fundamental_incompleto_paciente);
        CheckBox checkboxFundamentalCompletoPaciente = findViewById(R.id.checkbox_fundamental_completo_paciente);
        CheckBox checkboxMedioIncompletoPaciente = findViewById(R.id.checkbox_medio_incompleto_paciente);
        CheckBox checkboxMedioCompletoPaciente = findViewById(R.id.checkbox_medio_completo_paciente);
        CheckBox xcheckboxSuperiorIncompletoPaciente = findViewById(R.id.checkbox_superior_incompleto_paciente);
        CheckBox checkboxSuperiorCompletoPaciente = findViewById(R.id.checkbox_superior_completo_paciente);
        CheckBox checkboxPosGraduacaoPaciente = findViewById(R.id.checkbox_pos_graduacao_paciente);
        CheckBox checkboxMestradoPaciente = findViewById(R.id.checkbox_mestrado_paciente);
        CheckBox checkboxDoutoradoPaciente = findViewById(R.id.checkbox_doutorado_paciente);
        // Tipo sanguíneo
        CheckBox antecedentes_checkbox_a_positivo = findViewById(R.id.checkbox_tipo_a_positivo);
        CheckBox antecedentes_checkbox_a_negativo = findViewById(R.id.checkbox_tipo_a_negativo);
        CheckBox antecedentes_checkbox_b_positivo = findViewById(R.id.checkbox_tipo_b_positivo);
        CheckBox antecedentes_checkbox_b_negativo = findViewById(R.id.checkbox_tipo_b_negativo);
        CheckBox antecedentes_checkbox_ab_positivo = findViewById(R.id.checkbox_tipo_ab_positivo);
        CheckBox antecedentes_checkbox_ab_negativo = findViewById(R.id.checkbox_tipo_ab_negativo);
        CheckBox antecedentes_checkbox_o_positivo = findViewById(R.id.checkbox_tipo_o_positivo);
        CheckBox antecedentes_checkbox_o_negativo = findViewById(R.id.checkbox_tipo_o_negativo);

// Alergias
        EditText antecedentes_input_text_alergias = findViewById(R.id.editText_alergias_antecedentes);

// Consome tabaco
        CheckBox antecedentes_checkbox_sim_tabaco = findViewById(R.id.checkbox_sim_tabaco);
        CheckBox antecedentes_checkbox_nao_tabaco = findViewById(R.id.checkbox_nao_tabaco);
        CheckBox antecedentes_checkbox_nunca_fumei = findViewById(R.id.checkbox_nunca_fumei_tabaco);

// Quantidade tabaco
        EditText antecedentes_input_text_quantidade_tabaco = findViewById(R.id.editText_quantidade_tabaco_antecedentes);

// Consome bebidas alcoólicas
        CheckBox antecedentes_checkbox_sim_bebidas = findViewById(R.id.checkbox_sim_bebidas);
        CheckBox antecedentes_checkbox_nao_bebidas = findViewById(R.id.checkbox_nao_bebidas);

// Frequência de ingestão de bebidas alcoólicas
        CheckBox antecedentes_checkbox_nunca_bebidas = findViewById(R.id.checkbox_nunca_bebidas);
        CheckBox antecedentes_checkbox_mensalmente_bebidas = findViewById(R.id.checkbox_mensalmente_bebidas);
        CheckBox antecedentes_checkbox_2_4_vezes_bebidas = findViewById(R.id.checkbox_2_4_vezes_bebidas);
        CheckBox antecedentes_checkbox_2_3_vezes_bebidas = findViewById(R.id.checkbox_2_3_vezes_bebidas);
        CheckBox antecedentes_checkbox_4_mais_vezes_bebidas = findViewById(R.id.checkbox_4_mais_vezes_bebidas);

// Uso de outras substâncias psicoativas
        CheckBox antecedentes_checkbox_nao_substancias = findViewById(R.id.checkbox_nao_substancias);
        CheckBox antecedentes_checkbox_sim_estimulantes = findViewById(R.id.checkbox_sim_estimulantes);
        CheckBox antecedentes_checkbox_sim_perturbadoras = findViewById(R.id.checkbox_sim_perturbadoras);
        CheckBox antecedentes_checkbox_sim_depressoras = findViewById(R.id.checkbox_sim_depressoras);

// Alimentação
        CheckBox antecedentes_checkbox_cafe_da_manha = findViewById(R.id.checkbox_cafe_da_manha);
        CheckBox antecedentes_checkbox_lanche_da_manha = findViewById(R.id.checkbox_lanche_da_manha);
        CheckBox antecedentes_checkbox_almoco = findViewById(R.id.checkbox_almoco);
        CheckBox antecedentes_checkbox_lanche_da_tarde = findViewById(R.id.checkbox_lanche_da_tarde);
        CheckBox antecedentes_checkbox_jantar = findViewById(R.id.checkbox_jantar);
        CheckBox antecedentes_checkbox_ceia = findViewById(R.id.checkbox_ceia);

// Porções de frutas
        CheckBox antecedentes_checkbox_1_porcao_fruta = findViewById(R.id.checkbox_1_porcao_fruta);
        CheckBox antecedentes_checkbox_2_porcoes_fruta = findViewById(R.id.checkbox_2_porcoes_fruta);
        CheckBox antecedentes_checkbox_3_porcoes_fruta = findViewById(R.id.checkbox_3_porcoes_fruta);
        CheckBox  antecedentes_checkbox_4_porcoes_fruta = findViewById(R.id.checkbox_4_porcoes_fruta);
        CheckBox antecedentes_checkbox_5_porcoes_fruta = findViewById(R.id.checkbox_5_porcoes_fruta);
        CheckBox antecedentes_checkbox_6_ou_mais_porcoes_fruta = findViewById(R.id.checkbox_6_ou_mais_porcoes_fruta);

// Porções de verduras
        CheckBox antecedentes_checkbox_1_porcao_verdura = findViewById(R.id.checkbox_1_porcao_verdura);
        CheckBox antecedentes_checkbox_2_porcoes_verdura = findViewById(R.id.checkbox_2_porcoes_verdura);
        CheckBox antecedentes_checkbox_3_porcoes_verdura = findViewById(R.id.checkbox_3_porcoes_verdura);
        CheckBox antecedentes_checkbox_4_porcoes_verdura = findViewById(R.id.checkbox_4_porcoes_verdura);
        CheckBox antecedentes_checkbox_5_porcoes_verdura = findViewById(R.id.checkbox_5_porcoes_verdura);
        CheckBox antecedentes_checkbox_6_ou_mais_porcoes_verdura = findViewById(R.id.checkbox_6_ou_mais_porcoes_verdura);

        // Consumo de água
        CheckBox antecedentes_checkbox_sim_agua = findViewById(R.id.checkbox_sim_agua);
        CheckBox antecedentes_checkbox_nao_agua = findViewById(R.id.checkbox_nao_agua);

        // Horas de Sono

        CheckBox checkboxMenosDeQuatroHoras = findViewById(R.id.checkbox_menos_de_quatro_horas);
        CheckBox checkboxEntreQuatroESexoHoras = findViewById(R.id.checkbox_entre_quatro_e_seis_horas);
        CheckBox checkboxEntreSeisEOitoHoras = findViewById(R.id.checkbox_entre_seis_e_oito_horas);
        CheckBox checkboxMaisDeOitoHoras = findViewById(R.id.checkbox_mais_de_oito_horas);

// Fatores que interferem no sono

        EditText editTextFatoresSono = findViewById(R.id.editText_fatores_sono);

// Prática de atividades físicas

        CheckBox checkboxNuncaPraticaAtividade = findViewById(R.id.checkbox_nunca_pratica_atividade);
        CheckBox checkboxRaramentePraticaAtividade = findViewById(R.id.checkbox_raramente_pratica_atividade);
        CheckBox checkboxOcasionalmentePraticaAtividade = findViewById(R.id.checkbox_ocasionamente_pratica_atividade);
        CheckBox checkboxFrequentementePraticaAtividade = findViewById(R.id.checkbox_frequentemente_pratica_atividade);
        CheckBox checkboxMuitoFrequentementePraticaAtividade = findViewById(R.id.checkbox_muito_frequentemente_pratica_atividade);


        EditText editTextOcorrenciaHdlPaciente = findViewById(R.id.editText_ocorrencia_hdl_paciente);
        EditText editTextProblemasSaudePaciente = findViewById(R.id.editText_problemas_saude_paciente);
        EditText editTextMedicamentosPaciente = findViewById(R.id.editText_medicamentos_paciente);

        // Tipos de atividades físicas
        CheckBox checkboxExerciciosAerobicos = findViewById(R.id.checkbox_exercicios_aerobicos);
        CheckBox checkboxExerciciosForcaMuscular = findViewById(R.id.checkbox_exercicios_forca_muscular);
        CheckBox checkboxExerciciosFlexibilidade = findViewById(R.id.checkbox_exercicios_flexibilidade);
        CheckBox checkboxExerciciosVelocidade = findViewById(R.id.checkbox_exercicios_velocidade);
        CheckBox checkboxNaoPraticouAtividade = findViewById(R.id.checkbox_nao_praticou_atividade);
        CheckBox checkboxFraquezaMuscularPaciente = findViewById(R.id.checkbox_fraqueza_muscular_paciente);
        CheckBox checkboxPerdaMobilidadePaciente = findViewById(R.id.checkbox_perda_mobilidade_paciente);
        CheckBox checkboxRigidezMatutinaPaciente = findViewById(R.id.checkbox_rigidez_matutina_paciente);
        CheckBox checkboxDorTosseEspirroPaciente = findViewById(R.id.checkbox_dor_tosse_espirro_paciente);
        CheckBox checkboxDorDefecacaoPaciente = findViewById(R.id.checkbox_dor_defecacao_paciente);
        CheckBox checkboxAnorexiaPaciente = findViewById(R.id.checkbox_anorexia_paciente);
        CheckBox checkboxEmagrecimentoRepentinoPaciente = findViewById(R.id.checkbox_emagrecimento_repentino_paciente);
        CheckBox checkboxAnsiedadePaciente = findViewById(R.id.checkbox_ansiedade_paciente);
        CheckBox checkboxDepressaoPaciente = findViewById(R.id.checkbox_depressao_paciente);
        CheckBox checkboxCinesiofobiaPaciente = findViewById(R.id.checkbox_cinesiofobia_paciente);
        CheckBox checkboxOutrosSintomasPaciente = findViewById(R.id.checkbox_outros_sintomas_paciente);


        EditText editTextPosturaCorporalPaciente = findViewById(R.id.editText_postura_corporal_paciente);

        EditText editTextSofaCadeirasPaciente = findViewById(R.id.editText_sofa_cadeiras_paciente);

        EditText editTextSonoColchaoPaciente = findViewById(R.id.editText_sono_colchao_paciente);

        CheckBox checkboxSubitoPaciente = findViewById(R.id.checkbox_subito_paciente);
        CheckBox checkboxGradualPaciente = findViewById(R.id.checkbox_gradual_paciente);
        CheckBox checkboxInsidiosaPaciente = findViewById(R.id.checkbox_insidiosa_paciente);
        CheckBox checkboxAgudaPaciente = findViewById(R.id.checkbox_aguda_paciente);
        CheckBox checkboxSubagudaPaciente = findViewById(R.id.checkbox_subaguda_paciente);
        CheckBox checkboxCronicaPaciente = findViewById(R.id.checkbox_cronica_paciente);
        CheckBox checkboxContinuaPaciente = findViewById(R.id.checkbox_continua_paciente);
        CheckBox checkboxIntermitentePaciente = findViewById(R.id.checkbox_intermitente_paciente);
        CheckBox checkboxDorAliviaRepousoPaciente = findViewById(R.id.checkbox_dor_alivia_reposo_paciente);
        CheckBox checkboxDorPioraRepousoPaciente = findViewById(R.id.checkbox_dor_piora_reposo_paciente);
        CheckBox checkboxDorAliviaMovimentoPaciente = findViewById(R.id.checkbox_dor_alivia_movimento_paciente);
        CheckBox checkboxDorPioraMovimentoPaciente = findViewById(R.id.checkbox_dor_piora_movimento_paciente);

        EditText editTextAcoesAliviarDorPaciente = findViewById(R.id.editText_acoes_aliviar_dor_paciente);
        EditText editTextAcoesPiorarDorPaciente = findViewById(R.id.editText_acoes_piorar_dor_paciente);



        RadioGroup radioGroupClassificacaoHDLPaciente = findViewById(R.id.radioGroup_classificacao_hdl_paciente);
        RadioButton radioEstagioIPaciente = findViewById(R.id.radio_estagio_I_paciente);
        RadioButton radioEstagioIIPaciente = findViewById(R.id.radio_estagio_II_paciente);
        RadioButton radioEstagioIIIPaciente = findViewById(R.id.radio_estagio_III_paciente);
        RadioButton radioEstagioIVPaciente = findViewById(R.id.radio_estagio_IV_paciente);
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