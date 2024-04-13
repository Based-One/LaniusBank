package org.example;

public class Extranjero extends Clientes
{
    public Extranjero(int id, int idben, String name, String sex, String direccion, String paisProcedencia) {
        super(id, idben, name, sex, direccion, paisProcedencia);
        this.clistas = new Listas<>();
    }

}
