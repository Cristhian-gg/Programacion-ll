package Eje7;

public class Parada {
    
    private String[] admins;
    private String[][] autos; 
    private String nombreP;
    private int nroAdmins;
    private int nroAutos;

    public Parada() {
        this.nombreP = "Desconocida";
        this.admins = new String[10];
        this.autos = new String[10][3]; 
        this.nroAdmins = 0;
        this.nroAutos = 0;
    }

    public Parada(String nombreP) {
        this();
        this.nombreP = nombreP;
    }

    public void mostrar() {
        System.out.println("Parada: " + nombreP);

        System.out.println("Administradores:");
        for (int i = 0; i < nroAdmins; i++) {
            System.out.println(" - " + admins[i]);
        }

        System.out.println("Autos registrados:");
        for (int i = 0; i < nroAutos; i++) {
            System.out.println("Modelo: " + autos[i][0] + 
                               ", Conductor: " + autos[i][1] + 
                               ", Placa: " + autos[i][2]);
        }
        System.out.println("-----------------------------------");
    }

    public void adicionar(String admin) {
        if (nroAdmins < 10) {
            admins[nroAdmins++] = admin;
        } else {
            System.out.println("No se pueden adicionar más administradores.");
        }
    }

    public void adicionar(String modelo, String conductor, String placa) {
        if (nroAutos < 10) {
            autos[nroAutos][0] = modelo;
            autos[nroAutos][1] = conductor;
            autos[nroAutos][2] = placa;
            nroAutos++;
        } else {
            System.out.println("No se pueden adicionar más autos.");
        }
    }
}

