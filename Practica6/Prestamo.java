package Eje2;

import java.io.Serializable;
import java.time.LocalDate;

public class Prestamo implements Serializable {
    private Libro libro;
    private Estudiante estudiante;
    private LocalDate fecha;

    public Prestamo(Libro libro, Estudiante estudiante, LocalDate fecha) {
        this.libro = libro;
        this.estudiante = estudiante;
        this.fecha = fecha;
    }

    public Libro getLibro() {
        return libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return estudiante.getNombre() + " → " + libro.getTitulo() + " (" + fecha + ")";
    }
}
