package Eje13;

 import java.util.Arrays;

 public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] vitaminas;

    public Fruta() {
        this.nombre = "";
        this.tipo = "";
        this.nroVitaminas = 0;
        this.vitaminas = new String[30]; 
    }

    
    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = vitaminas.length;
        this.vitaminas = vitaminas;
    }

  
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setVitaminas(String[] vitaminas) {
        this.vitaminas = vitaminas;
        this.nroVitaminas = vitaminas.length;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getNroVitaminas() { return nroVitaminas; }
    public String[] getVitaminas() { return vitaminas; }

    public void mostrarVitaminas() {
        System.out.println("Vitaminas de " + nombre + ": " + Arrays.toString(vitaminas));
    }

    public void ordenarVitaminas() {
        Arrays.sort(vitaminas);
    }
}

