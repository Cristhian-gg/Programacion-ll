package Eje5;

public class Main {
    public static void main(String[] args) {

        ArchFarmacia arch = new ArchFarmacia();

        // ============================
        // CREANDO FARMACIAS EJEMPLO
        // ============================

        Farmacia f1 = new Farmacia("MiFarma", 1, "Av. Siempre Viva 123");
        Farmacia f2 = new Farmacia("SaludTotal", 2, "Calle Los Pinos 456");
        Farmacia f3 = new Farmacia("Farmacorp", 3, "Av. Las Flores 789");

        // Medicamentos para F1
        f1.insertar(new Medicamento("Tapsin",       101, "resfrio", 15));
        f1.insertar(new Medicamento("BroncoStop",   102, "tos",     12));
        f1.insertar(new Medicamento("Ibuprofeno",   103, "dolor",    8));

        // Medicamentos para F2
        f2.insertar(new Medicamento("Tapsin",       201, "resfrio", 15));
        f2.insertar(new Medicamento("Jarabe Tos",   202, "tos",     10));

        // Medicamentos para F3
        f3.insertar(new Medicamento("Dolocatil",    301, "dolor",    9));
        f3.insertar(new Medicamento("FluStop",      302, "resfrio", 11));

        // Añadir farmacias al archivo (administrador)
        arch.adicionar(f1);
        arch.adicionar(f2);
        arch.adicionar(f3);

        // ============================
        //       INCISOS A — E
        // ============================

        System.out.println("====================================");
        System.out.println("a) Medicamentos para la TOS de la sucursal 1");
        System.out.println("====================================");
        arch.mostrarMedicamentosTos(1);

        System.out.println("\n====================================");
        System.out.println("b) Sucursal + Dirección que tienen 'Tapsin'");
        System.out.println("====================================");
        arch.buscarFarmaciasConTapsin();

        System.out.println("\n====================================");
        System.out.println("c) Buscar medicamentos por tipo: 'resfrio'");
        System.out.println("====================================");
        arch.mostrarMedicamentosPorTipo("resfrio");

        System.out.println("\n====================================");
        System.out.println("d) Ordenar farmacias según dirección (A-Z)");
        System.out.println("====================================");
        arch.ordenarPorDireccion();

        // Mostrar farmacias ordenadas
        System.out.println("Farmacias ordenadas por dirección:");
        for (int i = 0; i < arch.getCantidad(); i++) {
            Farmacia f = arch.getFarmacia(i);
            System.out.println("Sucursal " + f.getSucursal() +
                    " | Dirección: " + f.getDireccion());
        }

        System.out.println("\n====================================");
        System.out.println("e) Mover medicamentos de tipo 'dolor' de sucursal 1 a sucursal 3");
        System.out.println("====================================");
        arch.moverTipo("dolor", 1, 3);

        System.out.println("\nMedicamentos actuales en Sucursal 3 luego del movimiento:");
        for (int i = 0; i < f3.getCantidad(); i++) {
            f3.getArrayMedicamentos()[i].mostrar();
        }
    }
}

