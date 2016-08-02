package com.android.guix.edson.org.appfinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class RegistroActivity extends AppCompatActivity {

    @Bind(R.id.textView3)
    TextView textView3;
    @Bind(R.id.idMate)
    EditText idMate;
    @Bind(R.id.idIngles)
    EditText idIngles;
    @Bind(R.id.idReli)
    EditText idReli;
    @Bind(R.id.idTaller)
    EditText idTaller;
    @Bind(R.id.idDibujo)
    EditText idDibujo;
    @Bind(R.id.idCalculo)
    EditText idCalculo;
    @Bind(R.id.idTeoria)
    EditText idTeoria;
    @Bind(R.id.idEstadistica)
    EditText idEstadistica;
    @Bind(R.id.idConferencia)
    EditText idConferencia;
    @Bind(R.id.btnCalcular)
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnCalcular)
    public void calcular(View v) {
        int n1 = Integer.parseInt(idMate.getText().toString());
        int n2 = Integer.parseInt(idIngles.getText().toString());
        int n3 = Integer.parseInt(idReli.getText().toString());
        int n4 = Integer.parseInt(idTaller.getText().toString());
        int n5 = Integer.parseInt(idDibujo.getText().toString());
        int n6 = Integer.parseInt(idCalculo.getText().toString());
        int n7 = Integer.parseInt(idTeoria.getText().toString());
        int n8 = Integer.parseInt(idEstadistica.getText().toString());

        int n13 = Integer.parseInt(idConferencia.getText().toString());

        int promedio = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n13) / 9;
        if ((promedio > 70) && (promedio < 85)) {
            mostrar1(promedio);
        } else if (promedio < 70) {
            mostrar2(promedio);
        }
        if (promedio > 85) {
            mostrar3(promedio);
        }
    }

    private void mostrar1(int res) {
        Toast.makeText(this, "Puedes mejorar: " + res, Toast.LENGTH_LONG).show();
    }

    private void mostrar2(int res) {
        Toast.makeText(this, "Debes mejorar en tus notas: " + res, Toast.LENGTH_LONG).show();
    }

    private void mostrar3(int res) {
        Toast.makeText(this, "Eres un excelente alumno: " + res, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            about();
        }
        return super.onOptionsItemSelected(item);
    }

    private void about(){
        PromedioApp app = (PromedioApp) getApplication();
        String strUrl = app.getAboutUrl();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(strUrl));
        startActivity(i);
    }
}
