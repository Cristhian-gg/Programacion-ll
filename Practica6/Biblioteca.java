package Eje2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Autor> autores;
    private List<Estudiante> estudiantes;
    private List<Libro> libros;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        autores = new ArrayList<>();
        estudiantes = new ArrayList<>();
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarAutor(String nombre) {
        autores.add(new Autor(nombre));
    }

    public void agregarEstudiante(String nombre, String ci) {
        estudiantes.add(new Estudiante(nombre, ci));
    }

    public void agregarLibro(String titulo, Autor autor) {
        libros.add(new Libro(titulo, autor));
    }

    public void agregarPrestamo(Libro libro, Estudiante estudiante) {
        prestamos.add(new Prestamo(libro, estudiante, LocalDate.now()));
    }

    public List<Autor> getAutores() { return autores; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }
    public List<Libro> getLibros() { return libros; }
    public List<Prestamo> getPrestamos() { return prestamos; }

    public String obtenerEstadoTexto() {
        StringBuilder sb = new StringBuilder();

        sb.append("📚 AUTORES:\n");
        autores.forEach(a -> sb.append(" - ").append(a).append("\n"));

        sb.append("\n👨‍🎓 ESTUDIANTES:\n");
        estudiantes.forEach(e -> sb.append(" - ").append(e).append("\n"));

        sb.append("\n📖 LIBROS:\n");
        libros.forEach(l -> sb.append(" - ").append(l).append("\n"));

        sb.append("\n📕 PRÉSTAMOS:\n");
        prestamos.forEach(p -> sb.append(" - ").append(p).append("\n"));

        return sb.toString();
    }
}
