package org.example;

public class CuentasAhorros  {
    private int idBen;
    private float saldoAct;
    private int pos;

    public CuentasAhorros(int idBen, float saldoAct) {
        this.idBen = idBen;
        this.saldoAct = saldoAct;
    }
    public CuentasAhorros(int idBen){

    }

    public int getIdBen() {
        return idBen;
    }

    public void setIdBen(int idBen) {
        this.idBen = idBen;
    }

    public float getSaldoAct() {
        return saldoAct;
    }

    public void setSaldoAct(float saldoAct) {
        this.saldoAct = saldoAct;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

}
