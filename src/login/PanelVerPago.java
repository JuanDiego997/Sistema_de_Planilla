package login;

import javax.swing.*;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

class Pago {
    String mes;
    double sueldoBase;
    double bonificaciones;
    double impuestos;
    double total;
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public double getBonificaciones() {
		return bonificaciones;
	}
	public void setBonificaciones(double bonificaciones) {
		this.bonificaciones = bonificaciones;
	}
	public double getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

    // Constructor y getters/setters
}

public class PanelVerPago extends JPanel {
    private JTable tablaPago;

    public PanelVerPago(String nombreEmpleado) {
        // Establece un layout para el panel (BorderLayout es una buena opción)
        setLayout(new BorderLayout());

        // Crear un modelo de tabla para los detalles del pago
        String[] columnNames = {"Mes", "Sueldo Base", "Bonificaciones", "Impuestos", "Total"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Aquí iría el código para obtener los datos de la base de datos y llenar el modelo
        // Por ahora, vamos a agregar algunos datos de ejemplo
        List<Pago> pagos = obtenerDatosDesdeBaseDeDatos(nombreEmpleado); // Método que simularía la obtención de datos

        // Agregar los datos de los pagos al modelo de la tabla
        for (Pago pago : pagos) {
            Object[] rowData = {pago.getMes(), pago.getSueldoBase(), pago.getBonificaciones(), pago.getImpuestos(), pago.getTotal()};
            model.addRow(rowData);
        }

        // Crear una tabla y un scroll pane
        tablaPago = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tablaPago);

        // Agregar un título con el nombre del empleado
        JLabel lblTitulo = new JLabel("Detalle de Pagos para: " + nombreEmpleado);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        add(lblTitulo, BorderLayout.NORTH);

        // Agregar el scroll pane al panel
        add(scrollPane, BorderLayout.CENTER);

        // Agregar un listener para los clics en la tabla
        tablaPago.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                int row = tablaPago.rowAtPoint(evt.getPoint());
                if (row >= 0) {
                    Pago pago = pagos.get(row);
                    String mensaje = "Detalle del pago para " + pago.getMes() + ":\n" +
                            "Sueldo Base: " + pago.getSueldoBase() + "\n" +
                            "Bonificaciones: " + pago.getBonificaciones() + "\n" +
                            "Impuestos: -" + pago.getImpuestos() + "\n" +
                            "Total: " + pago.getTotal();
                    JOptionPane.showMessageDialog(null, mensaje, "Detalle del Pago", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    // Método de ejemplo para simular la obtención de datos de la base de datos
    private List<Pago> obtenerDatosDesdeBaseDeDatos(String nombreEmpleado) {
        // Aquí iría el código para conectarse a la base de datos, ejecutar una consulta y llenar la lista de pagos
        List<Pago> pagos = new ArrayList<>();
        // ... (código para conectar a la base de datos y obtener los pagos)
        return pagos;
    }

    // ... (resto del código)
}