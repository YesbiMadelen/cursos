package com.virual.entornosvirtuales;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class cursoAdpter extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<curso> items;

    //costructor en el cual enviaremos informacion
    public cursoAdpter(Activity actividad, ArrayList<curso> items) {
        this.activity = actividad;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.cusros, null);
        }

        //creamos un objeto de la clase WebsEsTl
        final curso objWebs = items.get(position);

        //Asignamos los recursos a las variable
        TextView titulo = (TextView) v.findViewById(R.id.Curso);
        TextView descripcion = (TextView) v.findViewById(R.id.tipocurso);
        ImageView imagen = (ImageView) v.findViewById(R.id.blokeo);
        Button detalle = (Button) v.findViewById(R.id.descripcionCurso);
        Button modulos =(Button) v.findViewById(R.id.modulos);
        RelativeLayout fondo =(RelativeLayout)v.findViewById(R.id.fondoc);



        //Enviamos informacion a la vista apartir de la informacion que contenga la clase:
        titulo.setText(objWebs.getTitulo());
        descripcion.setText(objWebs.getTipo());
        imagen.setImageResource(objWebs.getImagen());
        fondo.setBackgroundResource(objWebs.getfondo());



        detalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent = new Intent( activity,detalles.class);
               // intent.putExtra("fondode", objWebs.getfondo());
                intent.putExtra("nombre", objWebs.getTitulo()+"");
                intent.putExtra("descripcion", objWebs.getDescrion()+"" );
                activity.startActivity(intent);


                // Toast.makeText(context,"presionó detalles",Toast.LENGTH_LONG);
            }
        });

        modulos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent( activity,listamodulos.class);
                // intent.putExtra("fondode", objWebs.getfondo());
              //  intent.putExtra("nombre", objWebs.getTitulo()+"");
              //  intent.putExtra("descripcion", objWebs.getDescrion()+"" );
                activity.startActivity(intent);
                // Toast.makeText(context,"presionó elegir",Toast.LENGTH_LONG);
            }
        });

        return v;
    }

    public void addAll(ArrayList<curso> Producto){
        for (int i= 0; i<Producto.size(); i++) {
            items.add(Producto.get(i));
        }
    }

}



