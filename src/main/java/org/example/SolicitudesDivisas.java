package org.example;

public class SolicitudesDivisas extends Solicitudes{


    public SolicitudesDivisas(int numid, int iden, String nombre, float monto) {
        super(numid, iden, nombre, monto);
    }

    @Override
    public void movimiento(float cantidad, CuentasAhorros cuenta) {
        float i = cantidad*20;
        cuenta.setSaldoAct(i+cuenta.getSaldoAct());
    }
}
