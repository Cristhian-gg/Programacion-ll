package Eje11;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    JefePolicia jefe1 = new JefePolicia("Carlos", 45, 5000, "Comandante");
	        JefePolicia jefe2 = new JefePolicia("Ana", 40, 5500, "Mayor");

	        System.out.println("--- Datos de los jefes ---");
	        jefe1.mostrar();
	        System.out.println();
	        jefe2.mostrar();

	        if (jefe1.getSueldo() > jefe2.getSueldo()) {
	            System.out.println("\nEl jefe con mayor sueldo es: " + jefe1.nombre);
	        } else {
	            System.out.println("\nEl jefe con mayor sueldo es: " + jefe2.nombre);
	        }

	        if (jefe1.getGrado().equalsIgnoreCase(jefe2.getGrado())) {
	            System.out.println("Ambos jefes tienen el mismo grado.");
	        } else {
	            System.out.println("Los jefes tienen diferentes grados.");
	        }

	}

}
