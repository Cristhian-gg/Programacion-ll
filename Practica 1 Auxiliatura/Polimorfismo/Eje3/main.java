package Eje3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matriz identidad = new Matriz(3);
        System.out.println("Matriz identidad:");
        identidad.mostrar();

        float[][] valores = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Matriz m1 = new Matriz(valores);
        System.out.println("\nMatriz m1:");
        m1.mostrar();

        float[][] valores2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        Matriz m2 = new Matriz(valores2);
        System.out.println("\nMatriz m2:");
        m2.mostrar();

        System.out.println("\nm1 + m2:");
        Matriz suma = m1.sumar(m2);
        suma.mostrar();

        System.out.println("\nm1 - m2:");
        Matriz resta = m1.restar(m2);
        resta.mostrar();

        System.out.println("\n¿m1 == m2? " + m1.igual(m2));
        System.out.println("¿m1 == m1? " + m1.igual(m1));
	}

}
