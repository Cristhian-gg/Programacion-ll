package Eje2;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoTrabajador {

    private String nombreArch;

    public ArchivoTrabajador(String nombreArch) {
        this.nombreArch = nombreArch;
    }

    // a) Crear archivo (vacío)
    public void crearArchivo() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArch));
        oos.writeObject(new ArrayList<Trabajador>());
        oos.close();
    }

    // Cargar lista desde archivo
    @SuppressWarnings("unchecked")
    private List<Trabajador> cargar() throws Exception {
        File f = new File(nombreArch);
        if (!f.exists()) return new ArrayList<>();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArch));
        List<Trabajador> lista = (List<Trabajador>) ois.readObject();
        ois.close();
        return lista;
    }

    // Guardar lista en archivo
    private void guardarLista(List<Trabajador> lista) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArch));
        oos.writeObject(lista);
        oos.close();
    }

    // b) Guardar un trabajador
    public void guardarTrabajador(Trabajador t) throws Exception {
        List<Trabajador> lista = cargar();
        lista.add(t);
        guardarLista(lista);
    }

    // c) Aumentar el salario del trabajador t en "a"
    public void aumentaSalario(int a, Trabajador t) throws Exception {
        List<Trabajador> lista = cargar();
        for (Trabajador x : lista) {
            if (x.getCarnet() == t.getCarnet()) {
                x.setSalario(x.getSalario() + a);
            }
        }
        guardarLista(lista);
    }

    // d) Buscar trabajador con mayor salario
    public Trabajador mayorSalario() throws Exception {
        List<Trabajador> lista = cargar();
        if (lista.isEmpty()) return null;

        Trabajador mayor = lista.get(0);
        for (Trabajador t : lista) {
            if (t.getSalario() > mayor.getSalario()) {
                mayor = t;
            }
        }
        return mayor;
    }

    // e) Ordenar trabajadores por salario ascendente
    public void ordenarPorSalario() throws Exception {
        List<Trabajador> lista = cargar();
        lista.sort((a, b) -> Double.compare(a.getSalario(), b.getSalario()));
        guardarLista(lista);
    }

    public void mostrar() throws Exception {
        List<Trabajador> lista = cargar();
        lista.forEach(System.out::println);
    }
}
