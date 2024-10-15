package com.example.appsaude;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TreinoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treino); // Certifique-se de que este arquivo XML contém a nova seção

        // Links do YouTube para DOR CRÔNICA
        final String[] urlsCronica = {
                "https://www.youtube.com/shorts/FkfIKGzbo0w?feature=share",
                "https://www.youtube.com/shorts/v-81lWPJrfw?feature=share",
                "https://www.youtube.com/shorts/TqUcMzEj7vY?feature=share",
                "https://www.youtube.com/shorts/jwlWoBd6ajQ?feature=share",
                "https://www.youtube.com/shorts/9y0dfRj2YP0?feature=share",
                "https://www.youtube.com/shorts/4XtMFkZWmBY?feature=share"
        };

        // Links do YouTube para DOR AGUDA
        final String[] urlsAguda = {
                "https://www.youtube.com/shorts/Tlqq5a46Qzs?feature=share",
                "https://www.youtube.com/shorts/2HBRXMT-npA?feature=share",
                "https://www.youtube.com/shorts/cwJxhicf_hk?feature=share",
                "https://www.youtube.com/shorts/WXGAdbdCyo8?feature=share",
                "https://www.youtube.com/shorts/riPnYQAnrPc?feature=share"
        };

        // Adiciona os listeners de clique aos TextViews de DOR CRÔNICA
        findViewById(R.id.textViewLink1).setOnClickListener(v -> openLink(urlsCronica[0]));
        findViewById(R.id.textViewLink2).setOnClickListener(v -> openLink(urlsCronica[1]));
        findViewById(R.id.textViewLink3).setOnClickListener(v -> openLink(urlsCronica[2]));
        findViewById(R.id.textViewLink4).setOnClickListener(v -> openLink(urlsCronica[3]));
        findViewById(R.id.textViewLink5).setOnClickListener(v -> openLink(urlsCronica[4]));
        findViewById(R.id.textViewLink6).setOnClickListener(v -> openLink(urlsCronica[5]));

        // Adiciona os listeners de clique aos TextViews de DOR AGUDA
        findViewById(R.id.textViewLink7).setOnClickListener(v -> openLink(urlsAguda[0]));
        findViewById(R.id.textViewLink8).setOnClickListener(v -> openLink(urlsAguda[1]));
        findViewById(R.id.textViewLink9).setOnClickListener(v -> openLink(urlsAguda[2]));
        findViewById(R.id.textViewLink10).setOnClickListener(v -> openLink(urlsAguda[3]));
        findViewById(R.id.textViewLink11).setOnClickListener(v -> openLink(urlsAguda[4]));
    }

    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}