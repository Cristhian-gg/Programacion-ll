package Eje2;

public class Bus {
    private int capacidad;
    private int pasajeros;
    private final double costoPasaje = 1.50;

    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
    }

    public void subirPasajeros(int cantidad) {
        if (pasajeros + cantidad <= capacidad) {
            pasajeros += cantidad;
            System.out.println(cantidad + " pasajeros subieron al bus.");
        } else {
            int disponibles = capacidad - pasajeros;
            System.out.println("Solo pueden subir " + disponibles + " pasajeros. Bus lleno.");
            pasajeros = capacidad;
        }
    }

    public double cobrarPasaje() {
        return pasajeros * costoPasaje;
    }

    public int asientosDisponibles() {
        return capacidad - pasajeros;
    }

    public void mostrarEstado() {
        System.out.println("Pasajeros actuales: " + pasajeros);
        System.out.println("Asientos disponibles: " + asientosDisponibles());
        System.out.println("Total recaudado: Bs. " + cobrarPasaje());
    }
}