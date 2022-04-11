package Listados;

import javax.swing.JFrame;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Datos.Cliente;
import Datos.Empleado;
import Datos.GestorData;
import Datos.Vehiculo;
import Forms.AnadirEmpleado;
import dialogs.MenuAdmin;

import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author ik_1dw3
 *
 */
public class ListadoEmpleados extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tableEmpleado;
	private DefaultTableModel dtmEmpleado;
	private GestorData gestorData;
	public JLabel lblEmpleado;
	private JButton btnVolver;
	private JButton btnNuevoEmpleado;
	private JButton btnBorrarEmpleado;

	/**
	 * Constructor que crea la clase
	 * 
	 * @param gestorData Clase donde están la mayoría de metodos y donde se guardan
	 *                   los datos
	 * 
	 */

	public ListadoEmpleados(GestorData gestorData) {
		setBackground(SystemColor.window);
		getContentPane().setBackground(SystemColor.window);
		this.gestorData = gestorData;
		setBounds(100, 100, 843, 739);
		setLocationRelativeTo(null);
		setSize(856, 559);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		String[] ColumnNames = new String[] { "Nombre", "Apellido", "DNI", "FechaNacimiento", "Tipo", "Codigo Empleado" };
		String[][] Data = null;

		dtmEmpleado = obtenerModelSoloLectura(Data, ColumnNames);
		tableEmpleado = new JTable(dtmEmpleado);

		tableEmpleado.setModel(dtmEmpleado);

		JScrollPane scrollPane = new JScrollPane(tableEmpleado);
		scrollPane.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(30, 144, 255),
				new Color(30, 144, 255), new Color(30, 144, 255), new Color(30, 144, 255)));
		panel.add(scrollPane, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		panel.add(panel_1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 415, 452, 0 };
		gbl_panel_1.rowHeights = new int[] { 37, 13, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblHola = new JLabel("Hola, ");
		GridBagConstraints gbc_lblHola = new GridBagConstraints();
		gbc_lblHola.anchor = GridBagConstraints.EAST;
		gbc_lblHola.insets = new Insets(0, 0, 5, 5);
		gbc_lblHola.gridx = 0;
		gbc_lblHola.gridy = 0;
		panel_1.add(lblHola, gbc_lblHola);

		lblEmpleado = new JLabel("");
		GridBagConstraints gbc_lblEmpledo = new GridBagConstraints();
		gbc_lblEmpledo.anchor = GridBagConstraints.WEST;
		gbc_lblEmpledo.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmpledo.gridx = 1;
		gbc_lblEmpledo.gridy = 0;
		panel_1.add(lblEmpleado, gbc_lblEmpledo);

		JLabel lbla = new JLabel("Listado EMPLEADOS");
		lbla.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbla.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lbla = new GridBagConstraints();
		gbc_lbla.fill = GridBagConstraints.BOTH;
		gbc_lbla.gridwidth = 2;
		gbc_lbla.gridx = 0;
		gbc_lbla.gridy = 1;
		panel_1.add(lbla, gbc_lbla);
		lbla.setVerticalAlignment(SwingConstants.BOTTOM);

		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.SOUTH);

		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(this);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(btnVolver);

		btnNuevoEmpleado = new JButton("Nuevo empleado");
		btnNuevoEmpleado.addActionListener(this);

		btnNuevoEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(btnNuevoEmpleado);

		btnBorrarEmpleado = new JButton("Borrar Empleado");
		btnBorrarEmpleado.addActionListener(this);
		btnBorrarEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(btnBorrarEmpleado);
		leerEmpleados();
		try {
			loadEmpleado();
		} catch (IndexOutOfBoundsException a) {
			System.out.println("Error de index");
		}
	}

	/**
	 * Método para definir un modelo de tabla personalizado
	 * 
	 * @param data    Datos que se cargan en la tabla
	 * @param columns Nombre de las columnas de la tabla
	 * @return DefautTableModel notEditable
	 */
	private DefaultTableModel obtenerModelSoloLectura(Object[][] data, String[] columns) {
		return new DefaultTableModel(data, columns) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}

	/**
	 * Método para cargar el fichero y pasar los datos a un array
	 */
	public void leerEmpleados() {
		FileInputStream fis;
		ObjectInputStream ois;
		Empleado Empleado = new Empleado();

		try {
			fis = new FileInputStream("Empleado.dat");

			while (fis.available() > 0) {
				ois = new ObjectInputStream(fis);

				Empleado = (Empleado) ois.readObject();

				gestorData.guardarEmpleado(Empleado);

			}
			// convierte los bytes leídos en un objeto de la clase

			fis.close();
		} catch (FileNotFoundException ae) {
			// TODO Auto-generated catch block
			System.out.println("No existe Fichero ");
		} catch (IOException ae) {
			// TODO Auto-generated catch block
			ae.printStackTrace();
		} catch (ClassNotFoundException ae) {
			// TODO Auto-generated catch block
			ae.printStackTrace();
		}
	}

	/**
	 * Método para cargar cada empleado del array creado y poder pasarlo a la tabla
	 */

	private void loadEmpleado() {
		// TODO Auto-generated method stub
		String nombreEmp = "";
		String apellidoEmp = "";
		String dniEmp = "";
		String tipo = "";
		String fechaEmp = "";
		int codEmp = 0;

		for (int i = 0; i < gestorData.tamañoArrayEmpleados(); i++) {
			nombreEmp = gestorData.getEmpleado(i).getNombre();
			apellidoEmp = gestorData.getEmpleado(i).getApellido1();
			dniEmp = gestorData.getEmpleado(i).getDni();
			codEmp = gestorData.getEmpleado(i).getCodEmp();
			fechaEmp = "" + gestorData.getEmpleado(i).getFecha_Nac();
			tipo = "" + gestorData.getEmpleado(i).getTipo();
			String[] rowData = new String[] { nombreEmp, apellidoEmp, dniEmp, fechaEmp, tipo, "" + codEmp }

			;
			dtmEmpleado.addRow(rowData);
		}

	}

	/**
	 * Método actionPerformed. @Param event
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o == btnVolver) {
			MenuAdmin aL = new MenuAdmin(gestorData);
			aL.setVisible(true);
			dispose();
		}
		if (o == btnBorrarEmpleado) {
			int Empleado = tableEmpleado.getSelectedRow();
			if (Empleado == -1) {
				JOptionPane.showMessageDialog(this, (String) "Seleccione un empleado", "ERROR", JOptionPane.ERROR_MESSAGE);

			} else {
				gestorData.removeEmpleado(Empleado);
				dtmEmpleado.removeRow(Empleado);
			}
		}

		if (o == btnNuevoEmpleado) {
			AnadirEmpleado anadirEmpleado = new AnadirEmpleado(gestorData);
			anadirEmpleado.setVisible(true);
			dispose();

		}
	}
}
