package Eje9;

public class OficialEncubierto {
    private String nombre;
    private String rango;
    private String arma;
    private boolean enOperacion;

    public OficialEncubierto(String nombre, String rango, String arma, boolean enOperacion) {
        this.nombre = nombre;
        this.rango = rango;
        this.arma = arma;
        this.enOperacion = enOperacion;
    }

    public void vigilar() {
        System.out.println("nombre + " + "está vigilando encubierto.");
    }

    public void arrestar() {
        System.out.println("nombre + " + "ha arrestado a un delincuente.");
    }

    public void mostrar() {
        System.out.println("Oficial [Nombre=" + nombre + ", Rango=" + rango + ", Arma=" + arma + ", En Operación=" + enOperacion + "]");
    }
}
