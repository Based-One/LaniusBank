package org.example;

public abstract class Solicitudes {
    protected String nombre;
    protected int numid;
    protected float monto;

    public Solicitudes(int numid, String nombre, float monto) {
        this.nombre = nombre;
        this.numid = numid;
        this.monto = monto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumid() {
        return numid;
    }

    public void setNumid(int numid) {
        this.numid = numid;
    }


    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
}

