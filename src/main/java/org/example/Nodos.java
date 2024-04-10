
package org.example;
public class Nodos<T> {
    protected T dato;
    protected Nodos<T> siguiente;
    public Nodos(T dato){
        this.dato = dato;
    }
    public Nodos(T dato, Nodos<T> siguiente){
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodos() {

    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodos<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos<T> siguiente) {
        this.siguiente = siguiente;
    }
}
