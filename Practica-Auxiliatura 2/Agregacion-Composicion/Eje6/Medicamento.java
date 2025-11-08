package Eje6;

public class Medicamento extends Producto {
    private String dosis;
    private String fechaVencimiento;

    public Medicamento(int codigo, String nombre, String dosis, String fechaVencimiento) {
        super(codigo, nombre);
        this.dosis = dosis;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDosis() {
        return dosis;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Dosis: " + dosis + " | Fecha de vencimiento: " + fechaVencimiento);
    }
}

