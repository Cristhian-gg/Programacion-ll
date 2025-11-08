package Eje4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ropero ropero = new Ropero("Madera");

        System.out.print("¿Cuántas prendas deseas agregar?: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Tipo de ropa: ");
            String tipo = sc.nextLine();
            System.out.print("Material: ");
            String material = sc.nextLine();
            ropero.adicionarRopa(new Ropa(tipo, material));
        }

        System.out.println("\n=== Prendas actuales ===");
        ropero.mostrarTodas();

        System.out.print("\nEliminar prendas de material: ");
        String matEliminar = sc.nextLine();
        ropero.eliminarPorMaterial(matEliminar);

        System.out.print("Eliminar prendas de tipo: ");
        String tipoEliminar = sc.nextLine();
        ropero.eliminarPorTipo(tipoEliminar);

        System.out.print("\nMostrar prendas de material: ");
        String matMostrar = sc.nextLine();
        ropero.mostrarPorMaterial(matMostrar);

        System.out.print("Mostrar prendas de tipo: ");
        String tipoMostrar = sc.nextLine();
        ropero.mostrarPorTipo(tipoMostrar);

        System.out.println("\n=== Estado final del ropero ===");
        ropero.mostrarTodas();

        sc.close();
    }
}
