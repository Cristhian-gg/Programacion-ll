package Eje1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCharango {

    public void guardar(String archivo, List<Charango> lista) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
        oos.writeObject(lista);
        oos.close();
    }

    @SuppressWarnings("unchecked")
    public List<Charango> cargar(String archivo) throws Exception {
        File f = new File(archivo);
        if (!f.exists()) return new ArrayList<>();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
        List<Charango> lista = (List<Charango>) ois.readObject();
        ois.close();
        return lista;
    }
}
