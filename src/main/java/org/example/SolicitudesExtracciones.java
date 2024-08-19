package org.example;

public class SolicitudesExtracciones extends Solicitudes {
    private String nacionalidad;
    private String direccion;
    private String sex;

    public SolicitudesExtracciones(int numid, int idCuenta, String nombre, float monto, String sex, String nacionalidad, String direccion) {
        super(numid, idCuenta, nombre, monto);
        this.sex = sex;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
    }

    public SolicitudesExtracciones(int numid, int idCuenta, String nombre, float monto, String sexo) {
        super(numid, idCuenta, nombre, monto);

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void movimiento(float cantidad, CuentasAhorros cuenta) {
        cuenta.setSaldoAct(cuenta.getSaldoAct() - cantidad);
    }
}

