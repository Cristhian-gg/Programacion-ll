package Eje5;

public class Vehiculo {
    protected String conductor;
    protected String placa;
    protected int id;

    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }

    public void mostrarDatos() {
        System.out.println("Conductor: " + conductor + " | Placa: " + placa);
    }

    public void cambiarConductor(String nuevoConductor) {
        conductor = nuevoConductor;
        System.out.println("Conductor cambiado a: " + conductor);
    }
}
