package Eje7;
import java.io.Serializable;

public class Niño extends Persona implements Serializable {

    private int edad;
    private double peso;
    private double talla;

    public Niño() {}

    public Niño(String nombre, String apPat, String apMat, int ci, int edad, double peso, double talla) {
        super(nombre, apPat, apMat, ci);
        this.edad = edad;
        this.peso = peso;
        this.talla = talla;
    }

    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public double getTalla() { return talla; }

    @Override
    public String toString() {
        return super.toString() + " | Edad: " + edad + " | Peso: " + peso + " | Talla: " + talla;
    }
}
