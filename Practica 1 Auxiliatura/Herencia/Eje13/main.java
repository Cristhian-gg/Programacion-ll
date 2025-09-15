package Eje13;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Chef chef1 = new Chef("Gusteau", 4000, 10, "Repostero", 50);
        Mesero mesero1 = new Mesero("Luis", 1500, 200, 5, 20);
        Mesero mesero2 = new Mesero("Ana", 1500, 150, 8, 18);
        Administrativo admin1 = new Administrativo("Carlos", 2500, "Contabilidad");
        Administrativo admin2 = new Administrativo("Sofia", 2500, "Recursos Humanos");

        Empleado[] empleados = {chef1, mesero1, mesero2, admin1, admin2};

        float X = 1500;
        System.out.println("\n--- Empleados con sueldo del mes = " + X + " ---");
        for (Empleado e : empleados) {
            if (e.sueldomes == X) {
                e.mostrar();
                System.out.println("Sueldo total: " + e.sueldoTotal());
            }
        }

        System.out.println("\n--- Sueldo total de todos los empleados ---");
        for (Empleado e : empleados) {
            e.mostrar();
            System.out.println("Sueldo total: " + e.sueldoTotal() + "\n");
        }
	}

}
