package com.android.guix.edson.org.appfinal;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CursosActivity extends AppCompatActivity {
    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    private ListView list;
    private String[] sistemas = {"Matemáticas", "Religión", "Taller", "Ingles", "Teoria",
            "Dibujo", "Estadistica", "Seminario", "Conferencias", "Cálculo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
       ListView list = (ListView)findViewById(R.id.listView);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, sistemas);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> padre, View v, int posicionSeleccionada, long id) {
               switch (posicionSeleccionada){
                   case 0:
                       Toast.makeText(getApplicationContext(), "El profesor de la clase es Ceferino Rodriguez " , Toast.LENGTH_LONG).show();
                       break;
                   case 1:
                        Toast.makeText(getApplicationContext(), "El profesor de la clase es Marlon Estrada " , Toast.LENGTH_LONG).show();
                       break;
                   case 2:
                         Toast.makeText(getApplicationContext(), "El profesor de la clase es Jorge Echeverria " , Toast.LENGTH_LONG).show();
                       break;
                   case 3:
                        Toast.makeText(getApplicationContext(), "El profesor de la clase es Carlos Cabrera " , Toast.LENGTH_LONG).show();
                       break;
                   case 4:
                       Toast.makeText(getApplicationContext(), "El profesor de la clase es Jorge Echeverria  " , Toast.LENGTH_LONG).show();
                       break;
                   case 5:
                       Toast.makeText(getApplicationContext(), "El profesor de la clase es Jorge Echeverria  " , Toast.LENGTH_LONG).show();
                       break;
                   case 6:
                       Toast.makeText(getApplicationContext(), "El profesor de la clase es Juan Pablo Elel  " , Toast.LENGTH_LONG).show();
                       break;
                   case 7:
                       Toast.makeText(getApplicationContext(), "El profesor de la clase es Jorge Echeverria  " , Toast.LENGTH_LONG).show();
                       break;
                   case 8:
                       Toast.makeText(getApplicationContext(), "El profesor de la clase es Darwin Coronado" , Toast.LENGTH_LONG).show();
                       break;
                   case 9:
                       Toast.makeText(getApplicationContext(), "El profesor de la clase es Jorge Echeverria  " , Toast.LENGTH_LONG).show();
                       break;
               }
            }

        });
    }


}
