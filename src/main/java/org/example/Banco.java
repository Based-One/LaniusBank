package org.example;

public class Banco {
    private Listas<CuentasAhorros> cuentasAhorros;
    private Listas<SolicitudesDeposito> solicitudesDeposito;
    private Listas<SolicitudesExtracciones>extraccionesLista;

       public Banco(Listas<CuentasAhorros> cuentasAhorros, Listas<SolicitudesDeposito> SolicitudesDeposito) {
           this.cuentasAhorros = cuentasAhorros;
          this.solicitudesDeposito = SolicitudesDeposito;
       }
public Banco(Listas<CuentasAhorros> cuentasAhorros) {
        this.cuentasAhorros = cuentasAhorros;
    }

public int verificarCuenta(Listas<CuentasAhorros> elemento, Listas<SolicitudesDeposito> deposito) {
    int pos;
//            Nodos<CuentasAhorros> cuenta = new Nodos<>();
    if (elemento.esVacia()) {
        System.out.println("No hay solicitudes pendientes");
    } else if (!elemento.esVacia()){

            if ((elemento.obtener(0).getIdBen()) == deposito.obtener(0).getIden()) {
                return elemento.obtener(0).getPos()+1 ;

            }
            else {
                System.out.println("No tiene una cuenta de ahorros, en un momento se le creara una");
                int x = deposito.obtener(0).getIden();
                float y = deposito.obtener(0).getMonCant();
                pos =elemento.longitud();
                elemento.addElement(new CuentasAhorros(x,y));
                return pos+1;

            }
        }


return 0;
}
//    public void atenderDepos(Listas<CuentasAhorros> cuentasAhorro, Listas<SolicitudesDeposito> depositos) {
//        if (depositos.esVacia()) {
//            System.out.println("No hay solicitudes de depósito pendientes.");
//            return;
//        }
//
//        for (int j = 0; j < depositos.longitud(); j++) {
//            SolicitudesDeposito solicitud = depositos.obtener(j);
//            int idBeneficiario = solicitud.getIden();
//            float montoDeposito = solicitud.getMonCant();
//
//            CuentasAhorros cuentaExistente = null;
//            for (int i = 0; i < cuentasAhorro.longitud(); i++) {
//                CuentasAhorros cuenta = cuentasAhorro.obtener(i);
//                if (cuenta.getIdBen() == idBeneficiario) {
//                    cuentaExistente = cuenta;
//                    break;
//                }
//            }
//
//            if (cuentaExistente == null) {
//                cuentaExistente = new CuentasAhorros(idBeneficiario, montoDeposito, cuentasAhorro.longitud());
//                cuentasAhorro.addElement(cuentaExistente);
//                System.out.println("Se ha creado una nueva cuenta de ahorro para el beneficiario con ID " + cuentaExistente.getIdBen() + "\n" + "Con un saldo de: " + cuentaExistente.getSaldoAct());
//            } else {
//                cuentaExistente.setSaldoAct(cuentaExistente.getSaldoAct() + montoDeposito);
//                // Imprime la información actualizada de la cuenta de ahorros
//                System.out.println("Se ha depositado " + montoDeposito + " a la cuenta de ahorro del beneficiario con ID: " + cuentaExistente.getIdBen());
//                System.out.println("Nuevo saldo de la cuenta: " + cuentaExistente.getSaldoAct());
//            }
//        }
//    }
//public void atenderDepos(Listas<CuentasAhorros> cuentasAhorro, Listas<SolicitudesDeposito> depositos) {
//    if (depositos.esVacia()) {
//        System.out.println("No hay solicitudes de depósito pendientes.");
//        return;
//    }
//
//    for (int j = 0; j < depositos.longitud(); j++) {
//        SolicitudesDeposito solicitud = depositos.obtener(j);
//        int idBeneficiario = solicitud.getIden();
//        float montoDeposito = solicitud.getMonCant();
//
//        // Buscar si el beneficiario ya tiene una cuenta de ahorros
//        boolean encontrado = false;
//        for (int i = 0; i < cuentasAhorro.longitud(); i++) {
//            if (cuentasAhorros.obtener(i) ==null){
//                return;
//            }
//            CuentasAhorros cuenta = cuentasAhorro.obtener(i);
//
//            if (cuenta.getIdBen() == idBeneficiario) {
//                // Si el beneficiario ya tiene una cuenta, actualizar el saldo
//                cuenta.setSaldoAct(cuenta.getSaldoAct() + montoDeposito);
//                encontrado = true;
//                // Imprimir la información actualizada de la cuenta de ahorros
//                System.out.println("Se ha depositado " + montoDeposito + " a la cuenta de ahorro del beneficiario con ID: " + cuenta.getIdBen());
//                System.out.println("Nuevo saldo de la cuenta: " + cuenta.getSaldoAct());
//                depositos.eliminarIndex(0);
//                break;
//            }
//        }
//
//        if (!encontrado) {
//            int pos = cuentasAhorro.longitud();
//            cuentasAhorro.addElement(new CuentasAhorros(idBeneficiario, montoDeposito));
//            // Imprimir la información de la nueva cuenta de ahorros
//            System.out.println("Se ha creado una nueva cuenta de ahorro para el beneficiario con ID " + idBeneficiario);
//            System.out.println("Con un saldo de: " + montoDeposito);
//            depositos.eliminarIndex(0);
//
//
//        }
//    }
//}
//    public void divisas()
public void atenderDepos(Listas<CuentasAhorros> cuentasAhorro, Listas<SolicitudesDeposito> depositos) {
    if (depositos.esVacia()) {
        System.out.println("No hay solicitudes de depósito pendientes.");
        return;
    }

    int j = 0;
    while (j < depositos.longitud()) {
        SolicitudesDeposito solicitud = depositos.obtener(j);
        int idBeneficiario = solicitud.getIden();
        float montoDeposito = solicitud.getMonCant();

        boolean encontrado = false;
        for (int i = 0; i < cuentasAhorro.longitud(); i++) {
            CuentasAhorros cuenta = cuentasAhorro.obtener(i);
            if (cuenta.getIdBen() == idBeneficiario) {
                cuenta.setSaldoAct(cuenta.getSaldoAct() + montoDeposito);
                encontrado = true;
                System.out.println("Se ha depositado " + montoDeposito + " a la cuenta de ahorro del beneficiario con ID: " + cuenta.getIdBen());
                System.out.println("Nuevo saldo de la cuenta: " + cuenta.getSaldoAct());
                depositos.eliminarIndex(j);
                break;
            }
        }

        if (!encontrado) {
            cuentasAhorro.addElement(new CuentasAhorros(idBeneficiario, montoDeposito));
            // Imprimir la información de la nueva cuenta de ahorros
            System.out.println("Se ha creado una nueva cuenta de ahorro para el beneficiario con ID " + idBeneficiario);
            System.out.println("Con un saldo de: " + montoDeposito);

            depositos.eliminarIndex(j);
        } else {
            j++;
        }
    }
}


