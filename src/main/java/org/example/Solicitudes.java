package org.example;

public abstract class Solicitudes {
    protected String nombre;
    protected int numid;
    protected float monto;
    protected  int idCuenta;

    public Solicitudes(int numid, int idCuenta, String nombre, float monto) {
        this.nombre = nombre;
        this.numid = numid;
        this.idCuenta = idCuenta;
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
public abstract void movimiento(float cantidad, CuentasAhorros cuenta);
}

