package Eje9;

import java.io.Serializable;

public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    private String especie;
    private String nombre;
    private int cantidad;

    public Animal(String especie, String nombre, int cantidad) {
        this.especie = especie;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
