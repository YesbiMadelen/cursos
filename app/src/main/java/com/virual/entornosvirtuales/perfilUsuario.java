package com.virual.entornosvirtuales;

import android.graphics.Typeface;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class perfilUsuario extends AppCompatActivity  implements View.OnClickListener{


    private Button editar;
    private Button volver;
    private Switch visible;
    private TextView nombre;
    private TextView user;
    private  TextView pass;
    private ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);

        editar =(Button)findViewById(R.id.EditarUser);
        volver =(Button)findViewById(R.id.volver);

        visible =(Switch)findViewById(R.id.UserVisible);
        nombre=(TextView)findViewById(R.id.nombreUsuario);
        user =(TextView) findViewById(R.id.idUser);
        pass = (TextView) findViewById(R.id.passs);
        foto =(ImageView)findViewById(R.id.foto);


        editar.setOnClickListener(this);
        volver.setOnClickListener(this);
        update();
    }


    public  void  update()
    {
        nombre.setText("Maribel Chipani");
        user.setText("virtual");
        pass.setText("12345");


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.volver:


                this.finish();
                break;
            case R.id.EditarUser:

                editar();
                break;

        }

    }


    public void editar()
    {
        pass.setTypeface(Typeface.DEFAULT);


    }
}
