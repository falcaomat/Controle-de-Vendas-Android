package com.exemplo.vendasapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class VendasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendas);

        // Aqui você pode adicionar o código para registrar vendas
        Toast.makeText(this, "Vendas registradas com sucesso", Toast.LENGTH_SHORT).show();
    }
}
