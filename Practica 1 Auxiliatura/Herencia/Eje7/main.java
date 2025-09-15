package Eje7;

public class main {
    public static void main(String[] args) {
    	
        Estudiante e1 = new Estudiante("Juan", "Perez", "Lopez", 20, "123", "M001");
        Estudiante e2 = new Estudiante("Ana", "Gomez", "Diaz", 22, "456", "M002");
        Docente d1 = new Docente("Carlos", "Ramirez", "Martinez", 40, 3500.0, "DP-789");

        System.out.println("\n--- Estudiantes ---");
        e1.mostrar();
        e2.mostrar();

        System.out.println("\n--- Docente ---");
        d1.mostrar();

        double promedioEdad = (e1.getEdad() + e2.getEdad()) / 2.0;
        System.out.println("\nPromedio de edad de los estudiantes: " + promedioEdad);

        e1.modificarEdad(21);
        System.out.println("\nEdad modificada de " + e1.nombre + ": " + e1.getEdad());

        if (e1.getEdad() == d1.getEdad() || e2.getEdad() == d1.getEdad()) {
            System.out.println("\nAlgún estudiante tiene la misma edad que el docente.");
        } else {
            System.out.println("\nNingún estudiante tiene la misma edad que el docente.");
        }
    }
}

