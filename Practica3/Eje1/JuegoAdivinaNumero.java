package Eje1;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void juega() {
    	
        reiniciaPartida(super.getNumeroDeVidas());
        numeroAAdivinar = random.nextInt(11); 

        System.out.println("Bienvenido al juego Adivina el Número.");
        System.out.println("Debes adivinar un número entre 0 y 10.");

        while (true) {
            System.out.print("Introduce tu número: ");
            int intento = scanner.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord(super.getNumeroDeVidas());
                break;
            } else {
                if (!quitaVida()) {
                    break;
                } else {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número a adivinar es mayor.");
                    } else {
                        System.out.println("El número a adivinar es menor.");
                    }
                }
            }
        }
    }
}
	