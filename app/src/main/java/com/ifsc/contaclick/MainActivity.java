package com.ifsc.contaclick;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int i = 0;

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= findViewById(R.id.listView);

        PlanetaDAO planetaDAO= new PlanetaDAO();

        AdapterPlaneta ap = new AdapterPlaneta(this,R.layout.item_lista,planetaDAO.getPlanetas());
        lv.setAdapter(ap);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), Planetas.class);

                int positionR = position;
                getIntent().putExtra("Position", positionR);


                Planeta p = planetaDAO.getPlanetas().get(position);
                i.putExtra("Planeta", p);



                startActivity(i);
            }
        });


    }

}