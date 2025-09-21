package Eje2;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 != 0) {
                return true;
            } else {
                System.out.println("Error: Solo puedes ingresar números impares entre 0 y 10.");
                return false;
            }
        }
        return false;
    }
}
