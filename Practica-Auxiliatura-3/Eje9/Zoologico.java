package Eje9;

import java.io.Serializable;
import java.util.ArrayList;

public class Zoologico implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private int nroAnimales;
    private ArrayList<Animal> animales;

    public Zoologico(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.animales = new ArrayList<>();
        this.nroAnimales = 0;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public ArrayList<Animal> getAnimales() { return animales; }

    public void agregarAnimal(Animal a) {
        animales.add(a);
        nroAnimales++;
    }

    public boolean eliminarAnimalPorNombre(String nombre) {
        return animales.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
    }

    public int cantidadVariedad() {
        return animales.size();
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nroAnimales=" + nroAnimales +
                '}';
    }
}
