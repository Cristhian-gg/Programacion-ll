package EjeExamen;
import java.util.*;
public class Cabina {

	private int nroCabina;
	private ArrayList<Persona> personasAbordo;
	
	public Cabina(int nroCabina) {
		super();
		this.nroCabina = nroCabina;
	}
	
	public void agregarPersona(Persona p) {
	
		personasAbordo.add(p);
		System.out.println("Persona agregada a la cabina");
		
	}
	public void agregarPersona(Persona p , int nroX) {
		
		personasAbordo.add(p);
		System.out.println("Persona agregada a la cabina" + nroX);
		
	}

	public int getNroCabina() {
		return nroCabina;
	}

	public void setNroCabina(int nroCabina) {
		this.nroCabina = nroCabina;
	}

	public ArrayList<Persona> getPersonasAbordo() {
		return personasAbordo;
	}

	public void setPersonasAbordo(ArrayList<Persona> personasAbordo) {
		this.personasAbordo = personasAbordo;
	}
	

	
	
	

}
