package Eje11;

public class JefePolicia extends Persona implements IEmpleado, IPolicia {
    private double sueldo;
    private String grado;

    public JefePolicia(String nombre, int edad, double sueldo, String grado) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.grado = grado;
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String getGrado() {
        return grado;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Sueldo: " + sueldo + " | Grado: " + grado);
    }
}

