package org.example;
public class Listas<A> implements Imetodos<A> {
    private Nodos<A> cabeza;
    private int size;

    public Listas() {
        this.cabeza = null;
        this.size =0;
    }

    @Override
    public boolean esVacia() {

        return cabeza == null;
    }
    //    public void Ordenar (Listas almacen) {
//        Nodos h = cabeza;
//        for (int i = 0; i <  longitud() - 1; i++) {
//            for (int j = 0; j < longitud()-1; j++) {
//                if (h.dato.equals(h.getSiguiente().dato)) {
//                    Nodos<A> temp = almacen
//                    Almacen temp = almacen[j];
//                    almacen[j] = almacen[j + 1];
//                    almacen[j + 1] = temp;
//
//
//                }
//
//            }
//        }
//    }
    @Override
    public int longitud() {
        if (esVacia()){
            return 0;
        }
        return size+1;
    }

    @Override
    public void addElement(A elemento) {
        Nodos<A> nuevoNodo = new Nodos<>(elemento);
        if (esVacia()) {
            cabeza = nuevoNodo;
        } else {
            Nodos<A> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
            size++;}
    }

    //    @Override
//    public void insert(A elemento, int indice) {
//        int contador = 0;
//        if (indice < 0 || indice > longitud()) {
//            System.out.println("No existe en la lista");
//            return;
//        }
//
//        Nodos<A> neuNodo = new Nodos<>(elemento);
//
//        if (indice == 0) {
//            neuNodo.siguiente = cabeza;
//            cabeza = neuNodo;
//        } else {
//            Nodos<A> previo = cabeza;
//            while (indice<contador){
//                previo = previo.siguiente;
//                contador++;
//            }
//            neuNodo.siguiente = previo.siguiente;
//            previo.siguiente = neuNodo;
//        }
//    }
    @Override
    public void insert(A elemento, int indice) {
        if (indice < 0 || indice > longitud()) {
            throw new IndexOutOfBoundsException("Índice fuera de los límites de la lista");
        }

        Nodos<A> neuNodo = new Nodos<>(elemento);
        if (indice == 0) {
            neuNodo.siguiente = cabeza;
            cabeza = neuNodo;
        } else {
            Nodos<A> previo = cabeza;
            int contador = 0;
            while (contador < indice - 1){
                previo = previo.siguiente;
                contador++;
            }
            neuNodo.siguiente = previo.siguiente;
            previo.siguiente = neuNodo;
        }
        size++;
    }
    //    @Override
//    public void insert(T elemento, int indice) {
//        if (indice < 0 || indice > longitud()) {
//            throw new IndexOutOfBoundsException("Índice fuera de rango");
//        }
//
//        Nodos<T> nuevoNodo = new Nodos<>(elemento);
//
//        if (indice == 0) {
//            nuevoNodo.siguiente = cabeza;
//            cabeza = nuevoNodo;
//        } else {
//            Nodos<T> previo = cabeza;
//            for (int i = 0; i < indice - 1; i++) {
//                previo = previo.siguiente;
//            }
//            nuevoNodo.siguiente = previo.siguiente;
//            previo.siguiente = nuevoNodo;
//        }
//    }
    public Nodos<A> getPrimero() {
        return cabeza;
    }


    @Override
    public int buscar(A elemento) {
        Nodos<A> actual = cabeza;
        int indice = 0;
        while (actual != null) {
            if (actual.dato.equals(elemento)) {
                return indice;
            }
            actual = actual.siguiente;
            indice++;
        }
        return -1;
    }

    //    @Override
//    public int obtener(int indice) {
//    Nodos<A> nodoActual = cabeza;
//    int contador = 0;
//        if (indice < 0 || indice > longitud()) {
//            System.out.println("No existe en la lista");
//            return 0;
//        }
//    while (indice>contador) {
//    nodoActual = nodoActual.siguiente;
//    contador++;
//    }
//    return (int) nodoActual.getDato();
//
//        }
//        @Override
//        public A obtener(int indice) {
//            if (indice < 0 || indice >= longitud()) {
//                throw new IndexOutOfBoundsException("Índice fuera de los límites de la lista");
//            }
//            Nodos<A> nodoActual = cabeza;
//            for (int i = 0; i < indice; i++) {
//                nodoActual = nodoActual.siguiente;
//
//            }
//            return nodoActual.getDato();
//        }
//        @Override
//        public A obtener(int indice) {
//            if (indice < 0 || indice >= longitud()) {
//                throw new IndexOutOfBoundsException("Índice fuera de los límites de la lista");
//            }
//            Nodos<A> nodoActual = cabeza;
//            for (int i = 0; i < indice; i++) {
//                if (nodoActual == null) {
//                    throw new IndexOutOfBoundsException("Índice fuera de los límites de la lista.");
//                }
//                nodoActual = nodoActual.siguiente;
//            }
//            return nodoActual.getDato();
//        }
    @Override
    public A obtener(int indice) {
        if (indice < 0 || indice >= longitud()) {
            throw new IndexOutOfBoundsException("Índice fuera de los límites de la lista");
        }
        Nodos<A> nodoActual = cabeza;
        for (int i = 0; i < indice; i++) {
            if (nodoActual == null) {
                // Si nodoActual es null, sal del bucle
                break;
            }
            nodoActual = nodoActual.siguiente;
        }
        // Si nodoActual es null, devuelve null. De lo contrario, devuelve el dato.
        return (nodoActual != null) ? nodoActual.getDato() : null;
    }




    @Override
    public void eliminarIndex(int indice) {
        if (esVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }
        if (indice == 0) {
            cabeza = cabeza.siguiente;
            size--;
            return;
        }
        Nodos<A> anterior = null;
        Nodos<A> actual = cabeza;
        int contador = 0;

        while (actual != null) {
            if (contador == indice) {
                // Elimina el nodo
                anterior.siguiente = actual.siguiente;
                size--;
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
            contador++;
        }

        // Si se llega aquí, el índice dado está fuera de rango
        System.out.println("El índice está fuera de rango.");
    }


    @Override
    public int buscarIndex(int in) {
        if (esVacia()) {
            System.out.println("La lista está vacía.");
            return 0;
        }
        if (in == 0) {
            cabeza = cabeza.siguiente;
            return 0;
        }
        Nodos<A> actual = cabeza;

        int contador = 0;
        if (contador== in)
            while (actual!= null){
                actual = actual.siguiente;
                contador++;
            }
        return contador;
    }

    //        public void imprimirLista() {
//            if (esVacia()) {
//                System.out.println("La lista está vacía.");
//                return;
//            }
//
//            Nodos<A> actual = cabeza;
//
//            System.out.print("Lista: ");
//            while (actual != null) {
//                System.out.print(actual.siguiente + " ");
//                actual = actual.siguiente;
//            }
//            System.out.println(); // Agrega un salto de línea al final para una mejor presentación
//        }
    public void imprimirLista() {
        Nodos<A> nodoActual = cabeza;
        while (nodoActual != null) {
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
    }


    @Override
    public void eliminar(A elemento) {

        if (esVacia()) {
            System.out.println("lista vacia");
        }
        if (cabeza.dato.equals(elemento)) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodos<A> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(elemento)) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
        size--;
    }

    public Nodos<A> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodos<A> cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}


