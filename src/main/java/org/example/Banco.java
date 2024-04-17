package org.example;

import java.util.HashMap;


public class Banco {
    private Listas<CuentasAhorros> cuentasAhorros;
    private Listas<SolicitudesDeposito> solicitudesDeposito;
    private Listas<SolicitudesExtracciones>extraccionesLista;
    private HashMap<Integer,Clientes> client;

    public Banco() {

    }

    public HashMap<Integer, Clientes> getClient() {
        return client;
    }

    public void setClient(HashMap<Integer, Clientes> client) {
        this.client = client;
    }

    public Banco(Listas<CuentasAhorros> cuentasAhorros, Listas<SolicitudesDeposito> SolicitudesDeposito) {
           this.cuentasAhorros = cuentasAhorros;
          this.solicitudesDeposito = SolicitudesDeposito;
          this.client = new HashMap<>();

       }
public Banco(Listas<CuentasAhorros> cuentasAhorros) {
        this.cuentasAhorros = cuentasAhorros;
    }


    public int verificarCuenta(int idCliente, int numeroCuenta) {
        Clientes cliente = client.get(idCliente);
        if (cliente == null) {
            System.out.println("El cliente con ID " + idCliente + " no existe.");
            return 0;
        }


        if (cliente.clistas.esVacia()) {
            System.out.println("El cliente no tiene cuentas de ahorros registradas.");
            return -1;
        }


        for (int i = 0; i < cliente.clistas.longitud(); i++) {
            CuentasAhorros cuenta = cliente.clistas.obtener(i);
            if (cuenta.getIdBen() ==numeroCuenta) {
                System.out.println("La cuenta de ahorros " + numeroCuenta + " ya existe para el cliente con ID " + idCliente + ".");
                return i + 1;
            }
        }


        System.out.println("La cuenta de ahorros " + numeroCuenta + " no existe para el cliente con ID " + idCliente + ".");


        return -2;
    }


public void divisas(){
           if (!solicitudesDeposito.esVacia()){

           }
    }
    public void atenderSolicitudes( Listas<Solicitudes> solicitudesListas, HashMap<Integer, Clientes> clients) {
        // Creamos una lista temporal para almacenar las solicitudes procesadas
        Listas<Solicitudes> solicitudesProcesadas = new Listas<>();

        // Iteramos sobre la lista de solicitudes utilizando un bucle for
        for (int i = 0; i < solicitudesListas.longitud();) {
            Solicitudes solicitud = solicitudesListas.obtener(i);

            if (solicitud instanceof SolicitudesDeposito depositoSolicitud) {
                int idCliente = depositoSolicitud.getNumid();
                int numeroCuenta = depositoSolicitud.idCuenta;
                float monto = depositoSolicitud.getMonto();

                if (clients.containsKey(idCliente)) {
                    CuentasAhorros cuenta = clients.get(idCliente).getClistas().obtener(numeroCuenta);
                    if (cuenta != null) {
                        depositoSolicitud.movimiento(monto, cuenta);
                        RegistroTransacciones.registrarDeposito(idCliente, numeroCuenta, monto);
                        System.out.println("Depósito de " + monto + " realizado en la cuenta del cliente con ID " + idCliente);
                        solicitudesProcesadas.addElement(depositoSolicitud);
                    } else {
                        System.out.println("Error: No se encontró la cuenta asociada al cliente con ID " + idCliente);
                    }
                } else {
                    System.out.println("Error: No se encontró ningún cliente con el ID " + idCliente);
                }
            } else if (solicitud instanceof SolicitudesExtracciones extraccionSolicitud) {
                int idCliente = extraccionSolicitud.getNumid();
                int numeroCuenta = extraccionSolicitud.idCuenta;
                float monto = extraccionSolicitud.getMonto();

                if (clients.containsKey(idCliente)) {
                    CuentasAhorros cuenta = clients.get(idCliente).getClistas().obtener(numeroCuenta);
                    if (cuenta != null) {
                        if (monto <= cuenta.getSaldoAct()) {
                            extraccionSolicitud.movimiento(monto, cuenta);
                            RegistroTransacciones.registrarRetiro(idCliente, numeroCuenta, monto);
                            System.out.println("Extracción de " + monto + " realizada en la cuenta del cliente con ID " + idCliente);
                            solicitudesProcesadas.addElement(extraccionSolicitud);
                        } else {
                            System.out.println("Error: Fondos insuficientes en la cuenta del cliente con ID " + idCliente);
                        }
                    } else {
                        System.out.println("Error: No se encontró la cuenta asociada al cliente con ID " + idCliente);
                    }
                } else {
                    System.out.println("Error: No se encontró ningún cliente con el ID " + idCliente);
                }
            }

            // Incrementamos el índice solo si no eliminamos una solicitud
            if (solicitudesListas.obtener(i) == solicitud) {
                i++;
            }
        }

        // Eliminamos todas las solicitudes procesadas de la lista original
        for (int i = 0; i < solicitudesProcesadas.longitud(); i++) {
            solicitudesListas.eliminar(solicitudesProcesadas.obtener(i));
        }
    }




