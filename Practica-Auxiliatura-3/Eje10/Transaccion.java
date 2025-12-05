package Eje10;

public class Transaccion {
    private String id;
    private double monto;
    private String fecha;

    public Transaccion(String id, double monto, String fecha) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getId() { return id; }

    @Override
    public String toString() {
        return id + " | Monto: " + monto + " | Fecha: " + fecha;
    }
}
