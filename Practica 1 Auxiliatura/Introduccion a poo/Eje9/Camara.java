package Eje9;

public class Camara {
    private String marca;
    private String resolucion;
    private int rangoVision;
    private boolean activa;

    public Camara(String marca, String resolucion, int rangoVision, boolean activa) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.rangoVision = rangoVision;
        this.activa = activa;
    }

    public void grabar() {
        System.out.println("La cámara " + marca + " está grabando en " + resolucion);
    }

    public void detectarMovimiento() {
        System.out.println("Movimiento detectado por la cámara " + marca);
    }

    public void mostrar() {
        System.out.println("Camara [Marca=" + marca + ", Resolución=" + resolucion + ", Rango=" + rangoVision + "m, Activa=" + activa + "]");
    }
}
