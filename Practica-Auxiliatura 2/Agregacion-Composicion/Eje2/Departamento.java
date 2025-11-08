package practicaAux;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String area;
    private List<Empleado> empleados;

    public Departamento(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarEmpleados() {
        System.out.println("Departamento: " + nombre + " (" + area + ")");
        if (empleados.isEmpty()) {
            System.out.println("  No hay empleados.");
        } else {
            for (Empleado e : empleados) {
                e.mostrarInfo();
            }
        }
        System.out.println("-----------------------------------");
    }

    public void cambioSalario(double nuevoSueldo) {
        for (Empleado e : empleados) {
            e.setSueldo(nuevoSueldo);
        }
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }
}

