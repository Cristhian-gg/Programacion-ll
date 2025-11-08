package Eje10;

import java.util.ArrayList;

public class Charla {
    private String lugar;
    private String nombreCharla;
    private Speaker speaker;
    private ArrayList<Participante> participantes;

    public Charla(String lugar, String nombreCharla, Speaker speaker) {
        this.lugar = lugar;
        this.nombreCharla = nombreCharla;
        this.speaker = speaker;
        this.participantes = new ArrayList<>();
    }

    public String getNombreCharla() { return nombreCharla; }
    public Speaker getSpeaker() { return speaker; }
    public ArrayList<Participante> getParticipantes() { return participantes; }

    public void agregarParticipante(Participante p) {
        participantes.add(p);
    }

    public int getNumeroParticipantes() {
        return participantes.size();
    }

    public double edadPromedioParticipantes() {
        if (participantes.isEmpty()) return 0;
        double suma = 0;
        for (Participante p : participantes)
            suma += p.getEdad();
        return suma / participantes.size();
    }

    public boolean contienePersona(String nombre, String apellido) {
        if (speaker.getNombre().equalsIgnoreCase(nombre) && speaker.getApellido().equalsIgnoreCase(apellido))
            return true;
        for (Participante p : participantes) {
            if (p.getNombre().equalsIgnoreCase(nombre) && p.getApellido().equalsIgnoreCase(apellido))
                return true;
        }
        return false;
    }

    public String toString() {
        return "Charla: " + nombreCharla + " | Lugar: " + lugar + 
               " | Speaker: " + speaker.getNombre() + " | Participantes: " + participantes.size();
    }
}

