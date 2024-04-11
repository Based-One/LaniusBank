package org.example;

public abstract class Clientes {
    protected int id;
protected int idben;
protected String name;
protected String sex;
protected String direccion;
protected String nacionalidad;//La cuenta existe,


    public Clientes(int id, int idben, String name, String sex, String direccion, String paisProcedencia) {
        this.id = id;
        this.idben = idben;
        this.name = name;
        this.sex = sex;
        this.direccion = direccion;
        this.nacionalidad = paisProcedencia;

    }

    public int getIdben() {
        return idben;
    }

    public void setIdben(int idben) {
        this.idben = idben;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
