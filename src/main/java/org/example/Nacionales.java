package org.example;

public class Nacionales extends Clientes
{
    protected Listas<CuentasAhorros> clistas;
    public Nacionales(int id,int idben, String name, String sex, String direccion, String nacionalidad) {
        super(id,idben, name, sex, direccion, nacionalidad);
        this.clistas = new Listas<>();
    }

    public Listas<CuentasAhorros> getClistas() {
        return clistas;
    }

    public void setClistas(Listas<CuentasAhorros> clistas) {
        this.clistas = clistas;
    }
}
