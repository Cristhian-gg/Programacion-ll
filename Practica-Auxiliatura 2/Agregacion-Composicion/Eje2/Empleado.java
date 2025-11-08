package practicaAux;

public class Empleado {
    private String nombre;
    private String cargo;
    private double sueldo;

    public Empleado(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Cargo: " + cargo + " | Sueldo: " + sueldo);
    }
}

