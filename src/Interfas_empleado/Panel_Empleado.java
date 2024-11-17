package Interfas_empleado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel_Empleado extends JFrame {
    public Panel_Empleado() {
        setTitle("Panel de Empleado");
        setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JButton btnMostrarAsistencia = new JButton("Mostrar Asistencia");
        JButton btnMostrarSueldo = new JButton("Mostrar Sueldo");

        // Asociamos los botones a sus respectivos ActionListener
        btnMostrarAsistencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MostrarAsistencia().setVisible(true);
            }
        });

        btnMostrarSueldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MostrarSueldo().setVisible(true);
            }
        });

        panel.add(btnMostrarAsistencia);
        panel.add(btnMostrarSueldo);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Aquí se inicia la aplicación, buscando la clase principal
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Panel_Empleado().setVisible(true);
            }
        });
    }
}
