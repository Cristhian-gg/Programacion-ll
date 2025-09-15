package Eje7;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parada p1 = new Parada();
        p1.adicionar("Carlos");
        p1.adicionar("Pedro", "Juan Perez", "ABC-123");
        p1.mostrar();

        Parada p2 = new Parada("Parada Central");
        p2.adicionar("Ana");
        p2.adicionar("Toyota Corolla", "Luis Flores", "XYZ-789");
        p2.adicionar("Nissan Sentra", "Maria Lopez", "LMN-456");
        p2.mostrar();

	}

}
