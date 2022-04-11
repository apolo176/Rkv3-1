package Listados;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Datos.GestorData;
import Datos.Vehiculo;
import Forms.AnadirVehiculo;
import dialogs.MenuAdmin;

import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;


/**
 * 
 * @author ik_1dw3
 *
 */
public class ListadoVehiculos extends JFrame implements ActionListener, WindowListener {

	private static final long serialVersionUID = 1L;
	private JTable tableVehiculos;
	private DefaultTableModel dtmVehiculos;
	private GestorData gestorData;
	private JButton btnVolver;
	private JButton btnModificarVehiculo;
	private JButton btnBorrarVehiculo;
	private JButton btnOrdenar;
	private JComboBox<String> comboBoxVehiculo;

	/**
	 * Es el constructor que crea la clase
	 * 
	 * @param gestorData Clase donde están la mayoría de métodos y donde se guardan
	 *                   los datos
	 */

	public ListadoVehiculos(GestorData gestorData) {
		getContentPane().setBackground(SystemColor.window);
		setBackground(SystemColor.window);
		addWindowListener(this);
		this.gestorData = gestorData;
		setBounds(100, 100, 843, 739);
		setLocationRelativeTo(null);
		setSize(789, 535);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		String[] ColumnNames = new String[] { "Modelo/Marca", "NumBast", "Matricula", "kilometros", "Fecha I.T.V.",
				"Fecha De Ulltima Revision" };
		String[][] Data = null;

		dtmVehiculos = obtenerModelSoloLectura(Data, ColumnNames);
		tableVehiculos = new JTable(dtmVehiculos);

		tableVehiculos.setModel(dtmVehiculos);

		JScrollPane scrollPane = new JScrollPane(tableVehiculos);
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

		btnBorrarVehiculo = new JButton("Borrar");
		btnBorrarVehiculo.addActionListener(this);
		btnBorrarVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(btnBorrarVehiculo);

		btnModificarVehiculo = new JButton("Modificar");
		btnModificarVehiculo.addActionListener(this);
		btnModificarVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(btnModificarVehiculo);

		btnOrdenar = new JButton("Ordenar");
		btnOrdenar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(btnOrdenar);
		btnOrdenar.addActionListener(this);

		comboBoxVehiculo = new JComboBox<String>();
		panel_1.add(comboBoxVehiculo);
		comboBoxVehiculo.setModel(new DefaultComboBoxModel<String>(new String[] { "Numero bastidor", "Matricula" }));
		comboBoxVehiculo.addActionListener(this);

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

		JLabel lblListadoVehiculos = new JLabel("Listado VEHICULOS");
		lblListadoVehiculos.setVerticalAlignment(SwingConstants.BOTTOM);
		lblListadoVehiculos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListadoVehiculos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblListadoVehiculos = new GridBagConstraints();
		gbc_lblListadoVehiculos.fill = GridBagConstraints.BOTH;
		gbc_lblListadoVehiculos.gridwidth = 2;
		gbc_lblListadoVehiculos.gridx = 0;
		gbc_lblListadoVehiculos.gridy = 1;
		panel_1_1.add(lblListadoVehiculos, gbc_lblListadoVehiculos);

		leerVehiculos();
		loadVehiculo();

	}

	/**
	 * Método para que cuando se desea volver a la ventana anterior aparezca un
	 * mensaje con las opciones "guardar", "no guardar" y "cancelar". Si decide
	 * guardar se guardan los datos en el fichero. Si decide no guardar, sale sin
	 * guardar. Si decide cancelar, vuelve al listado.
	 */

