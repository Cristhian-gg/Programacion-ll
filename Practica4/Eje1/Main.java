package Eje1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado[] empleados = new Empleado[5];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEmpleado tiempo completo #" + (i+1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Salario anual: ");
            double salarioAnual = sc.nextDouble();
            sc.nextLine(); 

            empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
        }

        for (int i = 3; i < 5; i++) {
            System.out.println("\nEmpleado por horas #" + (i-2));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Horas trabajadas: ");
            double horas = sc.nextDouble();

            System.out.print("Tarifa por hora: ");
            double tarifa = sc.nextDouble();
            sc.nextLine(); 

            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }

        System.out.println("\n--- Lista de empleados ---");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i]);
        }

        sc.close();
    }
}
