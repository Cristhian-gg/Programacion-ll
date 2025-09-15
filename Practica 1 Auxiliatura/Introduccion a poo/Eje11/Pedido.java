package Eje11;

public class Pedido {
    private int numeroPedido;
    private String estado;

    public Pedido(int numeroPedido, String estado) {
        this.numeroPedido = numeroPedido;
        this.estado = estado;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrar() {
        System.out.println("Pedido [Número=" + numeroPedido + ", Estado=" + estado + "]");
    }
}
