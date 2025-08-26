package Eje1;

public class EcuacionLineal {
	
	//A)
	private double a,b,c,d,e,f;
	
	//B) 
    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

	//C)Esto sirve para verifica si tendra solucion
	public boolean tieneSolucion() {
		return( a * d - b * c) !=0;
	}
	//D) Metodos getX y getY 
	
	public double getX() {
		return(e * d - b * f) / ( a * d - b * c);
	}
	public double getY() {
		return(a * f - e * c) / ( a * d - b * c);
	}

}
