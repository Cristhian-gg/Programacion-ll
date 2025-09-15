package Eje3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Producto("Laptop", 3500.0, 10);

        p1.vender(3);  
        p1.vender(8);   
        p1.reabastecer(5); 
        p1.vender(4);
        
	}

}
