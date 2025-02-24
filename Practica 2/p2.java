import javax.swing.*;
import java.awt.*;

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

class Dibujo extends JPanel {
    private Punto p1, p2;
    private Linea linea;
    private Circulo circulo;

    public Dibujo(Punto p1, Punto p2, Linea linea, Circulo circulo) {
        this.p1 = p1;
        this.p2 = p2;
        this.linea = linea;
        this.circulo = circulo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        int x1 = (int) (p1.x * 50 + 100);
        int y1 = (int) (300 - p1.y * 50);
        int x2 = (int) (p2.x * 50 + 100);
        int y2 = (int) (300 - p2.y * 50);

        g.fillOval(x1 - 3, y1 - 3, 6, 6);
        g.fillOval(x2 - 3, y2 - 3, 6, 6);

        g.drawString("P1" + p1, x1 + 5, y1 - 5);
        g.drawString("P2" + p2, x2 + 5, y2 - 5);

        g.drawLine(x1, y1, x2, y2);

        int radioPx = (int) (circulo.radio * 50);
        int centroX = (int) (circulo.centro.x * 50 + 100);
        int centroY = (int) (300 - circulo.centro.y * 50);
        g.drawOval(centroX - radioPx, centroY - radioPx, radioPx * 2, radioPx * 2);
        g.drawString("Centro " + circulo.centro, centroX + 5, centroY - 5);
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

        JFrame ventana = new JFrame("Gráfica");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        ventana.add(new Dibujo(p1, p2, linea, circulo));
        ventana.setVisible(true);
    }
}
