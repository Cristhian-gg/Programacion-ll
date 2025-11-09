package Eje1;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaPrestamo.plusDays(7);
    }

    public void mostrarInfo() {
        System.out.println("Prestamo:");
        System.out.println("  Libro: " + libro.getTitulo());
        System.out.println("  Estudiante: " + estudiante.getNombre());
        System.out.println("  Fecha préstamo: " + fechaPrestamo);
        System.out.println("  Fecha devolución: " + fechaDevolucion);
    }
}
