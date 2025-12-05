package Eje3;

public class Main {
    public static void main(String[] args) throws Exception {

        ArchivoProducto arch = new ArchivoProducto("productos.dat");
        arch.crearArchivo();

        arch.guardaProducto(new Producto(1, "Laptop", 4500));
        arch.guardaProducto(new Producto(2, "Mouse", 50));
        arch.guardaProducto(new Producto(3, "Celular", 3000));
        arch.guardaProducto(new Producto(4, "Tablet", 1500));

        System.out.println("=== Lista ===");
        arch.mostrar();

        System.out.println("\n=== Buscar producto con código 3 ===");
        System.out.println(arch.buscaProducto(3));

        System.out.println("\n=== Promedio de precios ===");
        System.out.println(arch.promedioPrecio());

        System.out.println("\n=== Producto más caro ===");
        System.out.println(arch.productoMasCaro());
    }
}
