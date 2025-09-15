package Eje3;

public class Matriz {
    private float[][] matriz; // atributo

    public Matriz(int n) {
        matriz = new float[n][n];
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1; // valores de la diagonal = 1
        }
    }

    public Matriz(float[][] valores) {
        int filas = valores.length;
        int cols = valores[0].length;
        matriz = new float[filas][cols];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = valores[i][j];
            }
        }
    }

    public Matriz sumar(Matriz otra) {
        int filas = matriz.length;
        int cols = matriz[0].length;
        Matriz resultado = new Matriz(new float[filas][cols]);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }
        return resultado;
    }

    public Matriz restar(Matriz otra) {
        int filas = matriz.length;
        int cols = matriz[0].length;
        Matriz resultado = new Matriz(new float[filas][cols]);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] - otra.matriz[i][j];
            }
        }
        return resultado;
    }

    public boolean igual(Matriz otra) {
        int filas = matriz.length;
        int cols = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                if (this.matriz[i][j] != otra.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void mostrar() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
