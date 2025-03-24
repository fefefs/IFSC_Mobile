package com.ifsc.contaclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int i = 0;
    EditText edPeso,edAltura;
    TextView tvResultado;
    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        edPeso=findViewById((R.id.editTxtPeso));
        edAltura=findViewById(R.id.editTxtAltura);
        tvResultado=findViewById(R.id.tvResultadoImc);
        buttonCalcular=findViewById(R.id.button);
        buttonCalcular.setOnClickListener(v ->{
            //calcular imc
            float peso,altura,imc;
            peso = Float.parseFloat(edPeso.getText().toString());
            altura = Float.parseFloat(edAltura.getText().toString());

            imc = (peso/(altura * altura));

            tvResultado.setText(Float.toString(imc));
        });

    }
}