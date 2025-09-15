package Eje7;

public class Mascota {
    
    private String nombre;
    private String tipo;
    private int energia;

    public Mascota(String nombre, String tipo, int energiaInicial) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energiaInicial;
    }

    public void alimentar() {
        energia = Math.min(100, energia + 20);
        System.out.println(nombre + " fue alimentado. Energía actual: " + energia);
    }

    public void jugar() {
        energia = Math.max(0, energia - 15);
        System.out.println(nombre + " jugó. Energía actual: " + energia);
    }

    public int getEnergia() {
        return energia;
    }
}
