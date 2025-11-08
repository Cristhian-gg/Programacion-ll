package Eje8;

public class Bailarin {
    private String nombre;
    private int edad;
    private Facultad facultad;
    private Fraternidad fraternidad;

    public Bailarin(String nombre, int edad, Facultad facultad, Fraternidad fraternidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.facultad = facultad;
        this.fraternidad = fraternidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public Fraternidad getFraternidad() {
        return fraternidad;
    }

    public void setFraternidad(Fraternidad fraternidad) {
        this.fraternidad = fraternidad;
    }

    @Override
    public String toString() {
        return "Bailarín: " + nombre + 
               " | Edad: " + edad + 
               " | " + facultad + 
               " | Fraternidad: " + fraternidad.getNombre();
    }
}
