package org.example;

public class SolicitudesExtracciones {
    private String nombre;
    private int numid;
    private char sexo;
    private String nacionalidad;
    private String direccion;
    private String monto;


    public SolicitudesExtracciones(String nombre, int numid, char sexo, String monto) {
        this.nombre = nombre;
        this.numid = numid;
        this.sexo = sexo;
        this.monto = monto;
    }

    public SolicitudesExtracciones(String nombre, int numid, char sexo, String monto, String nacionalidad, String direccion) {
        this.nombre = nombre;
        this.numid = numid;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.monto = monto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
}