package Eje10;

import java.io.*;
import java.util.*;

public class ArchivoCobrosNFC {

    private String nombreArchivo;

    public ArchivoCobrosNFC(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void guardarTransaccion(Transaccion t) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo, true))) {
            pw.println(t.getId() + ";" + t.toString());
        } catch (Exception e) {
            System.out.println("Error al guardar.");
        }
    }

    public List<String> leerTodo() {
        List<String> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }
        } catch (Exception e) {
            System.out.println("No se pudo leer archivo.");
        }
        return lista;
    }

    public String buscarPorID(String idBuscado) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith(idBuscado + ";"))
                    return linea;
            }
        } catch (Exception e) {
            System.out.println("Error de lectura.");
        }
        return null;
    }
}
