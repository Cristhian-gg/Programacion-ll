package Eje8;

public class Facultad {
    private String nombre;
    private String carreraPrincipal;

    public Facultad(String nombre, String carreraPrincipal) {
        this.nombre = nombre;
        this.carreraPrincipal = carreraPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarreraPrincipal() {
        return carreraPrincipal;
    }

    @Override
    public String toString() {
        return "Facultad: " + nombre + " | Carrera principal: " + carreraPrincipal;
    }
}

