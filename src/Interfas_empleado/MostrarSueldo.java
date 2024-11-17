package Interfas_empleado;
import java.awt.BorderLayout;

import javax.swing.*;

public class MostrarSueldo extends JFrame {
    public MostrarSueldo() {
        setTitle("Mostrar Sueldo");
        setSize(300, 200);

        // Creamos un panel para organizar los componentes
        JPanel panelSueldo = new JPanel();
        panelSueldo.setLayout(new BorderLayout());

        // Agregamos un label de ejemplo (puedes reemplazarlo por una tabla, etc.)
        JLabel lblSueldo = new JLabel("Tu sueldo es: $1000");
        panelSueldo.add(lblSueldo, BorderLayout.CENTER);

        add(panelSueldo);
    }
}