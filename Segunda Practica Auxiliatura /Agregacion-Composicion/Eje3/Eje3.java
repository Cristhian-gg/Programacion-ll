import java.util.ArrayList;
import java.util.List;

// INCISO A
class Parte {
    private String nombre;
    private double peso;

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("Parte: " + nombre + " - Peso: " + peso + " kg");
    }
}

class Avion {
    private String modelo;
    private String fabricante;
    private List<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("Modelo del avión: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Partes del avión:");
        for (Parte parte : partes) {
            parte.mostrarInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // INCISO B
        Avion avion = new Avion("Boeing 747", "Boeing");
        avion.agregarParte(new Parte("Motor", 5000));
        avion.agregarParte(new Parte("Ala Izquierda", 3000));
        avion.agregarParte(new Parte("Ala Derecha", 3000));
        avion.agregarParte(new Parte("Tren de Aterrizaje", 1500));

        // INCISO C
        avion.mostrarAvion();
    }
}
