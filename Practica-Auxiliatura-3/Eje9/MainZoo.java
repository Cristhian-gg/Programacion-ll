package Eje9;

public class MainZoo {

    public static void main(String[] args) {

        ArchZoo arch = new ArchZoo("Archivo Central");

        Zoologico z1 = new Zoologico(1, "La Paz");
        z1.agregarAnimal(new Animal("Felino", "Leon", 3));
        z1.agregarAnimal(new Animal("Ave", "Condor", 2));

        Zoologico z2 = new Zoologico(2, "Cochabamba");
        z2.agregarAnimal(new Animal("Felino", "Tigre", 4));

        Zoologico z3 = new Zoologico(3, "Oruro"); // vacío

        arch.crear(z1);
        arch.crear(z2);
        arch.crear(z3);

        System.out.println("TODOS:");
        arch.mostrarTodo();

        // b)
        arch.listarMayorVariedad();

        // c)
        arch.listarVaciosYEliminar();

        // d)
        arch.mostrarEspecieX("Felino");

        // e)
        arch.moverAnimal(1, 2, "Leon");

        System.out.println("DESPUÉS DE MOVER:");
        arch.mostrarTodo();
    }
}
