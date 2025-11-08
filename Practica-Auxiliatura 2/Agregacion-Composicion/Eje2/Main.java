package practicaAux;

public class Main {
    public static void main(String[] args) {
        Departamento d1 = new Departamento("Informatica", "Sistemas");
        Departamento d2 = new Departamento("Contabilidad", "Finanzas");

        d1.agregarEmpleado(new Empleado("Ana", "Analista", 4000));
        d1.agregarEmpleado(new Empleado("Luis", "Programador", 3500));
        d1.agregarEmpleado(new Empleado("Maria", "Tester", 3000));
        d1.agregarEmpleado(new Empleado("Jose", "Administrador", 4200));
        d1.agregarEmpleado(new Empleado("Sofia", "Diseñadora", 3700));

        System.out.println("=== Empleados iniciales ===");
        d1.mostrarEmpleados();
        d2.mostrarEmpleados();

        System.out.println("=== Cambio de salario en Departamento 1 ===");
        d1.cambioSalario(4500);
        d1.mostrarEmpleados();

        boolean existe = false;
        for (Empleado e1 : d1.getEmpleados()) {
            for (Empleado e2 : d2.getEmpleados()) {
                if (e1.getNombre().equals(e2.getNombre())) {
                    existe = true;
                }
            }
        }
        System.out.println("¿Algún empleado del d1 pertenece también al d2?: " + existe);

        System.out.println("=== Moviendo empleados del Departamento 1 al 2 ===");
        d2.getEmpleados().addAll(d1.getEmpleados());
        d1.getEmpleados().clear();

        System.out.println("=== Estado final de los departamentos ===");
        d1.mostrarEmpleados();
        d2.mostrarEmpleados();
    }
}

