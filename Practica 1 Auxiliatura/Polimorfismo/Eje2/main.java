package Eje2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        VideoJuego v1 = new VideoJuego("FIFA 23", "PlayStation", 2);
        VideoJuego v2 = new VideoJuego("Minecraft"); 
        VideoJuego v3 = new VideoJuego(); 
        v1.mostrarInfo();
        v2.mostrarInfo();
        v3.mostrarInfo();

        v1.agregarJugadores();         
        v1.agregarJugadores(3);        
        v1.agregarJugadoresTeclado();  

        v1.mostrarInfo();
	}

}
