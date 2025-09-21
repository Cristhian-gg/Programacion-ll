package Eje1;

public class Juego {
    private int numeroDeVidas;
    private int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }

    public void actualizaRecord(int vidasRestantes) {
        if (vidasRestantes > record) {
            record = vidasRestantes;
            System.out.println("¡Nuevo récord! Vidas restantes: " + record);
        }
    }
    

    public int getNumeroDeVidas() {
		return numeroDeVidas;
	}

	public void setNumeroDeVidas(int numeroDeVidas) {
		this.numeroDeVidas = numeroDeVidas;
	}

	public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te quedan " + numeroDeVidas + " vidas.");
            return true;
        } else {
            System.out.println("¡Te has quedado sin vidas!");
            return false;
        }
    }
}
