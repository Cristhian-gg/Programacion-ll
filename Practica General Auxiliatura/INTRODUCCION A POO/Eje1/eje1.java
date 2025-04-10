class Persona {
    String nombre;
    int edad;
    String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String saludo() {
        return "Hola, soy " + this.nombre + " de " + this.ciudad;
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Juan", 15, "La Paz"),
            new Persona("Ana", 17, "El Alto"),
            new Persona("Luis", 25, "Cochabamba")
        };

        for (Persona p : personas) {
            System.out.println(p.saludo());
        }
    }
}
