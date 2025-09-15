package Eje9;

public class SistemaRadio {
    private double frecuencia;
    private int canal;
    private boolean encriptado;
    private boolean activo;

    public SistemaRadio(double frecuencia, int canal, boolean encriptado, boolean activo) {
        this.frecuencia = frecuencia;
        this.canal = canal;
        this.encriptado = encriptado;
        this.activo = activo;
    }

    public void transmitir() {
        System.out.println("Transmitiendo en frecuencia " + frecuencia + " MHz canal " + canal);
    }

    public void recibir() {
        System.out.println("Recibiendo señal en canal " + canal);
    }

    public void mostrar() {
        System.out.println("Radio [Frecuencia=" + frecuencia + "MHz, Canal=" + canal + ", Encriptado=" + encriptado + ", Activo=" + activo + "]");
    }
}
