package org.example;


public class SolicitudesDeposito {
    protected int iden;
    protected float MonCant;
    protected String nombre;
    public SolicitudesDeposito(int iden, float monCant, String nombre) {
        this.iden = iden;
        MonCant = monCant;
        this.nombre = nombre;
    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public float getMonCant() {
        return MonCant;
    }

    public void setMonCant(float monCant) {
        MonCant = monCant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
