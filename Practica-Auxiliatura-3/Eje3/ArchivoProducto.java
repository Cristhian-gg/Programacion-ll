package Eje3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoProducto {

    private String nomA;

    public ArchivoProducto(String nomA) {
        this.nomA = nomA;
    }

    // Crear archivo vacío
    public void crearArchivo() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA));
        oos.writeObject(new ArrayList<Producto>());
        oos.close();
    }

    @SuppressWarnings("unchecked")
    private List<Producto> cargar() throws Exception {
        File f = new File(nomA);
        if (!f.exists()) return new ArrayList<>();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA));
        List<Producto> lista = (List<Producto>) ois.readObject();
        ois.close();
        return lista;
    }

    private void guardarLista(List<Producto> lista) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA));
        oos.writeObject(lista);
        oos.close();
    }

    // b) guardar productos
    public void guardaProducto(Producto p) throws Exception {
        List<Producto> lista = cargar();
        lista.add(p);
        guardarLista(lista);
    }

    // c) buscar por código
    public Producto buscaProducto(int c) throws Exception {
        List<Producto> lista = cargar();
        for (Producto p : lista) {
            if (p.getCodigo() == c) {
                return p;
            }
        }
        return null;
    }

    // d) promedio de precios
    public float promedioPrecio() throws Exception {
        List<Producto> lista = cargar();
        if (lista.isEmpty()) return 0;

        float suma = 0;
        for (Producto p : lista) {
            suma += p.getPrecio();
        }
        return suma / lista.size();
    }

    // e) producto más caro
    public Producto productoMasCaro() throws Exception {
        List<Producto> lista = cargar();
        if (lista.isEmpty()) return null;

        Producto max = lista.get(0);
        for (Producto p : lista) {
            if (p.getPrecio() > max.getPrecio()) {
                max = p;
            }
        }
        return max;
    }

    public void mostrar() throws Exception {
        List<Producto> lista = cargar();
        lista.forEach(System.out::println);
    }
}
