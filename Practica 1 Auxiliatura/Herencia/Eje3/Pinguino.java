package Eje3;

public class Pinguino extends Animal {

    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " nada ágilmente en el agua.");
    }
}

