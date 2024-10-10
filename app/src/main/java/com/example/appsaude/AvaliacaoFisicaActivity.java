package com.example.appsaude;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AvaliacaoFisicaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao); // Crie um arquivo XML correspondente


        CheckBox checkbox_alinhamento_simetria_anterior_preservado_paciente = findViewById(R.id.checkbox_alinhamento_simetria_anterior_preservado_paciente);
        CheckBox checkbox_alinhamento_simetria_anterior_alterado_paciente = findViewById(R.id.checkbox_alinhamento_simetria_anterior_alterado_paciente);
        CheckBox checkbox_alinhamento_simetria_lateral_preservado_paciente = findViewById(R.id.checkbox_alinhamento_simetria_lateral_preservado_paciente);
        CheckBox checkbox_alinhamento_simetria_lateral_alterado_paciente = findViewById(R.id.checkbox_alinhamento_simetria_lateral_alterado_paciente);
        CheckBox checkbox_alinhamento_simetria_posterior_preservado_paciente = findViewById(R.id.checkbox_alinhamento_simetria_posterior_preservado_paciente);
        CheckBox checkbox_alinhamento_simetria_posterior_alterado_paciente = findViewById(R.id.checkbox_alinhamento_simetria_posterior_alterado_paciente);
        CheckBox checkbox_marcha_normal_paciente = findViewById(R.id.checkbox_marcha_normal_paciente);
        CheckBox checkbox_marcha_trendelemburg_direita_paciente = findViewById(R.id.checkbox_marcha_trendelemburg_direita_paciente);
        CheckBox checkbox_marcha_trendelemburg_esquerda_paciente = findViewById(R.id.checkbox_marcha_trendelemburg_esquerda_paciente);
        CheckBox checkbox_marcha_antalgiaca_direita_paciente = findViewById(R.id.checkbox_marcha_antalgiaca_direita_paciente);
        CheckBox checkbox_marcha_antalgiaca_esquerda_paciente = findViewById(R.id.checkbox_marcha_antalgiaca_esquerda_paciente);
        CheckBox checkbox_marcha_claudicacao_direita_paciente = findViewById(R.id.checkbox_marcha_claudicacao_direita_paciente);
        CheckBox checkbox_marcha_claudicacao_esquerda_paciente = findViewById(R.id.checkbox_marcha_claudicacao_esquerda_paciente);
        CheckBox checkbox_coluna_cervical_paciente = findViewById(R.id.checkbox_coluna_cervical_paciente);
        CheckBox checkbox_coluna_cervical_dor_paciente = findViewById(R.id.checkbox_coluna_cervical_dor_paciente);
        CheckBox checkbox_coluna_cervical_deficit_paciente = findViewById(R.id.checkbox_coluna_cervical_deficit_paciente);
        EditText editText_deformidade_coluna_paciente = findViewById(R.id.editText_deformidade_coluna_paciente);

        CheckBox checkbox_sinal_romberg_negativo_paciente = findViewById(R.id.checkbox_sinal_romberg_negativo_paciente);
        CheckBox checkbox_sinal_romberg_positivo_paciente = findViewById(R.id.checkbox_sinal_romberg_positivo_paciente);
        EditText editText_face_anterior_paciente = findViewById(R.id.editText_face_anterior_paciente);
        EditText editText_face_posterior_paciente = findViewById(R.id.editText_face_posterior_paciente);
        EditText editText_musculos_paciente = findViewById(R.id.editText_musculos_paciente);
        CheckBox checkbox_flexao_coluna_lombar_normal_paciente = findViewById(R.id.checkbox_flexao_coluna_lombar_normal_paciente);
        CheckBox checkbox_flexao_coluna_lombar_restricao_paciente = findViewById(R.id.checkbox_flexao_coluna_lombar_restricao_paciente);
        CheckBox checkbox_flexao_coluna_lombar_compensacao_paciente = findViewById(R.id.checkbox_flexao_coluna_lombar_compensacao_paciente);
        CheckBox checkbox_flexao_coluna_lombar_dor_paciente = findViewById(R.id.checkbox_flexao_coluna_lombar_dor_paciente);


        EditText movimento1DorsiflexaoTornozeloPaciente = findViewById(R.id.editText_movimento1_dorsiflexao_tornozelo_paciente);
        EditText movimento2FlexaoPlantarTornozeloPaciente = findViewById(R.id.editText_movimento2_flexao_plantar_tornozelo_paciente);
        EditText movimento3FlexaoJoelhoPaciente = findViewById(R.id.editText_movimento3_flexao_joelho_paciente);
        EditText movimento4ExtensaoJoelhoPaciente = findViewById(R.id.editText_movimento4_extensao_joelho_paciente);
        EditText movimento5FlexaoQuadrilPaciente = findViewById(R.id.editText_movimento5_flexao_quadril_paciente);
        EditText movimento6ExtensaoQuadrilPaciente = findViewById(R.id.editText_movimento6_extensao_quadril_paciente);
        EditText movimento7AducaoQuadrilPaciente = findViewById(R.id.editText_movimento7_aducao_quadril_paciente);
        EditText movimento8AbducaoQuadrilPaciente = findViewById(R.id.editText_movimento8_abducao_quadril_paciente);
        EditText movimento9FlexaoTroncoPaciente = findViewById(R.id.editText_movimento9_flexao_tronco_paciente);
        EditText movimento10ExtensaoTroncoPaciente = findViewById(R.id.editText_movimento10_extensao_tronco_paciente);
        EditText movimento11FlexaoLateralTroncoPaciente = findViewById(R.id.editText_movimento11_flexao_lateral_tronco_paciente);
        EditText movimento12FlexaoPunhoPaciente = findViewById(R.id.editText_movimento12_flexao_punho_paciente);
        EditText movimento13ExtensaoPunhoPaciente = findViewById(R.id.editText_movimento13_extensao_punho_paciente);
        EditText movimento14FlexaoCotoveloPaciente = findViewById(R.id.editText_movimento14_flexao_cotovelo_paciente);
        EditText movimento15ExtensaoCotoveloPaciente = findViewById(R.id.editText_movimento15_extensao_cotovelo_paciente);
        EditText movimento16AducaoPosteriorOmbroPaciente = findViewById(R.id.editText_movimento16_aducao_posterior_ombro_paciente);
        EditText movimento17ExtensaoAdPosteriorOmbroPaciente = findViewById(R.id.editText_movimento17_extensao_ad_posterior_ombro_paciente);
        EditText movimento18ExtensaoPosteriorOmbroPaciente = findViewById(R.id.editText_movimento18_extensao_posterior_ombro_paciente);
        EditText movimento19RotacaoLateralOmbroPaciente = findViewById(R.id.editText_movimento19_rotacao_lateral_ombro_paciente);
        EditText movimento20RotacaoMedialOmbroPaciente = findViewById(R.id.editText_movimento20_rotacao_medial_ombro_paciente);

    }
}