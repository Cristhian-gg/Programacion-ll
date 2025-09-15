package Eje2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus miBus = new Bus(40);

        miBus.subirPasajeros(15);
        miBus.mostrarEstado();

        miBus.subirPasajeros(30); 
        miBus.mostrarEstado();

	}

}
