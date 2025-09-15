package Eje15;

import java.util.ArrayList;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private ArrayList<Ordenador> ordenadores;

    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ordenadores = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public ArrayList<Ordenador> getOrdenadores() { return ordenadores; }

    public void adicionar(Ordenador o) {
        if (ordenadores.size() < capacidad) {
            ordenadores.add(o);
        } else {
            System.out.println("Capacidad maxima alcanzada en " + nombre);
        }
    }


    public void informacion(boolean estado) {
        System.out.println("\n--- Ordenadores en " + nombre +
                " con estado " + (estado ? "Activo" : "Inactivo") + " ---");
        for (Ordenador o : ordenadores) {
            if (o.isActivo() == estado) o.mostrar();
        }
    }

    public void informacion() {
        System.out.println("\n--- Ordenadores del laboratorio " + nombre + " ---");
        for (Ordenador o : ordenadores) o.mostrar();
    }

    public void informacion(int ram) {
        System.out.println("\n--- Ordenadores en " + nombre + " con RAM > " + ram + " ---");
        for (Ordenador o : ordenadores) {
            if (o.getRam() > ram) o.mostrar();
        }
    }
}
