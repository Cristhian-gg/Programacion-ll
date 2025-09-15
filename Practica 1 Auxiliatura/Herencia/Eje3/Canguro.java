package Eje3;

public class Canguro extends Animal {

    public Canguro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " salta rápidamente usando sus patas traseras.");
    }
}

