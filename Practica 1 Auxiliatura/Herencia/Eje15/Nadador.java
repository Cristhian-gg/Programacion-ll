package Eje15;

public class Nadador {
    protected String estiloNatacion;

    public Nadador(String estiloNatacion) {
        this.estiloNatacion = estiloNatacion;
    }
}

class Ciclista {
    protected String tipoBicicleta;

    public Ciclista(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }
}

class Corredor {
    protected int distanciaPreferida;

    public Corredor(int distanciaPreferida) {
        this.distanciaPreferida = distanciaPreferida;
    }
}
