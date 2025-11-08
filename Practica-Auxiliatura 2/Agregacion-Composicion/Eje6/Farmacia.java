package Eje6;

import java.util.ArrayList;

public class Farmacia {
    private String nombre;
    private String direccion;
    private ArrayList<Registro> registros;

    public Farmacia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.registros = new ArrayList<>();
    }

    public void agregarRegistro(Registro r) {
        registros.add(r);
    }

    public void mostrarRegistros() {
        System.out.println("Farmacia: " + nombre + " | Dirección: " + direccion);
        if (registros.isEmpty()) {
            System.out.println("  No hay registros.");
        } else {
            for (Registro r : registros) {
                r.mostrarInfo();
                System.out.println("--------------------------------");
            }
        }
    }
}

