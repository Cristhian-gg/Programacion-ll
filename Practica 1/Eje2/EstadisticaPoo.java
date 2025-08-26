package Eje2;

class EstadisticaPoo {
    private double[] numeros;

    // Constructor
    public EstadisticaPoo(double[] numeros) {
        this.numeros = numeros;
    }

    public double promedio() {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];  
        }
        double prom = suma / numeros.length;
        return prom;
    }

    public double desviacion() {
        double prom = promedio();           
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            double resta = numeros[i] - prom;  
            double cuadrado = resta * resta;      
            suma = suma + cuadrado;              
        }

        double resultado = Math.sqrt(suma / (numeros.length - 1));
        return resultado;
    }
}
