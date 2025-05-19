package com.ifsc.contaclick;

import static com.ifsc.contaclick.R.id.imgPlaneta;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Planetas extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela_planetas);

        Bundle bundle = getIntent().getExtras();
        Planeta p =(Planeta) bundle.getSerializable("Planeta");



        TextView NomeP = findViewById(R.id.textView3);
        NomeP.setText(p.nome);

        ImageView imgP = findViewById(R.id.imgPlaneta);
        imgP.setImageResource(p.img);


    }
}


















