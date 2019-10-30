package com.virual.entornosvirtuales;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detalles extends AppCompatActivity {


TextView name;
TextView Descp;
ImageView fondo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);


        name=(TextView)findViewById(R.id.nombre_curso);
        Descp=(TextView)findViewById(R.id.textodescripcion);
       // fondo=(ImageView)findViewById(R.id.fondodescur);




        Bundle datos = this.getIntent().getExtras();
        // int fondoc = datos.getInt("fondode");
        String nombredecurso = datos.getString("nombre");
        String descricion=datos.getString("descripcion");



        name.setText(nombredecurso+"");
       Descp.setText(descricion+"");
     //   fondo.setBackgroundResource(fondoc);

    }
}
