package com.ifsc.contaclick;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    EditText nome;
    Button salvar;

    ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = openOrCreateDatabase("banco", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS notas(id INTEGER PRIMARY KEY AUTOINCREMENT, txt VARCHAR)");

        nome = findViewById(R.id.edTextNome);
        salvar = findViewById(R.id.button);
        lista = findViewById(R.id.listView);

        salvar.setOnClickListener(v ->{
            String msg = nome.getText().toString();
            insereNota(msg);
        });


    }

    public void listagemNotas(){
        Cursor cursor = db.rawQuery("SELECT * FROM notas", null);
        cursor.moveToFirst();
        ArrayList<String> listaNotass = new ArrayList<String>();
        while (!cursor.isAfterLast()){
            int coluna = cursor.getColumnIndex("txt");
            listaNotass.add(cursor.getString(coluna));
            cursor.moveToNext();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listaNotass);
        lista.setAdapter(adapter);
    }

    public void insereNota(String txt){
        ContentValues cv = new ContentValues();
        cv.put("txt",txt);
        db.insert("notas", null, cv);
        listagemNotas();
    }

}