package Eje2;

import java.util.List;

public interface Persistencia {
    void guardar(String nombreArchivo, List<?> lista) throws Exception;
    <T> List<T> cargar(String nombreArchivo) throws Exception;
}
