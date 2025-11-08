package Eje4;

public class Inventario {
    private Producto[] productos;
    private int contador;

    public Inventario(int capacidad) {
        productos = new Producto[capacidad];
        contador = 0;
    }

    public void agregarProducto(Producto p) throws ProductoExistenteException {
        if (p.getPrecio() < 0 || p.getStock() < 0) {
            throw new ProductoExistenteException("Error: precio o stock no pueden ser negativos.");
        }

        for (int i = 0; i < contador; i++) {
            if (productos[i].getCodigo().equalsIgnoreCase(p.getCodigo())) {
                throw new ProductoExistenteException("Error: el producto con código " + p.getCodigo() + " ya existe.");
            }
        }

        if (contador < productos.length) {
            productos[contador++] = p;
        } else {
            System.out.println("Inventario lleno, no se puede agregar más productos.");
        }
    }

    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCodigo().equalsIgnoreCase(codigo)) {
                return productos[i];
            }
        }
        throw new ProductoNoEncontradoException("Producto con código " + codigo + " no encontrado.");
    }

    public void venderProducto(String codigo, int cantidad)
            throws ProductoNoEncontradoException, StockInsuficienteException {
        Producto p = buscarProducto(codigo);
        if (p.getStock() < cantidad) {
            throw new StockInsuficienteException("Stock insuficiente para vender " + cantidad + " unidades.");
        }
        p.setStock(p.getStock() - cantidad);
        System.out.println("Venta realizada: " + cantidad + " unidades de " + p.getNombre());
    }

    public void mostrarInventario() {
        System.out.println("=== Inventario Actual ===");
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }
}
