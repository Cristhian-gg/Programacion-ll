package Eje2;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private String nombre;
    private String ci;

    public Estudiante(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCi() {
        return ci;
    }

    @Override
    public String toString() {
        return nombre + " (CI: " + ci + ")";
    }
}
