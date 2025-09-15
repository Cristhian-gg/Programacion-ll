package Eje15;

public class main {
	
	public class GestionLaboratorios {

	    public static void trasladar(Laboratorio origen, Laboratorio destino, int cantidad) {
	        System.out.println("\n*** Antes del traslado ***");
	        origen.informacion();
	        destino.informacion();

	        for (int i = 0; i < cantidad && !origen.getOrdenadores().isEmpty(); i++) {
	            Ordenador o = origen.getOrdenadores().get(origen.getOrdenadores().size() - 1);
	            destino.adicionar(o);
	            origen.getOrdenadores().remove(origen.getOrdenadores().size() - 1);
	        }

	        System.out.println("\n*** Despues del traslado ***");
	        origen.informacion();
	        destino.informacion();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Laboratorio lasin1 = new Laboratorio("Lasin 1", 10);
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 10);

        Ordenador o1 = new Ordenador("S001", 1, 4, "i3", true);
        Ordenador o2 = new Ordenador("S002", 2, 8, "i5", false);
        Ordenador o3 = new Ordenador("S003", 3, 16, "i7", true);
        Ordenador o4 = new Ordenador("S004", 4, 12, "Ryzen 5", true);
        Ordenador o5 = new Ordenador("S005", 5, 6, "i3", false);
        Ordenador o6 = new Ordenador("S006", 6, 16, "Ryzen 7", true);

        lasin1.adicionar(o1);
        lasin1.adicionar(o2);
        lasin1.adicionar(o3);
        lasin1.adicionar(o4);
        lasin2.adicionar(o5);
        lasin2.adicionar(o6);

        lasin1.informacion(true);   
        lasin2.informacion(false);  
        lasin1.informacion();       
        lasin2.informacion(8);      

        trasladar(lasin1, lasin2, 2);
	}
}
}
