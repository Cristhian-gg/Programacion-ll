package Eje8;

import java.util.ArrayList;

public class Fraternidad {
    private String nombre;
    private String encargado;
    private ArrayList<Bailarin> bailarines;

    public Fraternidad(String nombre, String encargado) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.bailarines = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEncargado() {
        return encargado;
    }

    public ArrayList<Bailarin> getBailarines() {
        return bailarines;
    }

    public void agregarBailarin(Bailarin b) {
        bailarines.add(b);
    }

    public void mostrarBailarines() {
        System.out.println("=== Fraternidad: " + nombre + " ===");
        for (Bailarin b : bailarines) {
            System.out.println(b.getNombre() + " - " + b.getEdad() + " años - Facultad: " + b.getFacultad().getNombre());
        }
    }
}

