package Eje1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario;

    public Biblioteca(String nombre, String dias, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario(dias, horaApertura, horaCierre);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
        System.out.println("Autor registrado: " + autor.getNombre());
    }

    public void prestarLibro(Estudiante estudiante, Libro libro) {
        Prestamo prestamo = new Prestamo(estudiante, libro);
        prestamos.add(prestamo);
        System.out.println("Se realizó un préstamo del libro '" + libro.getTitulo() + "' a " + estudiante.getNombre());
    }

    public void mostrarEstado() {
        System.out.println("\n=== Estado de la Biblioteca: " + nombre + " ===");
        horario.mostrarHorario();
        System.out.println("\nLibros disponibles:");
        for (Libro libro : libros) {
            System.out.println(" - " + libro.getTitulo());
        }
        System.out.println("\nAutores registrados:");
        for (Autor autor : autores) {
            autor.mostrarInfo();
        }
        System.out.println("\nPréstamos activos:");
        for (Prestamo prestamo : prestamos) {
            prestamo.mostrarInfo();
        }
    }

    public void cerrarBiblioteca() {
        System.out.println("\nLa biblioteca '" + nombre + "' está cerrando...");
        prestamos.clear();
        System.out.println("Todos los préstamos han sido finalizados.");
    }

    public class Horario {
        private String diasApertura;
        private String horaApertura;
        private String horaCierre;

        public Horario(String diasApertura, String horaApertura, String horaCierre) {
            this.diasApertura = diasApertura;
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }

        public void mostrarHorario() {
            System.out.println("Horario: " + diasApertura + " de " + horaApertura + " a " + horaCierre);
        }
    }
}
