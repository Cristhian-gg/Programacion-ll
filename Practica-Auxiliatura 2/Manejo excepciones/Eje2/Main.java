package Eje2;

public class Main {
    public static void main(String[] args) {
        try {
            int a = Calculadora.convertirAEntero("10");
            int b = Calculadora.convertirAEntero("5");
            int c = Calculadora.convertirAEntero("abc");

            System.out.println("Suma: " + Calculadora.sumar(a, b));
            System.out.println("Resta: " + Calculadora.restar(a, b));
            System.out.println("Multiplicación: " + Calculadora.multiplicar(a, b));
            System.out.println("División: " + Calculadora.dividir(a, b));

        } catch (NumeroInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("División entre cero: " + Calculadora.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
