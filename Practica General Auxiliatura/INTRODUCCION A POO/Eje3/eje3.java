public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println("El coche " + marca + " " + modelo + " ha acelerado. Velocidad: " + velocidad + " km/h.");
    }

    public void frenar() {
        velocidad -= 5;
        System.out.println("El coche " + marca + " " + modelo + " ha frenado. Velocidad: " + velocidad + " km/h.");
    }
}