	private void volver() {
		// Si han sido modificados

		String[] opciones = { "Guardar", "No Guardar", "Cancelar" };
		int opcion = JOptionPane.showOptionDialog(this, "¿Desea Guardar?", "Cuadro de Diálogo con OpcionesPersonalizadas",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		switch (opcion) {
		case 0:
			// Si se pulsa guardar
			// ESCRITURA
			// gestorData.deleteFich("Ordenes.dat");

			for (int i = gestorData.tamañoArrayVehiculos() - 1; i > 0; i--) {
				dtmVehiculos.removeRow(i);
				Vehiculo vehiculo = new Vehiculo(gestorData.getVehiculo(i));
				gestorData.escribirFichTrue("Vehiculos.dat", vehiculo);
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
		int opcion = JOptionPane.showOptionDialog(this, "¿Desea Guardar?", "Cuadro de Diálogo con OpcionesPersonalizadas",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		switch (opcion) {
		case 0:
			// Si se pulsa guardar
			// ESCRITURA
			// gestorData.deleteFich("Ordenes.dat");

			for (int i = gestorData.tamañoArrayVehiculos() - 1; i > 0; i--) {
				dtmVehiculos.removeRow(i);
				Vehiculo vehiculo = new Vehiculo(gestorData.getVehiculo(i));
				gestorData.escribirFichTrue("Vehiculos.dat", vehiculo);
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
	 * Método para cargar cada vehículo del array creado y poder pasarlo a la tabla
	 */

	private void loadVehiculo() {
		// TODO Auto-generated method stub
		String ModeloMarca = "";
		String numBast = "";
		String matricula = "";
		String fechITV = "";
		String kilometros = "";
		String fechUltimaRevision = "";

		for (int i = 0; i < gestorData.tamañoArrayVehiculos(); i++) {

			ModeloMarca = gestorData.getVehiculo(i).getModelo() + "/" + gestorData.getVehiculo(i).getMarca();
			numBast = gestorData.getVehiculo(i).getNumBast();
			matricula = gestorData.getVehiculo(i).getMatricula();
			fechITV = "" + gestorData.getVehiculo(i).getFechITV();
			kilometros = gestorData.getVehiculo(i).getKM() + "km";
			fechUltimaRevision = "" + gestorData.getVehiculo(i).getFechUltimaRevision();
			String[] rowData = new String[] { ModeloMarca, numBast, matricula, kilometros, fechITV, fechUltimaRevision }

			;
			dtmVehiculos.addRow(rowData);
		}

	}

	/**
	 * Método para definir un modelo de tabla personalizado
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
	 * Método para cargar el fichero y pasar los datos a un array
	 */

	public void leerVehiculos() {
		FileInputStream fis;
		ObjectInputStream ois;
		Vehiculo vehiculo = new Vehiculo();

		try {
			fis = new FileInputStream("Vehiculo.dat");

			while (fis.available() > 0) {
				ois = new ObjectInputStream(fis);

				vehiculo = (Vehiculo) ois.readObject();

				gestorData.guardarVehiculo(vehiculo);

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
	 * Método ActionPerformed. @Param event
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
		if (o == btnModificarVehiculo) {
			Vehiculo vehiculo;
			if (tableVehiculos.getSelectedRow() == -1) {
				JOptionPane.showMessageDialog(this, (String) "Seleccione un vehículo", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				vehiculo = new Vehiculo(gestorData.getVehiculo(tableVehiculos.getSelectedRow()));
				AnadirVehiculo anadirVehiculo = new AnadirVehiculo(gestorData, vehiculo);
				anadirVehiculo.setVisible(true);
				dispose();
			}
		}

		if (o == btnBorrarVehiculo) {
			int Vehiculo = tableVehiculos.getSelectedRow();
			if (Vehiculo == -1) {
				JOptionPane.showMessageDialog(this, (String) "Seleccione un vehículo", "ERROR", JOptionPane.ERROR_MESSAGE);

			} else {
				gestorData.removeVehiculo(Vehiculo);
				dtmVehiculos.removeRow(Vehiculo);
			}
		}

		if (o == btnOrdenar) {

			if (comboBoxVehiculo.getSelectedIndex() == 0) {
				ArrayList<Vehiculo> arrayVehiculo = new ArrayList<Vehiculo>();

				arrayVehiculo = gestorData.getVehiculos();
				Collections.sort(gestorData.getVehiculos());
				for (int i = arrayVehiculo.size() - 1; i >= 0; i--) {
					dtmVehiculos.removeRow(i);
				}

				loadVehiculo();
			}
			if (comboBoxVehiculo.getSelectedIndex() == 1) {
				ArrayList<Vehiculo> arrayVehiculos = new ArrayList<Vehiculo>();

				arrayVehiculos = gestorData.getVehiculos();

				Collections.sort(gestorData.getVehiculos(), new Comparator<Vehiculo>() {

					@Override
					public int compare(Vehiculo o1, Vehiculo o2) {
						// TODO Auto-generated method stub

						return (o1.getMatricula().compareTo(o2.getMatricula()));

					}

				});
				arrayVehiculos = gestorData.getVehiculos();
				for (int i = arrayVehiculos.size() - 1; i >= 0; i--) {
					dtmVehiculos.removeRow(i);
				}

				loadVehiculo();

			}

		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Método windowClosing Para utilizar el método close() al cerrar la ventana
	 */
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
