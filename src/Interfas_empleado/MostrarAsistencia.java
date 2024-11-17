package Interfas_empleado;

import java.awt.BorderLayout;

import javax.swing.*;

public class MostrarAsistencia extends JFrame {
    public MostrarAsistencia() {
        setTitle("Mostrar Asistencia");
        setSize(300, 200);

        // Creamos un panel para organizar los componentes
        JPanel panelAsistencia = new JPanel();
        panelAsistencia.setLayout(new BorderLayout());

        // Agregamos un botón de ejemplo (puedes reemplazarlo por una tabla, etc.)
        JButton btnMarcarAsistencia = new JButton("Marcar Asistencia");
        panelAsistencia.add(btnMarcarAsistencia, BorderLayout.CENTER);

        add(panelAsistencia);
    }
}