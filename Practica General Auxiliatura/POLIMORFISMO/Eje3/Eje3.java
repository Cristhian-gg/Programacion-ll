class Cocinero {
    String nombre;
    int sueldoMes;
    int horasExtra;
    float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }

    public void mostrarSueldo(int sueldo) {
        if (this.sueldoMes == sueldo) {
            System.out.println("Cocinero " + nombre + " tiene un sueldo mensual de " + sueldoMes);
        }
    }
}

class Mesero {
    String nombre;
    int sueldoMes;
    int horasExtra;
    float sueldoHora;
    float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    public void mostrarSueldo(int sueldo) {
        if (this.sueldoMes == sueldo) {
            System.out.println("Mesero " + nombre + " tiene un sueldo mensual de " + sueldoMes);
        }
    }
}

class Administrativo {
    String nombre;
    float sueldoMes;
    String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float sueldoTotal() {
        return sueldoMes;
    }

    public void mostrarSueldo(int sueldo) {
        if (this.sueldoMes == sueldo) {
            System.out.println("Administrativo " + nombre + ", cargo: " + cargo + ", tiene un sueldo mensual de " + sueldoMes);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero("Carlos", 2000, 20, 15);
        Mesero mesero1 = new Mesero("Juan", 1500, 30, 12, 200);
        Mesero mesero2 = new Mesero("Ana", 1500, 25, 12, 180);
        Administrativo administrativo1 = new Administrativo("Luis", 2500, "Gerente");
        Administrativo administrativo2 = new Administrativo("Maria", 2200, "Contadora");

        System.out.println("Sueldo total Cocinero " + cocinero.nombre + ": " + cocinero.sueldoTotal());
        System.out.println("Sueldo total Mesero " + mesero1.nombre + ": " + mesero1.sueldoTotal());
        System.out.println("Sueldo total Mesero " + mesero2.nombre + ": " + mesero2.sueldoTotal());
        System.out.println("Sueldo total Administrativo " + administrativo1.nombre + ": " + administrativo1.sueldoTotal());
        System.out.println("Sueldo total Administrativo " + administrativo2.nombre + ": " + administrativo2.sueldoTotal());

        int sueldo_buscar = 1500;
        System.out.println("\nEmpleados con sueldo igual a " + sueldo_buscar);
        cocinero.mostrarSueldo(sueldo_buscar);
        mesero1.mostrarSueldo(sueldo_buscar);
        mesero2.mostrarSueldo(sueldo_buscar);
        administrativo1.mostrarSueldo(sueldo_buscar);
        administrativo2.mostrarSueldo(sueldo_buscar);
    }
}
