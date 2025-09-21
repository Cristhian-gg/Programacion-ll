package Eje2;
	
public class Juego {
    private int numeroDeVidas;
    private int record;

    public Juego(int numeroDeVidas) {
        this.setNumeroDeVidas(numeroDeVidas);
        this.record = 0;
    }

    public void reiniciaPartida(int numeroDeVidas) {
        this.setNumeroDeVidas(numeroDeVidas);
    }

    public void actualizaRecord(int vidasRestantes) {
        if (vidasRestantes > record) {
            record = vidasRestantes;
            System.out.println("¡Nuevo récord! Vidas restantes: " + record);
        }
    }

    public boolean quitaVida() {
        setNumeroDeVidas(getNumeroDeVidas() - 1);
        if (getNumeroDeVidas() > 0) {
            System.out.println("Te quedan " + getNumeroDeVidas() + " vidas.");
            return true;
        } else {
            System.out.println("¡Te has quedado sin vidas!");
            return false;
        }
    }

	public int getNumeroDeVidas() {
		return numeroDeVidas;
	}

	public void setNumeroDeVidas(int numeroDeVidas) {
		this.numeroDeVidas = numeroDeVidas;
	}
}
