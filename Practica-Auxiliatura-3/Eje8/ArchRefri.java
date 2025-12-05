package Eje8;

import java.io.*;
import java.util.ArrayList;

public class ArchRefri {
    private String nombre;
    private ArrayList<Alimento> alimentos;
    private final String archivo = "refri.dat";

    public ArchRefri(String nombre) {
        this.nombre = nombre;
        this.alimentos = new ArrayList<>();
        cargar();
    }

    // ===================== PERSISTENCIA =====================

    private void guardar() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(alimentos);
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }

    private void cargar() {
        File f = new File(archivo);
        if (!f.exists()) return;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            alimentos = (ArrayList<Alimento>) in.readObject();
        } catch (Exception e) {
            alimentos = new ArrayList<>();
        }
    }

    // ===================== INCISO A =====================
    // CREAR
    public void crearAlimento(Alimento a) {
        alimentos.add(a);
        guardar();
    }

    // MODIFICAR POR NOMBRE
    public void modificarPorNombre(String nombre, String nuevaFecha, int nuevaCantidad) {
        for (Alimento a : alimentos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                a.setFechaVencimiento(nuevaFecha);
                a.setCantidad(nuevaCantidad);
                guardar();
                return;
            }
        }
        System.out.println("Alimento no encontrado");
    }

    // ELIMINAR POR NOMBRE
    public void eliminarPorNombre(String nombre) {
        alimentos.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
        guardar();
    }

    // ===================== INCISO B =====================
    public void mostrarAntesDeFecha(String fechaX) {
        System.out.println("Alimentos que caducan antes de " + fechaX);
        for (Alimento a : alimentos) {
            if (a.getFechaVencimiento().compareTo(fechaX) < 0) {
                System.out.println(a);
            }
        }
    }

    // ===================== INCISO C =====================
    public void eliminarConCantidadCero() {
        alimentos.removeIf(a -> a.getCantidad() == 0);
        guardar();
    }

    // ===================== INCISO D =====================
    public void mostrarVencidos(String fechaActual) {
        System.out.println("Alimentos vencidos:");
        for (Alimento a : alimentos) {
            if (a.getFechaVencimiento().compareTo(fechaActual) < 0) {
                System.out.println(a);
            }
        }
    }

    // ===================== INCISO E =====================
    public void mostrarMayorCantidad() {
        if (alimentos.isEmpty()) return;

        Alimento mayor = alimentos.get(0);
        for (Alimento a : alimentos) {
            if (a.getCantidad() > mayor.getCantidad()) {
                mayor = a;
            }
        }
        System.out.println("Alimento con mayor cantidad:");
        System.out.println(mayor);
    }

    // Mostrar todos
    public void mostrarTodo() {
        alimentos.forEach(System.out::println);
    }
}
