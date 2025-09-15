package Eje9;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Politico p1 = new Politico("Abogado", 15);
        Partido par1 = new Partido("Partido A", "Líder");
        Presidente pres1 = new Presidente("Juan", "Perez", p1, par1);

        Presidente pres2 = new Presidente("Ana", "Gomez", "Economista", 12, "Partido B", "Fundadora");

        pres1.mostrarDatos();
        System.out.println();
        pres2.mostrarDatos();

        Presidente[] presidentes = new Presidente[3];
        presidentes[0] = pres1;
        presidentes[1] = pres2;
        presidentes[2] = new Presidente("Carlos", "Ramirez", "Politólogo", 10, "Partido C", "Miembro");

        String nombreBuscar = "Ana";
        System.out.println("\n--- Buscando presidente con nombre: " + nombreBuscar + " ---");
        boolean encontrado = false;
        for (Presidente pres : presidentes) {
            if (pres.getNombre().equalsIgnoreCase(nombreBuscar)) {
                pres.mostrarDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró al presidente con nombre " + nombreBuscar);
        }
    }
	

}