    private CuentasAhorros encontrarCuentaPorId(Listas<CuentasAhorros> cuentas, int idCuenta) {
        for (int i = 0; i < cuentas.getSize(); i++) {
            CuentasAhorros cuenta = cuentas.obtener(i);
            if (cuenta.getNumCu() == idCuenta) {
                return cuenta;
            }
        }
        return null;
    }




    public void ExtraerDinero( Listas<CuentasAhorros> cuentasAhorros,Listas<SolicitudesExtracciones> extracciones,HashMap<Integer,Clientes> client) {
        boolean Encontrada = false;

        for (int i = 0; i < cuentasAhorros.longitud(); i++) {
            for (int j = 0; j < extracciones.longitud(); j++) {
                if (client.containsKey(extracciones.obtener(j).numid)) {
                    Encontrada = true;
            float s = extracciones.obtener(j).getMonto();
            int id = extracciones.obtener(j).numid;
            float saldoAct = client.get(id).clistas.obtener(i).getSaldoAct();
                    if (s >saldoAct) {
                        System.out.println("No hay fondos suficientes en la cuenta: " + saldoAct);
                    } else {
                        SolicitudesExtracciones extracciones1 = extracciones.obtener(j);
                        CuentasAhorros hola = cuentasAhorros.obtener(i);
                        extracciones1.movimiento(s,hola);
                        System.out.println("Se ha retirado: " + extracciones.obtener(j).getMonto() + " de su cuenta exitosamente");
                        System.out.println("Saldo restante: " + cuentasAhorros.obtener(i).getSaldoAct());

                    }

                    extracciones.eliminarIndex(j);
                    break; // Salir del bucle interior después de procesar una extracción
                }
            }
        }

        if (!Encontrada) {
            System.out.println("Número de identidad no encontrado, favor de crear una nueva cuenta");
        }

//        if (extracciones.obtener(j).getNumid() == cuentasAhorros.obtener(i).getIdBen()) {
//            if (Integer.parseInt(extracciones.obtener(i).getMonto()) > cuentasAhorros.obtener(i).getSaldoAct()) {
//                System.out.println("No hay fondos suficientes");
//            } else if (Integer.parseInt(extracciones.obtener(i).getMonto())  <= cuentasAhorros.obtener(i).getSaldoAct()) {
//                cuentasAhorros.obtener(i).setSaldoAct(cuentasAhorros.obtener(i).getSaldoAct() - extra);
//                System.out.println("Se ha retirado: " + Integer.parseInt(extracciones.obtener(i).getMonto()) + " de su cuenta existosamente");
//                System.out.println("Saldo restante: " + cuentasAhorros.obtener(i).getSaldoAct());
//            } else {
//                System.out.println("Numero de identidad no encontrado, favor de crear una nueva cuenta");
//            }
//
//
//            break;
//        }}
            }



//}
    public void imprimirListaCuentas(Listas<CuentasAhorros> cuentasAhorros) {
        if (cuentasAhorros.esVacia()) {
            System.out.println("La lista de cuentas de ahorro está vacía.");
            return;
        }

        System.out.println("Lista de cuentas:");
        for (int i = 0; i < cuentasAhorros.longitud(); i++) {
            CuentasAhorros cuenta = cuentasAhorros.obtener(i);
            if (cuenta != null) {
                System.out.println(i+1+"ID Beneficiario: " + cuenta.getIdBen() + ", Saldo Actual: " + cuenta.getSaldoAct());
            }
        }
    }

