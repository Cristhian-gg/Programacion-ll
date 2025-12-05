package Eje1;

import java.io.Serializable;
import java.util.Arrays;

public class Charango implements Serializable {
    private String material;
    private int nroCuerdas;
    private boolean[] cuerdas = new boolean[10];

    public Charango(String material, boolean[] cuerdas) {
        this.material = material;
        this.cuerdas = cuerdas;
        this.nroCuerdas = cuerdas.length;
    }

    public String getMaterial() {
        return material;
    }

    public int getNroCuerdas() {
        return nroCuerdas;
    }

    public boolean[] getCuerdas() {
        return cuerdas;
    }

    public int cantCuerdasFalse() {
        int cont = 0;
        for (boolean c : cuerdas) {
            if (!c) cont++;
        }
        return cont;
    }

    @Override
    public String toString() {
        return "Charango{" +
                "material='" + material + '\'' +
                ", nroCuerdas=" + nroCuerdas +
                ", cuerdas=" + Arrays.toString(cuerdas) +
                '}';
    }
}
