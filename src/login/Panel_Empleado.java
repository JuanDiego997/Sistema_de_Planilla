package login;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Panel_Empleado extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblNombre;
    private Map<String, Boolean> asistencia = new HashMap<>();

    // Constructor que recibe el nombre del empleado desde el login
    public Panel_Empleado(String nombreEmpleado) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 661, 321);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        // Mostrar el nombre del empleado en un label
        JLabel lblBienvenido = new JLabel("Bienvenido, " + nombreEmpleado);
        lblBienvenido.setFont(new Font("Arial", Font.BOLD, 20));
        lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblBienvenido, BorderLayout.NORTH);

        // Panel central para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 20, 20)); // Distribución en una fila, 2 columnas, con espacios
        buttonPanel.setBackground(Color.LIGHT_GRAY); // Fondo gris claro
        buttonPanel.setBorder(BorderFactory.createEtchedBorder()); // Borde grabado

        JButton btnMarcarAsistencia = new JButton("Marcar Asistencia");
        btnMarcarAsistencia.setFont(new Font("Arial", Font.PLAIN, 16));
        btnMarcarAsistencia.setBackground(Color.WHITE); // Fondo blanco para los botones
        JButton btnVerPago = new JButton("Ver Pago");
        btnVerPago.setFont(new Font("Arial", Font.PLAIN, 16));
        btnVerPago.setBackground(Color.WHITE);

        buttonPanel.add(btnMarcarAsistencia);
        buttonPanel.add(btnVerPago);
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        // Acciones de los botones
        btnMarcarAsistencia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para marcar asistencia (por ejemplo, guardar en una base de datos)
                System.out.println("Asistencia marcada para " + nombreEmpleado);
            }
        });

        btnVerPago.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para calcular y mostrar el pago
                double sueldo = calcularSueldo(nombreEmpleado); // Simulación de cálculo de sueldo
                JOptionPane.showMessageDialog(null, "Sueldo para " + nombreEmpleado + ": $" + sueldo);
            }
        });
    }

    // Simulación de cálculo de sueldo (reemplazar con tu lógica real)
    private double calcularSueldo(String nombreEmpleado) {
        // Aquí implementarías la lógica para calcular el sueldo en función de la información del empleado
        // (tipo de contrato, horas trabajadas, etc.)
        return 1500.0;
    }
    

    // Método principal (para pruebas, se reemplazará por la llamada desde el login)
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Panel_Empleado("Juan Pérez").setVisible(true)); // Ejemplo con un nombre de empleado
    }
}
