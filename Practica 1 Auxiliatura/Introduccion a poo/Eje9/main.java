package Eje9;

public class main {
	    public static void main(String[] args) {
	        Camara cam1 = new Camara("Sony", "1080p", 50, true);
	        OficialEncubierto of1 = new OficialEncubierto("Luis", "Sargento", "Pistola 9mm", true);
	        SistemaRadio radio1 = new SistemaRadio(450.5, 3, true, true);
	        CocineroPolicial cocinero1 = new CocineroPolicial("Carlos", 5, "Salchipapas Especiales", true);

	        cam1.mostrar();
	        of1.mostrar();
	        radio1.mostrar();
	        cocinero1.mostrar();

	        System.out.println("\n--- Simulación en la Ceja de El Alto ---\n");

	        cam1.grabar();
	        cam1.detectarMovimiento();
	        of1.vigilar();
	        of1.arrestar();
	        radio1.transmitir();
	        radio1.recibir();
	        cocinero1.cocinar();
	        cocinero1.reducirSospechoso();
	    }
	}


