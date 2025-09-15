package Eje5;

public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;

    public Persona(String nombre, String paterno, String materno, int edad, String ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }

    public void mostrarDatos() {
        System.out.println("Datos de la persona:");
        System.out.println("Nombre completo: " + nombre + " " + paterno + " " + materno);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
    }

    public boolean mayorDeEdad() {
        return edad >= 18;
    }

    public void modificarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
        System.out.println("La edad de " + nombre + " se actualizó a: " + edad);
    }

    public String getPaterno() {
        return paterno;
    }
    public String getNombre() {
    	return nombre;
    	
    }
}

