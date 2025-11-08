package Eje10;

public class Main {
    public static void main(String[] args) {
        Speaker s1 = new Speaker("Luis", "Perez", 35, 123, "IA");
        Speaker s2 = new Speaker("Ana", "Torres", 40, 456, "Ciberseguridad");

        Participante p1 = new Participante("Carlos", "Mendez", 22, 111, 1);
        Participante p2 = new Participante("Lucia", "Rojas", 25, 222, 2);
        Participante p3 = new Participante("Juan", "Flores", 30, 333, 3);

        Charla c1 = new Charla("Auditorio 1", "IA y Futuro", s1);
        c1.agregarParticipante(p1);
        c1.agregarParticipante(p2);

        Charla c2 = new Charla("Sala 2", "Seguridad Digital", s2);
        c2.agregarParticipante(p3);

        Evento evento = new Evento("Tech Talks 2025");
        evento.agregarCharla(c1);
        evento.agregarCharla(c2);

        System.out.println("a) Edad promedio de participantes: " + evento.edadPromedioEvento());

        System.out.println("b) ¿Lucia Rojas está en el evento?: " + evento.personaEnEvento("Lucia", "Rojas"));

        evento.eliminarCharlasDeSpeaker(123);
        System.out.println("c) Charlas después de eliminar las del speaker CI 123:");
        evento.mostrarCharlas();

        evento.ordenarCharlasPorParticipantes();
        System.out.println("d) Charlas ordenadas por número de participantes:");
        evento.mostrarCharlas();
    }
}

