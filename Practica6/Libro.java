package Eje2;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private Autor autor;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor.getNombre();
    }
}
