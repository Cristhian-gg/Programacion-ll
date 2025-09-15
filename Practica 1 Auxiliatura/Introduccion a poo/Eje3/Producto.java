package Eje3;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            double total = cantidad * precio;
            System.out.println("Se vendieron " + cantidad + " unidades de " + nombre + ". Total: $" + total);
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades.");
        }
    }

    public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Se reabastecieron " + cantidad + " unidades de " + nombre + ". Stock actual: " + stock);
    }

    public int getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }

}

