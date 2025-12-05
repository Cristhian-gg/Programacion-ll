package Eje1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        ArchivoCharango archivo = new ArchivoCharango();
        OperacionesCharango op = new OperacionesCharango();

        String ruta = "charangos.dat";

        // Crear lista de prueba
        List<Charango> lista = new ArrayList<>();

        lista.add(new Charango("Madera", new boolean[]{true,true,false,true,false,true,true,false,true,false}));
        lista.add(new Charango("Roble",  new boolean[]{true,true,true,true,true,true,true,true,true,true}));
        lista.add(new Charango("Cedro",  new boolean[]{false,false,false,false,false,false,false,false,false,false}));

        // Guardar
        archivo.guardar(ruta, lista);

        // Cargar
        lista = archivo.cargar(ruta);

        System.out.println("=== Lista cargada ===");
        lista.forEach(System.out::println);

        System.out.println("\n=== Eliminando charangos con más de 6 cuerdas false ===");
        op.eliminarConMasDe6CuerdasFalse(lista);
        lista.forEach(System.out::println);

        System.out.println("\n=== Buscar por material: Madera ===");
        op.listarPorMaterial(lista, "Madera");

        System.out.println("\n=== Charangos con 10 cuerdas ===");
        op.buscarCon10Cuerdas(lista);

        System.out.println("\n=== Ordenados por material ===");
        op.ordenarPorMaterial(lista);
        lista.forEach(System.out::println);

        // Guardar cambios finales
        archivo.guardar(ruta, lista);
    }
}
