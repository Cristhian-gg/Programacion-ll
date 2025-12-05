package Eje2;

public class Main {
    public static void main(String[] args) throws Exception {

        ArchivoTrabajador arch = new ArchivoTrabajador("trabajadores.dat");

        arch.crearArchivo();

        arch.guardarTrabajador(new Trabajador("Juan", 123, 2500));
        arch.guardarTrabajador(new Trabajador("María", 456, 3000));
        arch.guardarTrabajador(new Trabajador("Carlos", 789, 2800));

        System.out.println("=== Lista inicial ===");
        arch.mostrar();

        System.out.println("\n=== Aumentando salario a Carlos ===");
        arch.aumentaSalario(500, new Trabajador("", 789, 0));
        arch.mostrar();

        System.out.println("\n=== Trabajador con mayor salario ===");
        System.out.println(arch.mayorSalario());

        System.out.println("\n=== Ordenando por salario ===");
        arch.ordenarPorSalario();
        arch.mostrar();
    }
}
