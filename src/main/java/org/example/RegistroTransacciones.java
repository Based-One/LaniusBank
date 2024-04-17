package org.example;

import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDateTime;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class RegistroTransacciones {
    private static final String DEPOSIT_LOG_FILE = "registro_depositos.txt";
    private static final String WITHDRAWAL_LOG_FILE = "registro_retiros.txt";

    public static void registrarDeposito(int idCliente, int idCuenta, float monto) {
        String mensaje = String.format("[%s] Depósito: ID Cliente: %d, ID Cuenta: %d, Monto: %.2f%n",
                LocalDateTime.now(), idCliente, idCuenta, monto);
        escribirEnArchivo(DEPOSIT_LOG_FILE, mensaje);
    }

    public static void registrarRetiro(int idCliente, int idCuenta, float monto) {
        String mensaje = String.format("[%s] Retiro: ID Cliente: %d, ID Cuenta: %d, Monto: %.2f%n",
                LocalDateTime.now(), idCliente, idCuenta, monto);
        escribirEnArchivo(WITHDRAWAL_LOG_FILE, mensaje);
    }

    private static void escribirEnArchivo(String nombreArchivo, String mensaje) {
        try (FileWriter escritor = new FileWriter(nombreArchivo, true)) {
            escritor.write(mensaje);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de registro: " + e.getMessage());
        }
    }
}

