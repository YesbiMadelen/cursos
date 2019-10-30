package com.virual.entornosvirtuales;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

public class Menuclases extends AppCompatActivity implements View.OnClickListener{


    Button perfil;
    Button Cursos;
    Button Organizador;
    Button Pagos;
    Button Ajustes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuclases);

        perfil=(Button)findViewById(R.id.perfiluser);
        Cursos=(Button)findViewById(R.id.cursos);
        Organizador=(Button)findViewById(R.id.organizador);
        Pagos =(Button)findViewById(R.id.pagos);
        Ajustes =(Button)findViewById(R.id.ajustes);


        perfil.setOnClickListener(this);
        Cursos.setOnClickListener(this);
        Organizador.setOnClickListener(this);
        Pagos.setOnClickListener(this);
        Ajustes.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.perfiluser:
                Intent intent1 = new Intent(this,perfilUsuario.class);
                startActivity(intent1);

                break;
            case R.id.cursos:
                Intent intent = new Intent(this,listaCursos.class);
                startActivity(intent);
                break;
            case R.id.organizador:
                break;
            case R.id.pagos:
                break;
            case R.id.ajustes:
                break;

            }
    }
}
