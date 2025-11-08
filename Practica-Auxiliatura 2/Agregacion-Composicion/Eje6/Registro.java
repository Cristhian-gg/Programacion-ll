package Eje6;

public class Registro {
    private String fecha;
    private int cantidad;
    private Medicamento medicamento;

    public Registro(String fecha, int cantidad, Medicamento medicamento) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.medicamento = medicamento;
    }

    public void mostrarInfo() {
        System.out.println("Fecha: " + fecha + " | Cantidad: " + cantidad);
        System.out.print("Medicamento: ");
        medicamento.mostrarInfo();
    }
}
