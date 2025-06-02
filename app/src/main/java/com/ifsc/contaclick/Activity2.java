package com.ifsc.contaclick;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 {

    SQLiteDatabase db;
    TextView lvnome , lvnota;
    Button btnCancelar, btnEditar, btnExcluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        lvnome = findViewById(R.id.lblNome);
        lvnota = findViewById(R.id.lblNota);
        btnCancelar = findViewById(R.id.btnCancelar);
        btnEditar = findViewById(R.id.btnEdicao);
        btnExcluir = findViewById(R.id.btnExcluir);

        salvar.setOnClickListener(v ->{
            String msg = nome.getText().toString();
            insereNota(msg);
        });


    }
}
