package Eje4;

public class Ropero {
    private String material;
    private Ropa[] ropas;
    private int nroRopas;

    public Ropero(String material) {
        this.material = material;
        this.ropas = new Ropa[20]; 
        this.nroRopas = 0;
    }

    public void adicionarRopa(Ropa r) {
        if (nroRopas < 20) {
            ropas[nroRopas] = r;
            nroRopas++;
        } else {
            System.out.println("El ropero está lleno.");
        }
    }

    public void eliminarPorMaterial(String material) {
        for (int i = 0; i < nroRopas; i++) {
            if (ropas[i].getMaterial().equalsIgnoreCase(material)) {
                eliminarEnPosicion(i);
                i--; 
            }
        }
    }

    public void eliminarPorTipo(String tipo) {
        for (int i = 0; i < nroRopas; i++) {
            if (ropas[i].getTipo().equalsIgnoreCase(tipo)) {
                eliminarEnPosicion(i);
                i--;
            }
        }
    }

    private void eliminarEnPosicion(int index) {
        for (int j = index; j < nroRopas - 1; j++) {
            ropas[j] = ropas[j + 1];
        }
        nroRopas--;
        ropas[nroRopas] = null;
    }

    public void mostrarPorMaterial(String material) {
        System.out.println("Prendas de material: " + material);
        for (int i = 0; i < nroRopas; i++) {
            if (ropas[i].getMaterial().equalsIgnoreCase(material)) {
                ropas[i].mostrarInfo();
            }
        }
        System.out.println("---------------------------------");
    }

    public void mostrarPorTipo(String tipo) {
        System.out.println("Prendas de tipo: " + tipo);
        for (int i = 0; i < nroRopas; i++) {
            if (ropas[i].getTipo().equalsIgnoreCase(tipo)) {
                ropas[i].mostrarInfo();
            }
        }
        System.out.println("---------------------------------");
    }

    public void mostrarTodas() {
        System.out.println("Ropero de material: " + material);
        if (nroRopas == 0) {
            System.out.println("  (No hay prendas)");
        }
        for (int i = 0; i < nroRopas; i++) {
            ropas[i].mostrarInfo();
        }
        System.out.println("---------------------------------");
    }
}

