package Eje13;

public class Mesero extends Empleado {
    private double propina;
    private int horaExtra;
    private float sueldoHora;

    public Mesero(String nombre, float sueldomes, double propina, int horaExtra, float sueldoHora) {
        super(nombre, sueldomes);
        this.propina = propina;
        this.horaExtra = horaExtra;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Horas extra: " + horaExtra + " | Sueldo por hora: " + sueldoHora + " | Propina: " + propina);
    }

    @Override
    public float sueldoTotal() {
        return sueldomes + (horaExtra * sueldoHora) + (float)propina;
    }
}
