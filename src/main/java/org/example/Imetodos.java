package org.example;


public interface Imetodos<A>{
    boolean esVacia();

    int longitud();

    void addElement(A elemento);
    void insert (A elemento, int indicez);

    void eliminar(A elemento);

    int buscar(A elemento);
    A obtener(int indice);
    void eliminarIndex(int in);
    int buscarIndex (int in);
}