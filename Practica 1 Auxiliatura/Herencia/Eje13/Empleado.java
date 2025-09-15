package Eje13;

public class Empleado {
    protected String nombre;
    protected float sueldomes;

    public Empleado(String nombre, float sueldomes) {
        this.nombre = nombre;
        this.sueldomes = sueldomes;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " | Sueldo del mes: " + sueldomes);
    }

    public float sueldoTotal() {
        return sueldomes;
    }
}

