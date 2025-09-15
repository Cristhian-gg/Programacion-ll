package Eje2;

import java.util.Scanner;

public class VideoJuego {
    private String nombre;
    private String plataforma;
    private int jugadores;

    public VideoJuego() {
        this.nombre = "Desconocido";
        this.plataforma = "Desconocida";
        this.jugadores = 0;
    }

    public VideoJuego(String nombre) {
        this.nombre = nombre;
        this.plataforma = "Desconocida";
        this.jugadores = 0;
    }

    public VideoJuego(String nombre, String plataforma, int jugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.jugadores = jugadores;
    }

    public void mostrarInfo() {
        System.out.println("Videojuego: " + nombre + 
                           " | Plataforma: " + plataforma + 
                           " | Jugadores: " + jugadores);
    }

    public void agregarJugadores() {
        jugadores += 1;
        System.out.println("Se agregó 1 jugador. Total: " + jugadores);
    }

    public void agregarJugadores(int cantidad) {
        jugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Total: " + jugadores);
    }

    public void agregarJugadoresTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de jugadores a agregar: ");
        int cantidad = sc.nextInt();
        jugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores desde teclado. Total: " + jugadores);
    }
}
