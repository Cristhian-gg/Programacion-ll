package Eje7;

import java.io.*;
import java.util.*;

public class ArchNiño {
    private String nomArch;

    public ArchNiño(String nomArch) {
        this.nomArch = nomArch;
    }

    public void guardar(List<Niño> lista) {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(nomArch))) {
            o.writeObject(lista);
        } catch (Exception e) {
            System.out.println("Error al guardar archivo.");
        }
    }

    public List<Niño> leer() {
        List<Niño> lista = new ArrayList<>();
        try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(nomArch))) {
            lista = (List<Niño>) o.readObject();
        } catch (Exception e) {
            System.out.println("Archivo vacío o inexistente.");
        }
        return lista;
    }
}
