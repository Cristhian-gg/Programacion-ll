package Eje1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== PRUEBA DE RELACIONES EN LA BIBLIOTECA ===\n");

        // ================= COMPOSICIÓN =================
        // Biblioteca crea su Horario interno
        Biblioteca biblioteca = new Biblioteca("Biblioteca UMSA", "Lunes a Viernes", "08:00", "18:00");
        System.out.println("Se ha creado la biblioteca con su horario (COMPOSICIÓN).");

        // Libro con Páginas (COMPOSICIÓN)
        Libro libro1 = new Libro("Cien Años de Soledad", "978-123456789",
                Arrays.asList("Página 1: Introducción", "Página 2: Capítulo 1", "Página 3: Capítulo 2"));
        System.out.println("Se ha creado un libro con páginas (COMPOSICIÓN).");

        // ================= AGREGACIÓN =================
        // Crear autor y agregar a la biblioteca (AGREGACIÓN)
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        biblioteca.agregarAutor(autor1);

        // Agregar libro a la biblioteca (AGREGACIÓN)
        biblioteca.agregarLibro(libro1);
        System.out.println("Se ha agregado un libro y un autor a la biblioteca (AGREGACIÓN).");

        // ================= ASOCIACIÓN =================
        // Crear estudiante
        Estudiante est1 = new Estudiante("E001", "Ana López");

        // Crear préstamo asociando estudiante con libro
        Prestamo prestamo1 = new Prestamo(est1, libro1);
        System.out.println("Se ha creado un préstamo que asocia estudiante con libro (ASOCIACIÓN).\n");

        // ================= MOSTRAR ESTADO COMPLETO =================
        System.out.println("=== MOSTRANDO ESTADO COMPLETO DE LA BIBLIOTECA ===");
        biblioteca.mostrarEstado();

        // ================= DEMOSTRAR CIERRE DE BIBLIOTECA =================
        biblioteca.cerrarBiblioteca();
    }
}

