package org.example;

public class Nacionales extends Clientes
{

    public Nacionales(int id,int idben, String name, String sex, String direccion, String paisProcedencia) {
        super(id,idben, name, sex, direccion, paisProcedencia);
        this.clistas = new Listas<>();
    }

}
