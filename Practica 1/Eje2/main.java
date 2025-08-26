package Eje2;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double[] valores = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            valores[i] = sc.nextDouble();
        }

        EstadisticaPoo est = new EstadisticaPoo(valores);

        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviación estándar es " + est.desviacion());
	}

}
