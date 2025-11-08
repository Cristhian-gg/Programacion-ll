package Eje8;

public class Main {
    public static void main(String[] args) {
        Facultad f1 = new Facultad("Ingeniería", "Sistemas");
        Facultad f2 = new Facultad("Ciencias Económicas", "Economía");

        Fraternidad frat1 = new Fraternidad("Tinkus San Simón", "Carlos López");
        Fraternidad frat2 = new Fraternidad("Caporales Central", "Luis Vargas");

        Bailarin b1 = new Bailarin("Juan Pérez", 21, f1, frat1);
        Bailarin b2 = new Bailarin("María López", 22, f2, frat1);
        Bailarin b3 = new Bailarin("Andrés Gutiérrez", 20, f1, frat1);
        Bailarin b4 = new Bailarin("Lucía Ramos", 23, f2, frat2);
        Bailarin b5 = new Bailarin("José Aguilar", 19, f1, frat2);

        frat1.agregarBailarin(b1);
        frat1.agregarBailarin(b2);
        frat1.agregarBailarin(b3);

        frat2.agregarBailarin(b4);
        frat2.agregarBailarin(b5);

        frat1.mostrarBailarines();
        frat2.mostrarBailarines();

        System.out.println("\n--- Verificando bailarines duplicados ---");
        verificarDuplicados(b1, frat2);
    }

    public static void verificarDuplicados(Bailarin bailarin, Fraternidad otraFraternidad) {
        if (bailarin.getFraternidad().getNombre().equals(otraFraternidad.getNombre())) {
            System.out.println(bailarin.getNombre() + " ya pertenece a " + otraFraternidad.getNombre());
        } else {
            System.out.println(bailarin.getNombre() + " pertenece a " + bailarin.getFraternidad().getNombre() +
                               " y no puede estar en " + otraFraternidad.getNombre());
        }
    }
}

