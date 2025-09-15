package Eje9;

public class Presidente {
    private String nombre;
    private String apellido;
    private Politico politico; 
    private Partido partido;   

    public Presidente(String nombre, String apellido, Politico politico, Partido partido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.politico = politico;
        this.partido = partido;
    }

    public Presidente(String nombre, String apellido, String profesion, int aniosExp, String nombreP, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.politico = new Politico(profesion, aniosExp);
        this.partido = new Partido(nombreP, rol);
    }

    public String getNombre() { return nombre; }

    public void mostrarDatos() {
        System.out.println("Presidente: " + nombre + " " + apellido);
        System.out.println("Profesión: " + politico.profesion + " | Años de experiencia: " + politico.aniosExp);
        System.out.println("Partido: " + partido.nombreP + " | Rol: " + partido.rol);
    }
}

