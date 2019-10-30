package com.virual.entornosvirtuales;

public class detalleDecurso {

    int fondoDC;
    String nombre;
    String Descrion;

    detalleDecurso(int fondo,String nom,String des)
    {
        fondoDC=fondo;
        nombre=nom;
        Descrion=des;


    }

    public int getFondoDC(){return fondoDC;}
    public String getNombre(){return nombre;}
    public String getDescrion(){return Descrion;}
}
