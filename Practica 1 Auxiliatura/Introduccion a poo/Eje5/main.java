package Eje5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Persona p1 = new Persona("Carlos", "Perez", "Lopez", 20, "123456");
	        Persona p2 = new Persona("Ana", "Perez", "Gomez", 16, "654321");

	        p1.mostrarDatos();
	        System.out.println();
	        p2.mostrarDatos();

	        System.out.println("\n¿" + p1.getNombre() + " es mayor de edad? " + (p1.mayorDeEdad() ? "Sí" : "No"));
	        System.out.println("¿" + p2.getNombre() + " es mayor de edad? " + (p2.mayorDeEdad() ? "Sí" : "No"));

	        p2.modificarEdad(18);

	        if (p1.getPaterno().equalsIgnoreCase(p2.getPaterno())) {
	            System.out.println("\nAmbos tienen el mismo apellido paterno: " + p1.getPaterno());
	        } else {
	            System.out.println("\nNo tienen el mismo apellido paterno.");
	        }

	}

}
