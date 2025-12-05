package Eje7;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArchNiño arch = new ArchNiño("/home/niños.dat");

        // a) Crear lista, guardar y leer
        List<Niño> lista = new ArrayList<>();
        lista.add(new Niño("Ana", "Lopez", "Perez", 123, 8, 25, 1.30));
        lista.add(new Niño("Luis", "Mendez", "Rojas", 456, 10, 32, 1.45));
        lista.add(new Niño("Carla", "Diaz", "Soto", 789, 7, 20, 1.20));
        lista.add(new Niño("Juan", "Flores", "Mamani", 555, 8, 40, 1.10)); // peso/talla incorrectos

        arch.guardar(lista);
        lista = arch.leer();

        System.out.println("a) LISTA DE NIÑOS:");
        for (Niño n : lista) System.out.println(n);

        // b) Niños con peso adecuado según edad y talla
        System.out.println("\nb) Cantidad con peso adecuado:");
        int contAdecuados = 0;
        for (Niño n : lista) {
            double esperado = (n.getTalla() * n.getEdad()) / 10.0;
            if (Math.abs(n.getPeso() - esperado) <= 2) {
                contAdecuados++;
            }
        }
        System.out.println("Niños con peso adecuado: " + contAdecuados);

        // c) Niños con peso o talla inadecuada
        System.out.println("\nc) Niños con peso o talla NO adecuada:");
        for (Niño n : lista) {
            double pesoOk = (n.getTalla() * n.getEdad()) / 10.0;
            boolean malPeso = Math.abs(n.getPeso() - pesoOk) > 2;

            double tallaMin = n.getEdad() * 5 - 10;
            double tallaMax = n.getEdad() * 5 + 10;
            boolean malTalla = n.getTalla() < tallaMin || n.getTalla() > tallaMax;

            if (malPeso || malTalla) {
                System.out.println(n);
            }
        }

        // d) Promedio de edad
        double suma = 0;
        for (Niño n : lista) suma += n.getEdad();
        double promedio = suma / lista.size();
        System.out.println("\nd) Promedio de edad: " + promedio);

        // e) Buscar niño por CI
        int ciBuscado = 456;
        System.out.println("\ne) Niño con CI " + ciBuscado + ":");
        for (Niño n : lista) {
            if (n.getCi() == ciBuscado) {
                System.out.println(n);
            }
        }

        // f) Niños con la talla más alta
        System.out.println("\nf) Niños con la mayor talla:");
        double maxTalla = 0;
        for (Niño n : lista) {
            if (n.getTalla() > maxTalla)
                maxTalla = n.getTalla();
        }
        for (Niño n : lista) {
            if (n.getTalla() == maxTalla) {
                System.out.println(n);
            }
        }
    }
}
