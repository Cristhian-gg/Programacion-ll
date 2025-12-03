package Eje2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaArchivo implements Persistencia {

    private static final String RUTA_ESCRITORIO = "/home/cristhian/Escritorio/";

    @Override
    public void guardar(String nombreArchivo, List<?> lista) throws Exception {
        String ruta = RUTA_ESCRITORIO + nombreArchivo;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta));
        oos.writeObject(lista);
        oos.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> List<T> cargar(String nombreArchivo) throws Exception {
        String ruta = RUTA_ESCRITORIO + nombreArchivo;
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            return new ArrayList<>();
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
        List<T> lista = (List<T>) ois.readObject();
        ois.close();

        return lista;
    }
}
