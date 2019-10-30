package com.virual.entornosvirtuales;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class listaCursos extends AppCompatActivity implements View.OnClickListener  {


    private Button Menuprincipal;

    ListView listacursos;
    ArrayList<curso> Lcursos= new ArrayList<curso>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);


        listacursos =(ListView)findViewById(R.id.listaC);




        cursoAdpter adaptador = new cursoAdpter(this, Lcursos);

       listacursos.setAdapter(adaptador);

            llenar_cursos();




    Menuprincipal =(Button)findViewById(R.id.menuprincipal);
    Menuprincipal.setOnClickListener(this);




    listacursos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long id) {





        }
    });





    }


    public void llenar_cursos() {



        Lcursos.add(new curso("Robotica","Diplomado",true ,R.drawable.f,"diplomado  en   robotica mecanica  con  bajo  coeficiente  de  rosamiento "));
        Lcursos.add(new curso("Informatica forence","Maestria",true,R.drawable.b, "5"));
        Lcursos.add(new curso("Gestion de  calidad","Diplomado",false, R.drawable.c,"4"));
        Lcursos.add(new curso("GTIDO","DOCTORADO",true,R.drawable.b,"3"));
        Lcursos.add(new curso("Marketing","Diplomado",false,R.drawable.a,"2"));
        Lcursos.add(new curso("Auditoria","Diplomado",false,R.drawable.b,"1"));




    }





    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menuprincipal:


                this.finish();
                break;


        }

    }
}
