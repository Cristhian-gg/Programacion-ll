package Eje5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Bus bus1 = new Bus("Carlos", "BUS-123", 1, 50, "Sindicato A");
	        Auto auto1 = new Auto("Ana", "AUTO-456", 2, 150, true);
	        Moto moto1 = new Moto("Luis", "MOTO-789", 3, 250, true);

	        System.out.println("\n--- Datos de los vehículos ---");
	        bus1.mostrarDatos();
	        auto1.mostrarDatos();
	        moto1.mostrarDatos();

	        System.out.println("\n--- Cambiando conductor del bus ---");
	        bus1.cambiarConductor("Pedro");

	        bus1.mostrarDatos();

	}

}
