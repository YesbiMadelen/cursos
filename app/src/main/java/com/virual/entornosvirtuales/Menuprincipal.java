package com.virual.entornosvirtuales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Menuprincipal extends AppCompatActivity implements View.OnClickListener {
    ///inicializamos   variables
    private Button iniciar;
    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);


        ///agregamos   un  id  acada  variable
        iniciar =(Button) findViewById(R.id.iniciarlg);
        iniciar.setOnClickListener(this);
        user = (EditText)findViewById(R.id.userIncio);
        pass = (EditText)findViewById(R.id.userpass);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.iniciarlg:



                if (user.getText().toString().length()>1)
                {

                    if (pass.getText().toString().length() >1)
                    {  userLogin();     } else {  Toast.makeText(Menuprincipal.this, "inserte  el  codigo adecuado ", Toast.LENGTH_LONG).show();}
                }else{Toast.makeText(Menuprincipal.this,"inserte un usurio valido ",Toast.LENGTH_LONG).show();}


                break;
        }
    }

    private void  userLogin()

    {
        if(user.getText().toString().equals("virtual")){
            if (pass.getText().toString().equals("12345")){

                Intent intent = new Intent(this,Menuclases.class);
                startActivity(intent);
                this.finish();
            }}else{Toast.makeText(Menuprincipal.this,"usuario no   valido",Toast.LENGTH_LONG).show();}


    }


}