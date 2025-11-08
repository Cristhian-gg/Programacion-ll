package Eje10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Evento {
    private String nombre;
    private ArrayList<Charla> charlas;

    public Evento(String nombre) {
        this.nombre = nombre;
        this.charlas = new ArrayList<>();
    }

    public void agregarCharla(Charla c) {
        charlas.add(c);
    }

    public double edadPromedioEvento() {
        double suma = 0;
        int contador = 0;
        for (Charla c : charlas) {
            for (Participante p : c.getParticipantes()) {
                suma += p.getEdad();
                contador++;
            }
        }
        return (contador == 0) ? 0 : suma / contador;
    }

    public boolean personaEnEvento(String nombre, String apellido) {
        for (Charla c : charlas) {
            if (c.contienePersona(nombre, apellido))
                return true;
        }
        return false;
    }

    public void eliminarCharlasDeSpeaker(int ci) {
        charlas.removeIf(c -> c.getSpeaker().getCi() == ci);
    }

    public void ordenarCharlasPorParticipantes() {
        Collections.sort(charlas, Comparator.comparingInt(Charla::getNumeroParticipantes));
    }

    public void mostrarCharlas() {
        for (Charla c : charlas) {
            System.out.println(c);
        }
    }
}
