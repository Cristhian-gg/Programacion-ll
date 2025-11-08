package Eje6;

public class Main {
    public static void main(String[] args) {
        Medicamento m1 = new Medicamento(1, "Paracetamol", "500mg", "12/2025");
        Medicamento m2 = new Medicamento(2, "Amoxicilina", "250mg", "06/2026");

        Registro r1 = new Registro("2025-11-08", 100, m1);
        Registro r2 = new Registro("2025-11-09", 50, m2);

        Farmacia f1 = new Farmacia("Farmacia Central", "Av. Sucre #123");
        f1.agregarRegistro(r1);
        f1.agregarRegistro(r2);

        f1.mostrarRegistros();
    }
}

