package Eje8;

import java.io.Serializable;

public class Alimento implements Serializable {
    private String nombre;
    private String fechaVencimiento; 
    private int cantidad;

    public Alimento(String nombre, String fechaVencimiento, int cantidad) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public int getCantidad() { return cantidad; }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombre='" + nombre + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
