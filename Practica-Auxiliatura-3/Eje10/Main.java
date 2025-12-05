package Eje10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArchivoCobrosNFC arch = new ArchivoCobrosNFC("/home/cobros_nfc.txt");

        // Crear transacciones de ejemplo
        Transaccion t1 = new Transaccion("TX001", 25.50, "2025-02-10");
        Transaccion t2 = new Transaccion("TX002", 40.00, "2025-02-11");
        Transaccion t3 = new Transaccion("TX003", 15.75, "2025-02-12");

        // Guardar en archivo
        arch.guardarTransaccion(t1);
        arch.guardarTransaccion(t2);
        arch.guardarTransaccion(t3);

        // Mostrar todas las transacciones
        System.out.println("TODAS LAS TRANSACCIONES:");
        List<String> lista = arch.leerTodo();
        for (String s : lista) {
            System.out.println(s);
        }

        // Buscar una transacción por ID
        String idBuscado = "TX002";
        System.out.println("\nBUSCANDO TRANSACCIÓN con ID " + idBuscado);
        String resultado = arch.buscarPorID(idBuscado);

        if (resultado != null)
            System.out.println("Encontrada: " + resultado);
        else
            System.out.println("No existe esa transacción.");
    }
}
