package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    int i = 0;

    ListView lista;

    String [] nomes = new String[]{"Mercúrio","Vênus","Terra","Marte","Júpiter","Saturno","Urano","Netuno"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("ciclo de vida", "metodo onCreate");

        setContentView(R.layout.activity_main);
        lista= findViewById(R.id.listView);

        //Adaptador
        ArrayAdapter<String> arrayAdapterNomes=new ArrayAdapter(this, R.layout.item_lista, R.id.textView2, nomes);

        lista.setAdapter(arrayAdapterNomes);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String nome = nomes[position];

                Intent intent = new Intent(getApplicationContext(), Planetas.class);
                intent.putExtra("Nome", nome);

            }
        });



    }

}