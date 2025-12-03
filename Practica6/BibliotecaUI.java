package Eje2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BibliotecaUI extends JFrame {
    private Biblioteca biblioteca = new Biblioteca();
    private PersistenciaArchivo persistencia = new PersistenciaArchivo();

    private final String FILE_AUTORES = "autores.dat";
    private final String FILE_ESTUDIANTES = "estudiantes.dat";
    private final String FILE_LIBROS = "libros.dat";
    private final String FILE_PRESTAMOS = "prestamos.dat";

    private JTextArea areaEstado;

    public BibliotecaUI() {
        setTitle("📚 Biblioteca UMSA");
        setSize(700, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        UIManager.put("Button.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("TextArea.font", new Font("Segoe UI", Font.PLAIN, 14));

        // Panel de botones arriba
        JPanel panelBotones = new JPanel(new GridLayout(2, 3, 15, 15));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        panelBotones.add(new JButton(new AbstractAction("➕ Agregar Autor") {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Nombre del autor:");
                if (nombre != null && !nombre.isEmpty()) {
                    biblioteca.agregarAutor(nombre.trim());
                    actualizarEstado();
                }
            }
        }));

        panelBotones.add(new JButton(new AbstractAction("👨‍🎓 Agregar Estudiante") {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Nombre del estudiante:");
                if (nombre == null || nombre.isEmpty()) return;

                String ci = JOptionPane.showInputDialog("CI del estudiante:");
                if (ci == null || ci.isEmpty()) return;

                biblioteca.agregarEstudiante(nombre.trim(), ci.trim());
                actualizarEstado();
            }
        }));

        panelBotones.add(new JButton(new AbstractAction("📖 Agregar Libro") {
            public void actionPerformed(ActionEvent e) {
                if (biblioteca.getAutores().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay autores registrados.");
                    return;
                }

                Autor autor = (Autor) JOptionPane.showInputDialog(
                        null,
                        "Seleccione el autor:",
                        "Autor del Libro",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        biblioteca.getAutores().toArray(),
                        null
                );
                if (autor == null) return;

                String titulo = JOptionPane.showInputDialog("Título del libro:");
                if (titulo != null && !titulo.isEmpty()) {
                    biblioteca.agregarLibro(titulo.trim(), autor);
                    actualizarEstado();
                }
            }
        }));

        panelBotones.add(new JButton(new AbstractAction("📕 Registrar Préstamo") {
            public void actionPerformed(ActionEvent e) {
                if (biblioteca.getLibros().isEmpty() || biblioteca.getEstudiantes().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe tener libros y estudiantes registrados.");
                    return;
                }

                Libro libro = (Libro) JOptionPane.showInputDialog(
                        null,
                        "Seleccione el libro:",
                        "Libro",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        biblioteca.getLibros().toArray(),
                        null
                );

                Estudiante estudiante = (Estudiante) JOptionPane.showInputDialog(
                        null,
                        "Seleccione el estudiante:",
                        "Estudiante",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        biblioteca.getEstudiantes().toArray(),
                        null
                );

                if (libro != null && estudiante != null) {
                    biblioteca.agregarPrestamo(libro, estudiante);
                    actualizarEstado();
                }
            }
        }));

        panelBotones.add(new JButton(new AbstractAction("💾 Guardar Datos") {
            public void actionPerformed(ActionEvent e) {
                try {
                    persistencia.guardar(FILE_AUTORES, biblioteca.getAutores());
                    persistencia.guardar(FILE_ESTUDIANTES, biblioteca.getEstudiantes());
                    persistencia.guardar(FILE_LIBROS, biblioteca.getLibros());
                    persistencia.guardar(FILE_PRESTAMOS, biblioteca.getPrestamos());
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage());
                }
            }
        }));

        add(panelBotones, BorderLayout.NORTH);

        areaEstado = new JTextArea();
        areaEstado.setEditable(false);
        areaEstado.setMargin(new Insets(10, 10, 10, 10));
        areaEstado.setBackground(new Color(245, 245, 245));

        JScrollPane scroll = new JScrollPane(areaEstado);
        scroll.setBorder(BorderFactory.createTitledBorder("📘 Estado de la Biblioteca"));
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }

    private void actualizarEstado() {
        areaEstado.setText(biblioteca.obtenerEstadoTexto());
    }
}
