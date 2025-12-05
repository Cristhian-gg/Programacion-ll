package Eje4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        ArchiNota arch = new ArchiNota("notas.dat");
        arch.crearArchivo();

        List<Nota> notas = new ArrayList<>();

        notas.add(new Nota("Matemática", 80,
                new Estudiante("100", "Juan", "Perez", "Lopez", 20)));

        notas.add(new Nota("Programación", 95,
                new Estudiante("101", "Maria", "Mamani", "Choque", 19)));

        notas.add(new Nota("Programación", 95,
                new Estudiante("102", "Luis", "Quispe", "Flores", 21)));

        arch.agregarNotas(notas);

        System.out.println("\n=== Listado ===");
        arch.mostrar();

        System.out.println("\nPromedio general: " + arch.promedioNotas());

        System.out.println("\n=== Mejores notas ===");
        for (Nota n : arch.mejoresNotas()) System.out.println(n);

        System.out.println("\n=== Eliminando Programación ===");
        arch.eliminarMateria("Programación");

        arch.mostrar();
    }
}
