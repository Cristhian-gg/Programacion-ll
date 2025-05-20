// INCISO A

import java.util.ArrayList;
import java.util.List;

class Habitacion {
    private String nombre;
    private double tamano; 

    public Habitacion() {
        this.nombre = "";
        this.tamano = 0.0;
    }

    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamano + " m²");
    }
}

class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa() {
        this.direccion = "";
        this.habitaciones = new ArrayList<>();
    }

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrarCasa() {
        System.out.println("Casa en dirección: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion hab : habitaciones) {
            hab.mostrarInfo();
        }
    }
}

// INCISO B y C

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Av. Siempre Viva 123");
        casa.agregarHabitacion(new Habitacion("Sala", 20.5));
        casa.agregarHabitacion(new Habitacion("Cocina", 12.3));
        casa.agregarHabitacion(new Habitacion("Dormitorio Principal", 25.0));
        casa.agregarHabitacion(new Habitacion("Baño", 6.7));

        // INCISO C
        casa.mostrarCasa();
    }
}
