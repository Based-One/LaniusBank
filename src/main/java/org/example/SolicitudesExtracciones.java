package org.example;

public class SolicitudesExtracciones extends Solicitudes {
    private String nacionalidad;
    private String direccion;
    private char sex;


    public SolicitudesExtracciones(int numid, String nombre, float monto, char sex, String nacionalidad, String direccion) {
        super(numid, nombre, monto);
        this.nacionalidad = nacionalidad;
        this.sex = sex;
        this.direccion = direccion;
    }
    public SolicitudesExtracciones(int numid, String nombre, float monto){
        super(numid,nombre,monto);

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
    /*
    public SolicitudesExtracciones(String nombre, int numid, char sexo, String monto, String nacionalidad, String direccion) {
        this.nombre = nombre;
        this.numid = numid;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.monto = monto;
    }


 */
    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}