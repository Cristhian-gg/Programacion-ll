package Eje5;

public class Bus extends Vehiculo {
    private int capacidad;
    private String sindicato;

    public Bus(String conductor, String placa, int id, int capacidad, String sindicato) {
        super(conductor, placa, id);
        this.capacidad = capacidad;
        this.sindicato = sindicato;
    }

    public void mostrarBus() {
        mostrarDatos();
        System.out.println("Capacidad: " + capacidad + " | Sindicato: " + sindicato);
    }
}
