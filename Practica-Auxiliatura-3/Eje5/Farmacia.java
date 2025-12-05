package Eje5;

public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private Medicamento[] medicamentos = new Medicamento[100];
    private int nMedicamentos = 0;

    public Farmacia() {}

    public Farmacia(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
    }

    public void insertar(Medicamento m) {
        if (nMedicamentos < medicamentos.length) {
            medicamentos[nMedicamentos] = m;
            nMedicamentos++;
        }
    }

    public void leer() {
        System.out.println("Farmacia: " + nombreFarmacia);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Dirección: " + direccion);
        for (int i = 0; i < nMedicamentos; i++) {
            medicamentos[i].mostrar();
        }
    }

    public String getDireccion() { return direccion; }
    public int getSucursal() { return sucursal; }

    public void mostrarMedicamentos() {
        for (int i = 0; i < nMedicamentos; i++)
            medicamentos[i].mostrar();
    }

    public Medicamento buscaMedicamento(String nombre) {
        for (int i = 0; i < nMedicamentos; i++) {
            if (medicamentos[i].getNombre().equalsIgnoreCase(nombre))
                return medicamentos[i];
        }
        return null;
    }

    public Medicamento[] getArrayMedicamentos() {
        return medicamentos;
    }

    public int getCantidad() {
        return nMedicamentos;
    }
}

