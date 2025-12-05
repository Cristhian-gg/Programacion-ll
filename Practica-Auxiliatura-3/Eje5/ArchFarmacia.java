package Eje5;

public class ArchFarmacia {
	
    private Farmacia[] farmacias = new Farmacia[100];
    private int n = 0;

    public void adicionar(Farmacia f) {
        if (n < farmacias.length) {
            farmacias[n] = f;
            n++;
        }
    }

    // a) Mostrar medicamentos para la tos de la sucursal X
    public void mostrarMedicamentosTos(int sucursalBuscada) {
        for (int i = 0; i < n; i++) {
            if (farmacias[i].getSucursal() == sucursalBuscada) {
                System.out.println("Medicamentos para la tos en Sucursal " + sucursalBuscada);
                Medicamento[] meds = farmacias[i].getArrayMedicamentos();
                for (int j = 0; j < farmacias[i].getCantidad(); j++) {
                    if (meds[j].getTipo().equalsIgnoreCase("tos")) {
                        meds[j].mostrar();
                    }
                }
            }
        }
    }

    // b) Mostrar número de sucursal y dirección donde existe "Tapsin"
    public void buscarFarmaciasConTapsin() {
        for (int i = 0; i < n; i++) {
            Medicamento m = farmacias[i].buscaMedicamento("Tapsin");
            if (m != null) {
                System.out.println("Sucursal: " + farmacias[i].getSucursal() +
                        " | Dirección: " + farmacias[i].getDireccion());
            }
        }
    }

    // c) Buscar medicamentos por tipo
    public void mostrarMedicamentosPorTipo(String tipo) {
        for (int i = 0; i < n; i++) {
            Medicamento[] meds = farmacias[i].getArrayMedicamentos();
            for (int j = 0; j < farmacias[i].getCantidad(); j++) {
                if (meds[j].getTipo().equalsIgnoreCase(tipo)) {
                    meds[j].mostrar();
                }
            }
        }
    }

    // d) Ordenar farmacias por dirección
    public void ordenarPorDireccion() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (farmacias[i].getDireccion()
                        .compareToIgnoreCase(farmacias[j].getDireccion()) > 0) {

                    Farmacia aux = farmacias[i];
                    farmacias[i] = farmacias[j];
                    farmacias[j] = aux;
                }
            }
        }
    }

    // e) Mover medicamentos de tipo X de farmacia A a farmacia Z
    public void moverTipo(String tipo, int sucursalA, int sucursalZ) {
        Farmacia fa = null, fz = null;

        for (int i = 0; i < n; i++) {
            if (farmacias[i].getSucursal() == sucursalA) fa = farmacias[i];
            if (farmacias[i].getSucursal() == sucursalZ) fz = farmacias[i];
        }

        if (fa == null || fz == null) {
            System.out.println("Sucursal no encontrada");
            return;
        }

        Medicamento[] meds = fa.getArrayMedicamentos();
        for (int i = 0; i < fa.getCantidad(); i++) {
            if (meds[i].getTipo().equalsIgnoreCase(tipo)) {
                fz.insertar(meds[i]); // mover
            }
        }
    }

	public int getCantidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Farmacia getFarmacia(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
