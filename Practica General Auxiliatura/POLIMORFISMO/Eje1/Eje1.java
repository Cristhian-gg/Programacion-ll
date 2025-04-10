class Videojuego {
    String nombre;
    String plataforma;
    int cantidadjugadores;

    public Videojuego(String nombre, String plataforma, int cantidadjugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadjugadores = cantidadjugadores;
    }

    public void mostrar() {
        System.out.println("Nombre del videojuego: " + this.nombre);
        System.out.println("Plataforma: " + this.plataforma);
        System.out.println("Cantidad de jugadores: " + this.cantidadjugadores);
    }

    public void agregarJugadores(int cantidad) {
        this.cantidadjugadores += cantidad;
        System.out.println("Ahora el videojuego " + this.nombre + " tiene " + this.cantidadjugadores + " jugadores.");
    }

    public static void main(String[] args) {
        Videojuego videojuego1 = new Videojuego("FIFA 23", "PlayStation 5", 2);
        Videojuego videojuego2 = new Videojuego("Minecraft", "PC", 1);

        videojuego1.mostrar();
        videojuego2.mostrar();

        videojuego1.agregarJugadores(1);
        videojuego2.agregarJugadores(3);

        videojuego1.mostrar();
        videojuego2.mostrar();
    }
}
