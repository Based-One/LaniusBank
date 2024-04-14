package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class RegistroTransacciones {

    private static final String ARCHIVO_TRANSACCIONES = "transacciones.txt";

    public static void registrarTransaccion(String tipoTransaccion, int idCliente, float monto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_TRANSACCIONES, true))) {
          Date tiempo = new Date();
            String transaccion = tipoTransaccion + ", " + idCliente + ", " + monto + ", " + tiempo;

            writer.write(transaccion);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de transacciones: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        registrarTransaccion("Creación de cuenta    ID:     Monto:", 123, 0);

        registrarTransaccion("Depósito      ID:     Monto:", 123, 100.0f);

        registrarTransaccion("Extracción ID:    Monto:", 123, 50.0f);
    }
}
