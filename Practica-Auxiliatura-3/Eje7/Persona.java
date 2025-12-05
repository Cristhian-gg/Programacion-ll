package Eje7;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int ci;

    public Persona() {}

    public Persona(String nombre, String apPat, String apMat, int ci) {
        this.nombre = nombre;
        this.apellidoPaterno = apPat;
        this.apellidoMaterno = apMat;
        this.ci = ci;
    }

    public int getCi() { return ci; }

    @Override
    public String toString() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno + " (CI: " + ci + ")";
    }
}
