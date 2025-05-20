import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected LocalDate fechaNac;

    public Persona() {
        this("0000", "SinNombre", "SinApellido", "00000000", LocalDate.of(2000, 1, 1));
    }

    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    public int calcularEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public void mostrar() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha de Nacimiento: " + fechaNac);
    }
}

class Estudiante extends Persona {
    private String ru;
    private LocalDate fechaIngreso;
    private int semestre;

    public Estudiante() {
        this("0000", "SinNombre", "SinApellido", "00000000", LocalDate.of(2000,1,1),
             "RU0000", LocalDate.of(2023, 1, 1), 1);
    }

    public Estudiante(String ci, String nombre, String apellido, String celular, LocalDate fechaNac,
                      String ru, LocalDate fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
    }
}

class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo; 

    public Docente() {
        this("0000", "SinNombre", "SinApellido", "00000000", LocalDate.of(2000,1,1),
             "NIT0000", "Ninguna", "General", "M");
    }

    public Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNac,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Sexo: " + sexo);
    }
}

public class Main {
    public static void main(String[] args) {
        // INCISO B
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("123", "Luis", "Perez", "78945612", LocalDate.of(1998, 5, 21),
                                      "RU001", LocalDate.of(2021,1,1), 6));
        estudiantes.add(new Estudiante("124", "Maria", "Lopez", "78945613", LocalDate.of(2002, 8, 15),
                                      "RU002", LocalDate.of(2022,2,1), 4));

        ArrayList<Docente> docentes = new ArrayList<>();
        docentes.add(new Docente("200", "Juan", "Garcia", "75683912", LocalDate.of(1980, 4, 11),
                                 "NIT01", "Ingeniero", "Software", "M"));
        docentes.add(new Docente("201", "Lucia", "Lopez", "75683913", LocalDate.of(1985, 6, 23),
                                 "NIT02", "Arquitecta", "Diseño", "F"));

        // INCISO C
        System.out.println("Estudiantes mayores de 25 años:");
        for (Estudiante e : estudiantes) {
            if (e.calcularEdad() > 25) {
                e.mostrar();
                System.out.println("Edad: " + e.calcularEdad());
                System.out.println("------------");
            }
        }

        // INCISO D
        Docente mayorIngeniero = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("M")) {
                if (mayorIngeniero == null || d.calcularEdad() > mayorIngeniero.calcularEdad()) {
                    mayorIngeniero = d;
                }
            }
        }

        System.out.println("Docente varón con profesión 'Ingeniero' y mayor edad:");
        if (mayorIngeniero != null) {
            mayorIngeniero.mostrar();
            System.out.println("Edad: " + mayorIngeniero.calcularEdad());
        }
        System.out.println("------------");

        // INCISO E
        System.out.println("Estudiantes y docentes con el mismo apellido:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.apellido.equalsIgnoreCase(d.apellido)) {
                    System.out.println("Apellido coincidente: " + e.apellido);
                    System.out.println("Estudiante:");
                    e.mostrar();
                    System.out.println("Docente:");
                    d.mostrar();
                    System.out.println("------------");
                }
            }
        }
    }
}
