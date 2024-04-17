package org.example;

public class CuentasAhorros  {
    private int idBen;
    private float saldoAct;
    private int NumCu;

    public CuentasAhorros(int idBen, float saldoAct) {
        this.idBen = idBen;
        this.saldoAct = saldoAct;
    }
    public CuentasAhorros(int idBen, int NumCu, float saldoAct) {
        this.idBen = idBen;
        this.NumCu = NumCu;
        this.saldoAct = saldoAct;
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

    public int getNumCu() {
        return NumCu;
    }

    public void setNumCu(int numCu) {
        this.NumCu = numCu;
    }

}
