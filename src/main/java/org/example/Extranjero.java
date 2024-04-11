package org.example;

public class Extranjero extends Clientes
{
    protected Listas<CuentasAhorros> clistas;
    public Extranjero(int id, int idben, String name, String sex, String direccion, String paisProcedencia) {
        super(id, idben, name, sex, direccion, paisProcedencia);
        this.clistas = new Listas<>();
    }

    public Listas<CuentasAhorros> getClistas() {
        return clistas;
    }

    public void setClistas(Listas<CuentasAhorros> clistas) {
        this.clistas = clistas;
    }
}
