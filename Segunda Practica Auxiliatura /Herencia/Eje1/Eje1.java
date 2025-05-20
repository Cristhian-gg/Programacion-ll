// INCISO A

class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precioBase;

    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio base: $" + precioBase);
    }
}

class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int anio, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, anio, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }
}

class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;

    public Moto(String marca, String modelo, int anio, double precioBase, int cilindrada, String tipoMotor) {
        super(marca, modelo, anio, precioBase);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Tipo de motor: " + tipoMotor);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Coche("Toyota", "Corolla", 2025, 22000, 4, "Gasolina"),
            new Coche("Chevrolet", "Spin", 2023, 25000, 5, "Gasolina"),
            new Coche("BMW", "Serie 3", 2025, 35000, 2, "Diésel"),
            new Moto("Yamaha", "R3", 2025, 12000, 321, "4 tiempos"),
            new Moto("Honda", "CBR500R", 2024, 15000, 471, "4 tiempos")
        };

        // INCISO B
        System.out.println("Información de todos los vehículos:\n");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            System.out.println("------------");
        }

        // INCISO C
        System.out.println("Coches con más de 4 puertas:\n");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche && ((Coche) v).getNumPuertas() > 4) {
                v.mostrarInfo();
                System.out.println("------------");
            }
        }

        // INCISO D
        System.out.println("Vehículos del año 2025:\n");
        for (Vehiculo v : vehiculos) {
            if (v.getAnio() == 2025) {
                v.mostrarInfo();
                System.out.println("------------");
            }
        }
    }
}