    public void ExtraerDinero( Listas<CuentasAhorros> cuentasAhorros,Listas<SolicitudesExtracciones> extracciones) {
        for (int i = 0; i < cuentasAhorros.longitud(); i++) {
            for (int j = 0; j < extracciones.longitud(); j++) {


                if (extracciones.obtener(j).getNumid() == cuentasAhorros.obtener(i).getIdBen()) {
                    if (Float.parseFloat(extracciones.obtener(j).getMonto()) > cuentasAhorros.obtener(i).getSaldoAct()) {
                        System.out.println("No hay fondos suficientes: " + cuentasAhorros.obtener(i).getSaldoAct());
                        extracciones.eliminarIndex(j);

                    } else if (Integer.parseInt(extracciones.obtener(j).getMonto()) <= cuentasAhorros.obtener(i).getSaldoAct()) {
                        cuentasAhorros.obtener(i).setSaldoAct(cuentasAhorros.obtener(i).getSaldoAct() - Integer.parseInt(extracciones.obtener(j).getMonto()));
                        System.out.println("Se ha retirado: " + Integer.parseInt(extracciones.obtener(j).getMonto()) + " de su cuenta existosamente");
                        System.out.println("Saldo restante: " + cuentasAhorros.obtener(i).getSaldoAct());
                        extracciones.eliminarIndex(j);
                    }
                } else {
                    System.out.println("Numero de identidad no encontrado, favor de crear una nueva cuenta");
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

        }
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
        solicitudesDeposito.addElement(new SolicitudesDeposito(1, 15000000, "María"));
        solicitudesDeposito.addElement(new SolicitudesDeposito(5, 2500, "Ana"));
    solicitudesDeposito.addElement(new SolicitudesDeposito(2,2000000,"Jorgito"));

        // Crear una instancia del banco
        Banco banco = new Banco(cuentasAhorros, solicitudesDeposito);
        System.out.println(cuentasAhorros.longitud());
        // Procesar las solicitudes de depósito
        banco.atenderDepos(cuentasAhorros,solicitudesDeposito);
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
//        System.out.println("ID Beneficiario: " + millonarios.obtener(i).getIdBen() + ", Saldo Actual: " + millonarios.obtener(i).getSaldoAct());
//
//    }
    public void bajaAMillonarios(Listas<CuentasAhorros> cuentasAhorros, Listas<CuentasAhorros> millonarios){

        for (int i = 0; i < cuentasAhorros.longitud(); i++) {
            CuentasAhorros cuenta = cuentasAhorros.obtener(i);
            if (cuenta != null && cuenta.getSaldoAct() > 1000000) {
                millonarios.addElement(cuenta);
                cuentasAhorros.eliminarIndex(i);
                i--;
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
