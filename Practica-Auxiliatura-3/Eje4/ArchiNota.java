package Eje4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchiNota {

    private String nombreArchi;

    public ArchiNota(String nombreArchi) {
        this.nombreArchi = nombreArchi;
    }

    // Crea archivo vacío
    public void crearArchivo() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchi));
        oos.writeObject(new ArrayList<Nota>());
        oos.close();
    }

    @SuppressWarnings("unchecked")
    private List<Nota> cargar() throws Exception {
        File f = new File(nombreArchi);
        if (!f.exists()) return new ArrayList<>();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchi));
        List<Nota> lista = (List<Nota>) ois.readObject();
        ois.close();
        return lista;
    }

    private void guardarLista(List<Nota> lista) throws Exception {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(nombreArchi));
        oos.writeObject(lista);
        oos.close();
    }

    // b) Agregar varios estudiantes (varias notas)
    public void agregarNotas(List<Nota> nuevas) throws Exception {
        List<Nota> lista = cargar();
        lista.addAll(nuevas);
        guardarLista(lista);
    }

    // c) Obtener promedio
    public float promedioNotas() throws Exception {
        List<Nota> lista = cargar();
        if (lista.isEmpty()) return 0;

        float suma = 0;
        for (Nota n : lista) suma += n.getNotaFinal();

        return suma / lista.size();
    }

    // d) Buscar estudiantes con la mejor nota
    public List<Nota> mejoresNotas() throws Exception {
        List<Nota> lista = cargar();
        List<Nota> mejores = new ArrayList<>();

        if (lista.isEmpty()) return mejores;

        float max = lista.get(0).getNotaFinal();

        for (Nota n : lista) {
            if (n.getNotaFinal() > max) {
                max = n.getNotaFinal();
            }
        }

        for (Nota n : lista) {
            if (n.getNotaFinal() == max) {
                mejores.add(n);
            }
        }

        return mejores;
    }

    // e) Eliminar estudiantes por materia
    public void eliminarMateria(String materia) throws Exception {
        List<Nota> lista = cargar();
        lista.removeIf(n -> n.getMateria().equalsIgnoreCase(materia));
        guardarLista(lista);
    }

    public void mostrar() throws Exception {
        List<Nota> lista = cargar();
        for (Nota n : lista) System.out.println(n);
    }
}
