class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}

class Linea {
    private Punto punto1, punto2;

    public Linea(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public double longitud() {
        return Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
    }

    public String toString() {
        return "Linea desde " + punto1 + " hasta " + punto2;
    }
}

class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public String toString() {
        return "Circulo con centro en " + centro + " y radio " + String.format("%.2f", radio);
    }
}

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 3);
        Punto p2 = new Punto(4, 0);
        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(p1, 5);

        System.out.println(linea);
        System.out.println("Longitud de la línea: " + linea.longitud());
        System.out.println(circulo);
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Perímetro del círculo: " + circulo.perimetro());
    }
}
class Punto {
    public double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}

class Linea {
    public Punto punto1, punto2;

    public Linea(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public double longitud() {
        return Math.sqrt(Math.pow(punto2.x - punto1.x, 2) + Math.pow(punto2.y - punto1.y, 2));
    }

    public String toString() {
        return "Linea desde " + punto1 + " hasta " + punto2;
    }
}

class Circulo {
    public Punto centro;
    public double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public String toString() {
        return "Circulo con centro en " + centro + " y radio " + String.format("%.2f", radio);
    }
}

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 3);
        Punto p2 = new Punto(4, 0);
        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(p1, 5);

        System.out.println(linea);
        System.out.println("Longitud de la línea: " + linea.longitud());
        System.out.println(circulo);
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Perímetro del círculo: " + circulo.perimetro());
    }
}
