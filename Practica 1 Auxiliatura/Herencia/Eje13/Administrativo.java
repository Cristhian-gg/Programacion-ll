package Eje13;

public class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, float sueldomes, String cargo) {
        super(nombre, sueldomes);
        this.cargo = cargo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cargo: " + cargo);
    }

}
