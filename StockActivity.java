package com.exemplo.vendasapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class StockActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

        // Aqui você pode adicionar o código para controlar o estoque
        Toast.makeText(this, "Estoque atualizado", Toast.LENGTH_SHORT).show();
    }
}
