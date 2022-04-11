package Listados;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Datos.Cliente;
import Datos.GestorData;
import Forms.AnadirCliente;
import dialogs.MenuAdmin;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;


/**
 * 
 * @author ik_1dw3
 *
 */
public class ListadoClientes extends JFrame implements ActionListener, WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tableClientes;
	private DefaultTableModel dtmClientes;
	private GestorData gestorData;
	private JButton btnVolver;
	private JButton btnModificarCliente;
	private JButton btnBorrarCliente;
	private JButton btnOrdenarClientes;
	private JComboBox<String> comboBoxClientes;

	/**
	 * Es el constructor que crea la clase
	 * 
	 * @param gestorData Clae donde están la maoría de métodos y donde se guardan los
	 *                   datos.
	 */

	public ListadoClientes(GestorData gestorData) {
		addWindowListener(this);
		getContentPane().setBackground(SystemColor.window);
		setBackground(SystemColor.window);
		this.gestorData = gestorData;
		setBounds(100, 100, 843, 739);
		setSize(796, 532);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		String[] ColumnNames = new String[] { "Nombre", "Apellido", "DNI", "Email", "FechaNacimiento" };
		String[][] Data = null;

		dtmClientes = obtenerModelSoloLectura(Data, ColumnNames);
		tableClientes = new JTable(dtmClientes);

		tableClientes.setModel(dtmClientes);

		JScrollPane scrollPane = new JScrollPane(tableClientes);
		scrollPane.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(30, 144, 255),
				new Color(30, 144, 255), new Color(30, 144, 255), new Color(30, 144, 255)));
		panel.add(scrollPane, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		getContentPane().add(panel_1, BorderLayout.SOUTH);

		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(this);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(btnVolver);

		btnBorrarCliente = new JButton("Borrar");
		btnBorrarCliente.addActionListener(this);

		btnBorrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(btnBorrarCliente);

		btnModificarCliente = new JButton("Modificar");
		btnModificarCliente.addActionListener(this);

		btnModificarCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(btnModificarCliente);

		btnOrdenarClientes = new JButton("Ordenar");
		btnOrdenarClientes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(btnOrdenarClientes);
		btnOrdenarClientes.addActionListener(this);

		comboBoxClientes = new JComboBox<String>();
		comboBoxClientes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(comboBoxClientes);
		comboBoxClientes.setModel(new DefaultComboBoxModel<String>(new String[] { "NOMBRE", "APELLIDO" }));
		comboBoxClientes.addActionListener(this);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		getContentPane().add(panel_1_1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_1_1 = new GridBagLayout();
		gbl_panel_1_1.columnWidths = new int[] { 415, 452, 0 };
		gbl_panel_1_1.rowHeights = new int[] { 37, 13, 0 };
		gbl_panel_1_1.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_1_1.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		panel_1_1.setLayout(gbl_panel_1_1);

		JLabel lblHola = new JLabel("Hola, ");
		GridBagConstraints gbc_lblHola = new GridBagConstraints();
		gbc_lblHola.anchor = GridBagConstraints.EAST;
		gbc_lblHola.insets = new Insets(0, 0, 5, 5);
		gbc_lblHola.gridx = 0;
		gbc_lblHola.gridy = 0;
		panel_1_1.add(lblHola, gbc_lblHola);

		JLabel lblEmpleado = new JLabel("");
		GridBagConstraints gbc_lblEmpleado = new GridBagConstraints();
		gbc_lblEmpleado.anchor = GridBagConstraints.WEST;
		gbc_lblEmpleado.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmpleado.gridx = 1;
		gbc_lblEmpleado.gridy = 0;
		panel_1_1.add(lblEmpleado, gbc_lblEmpleado);

		JLabel lblListadoClientes = new JLabel("Listado CLIENTES");
		lblListadoClientes.setVerticalAlignment(SwingConstants.BOTTOM);
		lblListadoClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListadoClientes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblListadoClientes = new GridBagConstraints();
		gbc_lblListadoClientes.fill = GridBagConstraints.BOTH;
		gbc_lblListadoClientes.gridwidth = 2;
		gbc_lblListadoClientes.gridx = 0;
		gbc_lblListadoClientes.gridy = 1;
		panel_1_1.add(lblListadoClientes, gbc_lblListadoClientes);
		leerCliente();
		loadCliente();

	}

	/**
	 * Método para cargar el fichero y pasar los datos a un array
	 */
	private void leerCliente() {
		// TODO Auto-generated method stub
		FileInputStream fis;
		ObjectInputStream ois;
		Cliente cliente = new Cliente();

		try {
			fis = new FileInputStream("Cliente.dat");

			while (fis.available() > 0) {
				ois = new ObjectInputStream(fis);
				cliente = (Cliente) ois.readObject();
				// ordenTableModel.setValueAt(cliente, row, COLUMN_CLI );
				// orden.setCliente(cliente);
				gestorData.guardarCliente(cliente);

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

	private void volver() {
		// Si han sido modificados

		String[] opciones = { "Guardar", "No Guardar", "Cancelar" };
		int opcion = JOptionPane.showOptionDialog(this, "¿Desea Guardar?", "Cuadro de Diálogo Volver",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		switch (opcion) {
		case 0:
			// Si se pulsa guardar
			// ESCRITURA
			// gestorData.deleteFich("Ordenes.dat");

			for (int i = gestorData.tamañoArrayCliente() - 1; i > 0; i--) {
				dtmClientes.removeRow(i);
				Cliente cliente = new Cliente(gestorData.getCliente(i));
				gestorData.escribirFichTrue("Cliente.dat", cliente);
			}

			break;

		case 1:
			// Si se pulsa No Guardar

			break;

		case 2:
			return;
		}

	}

	/**
	 * Método para que cuando se desea salir de la aplicación aparezca un mensaje
	 * con las opciones "guardar", "no guardar" y "cancelar". Si decide guardar se
	 * guardan los datos en el fichero. Si decide no guardar, sale sin guardar. Si
	 * decide cancelar, vuelve al listado.
	 */

	private void close() {
		// Si han sido modificados

		String[] opciones = { "Guardar", "No Guardar", "Cancelar" };
		int opcion = JOptionPane.showOptionDialog(this, "¿Desea Guardar?", "Cuadro Cerrar Ventana",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		switch (opcion) {
		case 0:
			// Si se pulsa guardar
			// ESCRITURA
			// gestorData.deleteFich("Ordenes.dat");

			for (int i = gestorData.tamañoArrayVehiculos() - 1; i > 0; i--) {
				dtmClientes.removeRow(i);
				Cliente cliente = new Cliente(gestorData.getCliente(i));
				gestorData.escribirFichTrue("Cliente.dat", cliente);
			}
			System.exit(0);

			break;

		case 1:
			// Si se pulsa No Guardar
			System.exit(0);
			break;

		case 2:
			return;
		}

	}

	/**
	 * Método para definir un modelo de tabla persolazionado
	 * 
	 * @param data    Datos que aparecen en la tabla
	 * @param columns Nombre de las columnas
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
	 * Método para cargar cada cliente del array creado y poder pasarlo a la tabla
	 */

	private void loadCliente() {
		// TODO Auto-generated method stub
		String nombreCli = "";
		String apellidoCli = "";
		String DNICli = "";
		String EmailCli = "";
		String FechaCli = "";

		for (int i = 0; i < gestorData.tamañoArrayCliente(); i++) {
			nombreCli = gestorData.getCliente(i).getNombre();
			apellidoCli = gestorData.getCliente(i).getApellido1();
			DNICli = gestorData.getCliente(i).getDni();
			EmailCli = gestorData.getCliente(i).getEmail();
			FechaCli = "" + gestorData.getCliente(i).getFechNa();
			String[] rowData = new String[] { nombreCli, apellidoCli, DNICli, EmailCli, FechaCli }

			;
			dtmClientes.addRow(rowData);
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
			volver();
			MenuAdmin aL = new MenuAdmin(gestorData);
			aL.setVisible(true);
			dispose();

		}
		if (o == btnModificarCliente) {
			Cliente cliente;
			if (tableClientes.getSelectedRow() == -1) {
				JOptionPane.showMessageDialog(this, (String) "Seleccione un cliente", "ERROR", JOptionPane.ERROR_MESSAGE);

			} else {
				cliente = new Cliente(gestorData.getCliente(tableClientes.getSelectedRow()));
				AnadirCliente anadirCliente = new AnadirCliente(gestorData, cliente);
				anadirCliente.setVisible(true);
				dispose();
			}
		}
		if (o == btnBorrarCliente) {
			int cliente = tableClientes.getSelectedRow();
			if (cliente == -1) {
				JOptionPane.showMessageDialog(this, (String) "Seleccione un cliente", "ERROR", JOptionPane.ERROR_MESSAGE);

			} else {
				gestorData.removeCliente(cliente);
				dtmClientes.removeRow(cliente);

			}

		}
		if (o == btnOrdenarClientes) {

			if (comboBoxClientes.getSelectedIndex() == 0) {
				ArrayList<Cliente> arrayClientes = new ArrayList<Cliente>();

				arrayClientes = gestorData.getClientes();
				Collections.sort(gestorData.getClientes());
				for (int i = arrayClientes.size() - 1; i >= 0; i--) {
					dtmClientes.removeRow(i);
				}

				loadCliente();

			}
			if (comboBoxClientes.getSelectedIndex() == 1) {
				ArrayList<Cliente> arrayClientes = new ArrayList<Cliente>();

				arrayClientes = gestorData.getClientes();

				Collections.sort(gestorData.getClientes(), new Comparator<Cliente>() {

					@Override
					public int compare(Cliente o1, Cliente o2) {
						// TODO Auto-generated method stub

						return (o1.getApellido1().compareTo(o2.getApellido1()));

					}

				});
				arrayClientes = gestorData.getClientes();
				for (int i = arrayClientes.size() - 1; i >= 0; i--) {
					dtmClientes.removeRow(i);
				}

				loadCliente();

			}

		}

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		close();

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
