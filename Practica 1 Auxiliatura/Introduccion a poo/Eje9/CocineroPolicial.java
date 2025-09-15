package Eje9;

public class CocineroPolicial {
    private String nombre;
    private int experiencia;
    private String especialidad;
    private boolean entrenadoPolicialmente;

    public CocineroPolicial(String nombre, int experiencia, String especialidad, boolean entrenadoPolicialmente) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.especialidad = especialidad;
        this.entrenadoPolicialmente = entrenadoPolicialmente;
    }

    public void cocinar() {
        System.out.println(nombre + " está cocinando salchipapas (" + especialidad + ")");
    }

    public void reducirSospechoso() {
        System.out.println(nombre + " reduce a un sospechoso sin levantar sospechas.");
    }

    public void mostrar() {
        System.out.println("Cocinero [Nombre=" + nombre + ", Experiencia=" + experiencia +" años, Especialidad=" + especialidad + ", Entrenamiento Policial=" + entrenadoPolicialmente + "]");
    }
}
