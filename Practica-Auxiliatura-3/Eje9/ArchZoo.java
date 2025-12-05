package Eje9;

import java.io.*;
import java.util.ArrayList;

public class ArchZoo {

    private String nombre;
    private ArrayList<Zoologico> zoologicos;
    private final String archivo = "zoologicos.dat";

    public ArchZoo(String nombre) {
        this.nombre = nombre;
        zoologicos = new ArrayList<>();
        cargar();
    }

    // ================== PERSISTENCIA ==================
    private void guardar() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(zoologicos);
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }

    private void cargar() {
        File f = new File(archivo);
        if (!f.exists()) return;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            zoologicos = (ArrayList<Zoologico>) in.readObject();
        } catch (Exception e) {
            zoologicos = new ArrayList<>();
        }
    }

    // ================== INCISO A ==================
    public void crear(Zoologico z) {
        zoologicos.add(z);
        guardar();
    }

    public void modificar(int id, String nuevoNombre) {
        for (Zoologico z : zoologicos) {
            if (z.getId() == id) {
                z.getAnimales().clear();
                guardar();
                return;
            }
        }
    }

    public void eliminar(int id) {
        zoologicos.removeIf(z -> z.getId() == id);
        guardar();
    }

    // ================== INCISO B ==================
    public void listarMayorVariedad() {
        Zoologico mayor = zoologicos.get(0);
        for (Zoologico z : zoologicos) {
            if (z.cantidadVariedad() > mayor.cantidadVariedad()) {
                mayor = z;
            }
        }
        System.out.println("Zoológico con mayor variedad:");
        System.out.println(mayor);
    }

    // ================== INCISO C ==================
    public void listarVaciosYEliminar() {
        zoologicos.removeIf(z -> z.getAnimales().isEmpty());
        guardar();
    }

    // ================== INCISO D ==================
    public void mostrarEspecieX(String especie) {
        System.out.println("Animales de especie " + especie);
        for (Zoologico z : zoologicos) {
            for (Animal a : z.getAnimales()) {
                if (a.getEspecie().equalsIgnoreCase(especie)) {
                    System.out.println(a);
                }
            }
        }
    }

    // ================== INCISO E ==================
    public void moverAnimal(int idOrigen, int idDestino, String nombreAnimal) {
        Animal movido = null;
        Zoologico origen = null;

        for (Zoologico z : zoologicos) {
            if (z.getId() == idOrigen) {
                for (Animal a : z.getAnimales()) {
                    if (a.getNombre().equalsIgnoreCase(nombreAnimal)) {
                        movido = a;
                        origen = z;
                        break;
                    }
                }
            }
        }

        if (movido != null) {
            origen.getAnimales().remove(movido);
        }

        for (Zoologico z : zoologicos) {
            if (z.getId() == idDestino) {
                z.agregarAnimal(movido);
            }
        }

        guardar();
    }

    public void mostrarTodo() {
        for (Zoologico z : zoologicos) {
            System.out.println(z);
            z.getAnimales().forEach(System.out::println);
        }
    }
}
