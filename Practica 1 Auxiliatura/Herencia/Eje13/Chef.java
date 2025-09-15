package Eje13;

public class Chef extends Empleado {
    private int horaExtra;
    private String tipo;
    private float sueldoHora;

    public Chef(String nombre, float sueldomes, int horaExtra, String tipo, float sueldoHora) {
        super(nombre, sueldomes);
        this.horaExtra = horaExtra;
        this.tipo = tipo;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Tipo: " + tipo + " | Horas extra: " + horaExtra + " | Sueldo por hora: " + sueldoHora);
    }

    @Override
    public float sueldoTotal() {
        return sueldomes + (horaExtra * sueldoHora);
    }
}
