package org.example;


public class SolicitudesDeposito extends Solicitudes{
    protected int iden;
    protected String nombre;

    public SolicitudesDeposito(int numid, String nombre,float monto) {
        super(numid, nombre, monto);
    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
