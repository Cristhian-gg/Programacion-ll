package Eje4;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario(5);

        try {
            inv.agregarProducto(new Producto("P001", "Laptop", 4500, 10));
            inv.agregarProducto(new Producto("P002", "Mouse", 120, 25));
            inv.agregarProducto(new Producto("P001", "Monitor", 800, 5)); 
        } catch (ProductoExistenteException e) {
            System.out.println(e.getMessage());
        }

        inv.mostrarInventario();

        try {
            inv.venderProducto("P002", 5); 
            inv.venderProducto("P003", 1); 
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            inv.venderProducto("P001", 20);
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        inv.mostrarInventario();
    }
}