    public static void main(String[] args) {
        // Crear listas de cuentas de ahorros y solicitudes de depósito
        Listas<CuentasAhorros> cuentasAhorros = new Listas<>();

        Listas<SolicitudesDeposito> solicitudesDeposito = new Listas<>();
Listas<CuentasAhorros> millonarios = new Listas<>();
        // Agregar algunas cuentas de ahorros y solicitudes de depósito
        cuentasAhorros.addElement(new CuentasAhorros(1, 1000));
        cuentasAhorros.addElement(new CuentasAhorros(2, 2000));
//        solicitudesDeposito.addElement(new SolicitudesDeposito(1, 15000000, "María"));
//        solicitudesDeposito.addElement(new SolicitudesDeposito(5, 2500, "Ana"));
//    solicitudesDeposito.addElement(new SolicitudesDeposito(2,2000000,"Jorgito"));

        // Crear una instancia del banco
        Banco banco = new Banco(cuentasAhorros, solicitudesDeposito);
        System.out.println(cuentasAhorros.longitud());
        // Procesar las solicitudes de depósito
        System.out.println(cuentasAhorros.longitud());
        // Realizar la eliminación de cuentas millonarias
//        banco.bajaAMillonarios(cuentasAhorros, millonarios);
//        for (int i = 0; i < cuentasAhorros.longitud(); i++) {
//            System.out.println(cuentasAhorros.obtener(i).getIdBen());
//        }
//        banco.imprimirListaCuentas(millonarios);
    }

//public void bajaAMillonarios(Listas<CuentasAhorros> cuentasAhorros){
//           Listas<CuentasAhorros> millonarios = new Listas<>();
//
//    for (int i = 0; i < cuentasAhorros.longitud(); i++) {
//        if (cuentasAhorros.obtener(i).getSaldoAct() > 1000000) {
//            millonarios.addElement(cuentasAhorros.obtener(i));
//            millonarios.setSize(millonarios.longitud());
//        }
//
//    }
//    System.out.println("Lista de millonarios:"  );
//    for (int i = 0; i < millonarios.longitud(); i++) {
//        System.out.println("ID Beneficiario:" + millonarios.obtener(i).getIdBen() + ", Saldo Actual: " + millonarios.obtener(i).getSaldoAct());
//
//    }
public void bajaAMillonarios(HashMap<Integer, Clientes> clientes, Listas<Clientes> clientesDadosDeBaja, Listas<CuentasAhorros> millonarios) {
    for (Clientes cliente : clientes.values()) {
        if (cliente != null) {
            for (int j = 0; j < cliente.getClistas().longitud(); j++) {
                CuentasAhorros cuenta = cliente.getClistas().obtener(j);
                if (cuenta != null && cuenta.getSaldoAct() > 1000000) {
                    millonarios.addElement(cuenta);
                    clientesDadosDeBaja.addElement(cliente);
                    clientes.put(cliente.getIdben(), null);
                    break;
                }
            }
        }
    }
    System.out.println("Lista de millonarios:");
    imprimirListaCuentas(millonarios);
}

//    public void bajaAMillonarios(Listas<CuentasAhorros> cuentasAhorros) {
//        Listas<CuentasAhorros> millonarios = new Listas<>();
//        for (int i = 0; i < cuentasAhorros.longitud(); i++) {
//            CuentasAhorros cuenta = cuentasAhorros.obtener(i);
//            if (cuenta != null && cuenta.getSaldoAct() > 1000000) {
//                millonarios.addElement(cuenta);
//            }
//        }
//        System.out.println("Lista de millonarios:");
//        imprimirListaCuentas(millonarios);
//
//        System.out.println("Nueva lista actualizada:");
//        Listas<CuentasAhorros> nuevasCuentasAhorros = new Listas<>();
//        for (int i = 0; i < cuentasAhorros.longitud(); i++) {
//            CuentasAhorros cuenta = cuentasAhorros.obtener(i);
//            if (cuenta != null && cuenta.getSaldoAct() <= 1000000) {
//                nuevasCuentasAhorros.addElement(cuenta);
//            }
//        }
//        setCuentasAhorros(nuevasCuentasAhorros);
//        imprimirListaCuentas(nuevasCuentasAhorros);
//    }


//    public void bajaAMillonarios(Listas<CuentasAhorros> cuentasAhorros) {
//
//        int i = 0;
//        Listas<CuentasAhorros> millonarios = new Listas<>();
//        while (i < cuentasAhorros.longitud()  ) {
//            imprimirListaCuentas(cuentasAhorros);
//            CuentasAhorros cuenta = cuentasAhorros.obtener(i);
//            if (cuenta != null && cuenta.getSaldoAct() > 1000000) {
//                millonarios.addElement(cuenta);
//                cuentasAhorros.eliminarIndex(i);
//
//            } else {
//                i++;
//            }
//        }
//
//        imprimirListaCuentas(millonarios);
//        System.out.println("Nueva lista actualizada");
//        imprimirListaCuentas(cuentasAhorros);
//
//
//    }

    public Listas<SolicitudesExtracciones> getExtraccionesLista() {
        return extraccionesLista;
    }

    public void setExtraccionesLista(Listas<SolicitudesExtracciones> extraccionesLista) {
        this.extraccionesLista = extraccionesLista;
    }

    public Listas<CuentasAhorros> getCuentasAhorros() {
        return cuentasAhorros;
    }

    public void setCuentasAhorros(Listas<CuentasAhorros> cuentasAhorros) {
        this.cuentasAhorros = cuentasAhorros;
    }

    public Listas<SolicitudesDeposito> getSolicitudesDeposito() {
        return solicitudesDeposito;
    }

    public void setSolicitudesDeposito(Listas<SolicitudesDeposito> solicitudesDeposito) {
        this.solicitudesDeposito = solicitudesDeposito;
    }
}
