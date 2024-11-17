package login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PanelMarcarAsistencia extends JPanel {

    private JTextField txtFecha;
    private JTextField txtHoraEntrada;
    private JTextField txtHoraSalida;
    private JButton btnConfirmar;

    public PanelMarcarAsistencia() {
        setLayout(new GridLayout(4, 2, 10, 10)); // 4 filas, 2 columnas, espaciado de 10 píxeles

        // Etiqueta y campo de texto para la fecha (prellenado con la fecha actual)
        JLabel lblFecha = new JLabel("Fecha:");
        txtFecha = new JTextField(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        txtFecha.setEditable(false); // Deshabilitar la edición para que sea solo lectura

        // Etiqueta y campo de texto para la hora de entrada
        JLabel lblHoraEntrada = new JLabel("Hora de Entrada:");
        txtHoraEntrada = new JTextField();

        // Etiqueta y campo de texto para la hora de salida
        JLabel lblHoraSalida = new JLabel("Hora de Salida:");
        txtHoraSalida = new JTextField();

        // Botón para confirmar la asistencia
        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para guardar la asistencia en la base de datos
                String fecha = txtFecha.getText();
                String horaEntrada = txtHoraEntrada.getText();
                String horaSalida = txtHoraSalida.getText();

                // Aquí reemplazarías esta parte con el código para guardar los datos en la base de datos
                System.out.println("Fecha: " + fecha);
                System.out.println("Hora de Entrada: " + horaEntrada);
                System.out.println("Hora de Salida: " + horaSalida);

                // Mostrar un mensaje de confirmación
                JOptionPane.showMessageDialog(null, "Asistencia marcada correctamente.");
            }
        });

        // Agregar componentes al panel
        add(lblFecha);
        add(txtFecha);
        add(lblHoraEntrada);
        add(txtHoraEntrada);
        add(lblHoraSalida);
        add(txtHoraSalida);
        add(btnConfirmar);
    }
}