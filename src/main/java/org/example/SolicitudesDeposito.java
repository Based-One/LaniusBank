package org.example;


public class SolicitudesDeposito extends Solicitudes{
    protected String nombre;

    public SolicitudesDeposito(int numid,int iden, String nombre,float monto) {
        super(numid,iden, nombre, monto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void movimiento(float cantidad, CuentasAhorros cuenta) {
        cuenta.setSaldoAct(cantidad +monto);
        RegistroTransacciones.registrarDeposito(this.numid,cuenta.getNumCu(),cantidad);
    }


}


