package Eje6;

public class Producto {
    protected int codigo;
    protected String nombre;

    public Producto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo + " | Nombre: " + nombre);
    }
}
