package Eje2;

public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: división entre cero no permitida.");
        }
        return (double) a / b;
    }

    public static int convertirAEntero(String valor) throws NumeroInvalidoException {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            throw new NumeroInvalidoException("Error: '" + valor + "' no es un número válido.");
        }
    }
}

