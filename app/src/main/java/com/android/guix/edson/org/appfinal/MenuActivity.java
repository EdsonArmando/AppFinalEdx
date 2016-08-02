package com.android.guix.edson.org.appfinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    @Bind(R.id.button3)
    Button button3;
    @Bind(R.id.button)
    Button button;
    @Bind(R.id.button2)
    Button button2;
    @Bind(R.id.btnKinal)
    Button btnKinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void acercade(View v) {
        Intent intent = new Intent(this, AcercaDeActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button2)
    public void cursos(View v) {
        Intent intent = new Intent(this, CursosActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button3)
    public void promedio(View v) {
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnKinal)
    public void kinal(View v) {
        Uri uriUrl = Uri.parse("http://www.kinal.org.gt/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(intent);
    }


}
