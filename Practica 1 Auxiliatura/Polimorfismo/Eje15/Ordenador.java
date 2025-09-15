package Eje15;

public class Ordenador {
    private String codigoSerial;
    private int numero;
    private int ram;
    private String procesador;
    private boolean activo; 

    public Ordenador(String codigoSerial, int numero, int ram, String procesador, boolean activo) {
        this.codigoSerial = codigoSerial;
        this.numero = numero;
        this.ram = ram;
        this.procesador = procesador;
        this.activo = activo;
    }

    public String getCodigoSerial() { return codigoSerial; }
    public int getRam() { return ram; }
    public boolean isActivo() { return activo; }

    public void mostrar() {
        System.out.println("Codigo: " + codigoSerial +
                " | Numero: " + numero +
                " | RAM: " + ram + " GB" +
                " | Procesador: " + procesador +
                " | Estado: " + (activo ? "Activo" : "Inactivo"));
    }
}
