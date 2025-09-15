package Eje7;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Mascota m1 = new Mascota("Firulais", "Perro", 50);
	        Mascota m2 = new Mascota("Michi", "Gato", 80);

	        System.out.println("Simulación de mascotas\n");

	        m1.alimentar(); 
	        m1.jugar();     

	        System.out.println();

	        m2.jugar();     
	        m2.alimentar();

	}

}
