package com.virual.entornosvirtuales;

public class curso {

    String titulo;
    String tipo;
    int Imagen;
    int fondo;
    String Descrion;


    public curso(String titulo, String tip, boolean blokeo,int f,String des) {
        this.titulo = titulo;
        this.tipo = tip;
        if (!blokeo) {
            Imagen = R.drawable.bloqueado;
        } else {
            Imagen = R.drawable.desbloqueado;
        }
        fondo = f;
        Descrion = des;

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String descripcion) {
        this.tipo = descripcion;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public int getfondo() {
        return fondo;
    }

    public void setfondo(int f) {
        fondo = f;
    }


public  String getDescrion(){return Descrion;}
}
