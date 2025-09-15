package Eje13;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Fruta manzana = new Fruta("Manzana", "Dulce", new String[]{"A", "C"});

        Fruta naranja = new Fruta();
        naranja.setNombre("Naranja");
        naranja.setTipo("Cítrica");
        naranja.setVitaminas(new String[]{"C", "B1", "B6"});

        String[] vitaminasPlatano = {"A", "B6", "C"};
        Fruta platano = new Fruta("Plátano", "Dulce", vitaminasPlatano);

        Fruta frutaConMasVitaminas = manzana;
        if (naranja.getNroVitaminas() > frutaConMasVitaminas.getNroVitaminas()) {
            frutaConMasVitaminas = naranja;
        }
        if (platano.getNroVitaminas() > frutaConMasVitaminas.getNroVitaminas()) {
            frutaConMasVitaminas = platano;
        }
        System.out.println("La fruta con más vitaminas es: " + frutaConMasVitaminas.getNombre());

        naranja.mostrarVitaminas();

        String[] vitaminasCitricas = {"C", "B1", "B6"};
        int contador = 0;
        for (String vit : naranja.getVitaminas()) {
            for (String vitC : vitaminasCitricas) {
                if (vit.equalsIgnoreCase(vitC)) {
                    contador++;
                }
            }
        }
        System.out.println("La fruta " + naranja.getNombre() + " tiene " + contador + " vitaminas cítricas.");

        System.out.println("\nVitaminas ordenadas:");
        manzana.ordenarVitaminas();
        naranja.ordenarVitaminas();
        platano.ordenarVitaminas();

        manzana.mostrarVitaminas();
        naranja.mostrarVitaminas();
        platano.mostrarVitaminas();
	}

}
