package Eje15;

public class Triatleta implements INadador, ICiclista, ICorredor {
    private String nombre;
    private Nadador nadador;
    private Ciclista ciclista;
    private Corredor corredor;

    public Triatleta(String nombre, String estiloNatacion, String tipoBicicleta, int distanciaPreferida) {
        this.nombre = nombre;
        this.nadador = new Nadador(estiloNatacion);
        this.ciclista = new Ciclista(tipoBicicleta);
        this.corredor = new Corredor(distanciaPreferida);
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " nadando estilo " + nadador.estiloNatacion);
    }

    @Override
    public void pedalear() {
        System.out.println(nombre + " pedaleando en bicicleta tipo " + ciclista.tipoBicicleta);
    }

    @Override
    public void correr() {
        System.out.println(nombre + " corriendo una distancia de " + corredor.distanciaPreferida + " km");
    }
}
