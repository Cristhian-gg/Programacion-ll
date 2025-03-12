package practica4;
abstract class Figura {
 protected double[] dimensiones;

 public Figura(double... dimensiones) {
     this.dimensiones = dimensiones;
 }

 abstract double calcularArea();
}

class Circulo extends Figura {
 public Circulo(double radio) {
     super(radio);
 }

 @Override
 double calcularArea() {
     return Math.PI * Math.pow(dimensiones[0], 2);
 }
}

class Rectangulo extends Figura {
 public Rectangulo(double base, double altura) {
     super(base, altura);
 }

 @Override
 double calcularArea() {
     return dimensiones[0] * dimensiones[1];
 }
}

class TrianguloRectangulo extends Figura {
 public TrianguloRectangulo(double base, double altura) {
     super(base, altura);
 }

 @Override
 double calcularArea() {
     return (dimensiones[0] * dimensiones[1]) / 2;
 }
}

class Trapecio extends Figura {
 public Trapecio(double baseMayor, double baseMenor, double altura) {
     super(baseMayor, baseMenor, altura);
 }

 @Override
 double calcularArea() {
     return ((dimensiones[0] + dimensiones[1]) * dimensiones[2]) / 2;
 }
}

class Pentagono extends Figura {
 public Pentagono(double lado, double apotema) {
     super(lado, apotema);
 }

 @Override
 double calcularArea() {
     return (5 * dimensiones[0] * dimensiones[1]) / 2;
 }
}

public class main {
 public static void main(String[] args) {
     Figura[] figuras = {
         new Circulo(5),
         new Rectangulo(4, 6),
         new TrianguloRectangulo(3, 4),
         new Trapecio(6, 4, 5),
         new Pentagono(5, 3)
     };

     for (Figura figura : figuras) {
         System.out.println("Área de " + figura.getClass().getSimpleName() + ": " + figura.calcularArea());
     }
 }
}
