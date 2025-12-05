package Eje1;

import java.util.List;

public class OperacionesCharango {

    // b) Eliminar charangos con más de 6 cuerdas false
    public void eliminarConMasDe6CuerdasFalse(List<Charango> lista) {
        lista.removeIf(c -> c.cantCuerdasFalse() > 6);
    }

    // c) Listar charangos por material
    public void listarPorMaterial(List<Charango> lista, String x) {
        for (Charango c : lista) {
            if (c.getMaterial().equalsIgnoreCase(x)) {
                System.out.println(c);
            }
        }
    }

    // d) Buscar charangos con 10 cuerdas
    public void buscarCon10Cuerdas(List<Charango> lista) {
        for (Charango c : lista) {
            if (c.getNroCuerdas() == 10) {
                System.out.println(c);
            }
        }
    }

    // e) Ordenar alfabéticamente por material
    public void ordenarPorMaterial(List<Charango> lista) {
        lista.sort((a, b) -> a.getMaterial().compareToIgnoreCase(b.getMaterial()));
    }
}
