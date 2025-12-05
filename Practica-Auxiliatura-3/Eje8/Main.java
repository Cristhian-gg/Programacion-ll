package Eje8;

public class Main {
    public static void main(String[] args) {

        ArchRefri refri = new ArchRefri("Refrigerador Central");

        // INCISO A - CREAR
        refri.crearAlimento(new Alimento("Leche", "2025-01-20", 5));
        refri.crearAlimento(new Alimento("Carne", "2024-11-10", 3));
        refri.crearAlimento(new Alimento("Huevo", "2024-10-01", 0));
        refri.crearAlimento(new Alimento("Queso", "2025-03-15", 10));

        System.out.println("\nTODOS LOS ALIMENTOS:");
        refri.mostrarTodo();

        // INCISO A - MODIFICAR
        refri.modificarPorNombre("Leche", "2025-02-01", 8);

        // INCISO B
        System.out.println("\nANTES DE 2025-01-01:");
        refri.mostrarAntesDeFecha("2025-01-01");

        // INCISO C
        refri.eliminarConCantidadCero();

        // INCISO D
        System.out.println("\nVENCIDOS EN 2024-12-01:");
        refri.mostrarVencidos("2024-12-01");

        // INCISO E
        refri.mostrarMayorCantidad();
    }
}
