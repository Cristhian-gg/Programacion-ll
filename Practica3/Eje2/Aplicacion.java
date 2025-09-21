package Eje2;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println("=== JUEGO NORMAL ===");
        juego1.juega();

        System.out.println("\n=== JUEGO PARES ===");
        juego2.juega();

        System.out.println("\n=== JUEGO IMPARES ===");
        juego3.juega();
	}

}
